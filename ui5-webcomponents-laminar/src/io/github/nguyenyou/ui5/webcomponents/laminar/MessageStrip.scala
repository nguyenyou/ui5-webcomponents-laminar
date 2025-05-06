package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesMessageStripDesignMod.MessageStripDesign
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMessageStripMod.{
  MessageStrip as MessageStripComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MessageStrip extends WebComponent("ui5-message-strip") {

  @JSImport("@ui5/webcomponents/dist/MessageStrip.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MessageStrip.type

  type Ref = MessageStripComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the color scheme of the component. There are 10 predefined schemes. To use one you can set a number from
    * `"1"` to `"10"`. The `colorScheme` `"1"` will be set by default.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "1"
    */
  lazy val colorScheme: HtmlAttr[String] = htmlAttr("color-scheme", StringAsIsCodec)

  /** Defines the component type.
    *
    * Default: "Information"
    */
  lazy val design: HtmlAttr[MessageStripDesign] = htmlAttr("design", StringUnionCodec[MessageStripDesign])
  type MessageStripDesign = "Information" | "Positive" | "Negative" | "Critical" | "ColorSet1" | "ColorSet2"

  /** Defines whether the MessageStrip renders close button.
    *
    * Default: false
    */
  lazy val hideCloseButton: HtmlAttr[Boolean] = htmlAttr("hide-close-button", BooleanAsAttrPresenceCodec)

  /** Defines whether the MessageStrip will show an icon in the beginning. You can directly provide an icon with the
    * `icon` slot. Otherwise, the default icon for the type will be used.
    *
    * * **Note:** If <code>MessageStripDesign.ColorSet1</code> or <code>MessageStripDesign.ColorSet2</code> value is set
    * to the <code>design</code> property, default icon will not be presented.
    *
    * Default: false
    */
  lazy val hideIcon: HtmlAttr[Boolean] = htmlAttr("hide-icon", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the close button is pressed either with a click/tap or by using the Enter or Space key.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  // -- Slots --

  /** Defines the content to be displayed as graphical element within the component.
    *
    * **Note:** If no icon is given, the default icon for the component type will be used. The SAP-icons font provides
    * numerous options.
    *
    * See all the available icons in the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="icon"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val icon: Slot = new Slot("icon")
}
