import type { CodeBlockWriter } from "ts-morph";
import { AbstractRenderer, RenderingPhase } from "./AbstractRenderer.js";
import { normalizeModuleName } from "../../util/formatters.js";
import { WebComponentWrapper } from "./WebComponentWrapper.js";

export class ImportsRenderer extends AbstractRenderer {
  public phase = RenderingPhase.imports;

  render(context: WebComponentWrapper, writer: CodeBlockWriter): void {
    const sortedModules = [...context.importMap.keys()].sort((a, b) =>
      a.localeCompare(b)
    );

    if (context.isAiPackage) {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar.ai");
    } else if(context.isCompatPackage) {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar.compat");
    } else {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar");
    }
    writer
      .writeLine("import com.raquo.laminar.api.L.*")
      .writeLine("import com.raquo.laminar.codecs.*")
      .writeLine("import com.raquo.laminar.tags.CustomHtmlTag")
      .writeLine("import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*");
    if (context.isAiPackage) {
      writer.writeLine("import io.github.nguyenyou.ui5.webcomponents.laminar.IconName");
    }

    sortedModules.forEach((module) => {
      const config = context.importMap.get(module)!;
      const members = [];
      if (config.default) {
        members.push(config.default);
      }
      if (config.named.size > 0) {
        members.push(...config.named);
      }
      if (config.types.size > 0) {
        members.push(...config.types);
      }
      if (module.startsWith("@ui5/webcomponents/dist/types/")) {
        const name = module
          .replace("@ui5/webcomponents/dist/types/", "")
          .replace(".js", "");
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypes${name}Mod.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypes${name}Mod.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents/dist/")) {
        const name = module
          .replace("@ui5/webcomponents/dist/", "")
          .replace(".js", "");
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.dist${name}Mod.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.dist${name}Mod.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-fiori/dist/types/")) {
        const name = module
          .replace("@ui5/webcomponents-fiori/dist/types/", "")
          .replace(".js", "");
        const moduleName = normalizeModuleName(`distTypes${name}Mod`)
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-fiori/dist/")) {
        const name = module
          .replace("@ui5/webcomponents-fiori/dist/", "")
          .replace(".js", "");
        const moduleName = normalizeModuleName(`dist${name}Mod`)
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-ai/dist/types/")) {
        const name = module
          .replace("@ui5/webcomponents-ai/dist/types/", "")
          .replace(".js", "");
        const moduleName = `distTypes${name}Mod`
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-ai/dist/")) {
        const name = module
          .replace("@ui5/webcomponents-ai/dist/", "")
          .replace(".js", "");
        const moduleName = `dist${name}Mod`
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-compat/dist/types/")) {
        const name = module
          .replace("@ui5/webcomponents-compat/dist/types/", "")
          .replace(".js", "");
        const moduleName = `distTypes${name}Mod`
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      } else if (module.startsWith("@ui5/webcomponents-compat/dist/")) {
        const name = module
          .replace("@ui5/webcomponents-compat/dist/", "")
          .replace(".js", "");
        const moduleName = `dist${name}Mod`
        if (members.length === 1) {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.${moduleName}.${members[0]}`
          );
        } else {
          writer.writeLine(
            `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.${moduleName}.{${members.join(
              ","
            )}}`
          );
        }
      }
    });

    if(context.isMainPackage) {
      writer.writeLine(
        `import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.dist${context.componentName}Mod.{${context.componentName} as ${context.componentName}Component}`
      );
    } else if(context.isFioriPackage) {
      writer.writeLine(
        `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.dist${context.componentName}Mod.{${context.componentName} as ${context.componentName}Component}`
      );
    } else if(context.isAiPackage) {
      writer.writeLine(
        `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.dist${context.componentName}Mod.{${context.componentName} as ${context.componentName}Component}`
      );
    } else if(context.isCompatPackage) {
      writer.writeLine(
        `import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.dist${context.componentName}Mod.{${context.componentName} as ${context.componentName}Component}`
      );
    }
  
    writer
      .writeLine("import org.scalajs.dom")
      .blankLine()
      .writeLine("import scala.scalajs.js")
      .writeLine("import scala.scalajs.js.annotation.*")
      .blankLine();
  }
}
