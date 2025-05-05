package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Delete
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
    * `import "@ui5/webcomponents/fiori/dist/SearchItem.js";`
    *
    * @constructor
    * @extends ListItemBase
    * @public
    * @since 2.9.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchItem", JSImport.Default)
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
    * `import "@ui5/webcomponents/fiori/dist/SearchItem.js";`
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
    
    @JSName("eventDetails")
    var eventDetails_SearchItem: Focused & Delete = js.native
    
    var highlightText: String = js.native
    
    /**
      * Defines the icon name of the search item.
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines the scope of the search item
      * @default false
      * @public
      */
    var scopeName: js.UndefOr[String] = js.native
    
    /**
      * Defines the heading text of the search item.
      * @public
      */
    var text: String = js.native
  }
}
