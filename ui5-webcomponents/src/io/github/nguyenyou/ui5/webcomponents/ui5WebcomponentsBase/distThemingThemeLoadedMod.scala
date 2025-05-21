package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingThemeLoadedMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/ThemeLoaded.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def fireThemeLoaded(theme: String): js.Array[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("fireThemeLoaded")(theme.asInstanceOf[js.Any]).asInstanceOf[js.Array[Unit]]
  
  type ThemeLoadedCallback = js.Function1[/* theme */ String, Unit]
}
