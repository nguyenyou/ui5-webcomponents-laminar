package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigTooltipsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/Tooltips", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEnableDefaultTooltips(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("getEnableDefaultTooltips")().asInstanceOf[Boolean]
  
  /**
    * Defines the "enableDefaultTooltips" setting.
    *
    * - When set to "true" (default), the components will display default tooltips.
    * - When set to "false", the components will NOT display default tooltips.
    *
    * @public
    * @since 2.1.0
    * @param { boolean } enableDefaultTooltips
    */
  inline def setEnableDefaultTooltips(enableDefaultTooltips: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setEnableDefaultTooltips")(enableDefaultTooltips.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
