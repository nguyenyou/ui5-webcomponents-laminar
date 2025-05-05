package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.IOption
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-option` component defines the content of an option in the `ui5-select`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Option.js";`
    * @constructor
    * @extends ListItemBase
    * @implements {IOption}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Option", JSImport.Default)
  @js.native
  open class default () extends Option
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-option` component defines the content of an option in the `ui5-select`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Option.js";`
    * @constructor
    * @extends ListItemBase
    * @implements {IOption}
    * @public
    */
  @js.native
  trait Option extends IOption {
    
    def displayIconBegin: Boolean = js.native
    
    @JSName("effectiveDisplayText")
    def effectiveDisplayText_MOption: String = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
