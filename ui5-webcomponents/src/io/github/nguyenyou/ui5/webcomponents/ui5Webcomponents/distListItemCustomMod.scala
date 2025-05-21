package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemCustomMod {
  
  /**
    * @class
    *
    * A component to be used as custom list item within the `ui5-list`
    * the same way as the standard `ui5-li`.
    *
    * The component accepts arbitrary HTML content to allow full customization.
    * @csspart native-li - Used to style the main li tag of the list item
    * @csspart content - Used to style the content area of the list item
    * @csspart detail-button - Used to style the button rendered when the list item is of type detail
    * @csspart delete-button - Used to style the button rendered when the list item is in delete mode
    * @csspart radio - Used to style the radio button rendered when the list item is in single selection mode
    * @csspart checkbox - Used to style the checkbox rendered when the list item is in multiple selection mode
    * @slot {Node[]} default - Defines the content of the component.
    * @constructor
    * @extends ListItem
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ListItemCustom.js", JSImport.Default)
  @js.native
  open class default () extends ListItemCustom
  
  /**
    * @class
    *
    * A component to be used as custom list item within the `ui5-list`
    * the same way as the standard `ui5-li`.
    *
    * The component accepts arbitrary HTML content to allow full customization.
    * @csspart native-li - Used to style the main li tag of the list item
    * @csspart content - Used to style the content area of the list item
    * @csspart detail-button - Used to style the button rendered when the list item is of type detail
    * @csspart delete-button - Used to style the button rendered when the list item is in delete mode
    * @csspart radio - Used to style the radio button rendered when the list item is in single selection mode
    * @csspart checkbox - Used to style the checkbox rendered when the list item is in multiple selection mode
    * @slot {Node[]} default - Defines the content of the component.
    * @constructor
    * @extends ListItem
    * @public
    */
  @js.native
  trait ListItemCustom
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.default
}
