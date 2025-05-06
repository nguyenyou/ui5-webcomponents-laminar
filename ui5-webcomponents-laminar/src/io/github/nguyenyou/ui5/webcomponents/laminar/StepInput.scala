package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distStepInputMod.StepInputValueStateChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distStepInputMod.{StepInput as StepInputComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object StepInput extends WebComponent("ui5-step-input") {

  @JSImport("@ui5/webcomponents/dist/StepInput.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = StepInput.type

  type Ref = StepInputComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Determines whether the component is displayed as disabled.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines a maximum value of the component.
    *
    * Default: undefined
    */
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)

  /** Defines a minimum value of the component.
    *
    * Default: undefined
    */
  lazy val min: HtmlAttr[Double] = htmlAttr("min", DoubleAsStringCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines a short hint, intended to aid the user with data entry when the component has no value.
    *
    * **Note:** When no placeholder is set, the format pattern is displayed as a placeholder. Passing an empty string as
    * the value of this property will make the component appear empty - without placeholder or format pattern.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)

  /** Determines whether the component is displayed as read-only.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines a step of increasing/decreasing the value of the component.
    *
    * Default: 1
    */
  lazy val step: HtmlAttr[Double] = htmlAttr("step", DoubleAsStringCodec)

  /** Defines a value of the component.
    *
    * Default: 0
    */
  lazy val value: HtmlAttr[Double] = htmlAttr("value", DoubleAsStringCodec)

  /** Determines the number of digits after the decimal point of the component.
    *
    * Default: 0
    */
  lazy val valuePrecision: HtmlAttr[Double] = htmlAttr("value-precision", DoubleAsStringCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" | "Information"

  // -- Events --

  /** Fired when the input operation has finished by pressing Enter or on focusout.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  /** Fired when the value of the component changes at each keystroke.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired before the value state of the component is updated internally. The event is preventable, meaning that if
    * it's default action is prevented, the component will not update the value state.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onValueStateChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[StepInputValueStateChangeEventDetail]] =
    new EventProp("value-state-change")

  // -- Slots --

  /** Defines the value state message that will be displayed as pop up under the component.
    *
    * **Note:** If not specified, a default text (in the respective language) will be displayed.
    *
    * **Note:** The `valueStateMessage` would be displayed, when the component is in `Information`, `Critical` or
    * `Negative` value state.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="valueStateMessage"`). Since you can't change the DOM order of slots when declaring them within a prop, it
    * might prove beneficial to manually mount them as part of the component's children, especially when facing problems
    * with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}
