package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThemingThemeLoadedMod.ThemeLoadedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingMod {
  
  @JSImport("@ui5/webcomponents-base/dist/Theming", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomCSS(tag: String, css: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomCSS")(tag.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def attachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachThemeLoaded(listener: ThemeLoadedCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachThemeLoaded")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
