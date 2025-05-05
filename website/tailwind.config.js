const { extractTw } = require("scalawind/dist/transform");

/** @type {import('tailwindcss').Config} */
module.exports = {
  content: {
    files: ["./index.html", "./src/**/*.scala"],
    transform: {
      scala: (content) => {
        try {
          const utilities = extractTw(content);
          const result = `
            ${content}

            ${utilities}
          `;
          return result;
        } catch (error) {
          console.log("[Scalawind]: Can't transform scala source!");
          return content;
        }
      },
    },
  },
  theme: {
    extend: {
      colors: {
        primary: "rgb(205, 37, 41)",
        sap: {
          brand: "var(--sapBrandColor)",
          text: "var(--sapTextColor)",
          neutral: "var(--sapNeutralColor)",
          background: "var(--sapBackgroundColor)",
        },
      },
    },
    fontFamily: {
      sans: ["Inter", "sans-serif"],
      mono: ["Source Code Pro", "monospace"],
    },
  },
  corePlugins: {
    preflight: false,
  },
};
