import type { CodeBlockWriter } from "ts-morph";
import { AbstractRenderer, RenderingPhase } from "./AbstractRenderer.js";
import { normalizeModuleName } from "../../util/formatters.js";
import { WebComponentWrapper } from "./WebComponentWrapper.js";

type PackageConfig = {
  prefix: string;
  typesPrefix: string;
  scalaPackage: string;
  useNormalize?: boolean;
};

export class ImportsRenderer extends AbstractRenderer {
  public phase = RenderingPhase.imports;

  private packageConfigs: PackageConfig[] = [
    {
      prefix: "@ui5/webcomponents/dist/",
      typesPrefix: "@ui5/webcomponents/dist/types/",
      scalaPackage: "io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents",
      useNormalize: false
    },
    {
      prefix: "@ui5/webcomponents-fiori/dist/",
      typesPrefix: "@ui5/webcomponents-fiori/dist/types/",
      scalaPackage: "io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori",
      useNormalize: true
    },
    {
      prefix: "@ui5/webcomponents-ai/dist/",
      typesPrefix: "@ui5/webcomponents-ai/dist/types/",
      scalaPackage: "io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi",
      useNormalize: false
    },
    {
      prefix: "@ui5/webcomponents-compat/dist/",
      typesPrefix: "@ui5/webcomponents-compat/dist/types/",
      scalaPackage: "io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat",
      useNormalize: false
    }
  ];

  render(context: WebComponentWrapper, writer: CodeBlockWriter): void {
    const sortedModules = [...context.importMap.keys()].sort((a, b) =>
      a.localeCompare(b)
    );

    this.writePackageAndImports(context, writer);
    
    sortedModules.forEach((module) => {
      const config = context.importMap.get(module)!;
      const members = this.getMembers(config);
      
      // Process module imports based on package type
      for (const packageConfig of this.packageConfigs) {
        if (this.processModuleImport(module, members, packageConfig, writer)) {
          break; // Stop processing if the module was handled
        }
      }
    });

    this.writeComponentImport(context, writer);
  
    writer
      .writeLine("import org.scalajs.dom")
      .blankLine()
      .writeLine("import scala.scalajs.js")
      .writeLine("import scala.scalajs.js.annotation.*")
      .blankLine();
  }

  private writePackageAndImports(context: WebComponentWrapper, writer: CodeBlockWriter): void {
    if (context.isAiPackage) {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar.ai");
    } else if(context.isCompatPackage) {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar.compat");
    } else {
      writer.writeLine("package io.github.nguyenyou.ui5.webcomponents.laminar");
    }
    
    writer
      .blankLine()
      .writeLine("import com.raquo.laminar.api.L.*")
      .writeLine("import com.raquo.laminar.codecs.*")
      .writeLine("import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*");
    
    if (context.isAiPackage) {
      writer.writeLine("import io.github.nguyenyou.ui5.webcomponents.laminar.IconName");
    }
  }

  private getMembers(config: any): string[] {
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
    return members;
  }

  private processModuleImport(module: string, members: string[], packageConfig: PackageConfig, writer: CodeBlockWriter): boolean {
    if (module.startsWith(packageConfig.typesPrefix)) {
      const name = module
        .replace(packageConfig.typesPrefix, "")
        .replace(".js", "");
      
      const moduleName = packageConfig.useNormalize 
        ? normalizeModuleName(`distTypes${name}Mod`) 
        : `distTypes${name}Mod`;
      
      this.writeImportStatement(writer, packageConfig.scalaPackage, moduleName, members);
      return true;
    } else if (module.startsWith(packageConfig.prefix)) {
      const name = module
        .replace(packageConfig.prefix, "")
        .replace(".js", "");
      
      const moduleName = packageConfig.useNormalize 
        ? normalizeModuleName(`dist${name}Mod`) 
        : `dist${name}Mod`;
      
      this.writeImportStatement(writer, packageConfig.scalaPackage, moduleName, members);
      return true;
    }
    
    return false;
  }

  private writeImportStatement(writer: CodeBlockWriter, scalaPackage: string, moduleName: string, members: string[]): void {
    if (members.length === 1) {
      writer.writeLine(
        `import ${scalaPackage}.${moduleName}.${members[0]}`
      );
    } else {
      writer.writeLine(
        `import ${scalaPackage}.${moduleName}.{${members.join(",")}}`
      );
    }
  }

  private writeComponentImport(context: WebComponentWrapper, writer: CodeBlockWriter): void {
    let packageName = "";
    
    if (context.isMainPackage) {
      packageName = "ui5Webcomponents";
    } else if (context.isFioriPackage) {
      packageName = "ui5WebcomponentsFiori";
    } else if (context.isAiPackage) {
      packageName = "ui5WebcomponentsAi";
    } else if (context.isCompatPackage) {
      packageName = "ui5WebcomponentsCompat";
    }
    
    if (packageName) {
      writer.writeLine(
        `import io.github.nguyenyou.ui5.webcomponents.${packageName}.dist${context.componentName}Mod.${context.componentName} as ${context.componentName}Component`
      );
    }
  }
}
