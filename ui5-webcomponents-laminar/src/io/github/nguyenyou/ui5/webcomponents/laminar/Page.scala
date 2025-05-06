package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distPageMod.Page as PageComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Page extends WebComponent("ui5-page") {

  @JSImport("@ui5/webcomponents-fiori/dist/Page.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Page.type

  type Ref = PageComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the background color of the `Page`.
    *
    * **Note:** When a ui5-list is placed inside the page, we recommend using “List” to ensure better color contrast.
    *
    * Default: "Solid"
    */
  lazy val backgroundDesign: HtmlAttr[PageBackgroundDesign] =
    htmlAttr("background-design", StringUnionCodec[PageBackgroundDesign])
  type PageBackgroundDesign = "List" | "Solid" | "Transparent"

  /** Defines if the footer is fixed at the very bottom of the page.
    *
    * **Note:** When set to true the footer is fixed at the very bottom of the page, otherwise it floats over the
    * content with a slight offset from the bottom.
    *
    * Default: false
    */
  lazy val fixedFooter: HtmlAttr[Boolean] = htmlAttr("fixed-footer", BooleanAsAttrPresenceCodec)

  /** Defines the footer visibility.
    *
    * Default: false
    */
  lazy val hideFooter: HtmlAttr[Boolean] = htmlAttr("hide-footer", BooleanAsAttrPresenceCodec)

  /** Disables vertical scrolling of page content. If set to true, there will be no vertical scrolling at all.
    *
    * Default: false
    */
  lazy val noScrolling: HtmlAttr[Boolean] = htmlAttr("no-scrolling", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

  /** Defines the footer HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="footer"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val footer: Slot = new Slot("footer")

  /** Defines the header HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="header"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
