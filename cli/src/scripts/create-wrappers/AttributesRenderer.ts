import type * as CEM from "@ui5/webcomponents-tools/lib/cem/types-internal.d.ts";
import type CodeBlockWriter from "code-block-writer";
import * as fs from "fs";
import * as path from "path";
import { AbstractRenderer, RenderingPhase } from "./AbstractRenderer.js";
import {
  camelCaseToKebabCase,
  isScalaPrimitive,
  mapWebComponentTypeToPrimitive,
  normalizeScalaSymbolName,
  OPENER_ID,
  propDescriptionFormatter,
  sinceFilter,
  snakeCaseToCamelCase,
} from "../../util/formatters.js";
import { nodemodules, project } from "../../util/project.js";
import { resolveReferenceImports } from "../../util/referenceResolver.js";
import { WebComponentWrapper } from "./WebComponentWrapper.js";

const loggedTypes = new Set<string>();

function mapWebComponentTypeToScalaType(type: string) {
  const primitive = mapWebComponentTypeToPrimitive(type);
  if (primitive) {
    return primitive;
  }
  switch (type) {
    // case 'HTMLElement | string | undefined':
    // case 'HTMLElement | string':
    //   // opener props only accept strings as prop types
    //   return 'string';

    default:
      if (!loggedTypes.has(type)) {
        // console.log("-> Attributes type", type);
        loggedTypes.add(type);
      }
      return type;
  }
}

export class AttributesRenderer extends AbstractRenderer {
  public phase = RenderingPhase.attributes;

  private _attributes: CEM.ClassField[] = [];

  // Track processed enums to avoid duplicate declarations
  private processedEnums = new Set<string>();

  setAttributes(value: CEM.Attribute[]) {
    this._attributes = value.toSorted((a, b) =>
      a.name.localeCompare(b.name)
    ) as CEM.ClassField[];
    return this;
  }

  private descriptionBuilder(
    attribute: CEM.ClassField,
    context: WebComponentWrapper
  ) {
    const parts: string[] = [];

    parts.push(` * ${propDescriptionFormatter(attribute.description ?? "")}`);

    if (sinceFilter(attribute._ui5since)) {
      parts.push(` *`);
      parts.push(
        ` * **Note:** Available since [v${attribute._ui5since}](https://github.com/SAP/ui5-webcomponents/releases/tag/v${attribute._ui5since}) of **${context.packageName}**.`
      );
    }

    if (
      attribute.default &&
      attribute.default.length > 0 &&
      attribute.default !== '""'
    ) {
      parts.push(" *"), parts.push(` * Default: ${attribute.default}`);
    }

    if (attribute.deprecated) {
      parts.push(" *"), parts.push(` * Deprecated: ${attribute.deprecated}`);
    }

    return `/**\n${parts.join("\n")}\n */`;
  }

  private typeToCodec(type: string) {
    switch (type) {
      case "Boolean":
        return "BooleanAsAttrPresenceCodec";
      case "String":
        return "StringAsIsCodec";
      case "Double":
        return "DoubleAsStringCodec";
      default:
        return "StringAsIsCodec";
    }
  }

  private createHtmlAttrForEnum(
    attribute: CEM.ClassField,
    context: WebComponentWrapper,
    attributeName: string,
    enumTypeName: string,
    writer: CodeBlockWriter
  ) {
    writer.writeLine(`${this.descriptionBuilder(attribute, context)}`);
    writer.writeLine(
      `lazy val ${normalizeScalaSymbolName(
        snakeCaseToCamelCase(attributeName)
      )}: HtmlAttr[${enumTypeName}] = htmlAttr("${camelCaseToKebabCase(
        snakeCaseToCamelCase(attributeName)
      )}", StringUnionCodec[${enumTypeName}])`
    );
  }

  private propTyping(
    attribute: CEM.ClassField,
    context: WebComponentWrapper,
    writer: CodeBlockWriter
  ) {
    const attrName = attribute.name;
    const normalizedNamed = normalizeScalaSymbolName(
      snakeCaseToCamelCase(attribute.name)
    );

    let type = attribute.type?.text ?? "unknown";
    type = mapWebComponentTypeToScalaType(type);

    const references = attribute.type?.references;
    const isEnum =
      references != null &&
      references?.length > 0 &&
      attribute.default !== "{}";

    if (
      ["icon", "endIcon"].includes(normalizedNamed) ||
      (attribute.name === "name" && context.componentName === "Icon")
    ) {
      writer.writeLine(`${this.descriptionBuilder(attribute, context)}`);
      writer.writeLine(
        `lazy val ${normalizedNamed}: HtmlAttr[IconName] = htmlAttr("${camelCaseToKebabCase(
          attrName
        )}", IconName.AsStringCodec)`
      );
      return;
    }

    if (isEnum) {
      // Add the source file to the project
      for (const reference of references || []) {
        if (reference.name && reference.package && reference.module) {
          let typeName = reference.name;
          if (context.isCompatPackage) {
            typeName = `Compat${reference.name}`;
          }
          // Skip if this enum has already been processed
          if (this.processedEnums.has(typeName)) {
            this.createHtmlAttrForEnum(
              attribute,
              context,
              attribute.name,
              typeName,
              writer
            );
            return;
          }

          // Extract the file path from the module path
          const modulePath = reference.module;
          const typesFile = modulePath.replace(".js", ".d.ts");

          // Resolve the path to the type definition file
          const typePath = path.resolve(
            nodemodules,
            reference.package,
            typesFile
          );

          if (fs.existsSync(typePath)) {
            const sourceFile = project.addSourceFileAtPath(typePath);

            // Process the enum values here if needed
            const enumDeclaration = sourceFile.getEnum(reference.name);
            if (enumDeclaration) {
              const enumMembers = enumDeclaration.getMembers();

              // Extract enum values and create a union type
              const enumValues = enumMembers.map((member) => {
                const value = member.getValue();
                return typeof value === "string" ? `"${value}"` : value;
              });

              if (enumValues.length > 0) {
                // Use the enum values to create a union type
                type = enumValues.join(" | ");
                // Mark this enum as processed
                this.processedEnums.add(typeName);
                this.createHtmlAttrForEnum(
                  attribute,
                  context,
                  attribute.name,
                  typeName,
                  writer
                );

                const unionType = `type ${typeName} = ${type}`;
                context.enumSet.add(unionType);
                return;
              }
            }
          } else {
            console.warn(`Type definition file not found: ${typePath}`);
          }
        }
      }
    } else if (isScalaPrimitive(type)) {
      writer.writeLine(`${this.descriptionBuilder(attribute, context)}`);
      writer.writeLine(
        `lazy val ${normalizedNamed}: HtmlAttr[${type}] = htmlAttr("${camelCaseToKebabCase(
          attrName
        )}", ${this.typeToCodec(type)})`
      );
      if (normalizedNamed === OPENER_ID) {
        writer
          .blankLine()
          .write(
            `def openerRef(eventStream: EventStream[Option[dom.HTMLElement]]): Modifier[Element] =`
          )
          .block(() => {
            writer.writeLine(`inContext[Element] { element => `).indent(() => {
              writer
                .write(`eventStream --> Observer[Option[dom.HTMLElement]]`)
                .block(() => {
                  writer.write(`case Some(opener) =>`).indent(() => {
                    writer.writeLine(`element.ref.opener = opener`);
                    writer.writeLine(`element.ref.open = true`);
                  });
                  writer.write(`case None =>`).indent(() => {
                    writer.writeLine(`element.ref.open = false`);
                  });
                });
            });
            writer.writeLine(`}`);
          });
      }
      return;
    } else {
      /*
      Mostly accessibilityAttributes which we will handle in other way
      Beside that, we have "File | null" which I will implement later
      */
    }
  }

  prepare(context: WebComponentWrapper) {
    for (const attribute of this._attributes) {
      // special css handling
      if (
        attribute._ui5validator === "CSSSize" ||
        attribute._ui5validator === "CSSColor"
      ) {
        context.addTypeImport("react", "CSSProperties");
      } else {
        resolveReferenceImports(attribute.type?.references ?? [], context);
      }
    }
  }

  render(context: WebComponentWrapper, writer: CodeBlockWriter): void {
    writer
      .writeLine(`@JSImport("${context.modulePath}", JSImport.Default)`)
      .writeLine("@js.native object RawImport extends js.Object")
      .blankLine()
      .writeLine(
        `type Self = ${context.handleReservedScalaKeywords(
          context.componentName
        )}.type`
      )
      .blankLine()
      .writeLine(
        `type Ref = ${context.componentName}Component & dom.HTMLElement`
      )
      .blankLine()
      .writeLine(`// -- Attributes --`)
      .blankLine();
    this._attributes.forEach((attribute) => {
      this.propTyping(attribute, context, writer);
    });
  }
}
