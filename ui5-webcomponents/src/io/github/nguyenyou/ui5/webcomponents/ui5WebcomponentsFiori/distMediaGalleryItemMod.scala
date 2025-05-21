package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Wrapper
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryMod.IMediaGalleryItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.button
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMediaGalleryItemMod {
  
  /**
    * @class
    * ### Overview
    * The `ui5-media-gallery-item` web component represents the items displayed in the
    * `ui5-media-gallery` web component.
    *
    * **Note:** `ui5-media-gallery-item` is not supported when used outside of `ui5-media-gallery`.
    *
    * ### Keyboard Handling
    * The `ui5-media-gallery` provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/MediaGalleryItem.js";` (comes with `ui5-media-gallery`)
    * @constructor
    * @extends UI5Element
    * @public
    * @implements {IMediaGalleryItem}
    * @since 1.1.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/MediaGalleryItem.js", JSImport.Default)
  @js.native
  open class default () extends MediaGalleryItem
  
  /**
    * @class
    * ### Overview
    * The `ui5-media-gallery-item` web component represents the items displayed in the
    * `ui5-media-gallery` web component.
    *
    * **Note:** `ui5-media-gallery-item` is not supported when used outside of `ui5-media-gallery`.
    *
    * ### Keyboard Handling
    * The `ui5-media-gallery` provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/MediaGalleryItem.js";` (comes with `ui5-media-gallery`)
    * @constructor
    * @extends UI5Element
    * @public
    * @implements {IMediaGalleryItem}
    * @since 1.1.0
    */
  @js.native
  trait MediaGalleryItem extends IMediaGalleryItem {
    
    def _attachListeners(element: HTMLImageElement, callback: js.Function1[/* image */ HTMLImageElement, Unit]): js.UndefOr[`true`] = js.native
    
    /**
      * @private
      */
    var _contentImageNotFound: Boolean = js.native
    
    def _fireItemClick(): Unit = js.native
    
    /**
      * @private
      */
    var _interactive: Boolean = js.native
    
    def _isContentAvailable: Boolean | Null = js.native
    
    def _isThubmnailAvailable: Boolean | Null = js.native
    
    def _monitorLoadingError(): Unit = js.native
    
    var _monitoredContent: HTMLElement | Null = js.native
    
    var _monitoredThumbnail: HTMLElement | Null = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _role: js.UndefOr[button] = js.native
    
    def _showBackgroundIcon: Boolean = js.native
    
    /**
      * @private
      */
    var _square: Boolean = js.native
    
    def _thumbnail: HTMLElement | Null = js.native
    
    /**
      * @private
      */
    var _thumbnailDesign: Boolean = js.native
    
    /**
      * @private
      */
    var _thumbnailNotFound: Boolean = js.native
    
    def _updateContentImageLoaded(image: HTMLImageElement): Unit = js.native
    
    def _updateThumbnailLoaded(image: HTMLImageElement): Unit = js.native
    
    def _useContent: Boolean | Null = js.native
    
    def _useThumbnail: Boolean | Null = js.native
    
    /**
      * Defines the content of the component.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * @private
      */
    var contentHeight: js.UndefOr[String] = js.native
    
    @JSName("displayedContent")
    def displayedContent_MMediaGalleryItem: HTMLElement | Null = js.native
    
    def effectiveTabIndex: js.UndefOr[Double] = js.native
    
    @JSName("eventDetails")
    var eventDetails_MediaGalleryItem: Click = js.native
    
    def styles: Wrapper = js.native
    
    /**
      * Defines the content of the thumbnail.
      * @public
      */
    var thumbnail: js.Array[HTMLElement] = js.native
  }
}
