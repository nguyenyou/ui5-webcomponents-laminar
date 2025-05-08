import { resolve } from 'node:path';
import { readdir, readFile, unlink, writeFile } from 'node:fs/promises';
import { workspaceRoot } from 'util/project.js';

export default async function collectEnums(): Promise<void> {
    const laminarDir = resolve(workspaceRoot, 'ui5-webcomponents-laminar', 'src', 'io', 'github', 'nguyenyou', 'ui5', 'webcomponents', 'laminar');
    const enumFiles = [
        resolve(laminarDir, 'ai', 'EnumsAi.scala'),
        resolve(laminarDir, 'compat', 'EnumsCompat.scala'),
        resolve(laminarDir, 'EnumsFiori.scala'),
        resolve(laminarDir, 'EnumsBase.scala'),
    ]

    const enumSet = new Set<string>();

    // Read all files concurrently
    const fileContents = await Promise.all(
        enumFiles.map(file => readFile(file, 'utf-8'))
    );
    
    // Process the contents
    fileContents.forEach(content => {
        const enumContent = content.replace(/^package.*$/m, '').trim().split('\n').map(line => line.trim()).filter(line => line.length > 0);
        enumContent.forEach(line => enumSet.add(line));
    });

    const outputFile = resolve(laminarDir, 'shared', 'Enums.scala');
    await writeFile(outputFile, `package io.github.nguyenyou.ui5.webcomponents.laminar.shared

${Array.from(enumSet).join('\n')}
`);

    // Remove all enum files concurrently
    await Promise.all(
        enumFiles.map(file => unlink(file))
    );

    // Scan all files and remove the import of enum that has the same name
    const files = await readdir(laminarDir, { recursive: true });
    for (const file of files) {
        const filePath = resolve(laminarDir, file.toString());
        
        // Skip directories and the output file
        if (filePath === outputFile || !(filePath.endsWith('.scala'))) {
            continue;
        }
        
        try {
            const content = await readFile(filePath, 'utf-8');
            // Extract import statements for io.github.nguyenyou.ui5.webcomponents
            const importRegex = /import io\.github\.nguyenyou\.ui5\.webcomponents[^\n]+/g;
            const importStatements = content.match(importRegex);
            
            if (importStatements) {
                let updatedContent = content;
                
                for (const importStatement of importStatements) {
                    // Extract the import name (last part after the last dot)
                    const importName = importStatement.split('.').pop()?.trim();
                    
                    // Check if the import name exists in enumSet
                    if (importName && Array.from(enumSet).some(enumDef => enumDef.includes(importName))) {
                        // Remove this import line
                        updatedContent = updatedContent.replace(importStatement + '\n', '');
                    }
                }
                
                // Only write back if changes were made
                if (updatedContent !== content) {
                    await writeFile(filePath, updatedContent);
                }
            }
        } catch (error) {
            console.error(`Error processing file ${filePath}:`, error);
        }
    }

    console.log(`Collected ${enumSet.size} enums from ${enumFiles.length} files and wrote to ${outputFile}`);
}
