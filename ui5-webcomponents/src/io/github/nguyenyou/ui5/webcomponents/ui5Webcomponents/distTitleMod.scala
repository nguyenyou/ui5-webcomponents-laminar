package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTitleMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-title` component is used to display titles inside a page.
    * It is a simple, large-sized text with explicit header/title semantics.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Title.js";`
    * @constructor
    * @extends UI5Element
    * @slot {Node[]} default - Defines the text of the component.
    * This component supports nesting a `Link` component inside.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Title.js", JSImport.Default)
  @js.native
  open class default () extends Title
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-title` component is used to display titles inside a page.
    * It is a simple, large-sized text with explicit header/title semantics.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Title.js";`
    * @constructor
    * @extends UI5Element
    * @slot {Node[]} default - Defines the text of the component.
    * This component supports nesting a `Link` component inside.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @public
    */
  @js.native
  trait Title
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def h1: Boolean = js.native
    
    def h2: Boolean = js.native
    
    def h3: Boolean = js.native
    
    def h4: Boolean = js.native
    
    def h5: Boolean = js.native
    
    def h6: Boolean = js.native
    
    /**
      * Defines the component level.
      * Available options are: `"H6"` to `"H1"`.
      * This property does not influence the style of the component.
      * Use the property `size` for this purpose instead.
      * @default "H2"
      * @public
      */
    var level: /* template literal string: ${TitleLevel} */ String = js.native
    
    /**
      * Defines the visual appearance of the title.
      * Available options are: `"H6"` to `"H1"`.
      * @default "H5"
      * @public
      */
    var size: /* template literal string: ${TitleLevel} */ String = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      *
      * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
      * @default "Normal"
      * @public
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
