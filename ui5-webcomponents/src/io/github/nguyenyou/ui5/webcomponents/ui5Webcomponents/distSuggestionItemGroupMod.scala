package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSuggestionItemGroupMod {
  
  /**
    * @class
    * The `ui5-suggestion-item-group` is type of suggestion item,
    * that can be used to split the `ui5-input` suggestions into groups.
    * @constructor
    * @extends ListItemGroup
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents/dist/SuggestionItemGroup.js", JSImport.Default)
  @js.native
  open class default () extends SuggestionItemGroup
  
  /**
    * @class
    * The `ui5-suggestion-item-group` is type of suggestion item,
    * that can be used to split the `ui5-input` suggestions into groups.
    * @constructor
    * @extends ListItemGroup
    * @public
    * @since 2.0.0
    */
  @js.native
  trait SuggestionItemGroup
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupMod.default {
    
    /**
      * Defines the items of the <code>ui5-suggestion-item-group</code>.
      * @public
      */
    @JSName("items")
    var items_SuggestionItemGroup: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSuggestionListItemMod.default
      ] = js.native
  }
}
