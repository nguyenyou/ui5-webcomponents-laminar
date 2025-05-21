package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSuggestionListItemMod {
  
  /**
    * @class
    * The `ui5-li-suggestion-item` represents the suggestion item in the `ui5-input`
    * suggestion popover.
    * @constructor
    * @extends ListItemStandard
    * @csspart title - Used to style the title of the suggestion list item
    * @csspart description - Used to style the description of the suggestion list item
    * @csspart info - Used to style the info of the suggestion list item
    */
  @JSImport("@ui5/webcomponents/dist/SuggestionListItem", JSImport.Default)
  @js.native
  open class default () extends SuggestionListItem
  
  /**
    * @class
    * The `ui5-li-suggestion-item` represents the suggestion item in the `ui5-input`
    * suggestion popover.
    * @constructor
    * @extends ListItemStandard
    * @csspart title - Used to style the title of the suggestion list item
    * @csspart description - Used to style the description of the suggestion list item
    * @csspart info - Used to style the info of the suggestion list item
    */
  @js.native
  trait SuggestionListItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemStandardMod.default {
    
    def effectiveTitle: String = js.native
    
    def groupItem: Boolean = js.native
    
    def hasDescription: js.UndefOr[String | `true`] = js.native
    
    /**
      * Defines a description that can contain HTML.
      * **Note:** If not specified, the `description` property will be used.
      * @since 1.0.0-rc.8
      * @public
      */
    var richDescription: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the title text of the suggestion item.
      * @public
      */
    var titleText: js.Array[Node] = js.native
  }
}
