package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTextAreaMod.{
  TextArea as TextAreaComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TextArea extends WebComponent("ui5-textarea") {

  @JSImport("@ui5/webcomponents/dist/TextArea.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TextArea.type

  type Ref = TextAreaComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the textarea.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] =
    htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Indicates whether the user can interact with the component or not.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Enables the component to automatically grow and shrink dynamically with
    * its content.
    *
    * Default: false
    */
  lazy val growing: HtmlAttr[Boolean] =
    htmlAttr("growing", BooleanAsAttrPresenceCodec)

  /** Defines the maximum number of rows that the component can grow.
    *
    * Default: 0
    */
  lazy val growingMaxRows: HtmlAttr[Double] =
    htmlAttr("growing-max-rows", DoubleAsStringCodec)

  /** Defines the maximum number of characters that the `value` can have.
    *
    * Default: undefined
    */
  lazy val maxlength: HtmlAttr[Double] =
    htmlAttr("maxlength", DoubleAsStringCodec)

  /** Determines the name by which the component will be identified upon
    * submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML
    * Form element.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines a short hint intended to aid the user with data entry when the
    * component has no value.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] =
    htmlAttr("placeholder", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual
    * feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] =
    htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] =
    htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines the number of visible text rows for the component.
    *
    * **Notes:**
    *
    *   - If the `growing` property is enabled, this property defines the
    *     minimum rows to be displayed in the textarea.
    *   - The CSS `height` property wins over the `rows` property, if both are
    *     set.
    *
    * Default: 0
    */
  lazy val rows: HtmlAttr[Double] = htmlAttr("rows", DoubleAsStringCodec)

  /** Determines whether the characters exceeding the maximum allowed character
    * count are visible in the component.
    *
    * If set to `false`, the user is not allowed to enter more characters than
    * what is set in the `maxlength` property. If set to `true` the characters
    * exceeding the `maxlength` value are selected on paste and the counter
    * below the component displays their number.
    *
    * Default: false
    */
  lazy val showExceededText: HtmlAttr[Boolean] =
    htmlAttr("show-exceeded-text", BooleanAsAttrPresenceCodec)

  /** Defines the value of the component.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * **Note:** If `maxlength` property is set, the component turns into
    * "Critical" state once the characters exceeds the limit. In this case, only
    * the "Negative" state is considered and can be applied.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] =
    htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" |
    "Information"

  // -- Events --

  /** Fired when the text has changed and the focus leaves the component.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  /** Fired when the value of the component changes at each keystroke or when
    * something is pasted.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when textarea is scrolled.
    *
    * **Note:** Available since
    * [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0)
    * of **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onScroll: EventProp[Ui5CustomEvent[Ref]] = new EventProp("scroll")

  /** Fired when some text has been selected.
    *
    * **Note:** Available since
    * [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0)
    * of **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelect: EventProp[Ui5CustomEvent[Ref]] = new EventProp("select")

  // -- Slots --

  /** Defines the value state message that will be displayed as pop up under the
    * component. The value state message slot should contain only one root
    * element.
    *
    * **Note:** If not specified, a default text (in the respective language)
    * will be displayed.
    *
    * **Note:** The `valueStateMessage` would be displayed if the component has
    * `valueState` of type `Information`, `Critical` or `Negative`.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="valueStateMessage"`). Since you can't change the DOM
    * order of slots when declaring them within a prop, it might prove
    * beneficial to manually mount them as part of the component's children,
    * especially when facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}
