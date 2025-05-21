package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Active
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.HTMLElementindividualSlot
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Navigate
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Navigation
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateScrollEnablementMod.ScrollEnablementEventListenerParam
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCarouselMod {
  
  /**
    * @class
    *
    * ### Overview
    * The Carousel allows the user to browse through a set of items.
    * The component is mostly used for showing a gallery of images, but can hold any other HTML element.
    *
    * There are several ways to perform navigation:
    *
    * - on desktop - the user can navigate using the navigation arrows or with keyboard shortcuts.
    * - on touch devices - the user can navigate using the navigation arrows (always visible) or can use swipe gestures.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - The items you want to display are very different from each other.
    * - You want to display the items one after the other.
    *
    * #### When not to use:
    *
    * - The items you want to display need to be visible at the same time.
    * - The items you want to display are uniform and very similar.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * When the `ui5-carousel` is focused the user can navigate between the items
    * with the following keyboard shortcuts:
    *
    * - [Up] or [Down] - Navigates to previous and next item
    * - [Left] or [Right] - Navigates to previous and next item
    *
    * ### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    *
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Carousel.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @public
    * @csspart content - Used to style the content of the component
    */
  @JSImport("@ui5/webcomponents/dist/Carousel.js", JSImport.Default)
  @js.native
  open class default () extends Carousel
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Carousel.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Carousel.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The Carousel allows the user to browse through a set of items.
    * The component is mostly used for showing a gallery of images, but can hold any other HTML element.
    *
    * There are several ways to perform navigation:
    *
    * - on desktop - the user can navigate using the navigation arrows or with keyboard shortcuts.
    * - on touch devices - the user can navigate using the navigation arrows (always visible) or can use swipe gestures.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - The items you want to display are very different from each other.
    * - You want to display the items one after the other.
    *
    * #### When not to use:
    *
    * - The items you want to display need to be visible at the same time.
    * - The items you want to display are uniform and very similar.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * When the `ui5-carousel` is focused the user can navigate between the items
    * with the following keyboard shortcuts:
    *
    * - [Up] or [Down] - Navigates to previous and next item
    * - [Left] or [Right] - Navigates to previous and next item
    *
    * ### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    *
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Carousel.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @public
    * @csspart content - Used to style the content of the component
    */
  @js.native
  trait Carousel
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _backgroundDesign: String = js.native
    
    def _getLastFocusedActivePageIndex: Double = js.native
    
    def _handleF7Key(e: KeyboardEvent): Unit = js.native
    
    def _isRTL: Boolean = js.native
    
    /**
      * Defines the carousel item width in pixels.
      * @private
      */
    var _itemWidth: js.UndefOr[Double] = js.native
    
    var _lastFocusedElements: js.Array[HTMLElement] = js.native
    
    @JSName("_navButtonClick")
    def _navButtonClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _onResize(): Unit = js.native
    
    def _onResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_onResizeBound")
    var _onResizeBound_Original: ResizeObserverCallback = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _onmouseout(): Unit = js.native
    
    def _onmouseover(): Unit = js.native
    
    var _orderOfLastFocusedPages: js.Array[Double] = js.native
    
    var _resizing: Boolean = js.native
    
    def _roleDescription: String = js.native
    
    var _scrollEnablement: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateScrollEnablementMod.default = js.native
    
    /**
      * Defines the index of the initially selected item.
      * @default 0
      * @private
      */
    var _selectedIndex: Double = js.native
    
    def _updateScrolling(e: ScrollEnablementEventListenerParam): Unit = js.native
    
    /**
      * If set to true navigation arrows are shown.
      * @private
      * @since 1.0.0-rc.15
      */
    var _visibleNavigationArrows: Boolean = js.native
    
    /**
      * Defines the carousel width in pixels.
      * @private
      */
    var _width: js.UndefOr[Double] = js.native
    
    /**
      * Defines the accessible name of the component.
      * @default undefined
      * @public
      * @since 1.24
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the input.
      * @default undefined
      * @public
      * @since 1.24
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaActiveDescendant: js.UndefOr[String] = js.native
    
    def ariaLabelTxt: js.UndefOr[String] = js.native
    
    /**
      * Defines the position of arrows.
      *
      * Available options are:
      *
      * - `Content` - the arrows are placed on the sides of the current page.
      * - `Navigation` - the arrows are placed on the sides of the page indicator.
      * @default "Content"
      * @public
      */
    var arrowsPlacement: /* template literal string: ${CarouselArrowsPlacement} */ String = js.native
    
    /**
      * Defines the carousel's background design.
      * @since 1.14
      * @default "Translucent"
      * @public
      */
    var backgroundDesign: /* template literal string: ${BackgroundDesign} */ String = js.native
    
    /**
      * Defines the content of the component.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines whether the carousel should loop, i.e show the first page after the last page is reached and vice versa.
      * @default false
      * @public
      */
    var cyclic: Boolean = js.native
    
    def dots: js.Array[Active] = js.native
    
    def effectiveItemsPerPage: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_Carousel: Navigate = js.native
    
    def hasManyPages: Boolean = js.native
    
    def hasNext: Boolean = js.native
    
    def hasPrev: Boolean = js.native
    
    /**
      * Defines the visibility of the navigation arrows.
      * If set to true the navigation arrows will be hidden.
      *
      * @since 1.0.0-rc.15
      * @default false
      * @public
      */
    var hideNavigationArrows: Boolean = js.native
    
    /**
      * Defines the visibility of the page indicator.
      * If set to true the page indicator will be hidden.
      * @since 1.0.0-rc.15
      * @default false
      * @public
      */
    var hidePageIndicator: Boolean = js.native
    
    def isIndexInRange(index: Double): Boolean = js.native
    
    def isItemInViewport(index: Double): Boolean = js.native
    
    def isPageTypeDots: Boolean = js.native
    
    /**
      * Assuming that all items have the same width
      * @private
      */
    def items: js.Array[ItemsInfo] = js.native
    
    /**
      * Defines the number of items per page depending on the carousel width.
      *
      * - 'S' for screens smaller than 600 pixels.
      * - 'M' for screens greater than or equal to 600 pixels and smaller than 1024 pixels.
      * - 'L' for screens greater than or equal to 1024 pixels and smaller than 1440 pixels.
      * - 'XL' for screens greater than or equal to 1440 pixels.
      *
      * One item per page is shown by default.
      * @default "S1 M1 L1 XL1"
      * @public
      */
    var itemsPerPage: String = js.native
    
    def navigateLeft(): Unit = js.native
    
    def navigateRight(): Unit = js.native
    
    /**
      * Changes the currently displayed page.
      * @param itemIndex The index of the target page
      * @since 1.0.0-rc.15
      * @public
      */
    def navigateTo(itemIndex: Double): Unit = js.native
    
    def nextPageText: String = js.native
    
    def ofText: String = js.native
    
    /**
      * Defines the page indicator background design.
      * @since 1.14
      * @default "Solid"
      * @public
      */
    var pageIndicatorBackgroundDesign: /* template literal string: ${BackgroundDesign} */ String = js.native
    
    /**
      * Defines the page indicator border design.
      * @since 1.14
      * @default "Solid"
      * @public
      */
    var pageIndicatorBorderDesign: /* template literal string: ${BorderDesign} */ String = js.native
    
    /**
      * Defines the style of the page indicator.
      * Available options are:
      *
      * - `Default` - The page indicator will be visualized as dots if there are fewer than 9 pages. If there are more pages, the page indicator will switch to displaying the current page and the total number of pages. (e.g. X of Y)
      * - `Numeric` - The page indicator will display the current page and the total number of pages. (e.g. X of Y)
      * @since 1.10
      * @default "Default"
      * @public
      */
    var pageIndicatorType: /* template literal string: ${CarouselPageIndicatorType} */ String = js.native
    
    def pagesCount: Double = js.native
    
    def previousPageText: String = js.native
    
    /**
      * @private
      */
    def renderNavigation: Boolean = js.native
    
    def selectedIndexToShow: Double = js.native
    
    def showArrows: Navigation = js.native
    
    def suppressAnimation: Boolean = js.native
    
    def validateSelectedIndex(): Unit = js.native
    
    /**
      * The indices of the currently visible items of the component.
      * @public
      * @since 1.0.0-rc.15
      * @default []
      */
    def visibleItemsIndices: js.Array[Double] = js.native
  }
  
  trait CarouselNavigateEventDetail extends StObject {
    
    var selectedIndex: Double
  }
  object CarouselNavigateEventDetail {
    
    inline def apply(selectedIndex: Double): CarouselNavigateEventDetail = {
      val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait ItemsInfo extends StObject {
    
    var _individualSlot: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var item: HTMLElementindividualSlot
    
    var posinset: Double
    
    var selected: Boolean
    
    var setsize: Double
    
    var tabIndex: Double
  }
  object ItemsInfo {
    
    inline def apply(
      id: String,
      item: HTMLElementindividualSlot,
      posinset: Double,
      selected: Boolean,
      setsize: Double,
      tabIndex: Double
    ): ItemsInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], posinset = posinset.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], setsize = setsize.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemsInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ItemsInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setItem(value: HTMLElementindividualSlot): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setPosinset(value: Double): Self = StObject.set(x, "posinset", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSetsize(value: Double): Self = StObject.set(x, "setsize", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def set_individualSlot(value: String): Self = StObject.set(x, "_individualSlot", value.asInstanceOf[js.Any])
      
      inline def set_individualSlotUndefined: Self = StObject.set(x, "_individualSlot", js.undefined)
    }
  }
}
