package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Displayareaclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.Horizontal
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.Vertical
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediaGalleryMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-media-gallery` component allows the user to browse through multimedia items. Currently,
    * the supported items are images and videos. The items should be defined using the `ui5-media-gallery-item`
    * component.
    *
    * The items are initially displayed as thumbnails. When the user selects a thumbnail, the corresponding item
    * is displayed in larger size.
    *
    * The component is responsive by default and adjusts the position of the menu with respect to viewport size,
    * but the application is able to further customize the layout via the provided API.
    *
    * ### Keyboard Handling
    * The `ui5-media-gallery` provides advanced keyboard handling.
    *
    * When the thumbnails menu is focused the following keyboard
    * shortcuts allow the user to navigate through the thumbnail items:
    *
    * - [Up] or [Down] - Navigates up and down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    * - [Space], [Enter] - Selects an item
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/MediaGallery.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/MediaGalleryItem.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/MediaGallery.js", JSImport.Default)
  @js.native
  open class default () extends MediaGallery
  
  /**
    * Interface for components that can be slotted inside `ui5-media-gallery` as items.
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IMediaGalleryItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var disabled: Boolean = js.native
    
    var displayedContent: HTMLElement | Null = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var layout: /* template literal string: ${MediaGalleryItemLayout} */ String = js.native
    
    var selected: Boolean = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-media-gallery` component allows the user to browse through multimedia items. Currently,
    * the supported items are images and videos. The items should be defined using the `ui5-media-gallery-item`
    * component.
    *
    * The items are initially displayed as thumbnails. When the user selects a thumbnail, the corresponding item
    * is displayed in larger size.
    *
    * The component is responsive by default and adjusts the position of the menu with respect to viewport size,
    * but the application is able to further customize the layout via the provided API.
    *
    * ### Keyboard Handling
    * The `ui5-media-gallery` provides advanced keyboard handling.
    *
    * When the thumbnails menu is focused the following keyboard
    * shortcuts allow the user to navigate through the thumbnail items:
    *
    * - [Up] or [Down] - Navigates up and down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    * - [Space], [Enter] - Selects an item
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/MediaGallery.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/MediaGalleryItem.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    */
  @js.native
  trait MediaGallery
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _calculateOverflowSize(width: Double, height: Double): Double = js.native
    
    def _carousel: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCarouselMod.default | Null = js.native
    
    def _display: HTMLElement | Null = js.native
    
    def _displayContent(item: IMediaGalleryItem): Unit = js.native
    
    def _findSelectableItem(): js.UndefOr[IMediaGalleryItem] = js.native
    
    def _getFocusableItems(): js.Array[ITabbable] = js.native
    
    def _getMaxAllowedThumbnailsInColumn(columnHeight: Double): Double = js.native
    
    def _getOverflowSize(columnHeight: Double, columnsCount: Double): Double = js.native
    
    def _infereffectiveLayout(): Vertical | Horizontal | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout.Vertical | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout.Horizontal = js.native
    
    def _isPhonePlatform: Boolean = js.native
    
    def _isPhoneSize: Boolean = js.native
    
    def _isSelectableItem(item: IMediaGalleryItem): Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _mainItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryItemMod.default | Null = js.native
    
    def _mainItemHasWideLayout: Boolean | Null = js.native
    
    def _mainItemTabIndex: js.UndefOr[`0`] = js.native
    
    def _onCarouselNavigate(e: CustomEvent): Unit = js.native
    
    def _onDisplayAreaClick(): Unit = js.native
    
    def _onOverflowBtnClick(): Unit = js.native
    
    def _onResize(): Unit = js.native
    
    def _onThumbnailClick(e: MouseEvent): Unit = js.native
    
    def _overflowBtn: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    /**
      * The number of items in the overflow.
      * @private
      */
    var _overflowSize: Double = js.native
    
    def _selectItem(item: IMediaGalleryItem): Unit = js.native
    def _selectItem(item: IMediaGalleryItem, userInteraction: Boolean): Unit = js.native
    
    def _selectItemOnPhone(item: IMediaGalleryItem): Unit = js.native
    
    def _selectableItems: js.Array[IMediaGalleryItem] = js.native
    
    var _selectedItem: js.UndefOr[IMediaGalleryItem] = js.native
    
    def _shouldHaveSquareDisplay: Boolean = js.native
    
    def _shouldHaveWideDisplay: Boolean = js.native
    
    def _showOverflowBtn: Boolean = js.native
    
    def _showThumbnails: Boolean = js.native
    
    def _toggleDisplaySquareSize(enable: Boolean): Unit = js.native
    
    def _toggleMainItem9x16size(enable: Boolean): Unit = js.native
    
    def _updateLayout(): Unit = js.native
    
    def _updateMediaRange(width: Double): Unit = js.native
    
    def _updateSelectedFlag(itemToSelect: IMediaGalleryItem): Unit = js.native
    
    def _updateSelection(): Unit = js.native
    
    def _visibleItems: js.Array[IMediaGalleryItem] = js.native
    
    /**
      * Determines the actual applied layout type
      * (esp. needed when the app did not specify a fixed layout type
      * but selected `Auto` layout type).
      * @default "Vertical"
      * @private
      */
    var effectiveLayout: /* template literal string: ${MediaGalleryLayout} */ String = js.native
    
    @JSName("eventDetails")
    var eventDetails_MediaGallery: Displayareaclick = js.native
    
    /**
      * If enabled, a `display-area-click` event is fired
      * when the user clicks or taps on the display area.
      *
      * The display area is the central area that contains
      * the enlarged content of the currently selected item.
      * @default false
      * @public
      */
    var interactiveDisplayArea: Boolean = js.native
    
    /**
      * Defines the component items.
      *
      * **Note:** Only one selected item is allowed.
      *
      * **Note:** Use the `ui5-media-gallery-item` component to define the desired items.
      * @public
      */
    var items: js.Array[IMediaGalleryItem] = js.native
    
    /**
      * Determines the layout of the component.
      * @default "Auto"
      * @public
      */
    var layout: /* template literal string: ${MediaGalleryLayout} */ String = js.native
    
    /**
      * Defines the current media query size.
      * @private
      */
    var mediaRange: String = js.native
    
    /**
      * Determines the horizontal alignment of the thumbnails menu
      * vs. the central display area.
      * @default "Left"
      * @public
      */
    var menuHorizontalAlign: /* template literal string: ${MediaGalleryMenuHorizontalAlign} */ String = js.native
    
    /**
      * Determines the vertical alignment of the thumbnails menu
      * vs. the central display area.
      * @default "Bottom"
      * @public
      */
    var menuVerticalAlign: /* template literal string: ${MediaGalleryMenuVerticalAlign} */ String = js.native
    
    /**
      * If set to `true`, all thumbnails are rendered in a scrollable container.
      * If `false`, only up to five thumbnails are rendered, followed by
      * an overflow button that shows the count of the remaining thumbnails.
      * @default false
      * @public
      */
    var showAllThumbnails: Boolean = js.native
  }
  
  trait MediaGallerySelectionChangeEventDetail extends StObject {
    
    var item: IMediaGalleryItem
  }
  object MediaGallerySelectionChangeEventDetail {
    
    inline def apply(item: IMediaGalleryItem): MediaGallerySelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaGallerySelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaGallerySelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: IMediaGalleryItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
