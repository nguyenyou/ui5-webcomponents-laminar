package io.github.nguyenyou.ui5.webcomponents.laminar.ai

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distPromptInputMod.PromptInput as PromptInputComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object PromptInput extends WebComponent("ui5-ai-prompt-input") {

  @JSImport("@ui5/webcomponents-ai/dist/PromptInput.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = PromptInput.type

  type Ref = PromptInputComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the label of the input field.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: undefined
    */
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)

  /** Sets the maximum number of characters available in the input field.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: undefined
    */
  lazy val maxlength: HtmlAttr[Double] = htmlAttr("maxlength", DoubleAsStringCodec)

  /** Defines a short hint intended to aid the user with data entry when the component has no value.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the clear icon of the input will be shown.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val showClearIcon: HtmlAttr[Boolean] = htmlAttr("show-clear-icon", BooleanAsAttrPresenceCodec)

  /** Determines whether the characters exceeding the maximum allowed character count are visible in the component.
    *
    * If set to `false`, the user is not allowed to enter more characters than what is set in the `maxlength` property.
    * If set to `true` the characters exceeding the `maxlength` value are selected on paste and the counter below the
    * component displays their number.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: false
    */
  lazy val showExceededText: HtmlAttr[Boolean] = htmlAttr("show-exceeded-text", BooleanAsAttrPresenceCodec)

  /** Defines whether the component should show suggestions, if such are present.
    *
    * Default: false
    */
  lazy val showSuggestions: HtmlAttr[Boolean] = htmlAttr("show-suggestions", BooleanAsAttrPresenceCodec)

  /** Defines the value of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])

  // -- Events --

  /** Fired when the input operation has finished by pressing Enter or on focusout.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  /** Fired when the value of the component changes at each keystroke, and when a suggestion item has been selected.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when the input operation has finished by pressing Enter or AI button is clicked.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSubmit: EventProp[Ui5CustomEvent[Ref]] = new EventProp("submit")

  // -- Slots --

  /** Defines the value state message that will be displayed as pop up under the component. The value state message slot
    * should contain only one root element.
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
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-ai**.
    */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}
