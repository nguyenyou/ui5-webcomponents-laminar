package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Delete
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search-item` is a list item, used for displaying search suggestions
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchItem.js";`
    *
    * @constructor
    * @extends ListItemBase
    * @public
    * @since 2.9.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchItem.js", JSImport.Default)
  @js.native
  open class default () extends SearchItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search-item` is a list item, used for displaying search suggestions
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SearchItem.js";`
    *
    * @constructor
    * @extends ListItemBase
    * @public
    * @since 2.9.0
    * @experimental
    */
  @js.native
  trait SearchItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    var _markupText: String = js.native
    
    def _onDeleteButtonClick(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    /**
      * Defines the description that appears right under the item text, if available.
      * @default undefined
      * @public
      * @since 2.12.0
      */
    var description: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_SearchItem: Focused & Delete = js.native
    
    var highlightText: String = js.native
    
    /**
      * Defines the icon name of the search item.
      * **Note:** If provided, the image slot will be ignored.
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * **Note:** While the slot allows the option of setting a custom avatar, to comply with the
      * design guidelines, use the `ui5-avatar` with size - XS.
      *
      * @public
      * @since 2.12.0
      */
    var image: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the scope of the search item
      * @default undefined
      * @public
      */
    var scopeName: js.UndefOr[String] = js.native
    
    /**
      * Defines the heading text of the search item.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
