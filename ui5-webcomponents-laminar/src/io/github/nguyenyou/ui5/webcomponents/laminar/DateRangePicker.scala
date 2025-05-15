package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.{DatePickerChangeEventDetail,DatePickerInputEventDetail,DatePickerValueStateChangeEventDetail}
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDateRangePickerMod.DateRangePicker as DateRangePickerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DateRangePicker extends WebComponent("ui5-daterange-picker") {

  @JSImport("@ui5/webcomponents/dist/DateRangePicker.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = DateRangePicker.type

  type Ref = DateRangePickerComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the aria-label attribute for the component.
   *
   * Default: undefined
   */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)
  /**
   * Receives id(or many ids) of the elements that label the component.
   *
   * Default: undefined
   */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)
  /**
   * Defines how to calculate calendar weeks and first day of the week.
   * If not set, the calendar will be displayed according to the currently set global configuration.
   *
   * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of **@ui5/webcomponents**.
   *
   * Default: "Default"
   */
  lazy val calendarWeekNumbering: HtmlAttr[CalendarWeekNumbering] = htmlAttr("calendar-week-numbering", StringUnionCodec[CalendarWeekNumbering])
  /**
   * Determines the symbol which separates the dates.
   * If not supplied, the default time interval delimiter for the current locale will be used.
   *
   * Default: "-"
   */
  lazy val delimiter: HtmlAttr[String] = htmlAttr("delimiter", StringAsIsCodec)
  /**
   * Determines whether the component is displayed as disabled.
   *
   * Default: false
   */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  /**
   * Determines the format, displayed in the input field.
   *
   * Default: undefined
   */
  lazy val formatPattern: HtmlAttr[String] = htmlAttr("format-pattern", StringAsIsCodec)
  /**
   * Defines the visibility of the week numbers column.
   * 
   * **Note:** For calendars other than Gregorian,
   * the week numbers are not displayed regardless of what is set.
   *
   * Default: false
   */
  lazy val hideWeekNumbers: HtmlAttr[Boolean] = htmlAttr("hide-week-numbers", BooleanAsAttrPresenceCodec)
  /**
   * Determines the maximum date available for selection.
   * 
   * **Note:** If the formatPattern property is not set, the maxDate value must be provided in the ISO date format (YYYY-MM-dd).
   */
  lazy val maxDate: HtmlAttr[String] = htmlAttr("max-date", StringAsIsCodec)
  /**
   * Determines the minimum date available for selection.
   * 
   * **Note:** If the formatPattern property is not set, the minDate value must be provided in the ISO date format (YYYY-MM-dd).
   */
  lazy val minDate: HtmlAttr[String] = htmlAttr("min-date", StringAsIsCodec)
  /**
   * Determines the name by which the component will be identified upon submission in an HTML form.
   * 
   * **Note:** This property is only applicable within the context of an HTML Form element.
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
   * Sets a calendar type used for display.
   * If not set, the calendar type of the global configuration is used.
   *
   * Default: undefined
   */
  lazy val primaryCalendarType: HtmlAttr[CalendarType] = htmlAttr("primary-calendar-type", StringUnionCodec[CalendarType])
  /**
   * Determines whether the component is displayed as read-only.
   *
   * Default: false
   */
  lazy val readonly: HtmlAttr[Boolean] = htmlAttr("readonly", BooleanAsAttrPresenceCodec)
  /**
   * Defines whether the component is required.
   *
   * Default: false
   */
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  /**
   * Defines the secondary calendar type.
   * If not set, the calendar will only show the primary calendar type.
   *
   * Default: undefined
   */
  lazy val secondaryCalendarType: HtmlAttr[CalendarType] = htmlAttr("secondary-calendar-type", StringUnionCodec[CalendarType])
  /**
   * Defines a formatted date value.
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
   * Fired when the input operation has finished by pressing Enter or on focusout.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|✅|
   */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[DatePickerChangeEventDetail]]  = new EventProp("change")
  /**
   * Fired after the component's picker is closed.
   *
   * **Note:** Available since [v2.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.4.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("close")
  /**
   * Fired when the value of the component is changed at each key stroke.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|✅|
   */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref] & EventDetail[DatePickerInputEventDetail]]  = new EventProp("input")
  /**
   * Fired after the component's picker is opened.
   *
   * **Note:** Available since [v2.4.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.4.0) of **@ui5/webcomponents**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("open")
  /**
   * Fired before the value state of the component is updated internally.
   * The event is preventable, meaning that if it's default action is
   * prevented, the component will not update the value state.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|✅|
   */
  lazy val onValueStateChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[DatePickerValueStateChangeEventDetail]]  = new EventProp("value-state-change")

  // -- Slots --

  /**
   * Defines the value state message that will be displayed as pop up under the component.
   * 
   * **Note:** If not specified, a default text (in the respective language) will be displayed.
   * 
   * **Note:** The `valueStateMessage` would be displayed,
   * when the component is in `Information`, `Critical` or `Negative` value state.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="valueStateMessage"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}

