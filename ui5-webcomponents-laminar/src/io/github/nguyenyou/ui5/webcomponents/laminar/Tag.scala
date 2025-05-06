package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagDesignMod.TagDesign
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTagSizeMod.TagSize
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTagMod.Tag as TagComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Tag extends WebComponent("ui5-tag") {

  @JSImport("@ui5/webcomponents/dist/Tag.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Tag.type

  type Ref = TagComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the color scheme of the component. There are 10 predefined schemes. To use one you can set a number from
    * `"1"` to `"10"`. The `colorScheme` `"1"` will be set by default.
    *
    * Default: "1"
    */
  lazy val colorScheme: HtmlAttr[String] = htmlAttr("color-scheme", StringAsIsCodec)

  /** Defines the design type of the component.
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Neutral"
    */
  lazy val design: HtmlAttr[TagDesign] = htmlAttr("design", StringUnionCodec[TagDesign])
  type TagDesign = "Set1" | "Set2" | "Neutral" | "Information" | "Positive" | "Negative" | "Critical"

  /** Defines if the default state icon is shown.
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val hideStateIcon: HtmlAttr[Boolean] = htmlAttr("hide-state-icon", BooleanAsAttrPresenceCodec)

  /** Defines if the component is interactive (focusable and pressable).
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val interactive: HtmlAttr[Boolean] = htmlAttr("interactive", BooleanAsAttrPresenceCodec)

  /** Defines predefined size of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "S"
    */
  lazy val size: HtmlAttr[TagSize] = htmlAttr("size", StringUnionCodec[TagSize])
  type TagSize = "S" | "L"

  /** Defines how the text of a component will be displayed when there is not enough space.
    *
    * **Note:** For option "Normal" the text will wrap and the words will not be broken based on hyphenation.
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])
  type WrappingType = "None" | "Normal"

  // -- Events --

  /** Fired when the user clicks on an interactive tag.
    *
    * **Note:** The event will be fired if the `interactive` property is `true`
    *
    * **Note:** Available since [v1.22.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.22.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

  /** Defines the icon to be displayed in the component.
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
