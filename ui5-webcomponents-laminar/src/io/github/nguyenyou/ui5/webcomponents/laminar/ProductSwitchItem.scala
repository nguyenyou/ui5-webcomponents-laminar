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

}
