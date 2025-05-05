package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxMod.MultiComboBoxSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxMod.{
  MultiComboBox as MultiComboBoxComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MultiComboBox extends WebComponent("ui5-multi-combobox") {

  @JSImport("@ui5/webcomponents/dist/MultiComboBox.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MultiComboBox.type

  type Ref = MultiComboBoxComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.4.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component.
    *
    * **Note:** Available since [v1.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.4.0) of
    * **@ui5/webcomponents**.
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

  /** Defines the filter type of the component.
    *
    * Default: "StartsWithPerTerm"
    */
  lazy val filter: HtmlAttr[ComboBoxFilter] = htmlAttr("filter", StringUnionCodec[ComboBoxFilter])
  type ComboBoxFilter = "StartsWithPerTerm" | "StartsWith" | "Contains" | "None"

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element. **Note:** When the
    * component is used inside a form element, the value is sent as the first element in the form data, even if it's
    * empty.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
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

  /** Defines if the user input will be prevented, if no matching item has been found
    *
    * Default: false
    */
  lazy val noValidation: HtmlAttr[Boolean] = htmlAttr("no-validation", BooleanAsAttrPresenceCodec)

  /** Indicates whether the items picker is open.
    *
    * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
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

  /** Defines whether the clear icon of the multi-combobox will be shown.
    *
    * **Note:** Available since [v1.20.1](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.20.1) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val showClearIcon: HtmlAttr[Boolean] = htmlAttr("show-clear-icon", BooleanAsAttrPresenceCodec)

  /** Determines if the select all checkbox is visible on top of suggestions.
    *
    * Default: false
    */
  lazy val showSelectAll: HtmlAttr[Boolean] = htmlAttr("show-select-all", BooleanAsAttrPresenceCodec)

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

  /** Fired when the dropdown is closed.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when the value of the component changes at each keystroke or clear icon is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when the dropdown is opened.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  /** Fired when selection is changed by user interaction.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[MultiComboBoxSelectionChangeEventDetail]] =
    new EventProp("selection-change")

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
    */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}
