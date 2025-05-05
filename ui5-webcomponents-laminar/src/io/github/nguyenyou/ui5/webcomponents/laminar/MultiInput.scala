package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiInputMod.MultiInputTokenDeleteEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiInputMod.{MultiInput as MultiInputComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MultiInput extends WebComponent("ui5-multi-input") {

  @JSImport("@ui5/webcomponents/dist/MultiInput.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MultiInput.type

  type Ref = MultiInputComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible description of the component.
    *
    * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleDescription: HtmlAttr[String] = htmlAttr("accessible-description", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that describe the input.
    *
    * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleDescriptionRef: HtmlAttr[String] = htmlAttr("accessible-description-ref", StringAsIsCodec)

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the input.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Sets the maximum number of characters available in the input field.
    *
    * **Note:** This property is not compatible with the ui5-input type InputType.Number. If the ui5-input type is set
    * to Number, the maxlength value is ignored.
    *
    * Default: undefined
    */
  lazy val maxlength: HtmlAttr[Double] = htmlAttr("maxlength", DoubleAsStringCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element. **Note:** When the
    * component is used inside a form element, the value is sent as the first element in the form data, even if it's
    * empty.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the value will be autcompleted to match an item
    *
    * **Note:** Available since [v1.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.4.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val noTypeahead: HtmlAttr[Boolean] = htmlAttr("no-typeahead", BooleanAsAttrPresenceCodec)

  /** Defines whether the suggestions picker is open. The picker will not open if the `showSuggestions` property is set
    * to `false`, the input is disabled or the input is readonly. The picker will close automatically and `close` event
    * will be fired if the input is not in the viewport.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines a short hint intended to aid the user with data entry when the component has no value.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines whether the clear icon of the input will be shown.
    *
    * **Note:** Available since [v1.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val showClearIcon: HtmlAttr[Boolean] = htmlAttr("show-clear-icon", BooleanAsAttrPresenceCodec)

  /** Defines whether the component should show suggestions, if such are present.
    *
    * Default: false
    */
  lazy val showSuggestions: HtmlAttr[Boolean] = htmlAttr("show-suggestions", BooleanAsAttrPresenceCodec)

  /** Determines whether a value help icon will be visualized in the end of the input. Pressing the icon will fire
    * `value-help-trigger` event.
    *
    * Default: false
    */
  lazy val showValueHelpIcon: HtmlAttr[Boolean] = htmlAttr("show-value-help-icon", BooleanAsAttrPresenceCodec)

  /** Defines the HTML type of the component.
    *
    * **Notes:**
    *
    *   - The particular effect of this property differs depending on the browser and the current language settings,
    *     especially for type `Number`.
    *   - The property is mostly intended to be used with touch devices that use different soft keyboard layouts
    *     depending on the given input type.
    *
    * Default: "Text"
    */
  lazy val tpe: HtmlAttr[InputType] = htmlAttr("type", StringUnionCodec[InputType])
  type InputType = "Text" | "Email" | "Number" | "Password" | "Tel" | "URL" | "Search"

  /** Defines the value of the component.
    *
    * **Note:** The property is updated upon typing.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

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

  /** Fired when the suggestions picker is closed.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when the value of the component changes at each keystroke, and when a suggestion item has been selected.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when the suggestions picker is open.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  /** Fired when some text has been selected.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelect: EventProp[Ui5CustomEvent[Ref]] = new EventProp("select")

  /** Fired when the user navigates to a suggestion item via the ARROW keys, as a preview, before the final selection.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[InputSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  /** Fired when tokens are being deleted.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onTokenDelete: EventProp[Ui5CustomEvent[Ref] & EventDetail[MultiInputTokenDeleteEventDetail]] =
    new EventProp("token-delete")

  /** Fired when the value help icon is pressed and F4 or ALT/OPTION + ARROW_UP/ARROW_DOWN keyboard keys are used.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onValueHelpTrigger: EventProp[Ui5CustomEvent[Ref]] = new EventProp("value-help-trigger")

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

  /** Defines the component tokens.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="tokens"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val tokens: Slot = new Slot("tokens")

  /** Defines the value state message that will be displayed as pop up under the component. The value state message slot
    * should contain only one root element.
    *
    * **Note:** If not specified, a default text (in the respective language) will be displayed.
    *
    * **Note:** The `valueStateMessage` would be displayed, when the component is in `Information`, `Critical` or
    * `Negative` value state.
    *
    * **Note:** If the component has `suggestionItems`, the `valueStateMessage` would be displayed as part of the same
    * popover, if used on desktop, or dialog - on phone.
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
