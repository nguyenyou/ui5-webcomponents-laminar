package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`sys-enter-2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`sys-help-2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.alert
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.error
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.information
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTagMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-tag` is a component which serves
    * the purpose to attract the user attention to some piece
    * of information (state, quantity, condition, etc.).
    * It can contain icon and text information, and its design can be chosen from specific design types.
    *
    * ### Usage Guidelines
    *
    * - If the text is longer than the width of the component, it can wrap, or it can show ellipsis, depending on the `wrappingType` property.
    * - Colors can be semantic or not semantic.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Tag.js";`
    * @csspart root - Used to style the root element.
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Tag", JSImport.Default)
  @js.native
  open class default () extends Tag
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Tag", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Tag", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-tag` is a component which serves
    * the purpose to attract the user attention to some piece
    * of information (state, quantity, condition, etc.).
    * It can contain icon and text information, and its design can be chosen from specific design types.
    *
    * ### Usage Guidelines
    *
    * - If the text is longer than the width of the component, it can wrap, or it can show ellipsis, depending on the `wrappingType` property.
    * - Colors can be semantic or not semantic.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Tag.js";`
    * @csspart root - Used to style the root element.
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @js.native
  trait Tag
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines if the tag has an icon.
      * @private
      */
    var _hasIcon: Boolean = js.native
    
    /**
      * Defines if the tag has only an icon (and no text).
      * @private
      */
    var _iconOnly: Boolean = js.native
    
    def _onclick(e: Event): Unit = js.native
    
    def _roleDescription: String = js.native
    
    def _semanticIconName: alert | `sys-help-2` | `sys-enter-2` | error | information | Null = js.native
    
    def _title: js.UndefOr[String] = js.native
    
    def _valueState: js.UndefOr[String] = js.native
    
    /**
      * Defines the color scheme of the component.
      * There are 10 predefined schemes.
      * To use one you can set a number from `"1"` to `"10"`. The `colorScheme` `"1"` will be set by default.
      * @default "1"
      * @public
      */
    var colorScheme: String = js.native
    
    /**
      * Defines the design type of the component.
      * @default "Neutral"
      * @public
      * @since 1.22.0
      */
    var design: /* template literal string: ${TagDesign} */ String = js.native
    
    @JSName("eventDetails")
    var eventDetails_Tag: Click = js.native
    
    def hasIcon: Boolean = js.native
    
    def hasText: Boolean = js.native
    
    /**
      * Defines if the default state icon is shown.
      * @default false
      * @public
      * @since 1.22.0
      */
    var hideStateIcon: Boolean = js.native
    
    /**
      * Defines the icon to be displayed in the component.
      * @public
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconOnly: Boolean = js.native
    
    /**
      * Defines if the component is interactive (focusable and pressable).
      *
      * @default false
      * @public
      * @since 1.22.0
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines predefined size of the component.
      * @default "S"
      * @public
      * @since 2.0.0
      */
    var size: /* template literal string: ${TagSize} */ String = js.native
    
    def tagDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
    
    /**
      * Defines how the text of a component will be displayed when there is not enough space.
      *
      * **Note:** For option "Normal" the text will wrap and the
      * words will not be broken based on hyphenation.
      * @default "Normal"
      * @public
      * @since 1.22.0
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
