import { CodeBlockWriter } from "ts-morph";
import { AbstractRenderer, RenderingPhase } from "./AbstractRenderer.js";

interface ImportConfig {
  default: string | null;
  typeOnlyDefault: boolean;
  importUnassinged: boolean;
  named: Set<string>;
  types: Set<string>;
}

export class WebComponentWrapper {
  public tagName: string;
  public componentName: string;
  public modulePath: string;

  importMap = new Map<string, ImportConfig>();
  private renderers = new Array<AbstractRenderer>();

  public typeExportSet = new Set<string>();
  public attributesMap = new Map<string, string>();

  public enumSet
  public readonly packageName: string;
  public readonly isMainPackage: boolean;
  public readonly isAiPackage: boolean;
  public readonly isFioriPackage: boolean;
  public readonly isCompatPackage: boolean;

  private readonly writer = new CodeBlockWriter({
    newLine: "\r\n",
    indentNumberOfSpaces: 2,
    useTabs: false,
    useSingleQuote: true,
  });

  constructor(
    tagName: string,
    componentName: string,
    modulePath: string,
    packageName: string,
    enumSet: Set<string>
  ) {
    this.tagName = tagName;
    this.componentName = componentName;
    this.modulePath = modulePath;
    this.packageName = packageName;
    this.isAiPackage = packageName === "@ui5/webcomponents-ai";
    this.isFioriPackage = packageName === "@ui5/webcomponents-fiori";
    this.isMainPackage = packageName === "@ui5/webcomponents";
    this.isCompatPackage = packageName === "@ui5/webcomponents-compat";
    this.enumSet = enumSet;
  }

  addDefaultImport(pkgName: string, localName: string) {
    const importConfig = this.getOrCreateImportConfig(pkgName);
    importConfig.default = localName;
    importConfig.typeOnlyDefault = false;
    importConfig.importUnassinged = false;
    return this;
  }

  addNamedImport(pkgName: string, localName: string) {
    const importConfig = this.getOrCreateImportConfig(pkgName);
    importConfig.named.add(localName);
    importConfig.importUnassinged = false;
    return this;
  }

  addDefaultTypeImport(pkgName: string, localName: string) {
    const importConfig = this.getOrCreateImportConfig(pkgName);
    importConfig.default = localName;
    importConfig.typeOnlyDefault = true;
    return this;
  }

  addTypeImport(pkgName: string, localName: string) {
    const importConfig = this.getOrCreateImportConfig(pkgName);
    importConfig.types.add(localName);
    return this;
  }

  addUnassignedImport(pkgName: string) {
    const importConfig = this.getOrCreateImportConfig(pkgName);
    importConfig.importUnassinged = true;
    return this;
  }

  addRenderer(ctx: AbstractRenderer) {
    this.renderers.push(ctx);
  }

  addAttribute(attr: string, type: string) {
    this.attributesMap.set(attr, type);
  }

  render() {
    for (const renderer of this.renderers) {
      if (typeof renderer.prepare === "function") {
        renderer.prepare(this);
      }
    }
    this.renderers
      .find((renderer) => renderer.phase === RenderingPhase.imports)
      ?.render(this, this.writer);
    this.writer
      .write(`object ${this.handleReservedScalaKeywords(this.componentName)} extends WebComponent("${this.tagName}")`)
      .block(() => {
        this.writer.blankLine()
        this.renderers
          .find((renderer) => renderer.phase === RenderingPhase.attributes)
          ?.render(this, this.writer);
        this.renderers
          .find((renderer) => renderer.phase === RenderingPhase.props)
          ?.render(this, this.writer);
      });
    this.writer.blankLine()
    this.writer.newLineIfLastNot();
    return this.writer.toString();
  }

  handleReservedScalaKeywords(componentName: string) {
    if (componentName === "Option") {
      return "Opt"
    }
    if (componentName === "List") {
      return "Lis"
    }
    return componentName
  }

  private getOrCreateImportConfig(pkgName: string) {
    if (!this.importMap.has(pkgName)) {
      this.importMap.set(pkgName, {
        default: null,
        typeOnlyDefault: false,
        named: new Set(),
        types: new Set(),
        importUnassinged: false,
      });
    }
    return this.importMap.get(pkgName)!;
  }
}
