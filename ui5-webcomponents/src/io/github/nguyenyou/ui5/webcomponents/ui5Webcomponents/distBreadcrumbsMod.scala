package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.WeakMap
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Itemclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PickAccessibilityAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBreadcrumbsMod {
  
  /**
    * @class
    *
    * ### Overview
    * Enables users to navigate between items by providing a list of links to previous steps in the user's navigation path.
    * It helps the user to be aware of their location within the application and allows faster navigation.
    *
    * The last three steps can be accessed as links directly, while the remaining links prior to them are available
    * in a drop-down menu.
    *
    * You can choose the type of separator to be used from a number of predefined options.
    *
    * ### Keyboard Handling
    * The `ui5-breadcrumbs` provides advanced keyboard handling.
    *
    * - [F4], [Alt] + [Up], [Alt] + [Down], [Space], or [Enter] - If the dropdown arrow is focused - opens/closes the drop-down.
    * - [Space],[Enter] - Activates the focused item and triggers the `item-click` event.
    * - [Escape] - Closes the drop-down.
    * - [Left] - If the drop-down is closed - navigates one item to the left.
    * - [Right] - If the drop-down is closed - navigates one item to the right.
    * - [Up] - If the drop-down is open - moves focus to the next item.
    * - [Down] - If the drop-down is open - moves focus to the previous item.
    * - [Home] - Navigates to the first item.
    * - [End] - Navigates to the last item.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents/dist/Breadcrumbs", JSImport.Default)
  @js.native
  open class default () extends Breadcrumbs
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Breadcrumbs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Breadcrumbs", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * Enables users to navigate between items by providing a list of links to previous steps in the user's navigation path.
    * It helps the user to be aware of their location within the application and allows faster navigation.
    *
    * The last three steps can be accessed as links directly, while the remaining links prior to them are available
    * in a drop-down menu.
    *
    * You can choose the type of separator to be used from a number of predefined options.
    *
    * ### Keyboard Handling
    * The `ui5-breadcrumbs` provides advanced keyboard handling.
    *
    * - [F4], [Alt] + [Up], [Alt] + [Down], [Space], or [Enter] - If the dropdown arrow is focused - opens/closes the drop-down.
    * - [Space],[Enter] - Activates the focused item and triggers the `item-click` event.
    * - [Escape] - Closes the drop-down.
    * - [Left] - If the drop-down is closed - navigates one item to the left.
    * - [Right] - If the drop-down is closed - navigates one item to the right.
    * - [Up] - If the drop-down is open - moves focus to the next item.
    * - [Down] - If the drop-down is open - moves focus to the previous item.
    * - [Home] - Navigates to the first item.
    * - [End] - Navigates to the last item.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait Breadcrumbs
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Returns the translatable accessible name for the popover
      * @private
      */
    def _accessibleNamePopover: String = js.native
    
    def _accessibleNameText: String = js.native
    
    var _breadcrumbItemWidths: WeakMap[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default, 
        Double
      ] = js.native
    
    /**
      * Caches the space required to render the content
      * @private
      */
    def _cacheWidths(): Unit = js.native
    
    def _cancelButtonText: String = js.native
    
    def _closeRespPopover(): Unit = js.native
    
    /**
      * Getter for accessible name of the current location. Includes the position of the current location and the size of the breadcrumbs
      */
    def _currentLocationAccName: String = js.native
    
    def _currentLocationLabel: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLabelMod.default | Null = js.native
    
    def _currentLocationText: String = js.native
    
    def _dropdownArrowAccessibleNameText: String = js.native
    
    /**
      * Getter for the interactive element that opens the overflow
      * @private
      */
    def _dropdownArrowLink: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.default = js.native
    
    var _dropdownArrowLinkWidth: Double = js.native
    
    def _endsWithCurrentLinkItem: js.UndefOr[String | `0`] = js.native
    
    def _endsWithCurrentLocation: Boolean = js.native
    
    def _getElementWidth(element: HTMLElement): Double = js.native
    
    /**
      * Obtains the items for navigation via keyboard
      * @private
      */
    def _getFocusableItems(): js.Array[ITabbable] = js.native
    
    def _getItemAccessibleName(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default,
      position: Double,
      size: Double
    ): String = js.native
    
    def _getItemPositionText(position: Double, size: Double): String = js.native
    
    def _getItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    def _getTotalContentWidth(): Double = js.native
    
    def _hasVisibleContent(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default): String | Boolean = js.native
    
    def _initItemNavigation(): Unit = js.native
    
    def _isCurrentLocationLabelFocused: Boolean | Null = js.native
    
    def _isDropdownArrowFocused: Boolean = js.native
    
    def _isItemVisible(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default): String | Boolean = js.native
    
    def _isOverflowEmpty: Boolean = js.native
    
    def _isPickerOpen: Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _labelFocusAdaptor: FocusAdaptor = js.native
    
    /**
      * Getter for the list of links corresponding to the abstract breadcrumb items
      */
    def _links: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distLinkMod.default] = js.native
    
    /**
      * Getter for the list of abstract breadcrumb items to be rendered as links outside the overflow
      */
    def _linksData: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    /**
      * Returns the maximum allowed count of items in the overflow
      * with respect to the UX requirement to never overflow the last visible item
      */
    def _maxAllowedOverflowSize: Double = js.native
    
    /**
      * Returns all items that should be displayed in the popover on mobile devices
      * @private
      */
    def _mobilePopoverItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    def _onLabelPress(e: KeyboardEvent): Unit = js.native
    def _onLabelPress(e: MouseEvent): Unit = js.native
    
    def _onLinkPress(e: CustomEvent): Unit = js.native
    
    def _onOverflowListItemSelect(e: CustomEvent): Unit = js.native
    
    def _onResizeHandler(): js.Promise[Unit] | Unit = js.native
    @JSName("_onResizeHandler")
    var _onResizeHandler_Original: ResizeObserverCallback = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _openRespPopover(): Unit = js.native
    
    /**
      * Getter for the list of abstract breadcrumb items to be rendered as list-items inside the overflow
      */
    def _overflowItemsData: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    /**
      * Holds the number of items in the overflow.
      * @default 0
      * @private
      */
    var _overflowSize: Double = js.native
    
    def _preprocessItems(): Unit = js.native
    
    def _respPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _toggleRespPopover(): Unit = js.native
    
    def _updateOverflow(): Unit = js.native
    
    def _visibleItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    /**
      * Defines the visual appearance of the last BreadcrumbsItem.
      *
      * The Breadcrumbs supports two visual appearances for the last BreadcrumbsItem:
      * - "Standard" - displaying the last item as "current page" (bold and without separator)
      * - "NoCurrentPage" - displaying the last item as a regular BreadcrumbsItem, followed by separator
      * @default "Standard"
      * @public
      */
    var design: /* template literal string: ${BreadcrumbsDesign} */ String = js.native
    
    @JSName("eventDetails")
    var eventDetails_Breadcrumbs: Itemclick = js.native
    
    def getCurrentLocationLabelWrapper(): HTMLElement | Null = js.native
    
    /**
      * Defines the component items.
      *
      * **Note:** Use the `ui5-breadcrumbs-item` component to define the desired items.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
      ] = js.native
    
    def linkAccessibilityAttributes: PickAccessibilityAttribut = js.native
    
    var responsivePopover: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default
      ] = js.native
    
    /**
      * Determines the visual style of the separator between the breadcrumb items.
      * @default "Slash"
      * @public
      */
    var separators: /* template literal string: ${BreadcrumbsSeparator} */ String = js.native
  }
  
  trait BreadcrumbsItemClickEventDetail extends StObject {
    
    var altKey: js.UndefOr[Boolean] = js.undefined
    
    var ctrlKey: js.UndefOr[Boolean] = js.undefined
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default
    
    var metaKey: js.UndefOr[Boolean] = js.undefined
    
    var shiftKey: js.UndefOr[Boolean] = js.undefined
  }
  object BreadcrumbsItemClickEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default): BreadcrumbsItemClickEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[BreadcrumbsItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BreadcrumbsItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBreadcrumbsItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
      
      inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
    }
  }
  
  trait FocusAdaptor
    extends StObject
       with ITabbable {
    
    @JSName("forcedTabIndex")
    var forcedTabIndex_FocusAdaptor: String
    
    def getlabelWrapper(): Element | Null
  }
  object FocusAdaptor {
    
    inline def apply(forcedTabIndex: String, getlabelWrapper: () => Element | Null, id: String): FocusAdaptor = {
      val __obj = js.Dynamic.literal(forcedTabIndex = forcedTabIndex.asInstanceOf[js.Any], getlabelWrapper = js.Any.fromFunction0(getlabelWrapper), id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusAdaptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusAdaptor] (val x: Self) extends AnyVal {
      
      inline def setForcedTabIndex(value: String): Self = StObject.set(x, "forcedTabIndex", value.asInstanceOf[js.Any])
      
      inline def setGetlabelWrapper(value: () => Element | Null): Self = StObject.set(x, "getlabelWrapper", js.Any.fromFunction0(value))
    }
  }
}
