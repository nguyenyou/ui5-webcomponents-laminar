import { defineConfig } from "vite";
import { iframePreviewPlugin } from "./iframe-preview-plugin";
import tailwindcss from '@tailwindcss/vite'

export default defineConfig({
  plugins: [tailwindcss(), iframePreviewPlugin()],
  base: process.env.PAGES_BASE_PATH || '/',
});
