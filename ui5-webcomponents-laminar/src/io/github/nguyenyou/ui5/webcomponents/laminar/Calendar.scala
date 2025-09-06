package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.Calendar as CalendarComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.CalendarSelectionChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Calendar extends WebComponent("ui5-calendar") {

  @JSImport("@ui5/webcomponents/dist/Calendar.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Calendar.type

  type Ref = CalendarComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines how to calculate calendar weeks and first day of the week. If not set, the calendar will be displayed
    * according to the currently set global configuration.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Default"
    */
  lazy val calendarWeekNumbering: HtmlAttr[CalendarWeekNumbering] =
    htmlAttr("calendar-week-numbering", StringUnionCodec[CalendarWeekNumbering])

  /** Determines the format, displayed in the input field.
    *
    * **Note:** Available since [v2.14.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.14.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val displayFormat: HtmlAttr[String] = htmlAttr("display-format", StringAsIsCodec)

  /** Determines the format, displayed in the input field.
    *
    * Default: undefined
    *
    * Deprecated: Use displayFormat and valueFormat instead
    */
  lazy val formatPattern: HtmlAttr[String] = htmlAttr("format-pattern", StringAsIsCodec)

  /** Defines the visibility of the week numbers column.
    *
    * **Note:** For calendars other than Gregorian, the week numbers are not displayed regardless of what is set.
    *
    * Default: false
    */
  lazy val hideWeekNumbers: HtmlAttr[Boolean] = htmlAttr("hide-week-numbers", BooleanAsAttrPresenceCodec)

  /** Determines the maximum date available for selection.
    *
    * **Note:** If the formatPattern property is not set, the maxDate value must be provided in the ISO date format
    * (yyyy-MM-dd).
    */
  lazy val maxDate: HtmlAttr[String] = htmlAttr("max-date", StringAsIsCodec)

  /** Determines the minimum date available for selection.
    *
    * **Note:** If the formatPattern property is not set, the minDate value must be provided in the ISO date format
    * (yyyy-MM-dd).
    */
  lazy val minDate: HtmlAttr[String] = htmlAttr("min-date", StringAsIsCodec)

  /** Sets a calendar type used for display. If not set, the calendar type of the global configuration is used.
    *
    * Default: undefined
    */
  lazy val primaryCalendarType: HtmlAttr[CalendarType] =
    htmlAttr("primary-calendar-type", StringUnionCodec[CalendarType])

  /** Defines the secondary calendar type. If not set, the calendar will only show the primary calendar type.
    *
    * Default: undefined
    */
  lazy val secondaryCalendarType: HtmlAttr[CalendarType] =
    htmlAttr("secondary-calendar-type", StringUnionCodec[CalendarType])

  /** Defines the type of selection used in the calendar component. Accepted property values are:
    *
    *   - `CalendarSelectionMode.Single` - enables a single date selection.(default value)
    *   - `CalendarSelectionMode.Range` - enables selection of a date range.
    *   - `CalendarSelectionMode.Multiple` - enables selection of multiple dates.
    *
    * Default: "Single"
    */
  lazy val selectionMode: HtmlAttr[CalendarSelectionMode] =
    htmlAttr("selection-mode", StringUnionCodec[CalendarSelectionMode])

  /** Determines the format, used for the value attribute.
    *
    * **Note:** Available since [v2.14.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.14.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val valueFormat: HtmlAttr[String] = htmlAttr("value-format", StringAsIsCodec)

  // -- Events --

  /** Fired when the selected dates change.
    *
    * **Note:** If you call `preventDefault()` for this event, the component will not create instances of `CalendarDate`
    * for the newly selected dates. In that case you should do this manually.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[CalendarSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the calendar legend of the component.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="calendarLegend"`). Since you can't change the DOM order of slots when declaring them within a prop, it
    * might prove beneficial to manually mount them as part of the component's children, especially when facing problems
    * with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of
    * **@ui5/webcomponents**.
    */
  lazy val calendarLegend: Slot = new Slot("calendarLegend")

  /** Defines the special dates, visually emphasized in the calendar.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="specialDates"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of
    * **@ui5/webcomponents**.
    */
  lazy val specialDates: Slot = new Slot("specialDates")
}
