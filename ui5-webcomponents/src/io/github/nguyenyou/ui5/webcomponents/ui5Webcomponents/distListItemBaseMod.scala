package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemBaseMod {
  
  /**
    * @class
    * A class to serve as a foundation
    * for the `ListItem` and `ListItemGroupHeader` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ListItemBase.js", JSImport.Default)
  @js.native
  open class default () extends ListItemBase
  
  /**
    * @class
    * A class to serve as a foundation
    * for the `ListItem` and `ListItemGroupHeader` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait ListItemBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _effectiveTabIndex: js.UndefOr[Double] = js.native
    
    def _focusable: Boolean = js.native
    
    def _handleTabNext(e: KeyboardEvent): Unit = js.native
    
    def _handleTabPrevious(e: KeyboardEvent): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _pressable: Boolean = js.native
    
    /**
      * Indicates if the list item is actionable, e.g has hover and pressed effects.
      * @private
      */
    var actionable: Boolean = js.native
    
    /**
      * Defines whether `ui5-li` is in disabled state.
      *
      * **Note:** A disabled `ui5-li` is noninteractive.
      * @default false
      * @protected
      * @since 1.0.0-rc.12
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_ListItemBase: Focused = js.native
    
    def fireItemPress(e: Event): Unit = js.native
    
    /**
      * Indicates if the element is on focus
      * @private
      */
    var focused: Boolean = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    /**
      * Defines if the list item should display its bottom border.
      * @private
      */
    var hasBorder: Boolean = js.native
    
    def hasConfigurableMode: Boolean = js.native
    
    /**
      * Defines whether the item is movable.
      * @default false
      * @private
      * @since 2.0.0
      */
    var movable: Boolean = js.native
    
    /**
      * Defines the selected state of the component.
      * @default false
      * @private
      */
    var selected: Boolean = js.native
    
    /**
      * Determines if th current list item either has no tabbable content or
      * [Tab] is performed onto the last tabbale content item.
      */
    def shouldForwardTabAfter(): Boolean = js.native
    
    /**
      * Determines if the current list item is target of [SHIFT+TAB].
      */
    def shouldForwardTabBefore(target: HTMLElement): Boolean = js.native
  }
  
  trait ListItemBasePressEventDetail extends StObject {
    
    var item: ListItemBase
    
    var key: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
  }
  object ListItemBasePressEventDetail {
    
    inline def apply(item: ListItemBase): ListItemBasePressEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemBasePressEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemBasePressEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: ListItemBase): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
