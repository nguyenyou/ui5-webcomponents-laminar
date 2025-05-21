#!/usr/bin/env node

import * as fs from 'fs/promises';
import * as path from 'path';

// Regex to find @JSImport annotations
const jsImportRegex = /@JSImport\("([^"]+)"([^)]*)\)/g;

async function processFile(filePath) {
  try {
    // Read file content
    const content = await fs.readFile(filePath, 'utf8');
    
    // Replace @JSImport paths without .js extension
    const updatedContent = content.replace(jsImportRegex, (match, importPath, rest) => {
      // Only append .js if:
      // 1. It doesn't already end with .js
      // 2. It's not a namespace import (ending with /)
      // 3. It contains "/dist/" or starts with "dist/"
      if (!importPath.endsWith('.js') && 
          !importPath.endsWith('/') && 
          (importPath.includes('/dist/') || importPath.startsWith('dist/'))) {
        return `@JSImport("${importPath}.js"${rest})`;
      }
      return match;
    });
    
    // Only write if content was changed
    if (content !== updatedContent) {
      await fs.writeFile(filePath, updatedContent);
      console.log(`Updated: ${filePath}`);
    }
  } catch (error) {
    console.error(`Error processing file ${filePath}:`, error);
  }
}

async function traverseDirectory(dirPath) {
  try {
    const entries = await fs.readdir(dirPath);
    
    for (const entry of entries) {
      const entryPath = path.join(dirPath, entry);
      const stats = await fs.stat(entryPath);
      
      if (stats.isDirectory()) {
        // Recursively process subdirectories
        await traverseDirectory(entryPath);
      } else if (stats.isFile() && entryPath.endsWith('.scala')) {
        // Process .scala files
        await processFile(entryPath);
      }
    }
  } catch (error) {
    console.error(`Error traversing directory ${dirPath}:`, error);
  }
}

async function main() {
  // Get target directory from command line argument or use default
  const targetDir = process.argv[2] || './ui5-webcomponents';
  
  console.log(`Processing .scala files in ${targetDir}...`);
  console.log(`Only appending .js to imports from 'dist/' paths`);
  
  try {
    await traverseDirectory(targetDir);
    console.log('Done!');
  } catch (error) {
    console.error('Error:', error);
    process.exit(1);
  }
}

main(); 