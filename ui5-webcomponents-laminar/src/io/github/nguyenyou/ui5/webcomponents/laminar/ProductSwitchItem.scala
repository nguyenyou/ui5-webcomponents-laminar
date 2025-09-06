package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distProductSwitchItemMod.ProductSwitchItem as ProductSwitchItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ProductSwitchItem extends WebComponent("ui5-product-switch-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitchItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ProductSwitchItem.type

  type Ref = ProductSwitchItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the icon to be displayed as a graphical element within the component.
    *
    * Example:
    *
    * `<ProductSwitchItem icon="palette">`
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the subtitle of the component.
    *
    * Default: undefined
    */
  lazy val subtitleText: HtmlAttr[String] = htmlAttr("subtitle-text", StringAsIsCodec)

  /** Defines a target where the `targetSrc` content must be open.
    *
    * Available options are:
    *
    *   - `_self`
    *   - `_top`
    *   - `_blank`
    *   - `_parent`
    *   - `_search`
    *
    * **Note:** By default target will be open in the same frame as it was clicked.
    *
    * Default: undefined
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  /** Defines the component target URI. Supports standard hyperlink behavior.
    *
    * Default: undefined
    */
  lazy val targetSrc: HtmlAttr[String] = htmlAttr("target-src", StringAsIsCodec)

  /** Defines the title of the component.
    *
    * Default: undefined
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --

  /** Fired when the `ProductSwitchItem` is activated either with a click/tap or by using the Enter or Space key.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

  /** Defines an image to be displayed instead of the standard icon.
    *
    * **Note:** The image slot takes precedence over the icon property. **Note:** We recommend using non-interactive
    * ui5-avatar with size S, Square shape and Transparent colorScheme for best alignment.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="image"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.14.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.14.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val image: Slot = new Slot("image")
}
