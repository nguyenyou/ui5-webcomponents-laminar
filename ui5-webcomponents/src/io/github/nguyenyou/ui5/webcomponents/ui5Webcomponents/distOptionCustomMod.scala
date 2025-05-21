package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.IOption
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptionCustomMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-option-custom` component defines a custom content of an option in the `ui5-select`.
    * A component to be the same way as the standard `ui5-option`.
    * The component accepts arbitrary HTML content to allow full customization.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/OptionCustom.js";`
    * @constructor
    * @since 2.0.0
    * @extends ListItemBase
    * @implements {IOption}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/OptionCustom", JSImport.Default)
  @js.native
  open class default () extends OptionCustom
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-option-custom` component defines a custom content of an option in the `ui5-select`.
    * A component to be the same way as the standard `ui5-option`.
    * The component accepts arbitrary HTML content to allow full customization.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/OptionCustom.js";`
    * @constructor
    * @since 2.0.0
    * @extends ListItemBase
    * @implements {IOption}
    * @public
    */
  @js.native
  trait OptionCustom extends IOption {
    
    /**
      * Defines the content of the component.
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * Defines the text, displayed inside the `ui5-select` input filed
      * when the option gets selected.
      * @default undefined
      * @public
      */
    var displayText: js.UndefOr[String] = js.native
    
    @JSName("effectiveDisplayText")
    def effectiveDisplayText_MOptionCustom: String = js.native
  }
}
