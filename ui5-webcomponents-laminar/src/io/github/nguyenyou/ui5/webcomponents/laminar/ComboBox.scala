package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxMod.ComboBoxSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxMod.{
  ComboBox as ComboBoxComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ComboBox extends WebComponent("ui5-combobox") {

  @JSImport("@ui5/webcomponents/dist/ComboBox.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ComboBox.type

  type Ref = ComboBoxComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] =
    htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the component
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] =
    htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the filter type of the component.
    *
    * Default: "StartsWithPerTerm"
    */
  lazy val filter: HtmlAttr[ComboBoxFilter] =
    htmlAttr("filter", StringUnionCodec[ComboBoxFilter])
  type ComboBoxFilter = "StartsWithPerTerm" | "StartsWith" | "Contains" | "None"

  /** Indicates whether a loading indicator should be shown in the picker.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] =
    htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon
    * submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML
    * Form element.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the value will be autocompleted to match an item
    *
    * **Note:** Available since
    * [v1.19.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.19.0)
    * of **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val noTypeahead: HtmlAttr[Boolean] =
    htmlAttr("no-typeahead", BooleanAsAttrPresenceCodec)

  /** Indicates whether the items picker is open.
    *
    * **Note:** Available since
    * [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] =
    htmlAttr("open", BooleanAsAttrPresenceCodec)

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

  /** Defines whether the clear icon of the combobox will be shown.
    *
    * **Note:** Available since
    * [v1.20.1](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.20.1)
    * of **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val showClearIcon: HtmlAttr[Boolean] =
    htmlAttr("show-clear-icon", BooleanAsAttrPresenceCodec)

  /** Defines the value of the component.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] =
    htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" |
    "Information"

  // -- Events --

  /** Fired when the input operation has finished by pressing Enter, focusout or
    * an item is selected.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  /** Fired when the dropdown is closed.
    *
    * **Note:** Available since
    * [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when typing in input or clear icon is pressed.
    *
    * **Note:** filterValue property is updated, input is changed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when the dropdown is opened.
    *
    * **Note:** Available since
    * [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  /** Fired when selection is changed by user interaction
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ComboBoxSelectionChangeEventDetail]
  ] = new EventProp("selection-change")

  // -- Slots --

  /** Defines the icon to be displayed in the input field.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="icon"`). Since you can't change the DOM order of slots
    * when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing
    * problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val icon: Slot = new Slot("icon")

  /** Defines the value state message that will be displayed as pop up under the
    * component. The value state message slot should contain only one root
    * element.
    *
    * **Note:** If not specified, a default text (in the respective language)
    * will be displayed.
    *
    * **Note:** The `valueStateMessage` would be displayed, when the `ComboBox`
    * is in `Information`, `Critical` or `Negative` value state.
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
