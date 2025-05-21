package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Theme.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the default theme.
    *
    * Note: Default theme might be different than the configurated one.
    *
    * @public
    * @returns {string}
    */
  inline def getDefaultTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultTheme")().asInstanceOf[String]
  
  inline def getTheme(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTheme")().asInstanceOf[String]
  
  /**
    * Returns if the currently set theme is part of legacy theme families ("sap_fiori_3").
    * **Note**: in addition, the method checks the base theme of a custom theme, built via the ThemeDesigner.
    *
    * @private
    * @returns { boolean }
    */
  inline def isLegacyThemeFamily(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyThemeFamily")().asInstanceOf[Boolean]
  
  inline def isLegacyThemeFamilyAsync(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyThemeFamilyAsync")().asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Returns if the given theme name is the one currently applied.
    * @private
    * @param {string} theme
    * @returns {boolean}
    */
  inline def isTheme(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Applies a new theme after fetching its assets from the network.
    * @public
    * @param {string} theme the name of the new theme
    * @returns {Promise<void>} a promise that is resolved when the new theme assets have been fetched and applied to the DOM
    */
  inline def setTheme(theme: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setTheme")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
}
