import { setTheme } from "@ui5/webcomponents-base/config/Theme.js";
setTheme("sap_horizon_dark");

import "scalajs:main.js";
import "./style.css";

window.setTimeout(() => {
  const initialDarkMode = document.getElementById("initial-dark-mode");
  if (initialDarkMode) {
    initialDarkMode.remove();
  }
}, 1000);
