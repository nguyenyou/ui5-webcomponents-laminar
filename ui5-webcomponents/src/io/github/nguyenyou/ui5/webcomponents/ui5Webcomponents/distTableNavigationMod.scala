package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`1`
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableNavigationMod {
  
  /**
    * Handles the keyboard navigation for the ui5-table.
    *
    * @class
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/TableNavigation", JSImport.Default)
  @js.native
  open class default protected () extends TableNavigation {
    def this(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default) = this()
  }
  
  /**
    * Handles the keyboard navigation for the ui5-table.
    *
    * @class
    * @private
    */
  @js.native
  trait TableNavigation
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableExtensionMod.default {
    
    var _colPosition: Double = js.native
    
    def _focusCurrentItem(): Unit = js.native
    
    def _focusElement(element: HTMLElement): Unit = js.native
    def _focusElement(element: HTMLElement, ignoreFocusIn: Boolean): Unit = js.native
    
    def _getNavigationItemsOfGrid(): js.Array[js.Array[js.UndefOr[HTMLElement]]] = js.native
    
    def _getNavigationItemsOfRow(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default): js.Array[HTMLElement] = js.native
    
    var _gridWalker: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distGridWalkerMod.default = js.native
    
    def _handleArrowDown(e: KeyboardEvent, eventOrigin: HTMLElement): Boolean = js.native
    
    def _handleArrowUp(e: KeyboardEvent, eventOrigin: HTMLElement): Boolean = js.native
    
    def _handleArrowUpDown(e: KeyboardEvent, eventOrigin: HTMLElement, direction: `-1` | `1`): Boolean = js.native
    
    def _handleEnter(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _handleF2(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _handleF7(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _handleTab(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    var _ignoreFocusIn: js.UndefOr[Boolean] = js.native
    
    def _isEventFromCurrentItem(e: Event): Boolean = js.native
    
    var _lastFocusedItem: js.UndefOr[HTMLElement] = js.native
    
    def _onKeyDownCapture(e: KeyboardEvent): Unit = js.native
    
    def _onKeyDownCaptureBound(e: KeyboardEvent): Unit = js.native
    
    def _onclick(e: PointerEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _setCurrentItem(e: Event): Unit = js.native
    def _setCurrentItem(e: Event, callback: js.Function1[/* currentItem */ HTMLElement, Unit]): Unit = js.native
    
    var _tabPosition: Double = js.native
    
    var _table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default = js.native
  }
}
