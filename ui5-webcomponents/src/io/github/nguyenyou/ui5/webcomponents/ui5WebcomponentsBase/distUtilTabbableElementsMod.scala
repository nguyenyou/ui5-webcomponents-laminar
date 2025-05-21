package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilTabbableElementsMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/TabbableElements", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns the last tabbable element within the provided HTMLElement.
    *
    * @public
    * @param { HTMLElement } el the component to operate on (component that slots or contains within its shadow root the items the user navigates among)
    * @returns { HTMLElement | null } the last tabbable element or "null" if not found
    */
  inline def getLastTabbableElement(el: HTMLElement): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastTabbableElement")(el.asInstanceOf[js.Any]).asInstanceOf[HTMLElement | Null]
  
  inline def getTabbableElements(el: HTMLElement): js.Array[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabbableElements")(el.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLElement]]
}
