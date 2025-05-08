package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableUtilsMod {
  
  @JSImport("@ui5/webcomponents/dist/TableUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findRowInPath(composedPath: js.Array[EventTarget]): default = ^.asInstanceOf[js.Dynamic].applyDynamic("findRowInPath")(composedPath.asInstanceOf[js.Any]).asInstanceOf[default]
  
  inline def findVerticalScrollContainer(element: HTMLElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("findVerticalScrollContainer")(element.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  
  inline def isFeature[T](element: Any, identifier: String): /* is T */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isFeature")(element.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[/* is T */ Boolean]
  
  inline def isHeaderSelector(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeaderSelector")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isInstanceOfTable(obj: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/Table.default */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfTable")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/Table.default */ Boolean]
  
  inline def isSelectionCheckbox(e: Event): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSelectionCheckbox")(e.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if a given width is valid for a column.
    *
    * @param width Width string to check
    * @returns {boolean} true if the width is valid, false otherwise
    */
  inline def isValidColumnWidth(): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidColumnWidth")().asInstanceOf[/* is string */ Boolean]
  inline def isValidColumnWidth(width: String): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidColumnWidth")(width.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def scrollElementIntoView(
    scrollContainer: HTMLElement,
    element: HTMLElement,
    stickyElements: js.Array[HTMLElement],
    isRtl: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("scrollElementIntoView")(scrollContainer.asInstanceOf[js.Any], element.asInstanceOf[js.Any], stickyElements.asInstanceOf[js.Any], isRtl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def throttle(callback: js.Function0[Unit]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def toggleAttribute(element: HTMLElement, attribute: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggleAttribute(element: HTMLElement, attribute: String, condition: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggleAttribute(element: HTMLElement, attribute: String, condition: Boolean, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def toggleAttribute(element: HTMLElement, attribute: String, condition: Unit, value: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleAttribute")(element.asInstanceOf[js.Any], attribute.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
