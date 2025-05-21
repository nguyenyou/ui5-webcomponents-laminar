package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilCaretMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/Caret", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCaretPosition(field: HTMLInputElement): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getCaretPosition")(field.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  inline def setCaretPosition(field: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCaretPosition")(field.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setCaretPosition(field: HTMLInputElement, caretPos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCaretPosition")(field.asInstanceOf[js.Any], caretPos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
