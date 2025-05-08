package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distDynamicPageMod.DynamicPage as DynamicPageComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DynamicPage extends WebComponent("ui5-dynamic-page") {

  @JSImport("@ui5/webcomponents-fiori/dist/DynamicPage.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = DynamicPage.type

  type Ref = DynamicPageComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines if the header is pinned.
    *
    * Default: false
    */
  lazy val headerPinned: HtmlAttr[Boolean] = htmlAttr("header-pinned", BooleanAsAttrPresenceCodec)

  /** Defines if the header is snapped.
    *
    * Default: false
    */
  lazy val headerSnapped: HtmlAttr[Boolean] = htmlAttr("header-snapped", BooleanAsAttrPresenceCodec)

  /** Defines if the pin button is hidden.
    *
    * Default: false
    */
  lazy val hidePinButton: HtmlAttr[Boolean] = htmlAttr("hide-pin-button", BooleanAsAttrPresenceCodec)

  /** Defines if the footer is shown.
    *
    * Default: false
    */
  lazy val showFooter: HtmlAttr[Boolean] = htmlAttr("show-footer", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the pin header button is toggled.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onPinButtonToggle: EventProp[Ui5CustomEvent[Ref]] = new EventProp("pin-button-toggle")

  /** Fired when the expand/collapse area of the title is toggled.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onTitleToggle: EventProp[Ui5CustomEvent[Ref]] = new EventProp("title-toggle")

  // -- Slots --

  /** Defines the footer HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="footerArea"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val footerArea: Slot = new Slot("footerArea")

  /** Defines the header HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="headerArea"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val headerArea: Slot = new Slot("headerArea")

  /** Defines the title HTML Element.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="titleArea"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val titleArea: Slot = new Slot("titleArea")
}
