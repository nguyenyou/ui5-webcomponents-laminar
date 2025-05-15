package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerMod.{TimePickerChangeEventDetail,TimePickerInputEventDetail}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerMod.TimePicker as TimePickerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TimePicker extends WebComponent("ui5-time-picker") {

  @JSImport("@ui5/webcomponents/dist/TimePicker.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = TimePicker.type

  type Ref = TimePickerComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the aria-label attribute for the component.
   *
   * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of **@ui5/webcomponents**.
   *
   * Default: undefined
   */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)
  /**
   * Receives id (or many ids) of the elements that label the component.
   *
   * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of **@ui5/webcomponents**.
   *
   * Default: undefined
   */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)
  /**
   * Defines the disabled state of the comonent.
   *
   * Default: false
   */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  /**
   * Determines the format, displayed in the input field.
   * 
   * Example:
   * HH:mm:ss -> 11:42:35
   * hh:mm:ss a -> 2:23:15 PM
   * mm:ss -> 12:04 (only minutes and seconds)
   *
   * Default: undefined
   */
  lazy val formatPattern: HtmlAttr[String] = htmlAttr("format-pattern", StringAsIsCodec)
  /**
   * Determines the name by which the component will be identified upon submission in an HTML form.
   * 
   * **Note:** This property is only applicable within the context of an HTML Form element.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
   * Default: undefined
   */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  /**
   * Defines the open or closed state of the popover.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
   * Default: false
   */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)
  /**
   * Defines a short hint, intended to aid the user with data entry when the
   * component has no value.
   * 
   * **Note:** When no placeholder is set, the format pattern is displayed as a placeholder.
   * Passing an empty string as the value of this property will make the component appear empty - without placeholder or format pattern.
   *
   * Default: undefined
   */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)
  /**
   * Defines the readonly state of the comonent.
   *
   * Default: false
   */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)
  /**
   * Defines whether the component is required.
   *
   * **Note:** Available since [v2.1.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.1.0) of **@ui5/webcomponents**.
   *
   * Default: false
   */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  /**
   * Defines a formatted time value.
   */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  /**
   * Defines the value state of the component.
   *
   * Default: "None"
   */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])

  // -- Events --

  /**
   * Fired when the input operation has finished by clicking the "OK" button or
   * when the text in the input field has changed and the focus leaves the input field.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[TimePickerChangeEventDetail]]  = new EventProp("change")
  /**
   * Fired after the value-help dialog of the component is closed.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("close")
  /**
   * Fired when the value of the `TimePicker` is changed at each key stroke.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref] & EventDetail[TimePickerInputEventDetail]]  = new EventProp("input")
  /**
   * Fired after the value-help dialog of the component is opened.
   *
   * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("open")

  // -- Slots --

  /**
   * Defines the value state message that will be displayed as pop up under the `TimePicker`.
   * 
   * **Note:** If not specified, a default text (in the respective language) will be displayed.
   * 
   * **Note:** The `valueStateMessage` would be displayed,
   * when the `TimePicker` is in `Information`, `Critical` or `Negative` value state.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="valueStateMessage"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}

