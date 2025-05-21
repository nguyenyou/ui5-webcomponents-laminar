package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeRootMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/ThemeRoot.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachCustomThemeStylesToHead(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("attachCustomThemeStylesToHead")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def getThemeRoot(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeRoot")().asInstanceOf[js.UndefOr[String]]
  
  /**
    * Sets theme root for the current theme.
    * When set, the framework will validate the theme root and fetch the theme styles (CSS variables) from this location.
    *
    * **Note:** The feature is specific to custom themes, created with the `UI Theme Designer`.
    * The provided theme root is used only as a base to construct the actual location of the theme styles: `{themeRoot}/.../css_variables.css`.
    *
    * **Note:** Certain security restrictions will apply before fetching the theme assets.
    * Absolute URLs to a different origin than the current page will result in using the current page as an origin.
    * To allow specific origins, use &lt;meta name="sap-allowedThemeOrigins" content="https://my-example-host.com/"&gt; tag inside the &lt;head&gt; of the page.
    *
    * @public
    * @since 1.14.0
    * @param { string } themeRoot the new theme root
    * @returns { Promise<void> }
    */
  inline def setThemeRoot(themeRoot: String): js.UndefOr[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setThemeRoot")(themeRoot.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Promise[Unit]]]
}
