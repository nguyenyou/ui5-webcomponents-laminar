import * as path from "path";
import { fileURLToPath } from "url";
import { ModuleKind, Project, ScriptTarget } from "ts-morph";

const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

export const workspaceRoot = path.resolve(
  __dirname,
  "../../../"
);

export const nodemodules = path.join(
  workspaceRoot,
  "node_modules"
);

export const ui5webcomponents = path.join(
  nodemodules,
  "@ui5/webcomponents/dist/**/*{.d.ts,.ts}",
);

export const project = new Project({
  compilerOptions: {
    target: ScriptTarget.ES2020,
    module: ModuleKind.ESNext,
  },
});
project.addSourceFilesAtPaths(ui5webcomponents);
