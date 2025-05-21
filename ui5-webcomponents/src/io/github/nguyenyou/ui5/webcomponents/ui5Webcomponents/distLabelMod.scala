package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLabelMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-label` is a component used to represent a label for elements like input, textarea, select.
    * The `for` property of the `ui5-label` must be the same as the id attribute of the related input element.
    * Screen readers read out the label, when the user focuses the labelled control.
    *
    * The `ui5-label` appearance can be influenced by properties,
    * such as `required` and `wrappingType`.
    * The appearance of the Label can be configured in a limited way by using the design property.
    * For a broader choice of designs, you can use custom styles.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Label";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @JSImport("@ui5/webcomponents/dist/Label.js", JSImport.Default)
  @js.native
  open class default () extends Label
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Label.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Label.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-label` is a component used to represent a label for elements like input, textarea, select.
    * The `for` property of the `ui5-label` must be the same as the id attribute of the related input element.
    * Screen readers read out the label, when the user focuses the labelled control.
    *
    * The `ui5-label` appearance can be influenced by properties,
    * such as `required` and `wrappingType`.
    * The appearance of the Label can be configured in a limited way by using the design property.
    * For a broader choice of designs, you can use custom styles.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Label";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @js.native
  trait Label
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _colonSymbol: String = js.native
    
    def _onclick(): Unit = js.native
    
    /**
      * Defines the labeled input by providing its ID.
      *
      * **Note:** Can be used with both `ui5-input` and native input.
      * @default undefined
      * @public
      */
    var `for`: js.UndefOr[String] = js.native
    
    /**
      * Defines whether an asterisk character is added to the component text.
      *
      * **Note:** Usually indicates that user input (bound with the `for` property) is required.
      * In that case the `required` property of
      * the corresponding input should also be set.
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    /**
      * Defines whether colon is added to the component text.
      *
      * **Note:** Usually used in forms.
      * @default false
      * @public
      */
    var showColon: Boolean = js.native
    
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
