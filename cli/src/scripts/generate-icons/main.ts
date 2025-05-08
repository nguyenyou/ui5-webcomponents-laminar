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

function wrappedName(name: string): string {
  const result = kebabCaseToCamelCase(name)
  if (scalaKeywords.includes(result)) {
    return `\`${result}\``
  }
  return result
}

function importName(name: string): string {
  return `\`import-${name}\``;
}

function dummyJSImport(folder: string, name: string, indent: number): string {
  const tab = "  ".repeat(indent);
  return `${tab}@js.native @JSImport("${folder}/${name}.js", JSImport.Namespace)\n${tab}object ${importName(name)} extends js.Object\n`;
}

function generateIconImportsFileContent(iconNames: string[], fullPackageName: string): string {
  const packageName = fullPackageName.split('.').pop();
  
  const allIconImports = iconNames.map(name => 
    dummyJSImport("@ui5/webcomponents-icons/dist", name, 1)
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

${allIconImports.join("\n")}
}
`.trim();
}

function generateIconValuesFileContent(iconNames: string[], fullPackageName: string): string {
  const allIconValues = iconNames.map(name =>
    `def ${wrappedName(name)}: IconName = _iconName(${importName(name)}, "${name}")`
  );

  return `
package ${fullPackageName}

import com.raquo.laminar.codecs.Codec
import ${fullPackageName}.IconImports.*

import scala.scalajs.js

@js.native sealed trait IconName extends js.Any

//noinspection NoTargetNameAnnotationForOperatorLikeDefinition
object IconName {
${allIconValues.map(line => "  " + line).join("\n")}

  def AsStringCodec: Codec[IconName, String] = new Codec[IconName, String] {
    override def encode(scalaValue: IconName): String = scalaValue.asInstanceOf[String] // scalafix:ok
    override def decode(domValue: String): IconName = domValue.asInstanceOf[IconName] // scalafix:ok
  }
}
`.trim();
}

export default async function generateIcons(): Promise<void> {
  try {
    const iconsDir = path.join(workspaceRoot, 'node_modules', '@ui5', 'webcomponents-icons', 'dist');
    
    // Get all icon names
    const allIconNames = fs.readdirSync(iconsDir)
      .filter(fileName => fileName.endsWith('.js'))
      .map(fileName => fileName.slice(0, -3)) // Remove .js extension
      .filter(name => !nonIcons.includes(name))
      .sort();
    
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
    const iconImportsContent = generateIconImportsFileContent(allIconNames, fullPackageName);
    const iconImportsFile = path.join(destinationFolder, 'IconImports.scala');
    fs.writeFileSync(iconImportsFile, iconImportsContent);
    
    // Generate and write IconName.scala
    const iconNameContent = generateIconValuesFileContent(allIconNames, fullPackageName);
    const iconNameFile = path.join(destinationFolder, 'IconName.scala');
    fs.writeFileSync(iconNameFile, iconNameContent);
    
    console.log(`Generated icon files at ${destinationFolder}`);
  } catch (error) {
    console.error('Error generating icon files:', error);
    process.exit(1);
  }
}