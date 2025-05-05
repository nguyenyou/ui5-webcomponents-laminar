package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.DOMRect
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilPopupUtilsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/PopupUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getClosedPopupParent(el: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getClosedPopupParent")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def getFocusedElement(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFocusedElement")().asInstanceOf[HTMLElement | Null]
  
  inline def isClickInRect(e: MouseEvent, rect: DOMRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClickInRect")(e.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isClickInRect(e: TouchEvent, rect: DOMRect): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClickInRect")(e.asInstanceOf[js.Any], rect.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isFocusedElementWithinNode(node: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusedElementWithinNode")(node.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
