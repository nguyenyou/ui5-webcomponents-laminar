import { mkdir, writeFile, readdir, readFile } from "node:fs/promises";
import { resolve, extname, basename, dirname } from "node:path";
import { fileURLToPath } from "node:url";

export default async function copySharedFiles(
  packageName: string,
  outDir: string
): Promise<void> {
  const currentFilePath = fileURLToPath(import.meta.url);
  const currentDir = dirname(currentFilePath);
  const sharedSourceDir = resolve(currentDir, "shared");
  const sharedOutDir = resolve(outDir, "shared");

  await mkdir(sharedOutDir, { recursive: true });

  // Read all files from the shared source directory
  const files = await readdir(sharedSourceDir);

  // Copy each file to the output directory with .scala extension
  const copyPromises = files.map(async (file) => {
    const sourceFilePath = resolve(sharedSourceDir, file);
    const fileContent = await readFile(sourceFilePath, "utf-8");
    
    // Trim whitespace from the beginning and end before splitting
    const contentLines = fileContent.trim().split('\n');
    // remove the first and last line
    contentLines.shift();
    contentLines.pop();
    // replace the first line with packageName
    contentLines[0] = `package ${packageName}`;
    const modifiedContent = contentLines.join('\n') + '\n';
    
    const fileNameWithoutExt = basename(file, extname(file));
    const outputFilePath = resolve(sharedOutDir, `${fileNameWithoutExt}.scala`);

    await writeFile(outputFilePath, modifiedContent);
  });

  await Promise.all(copyPromises);
  console.log(`Copied ${files.length} shared files to ${sharedOutDir}`);
}
