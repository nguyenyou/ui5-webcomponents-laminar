package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigFontsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Fonts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDefaultFontLoading(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultFontLoading")().asInstanceOf[Boolean]
  
  /**
    * Defines the "defaultFontLoading" setting.
    *
    * - When set to "true" (default), all used font faces are fetched over the network.
    * - When set to "false", default font faces are not fetched automatically and must be managed separately.
    * @public
    * @param { boolean } defaultFontLoadingData
    */
  inline def setDefaultFontLoading(defaultFontLoadingData: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultFontLoading")(defaultFontLoadingData.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
