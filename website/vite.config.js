import { defineConfig } from "vite";
import path from "path";
import { fileURLToPath } from "url";
import { iframePreviewPlugin } from "./iframe-preview-plugin";

const __dirname = path.dirname(fileURLToPath(import.meta.url));

const isProd = process.env.NODE_ENV == "production";

export default defineConfig({
  plugins: [iframePreviewPlugin()],
  resolve: {
    alias: [
      {
        find: /^scalajs:(.*)$/,
        replacement: path.resolve(
          __dirname,
          `../out/website/${isProd ? "full" : "fast"}LinkJS.dest/$1`
        ),
      },
    ],
  },
});
