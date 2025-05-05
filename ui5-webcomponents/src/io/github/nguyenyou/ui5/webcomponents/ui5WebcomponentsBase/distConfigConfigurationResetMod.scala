package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigConfigurationResetMod {
  
  @JSImport("@ui5/webcomponents-base/dist/config/ConfigurationReset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachConfigurationReset(listener: ConfigurationResetCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachConfigurationReset")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def resetConfiguration(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetConfiguration")().asInstanceOf[Unit]
  
  type ConfigurationResetCallback = js.Function0[Unit]
}
