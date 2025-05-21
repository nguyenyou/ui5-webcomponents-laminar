package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTextMod {
  
  /**
    * @class
    *
    * <h3>Overview</h3>
    *
    * The `ui5-text` component displays text that can be used in any content area of an application.
    *
    * <h3>Usage</h3>
    *
    * - Use the `ui5-text` if you want to display text inside a form, table, or any other content area.
    * - Do not use the `ui5-text` if you need to reference input type of components (use ui5-label).
    *
    * <h3>Responsive behavior</h3>
    *
    * The `ui5-text` component is fully adaptive to all screen sizes.
    * By default, the text will wrap when the space is not enough.
    * In addition, the component supports truncation via the <code>max-lines</code> property,
    * by defining the number of lines the text should wrap before start truncating.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Text";</code>
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents/dist/Text", JSImport.Default)
  @js.native
  open class default () extends Text
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Text", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Text", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * <h3>Overview</h3>
    *
    * The `ui5-text` component displays text that can be used in any content area of an application.
    *
    * <h3>Usage</h3>
    *
    * - Use the `ui5-text` if you want to display text inside a form, table, or any other content area.
    * - Do not use the `ui5-text` if you need to reference input type of components (use ui5-label).
    *
    * <h3>Responsive behavior</h3>
    *
    * The `ui5-text` component is fully adaptive to all screen sizes.
    * By default, the text will wrap when the space is not enough.
    * In addition, the component supports truncation via the <code>max-lines</code> property,
    * by defining the number of lines the text should wrap before start truncating.
    *
    * <h3>ES6 Module Import</h3>
    *
    * <code>import "@ui5/webcomponents/dist/Text";</code>
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    */
  @js.native
  trait Text
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _emptyIndicatorAriaLabel: String = js.native
    
    def _emptyIndicatorSymbol: String = js.native
    
    def _renderEmptyIndicator: Boolean = js.native
    
    /**
      * Specifies if an empty indicator should be displayed when there is no text.
      * @default "Off"
      * @since 2.2.0
      * @public
      */
    var emptyIndicatorMode: /* template literal string: ${TextEmptyIndicatorMode} */ String = js.native
    
    def hasText: Boolean = js.native
    
    /**
      * Defines the number of lines the text should wrap before it truncates.
      * @default Infinity
      * @public
      */
    var maxLines: Double = js.native
    
    /**
      * Defines the text of the component.
      * @public
      */
    var text: js.Array[Node] = js.native
  }
}
