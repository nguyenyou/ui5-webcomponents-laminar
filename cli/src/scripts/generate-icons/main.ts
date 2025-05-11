#!/usr/bin/env node

import * as fs from 'fs';
import * as path from 'path';
import { workspaceRoot } from '../../util/project.js';

const nonIcons = [
  "AllIcons",
  "AllIcons-static",
  "Assets",
  "Assets-static"
];

// Helper for escaping Scala keywords
const scalaKeywords = ["private", "class", "for"]; // add more if needed

// kebab case to camel case
function kebabCaseToCamelCase(name: string): string {
  return name.replace(/-([a-zA-Z0-9])/g, (_, letter) => letter.toUpperCase());
}

function wrappedName(name: string, prefix: string = ""): string {
  let result = kebabCaseToCamelCase(name);
  if (prefix) {
    // Capitalize first letter after prefix
    result = prefix + result.charAt(0).toUpperCase() + result.slice(1);
  }
  
  // Add backticks if the name starts with a number or is a Scala keyword
  if (scalaKeywords.includes(result) || /^[0-9]/.test(result)) {
    return `\`${result}\``
  }
  return result
}

function importName(name: string, prefix: string = ""): string {
  const prefixedName = prefix ? `${prefix}-${name}` : name;
  return `\`import-${prefixedName}\``;
}

function dummyJSImport(folder: string, name: string, indent: number, prefix: string = ""): string {
  const tab = "  ".repeat(indent);
  return `${tab}@js.native @JSImport("${folder}/${name}.js", JSImport.Namespace)\n${tab}object ${importName(name, prefix)} extends js.Object\n`;
}

function generateIconImportsFileContent(
  standardIconNames: string[], 
  businessSuiteIconNames: string[], 
  fullPackageName: string
): string {
  const packageName = fullPackageName.split('.').pop();
  
  const allStandardIconImports = standardIconNames.map(name => 
    dummyJSImport("@ui5/webcomponents-icons/dist", name, 1)
  );

  const allBusinessSuiteIconImports = businessSuiteIconNames.map(name => 
    dummyJSImport("@ui5/webcomponents-icons-business-suite/dist", name, 1, "bs")
  );

  return `
package ${fullPackageName}

import scala.annotation.unused
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

//noinspection NoTargetNameAnnotationForOperatorLikeDefinition
private[${packageName}] object IconImports {
  @inline def _iconName(@unused obj: js.Object, name: String): IconName =
    name.asInstanceOf[IconName] // scalafix:ok

  // Standard Icons
${allStandardIconImports.join("\n")}

  // Business Suite Icons
${allBusinessSuiteIconImports.join("\n")}
}
`.trim();
}

function generateIconValuesFileContent(
  standardIconNames: string[], 
  businessSuiteIconNames: string[], 
  fullPackageName: string
): string {
  const allStandardIconValues = standardIconNames.map(name =>
    `def ${wrappedName(name)}: IconName = _iconName(${importName(name)}, "${name}")`
  );

  const allBusinessSuiteIconValues = businessSuiteIconNames.map(name =>
    `def ${wrappedName(name, "bs")}: IconName = _iconName(${importName(name, "bs")}, "business-suite/${name}")`
  );

  return `
package ${fullPackageName}

import com.raquo.laminar.codecs.Codec
import ${fullPackageName}.IconImports.*

import scala.scalajs.js

@js.native sealed trait IconName extends js.Any

//noinspection NoTargetNameAnnotationForOperatorLikeDefinition
object IconName {
  // Standard icons
${allStandardIconValues.map(line => "  " + line).join("\n")}

  // Business Suite icons (with 'bs' prefix)
${allBusinessSuiteIconValues.map(line => "  " + line).join("\n")}

  def AsStringCodec: Codec[IconName, String] = new Codec[IconName, String] {
    override def encode(scalaValue: IconName): String = scalaValue.asInstanceOf[String] // scalafix:ok
    override def decode(domValue: String): IconName = domValue.asInstanceOf[IconName] // scalafix:ok
  }
}
`.trim();
}

export default async function generateIcons(): Promise<void> {
  try {
    const standardIconsDir = path.join(workspaceRoot, 'node_modules', '@ui5', 'webcomponents-icons', 'dist');
    const businessSuiteIconsDir = path.join(workspaceRoot, 'node_modules', '@ui5', 'webcomponents-icons-business-suite', 'dist');
    
    // Get standard icon names
    const standardIconNames = fs.existsSync(standardIconsDir) 
      ? fs.readdirSync(standardIconsDir)
        .filter(fileName => fileName.endsWith('.js'))
        .map(fileName => fileName.slice(0, -3)) // Remove .js extension
        .filter(name => !nonIcons.includes(name))
        .sort()
      : [];
    
    // Get business suite icon names
    const businessSuiteIconNames = fs.existsSync(businessSuiteIconsDir)
      ? fs.readdirSync(businessSuiteIconsDir)
        .filter(fileName => fileName.endsWith('.js'))
        .map(fileName => fileName.slice(0, -3)) // Remove .js extension
        .filter(name => !nonIcons.includes(name))
        .sort()
      : [];
    
    // Define destination and package info
    const destinationFolder = path.join(
      workspaceRoot, 
      'ui5-webcomponents-laminar', 
      'src', 
      'io', 
      'github', 
      'nguyenyou', 
      'ui5', 
      'webcomponents',
      "laminar"
    );
    const fullPackageName = "io.github.nguyenyou.ui5.webcomponents.laminar";
    
    // Ensure directory exists
    if (!fs.existsSync(destinationFolder)) {
      fs.mkdirSync(destinationFolder, { recursive: true });
    }
    
    // Generate and write IconImports.scala
    const iconImportsContent = generateIconImportsFileContent(
      standardIconNames, 
      businessSuiteIconNames,
      fullPackageName
    );
    const iconImportsFile = path.join(destinationFolder, 'IconImports.scala');
    fs.writeFileSync(iconImportsFile, iconImportsContent);
    
    // Generate and write IconName.scala
    const iconNameContent = generateIconValuesFileContent(
      standardIconNames, 
      businessSuiteIconNames,
      fullPackageName
    );
    const iconNameFile = path.join(destinationFolder, 'IconName.scala');
    fs.writeFileSync(iconNameFile, iconNameContent);
    
    console.log(`Generated icon files at ${destinationFolder}`);
    console.log(`Found ${standardIconNames.length} standard icons and ${businessSuiteIconNames.length} business suite icons`);
  } catch (error) {
    console.error('Error generating icon files:', error);
    process.exit(1);
  }
}