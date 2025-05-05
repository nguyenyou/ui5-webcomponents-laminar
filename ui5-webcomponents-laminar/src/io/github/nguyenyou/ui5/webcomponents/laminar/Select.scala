package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.{
  SelectChangeEventDetail,
  SelectLiveChangeEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.{Select as SelectComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Select extends WebComponent("ui5-select") {

  @JSImport("@ui5/webcomponents/dist/Select.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Select.type

  type Ref = SelectComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the select.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines whether the component is read-only.
    *
    * **Note:** A read-only component is not editable, but still provides visual feedback upon user interaction.
    *
    * **Note:** Available since [v1.21.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.21.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)

  /** Defines whether the component is required.
    *
    * Default: false
    */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** Defines the tooltip of the select.
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the value of the component:
    *
    *   - when get - returns the value of the component or the value/text content of the selected option.
    *   - when set - selects the option with matching `value` property or text content.
    *
    * **Note:** Use either the Select's value or the Options' selected property. Mixed usage could result in unexpected
    * behavior.
    *
    * **Note:** If the given value does not match any existing option, no option will be selected and the Select
    * component will be displayed as empty.
    *
    * **Note:** Available since [v1.20.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.20.0) of
    * **@ui5/webcomponents**.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" | "Information"

  // -- Events --

  /** Fired when the selected option changes.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[SelectChangeEventDetail]] = new EventProp("change")

  /** Fired after the component's dropdown menu closes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when the user navigates through the options, but the selection is not finalized, or when pressing the ESC
    * key to revert the current selection.
    *
    * **Note:** Available since [v1.17.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.17.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLiveChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[SelectLiveChangeEventDetail]] = new EventProp(
    "live-change"
  )

  /** Fired after the component's dropdown menu opens.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

  /** Defines the HTML element that will be displayed in the component input part, representing the selected option.
    *
    * **Note:** If not specified and `OptionCustom` is used, either the option's `display-text` or its textContent will
    * be displayed.
    *
    * **Note:** If not specified and `Option` is used, the option's textContent will be displayed.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="label"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v1.17.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.17.0) of
    * **@ui5/webcomponents**.
    */
  lazy val label: Slot = new Slot("label")

  /** Defines the value state message that will be displayed as pop up under the component.
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
