package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingCustomStyleMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/CustomStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCustomCSS(tag: String, css: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("addCustomCSS")(tag.asInstanceOf[js.Any], css.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def attachCustomCSSChange(listener: CustomCSSChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachCustomCSSChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def detachCustomCSSChange(listener: CustomCSSChangeCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachCustomCSSChange")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getCustomCSS(tag: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomCSS")(tag.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type CustomCSSChangeCallback = js.Function1[/* tag */ String, Unit]
}
