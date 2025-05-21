package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarSelectOptionMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toolbar-select-option` component defines the content of an option in the `ui5-toolbar-select`.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.17.0
    */
  @JSImport("@ui5/webcomponents/dist/ToolbarSelectOption.js", JSImport.Default)
  @js.native
  open class default () extends ToolbarSelectOption
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toolbar-select-option` component defines the content of an option in the `ui5-toolbar-select`.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.17.0
    */
  @js.native
  trait ToolbarSelectOption
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the selected state of the component.
      * @default false
      * @public
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
