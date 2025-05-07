import { defineConfig } from "vite";
import { iframePreviewPlugin } from "./iframe-preview-plugin";

export default defineConfig({
  plugins: [iframePreviewPlugin()],
});
