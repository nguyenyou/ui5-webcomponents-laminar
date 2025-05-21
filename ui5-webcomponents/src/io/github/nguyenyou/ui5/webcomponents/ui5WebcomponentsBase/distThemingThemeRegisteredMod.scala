package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingThemeRegisteredMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/ThemeRegistered.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachThemeRegistered(listener: ThemeRegisteredCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachThemeRegistered")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fireThemeRegistered(theme: String): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fireThemeRegistered")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
  
  type ThemeRegisteredCallback = js.Function1[/* theme */ String, Unit]
}
