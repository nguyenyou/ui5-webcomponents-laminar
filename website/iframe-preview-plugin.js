import fs from "fs";
import path from "path";

export const iframePreviewPlugin = () => {
  return {
    name: "iframe-preview-plugin",
    enforce: "post",
    closeBundle: async () => {
      // This runs after the bundle has been written to disk
      const assetsDir = path.resolve(__dirname, "dist/assets");

      // Find the JS and CSS files with their hashes
      const files = fs.readdirSync(assetsDir);
      const jsFile = files.find((file) => file.match(/^index-.*\.js$/));
      const cssFile = files.find((file) => file.match(/^index-.*\.css$/));

      if (!jsFile || !cssFile) {
        console.error("Could not find index JS or CSS files");
        return;
      }

      // Extract hash values
      const jsHash = jsFile.match(/index-(.*?)\.js/)[1];
      const cssHash = cssFile.match(/index-(.*?)\.css/)[1];

      console.log(`Found JS hash: ${jsHash}`);
      console.log(`Found CSS hash: ${cssHash}`);

      // Read the JS file content
      const jsFilePath = path.join(assetsDir, jsFile);
      let content = fs.readFileSync(jsFilePath, "utf8");

      if (content.includes("[REPLACE_THIS_WITH_INDEX_JS_HASH]")) {
        content = content.replace(
          /\[REPLACE_THIS_WITH_INDEX_JS_HASH\]/g,
          jsHash
        );
        console.log("Replaced [REPLACE_THIS_WITH_INDEX_JS_HASH] with", jsHash);
      }
      if (content.includes("[REPLACE_THIS_WITH_INDEX_CSS_HASH]")) {
        content = content.replace(
          /\[REPLACE_THIS_WITH_INDEX_CSS_HASH\]/g,
          cssHash
        );
        console.log(
          "Replaced [REPLACE_THIS_WITH_INDEX_CSS_HASH] with",
          cssHash
        );
      }

      fs.writeFileSync(jsFilePath, content);
    },
  };
};
