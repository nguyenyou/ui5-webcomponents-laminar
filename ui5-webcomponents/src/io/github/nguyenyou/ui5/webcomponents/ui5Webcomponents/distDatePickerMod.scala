package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Exclude
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.MainWidth
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Open
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputAccInfo
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarPickersModeMod.CalendarPickersMode
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Decorative
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Interactive
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`value-changed`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.change
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatePickerMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date-picker` component provides an input field with assigned calendar which opens on user action.
    * The `ui5-date-picker` allows users to select a localized date using touch,
    * mouse, or keyboard input. It consists of two parts: the date input field and the
    * date picker.
    *
    * ### Usage
    *
    * The user can enter a date by:
    *
    * - Using the calendar that opens in a popup
    * - Typing it in directly in the input field
    *
    * When the user makes an entry and presses the enter key, the calendar shows the corresponding date.
    * When the user directly triggers the calendar display, the actual date is displayed.
    *
    * ### Formatting
    *
    * If a date is entered by typing it into
    * the input field, it must fit to the used date format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](http://unicode.org/reports/tr35/#Date_Field_Symbol_Table).
    *
    * For example, if the `format-pattern` is "yyyy-MM-dd",
    * a valid value string is "2015-07-30" and the same is displayed in the input.
    *
    * ### Keyboard Handling
    * The `ui5-date-picker` provides advanced keyboard handling.
    * If the `ui5-date-picker` is focused,
    * you can open or close the drop-down by pressing [F4], [Alt] + [Up] or [Alt] + [Down] keys.
    * Once the drop-down is opened, you can use the [Up], [Down], [Left] or [Right] arrow keys
    * to navigate through the dates and select one by pressing the `Space` or `Enter` keys. Moreover you can
    * use TAB to reach the buttons for changing month and year.
    *
    * If the `ui5-date-picker` input field is focused and its corresponding picker dialog is not opened,
    * then users can increment or decrement the date referenced by `dateValue` property
    * by using the following shortcuts:
    *
    * - [Page Down] - Decrements the corresponding day of the month by one
    * - [Shift] + [Page Down] - Decrements the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Down] - Decrements the corresponding year by one
    * - [Page Up] - Increments the corresponding day of the month by one
    * - [Shift] + [Page Up] - Increments the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Up] - Increments the corresponding year by one
    *
    * ### Calendar types
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the `primaryCalendarType` property and import one or more of the following modules:
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";`
    *
    * Or, you can use the global configuration and set the `calendarType` key:
    *
    * ```html
    * <script data-id="sap-ui-config" type="application/json">
    * 	{
    * 		"calendarType": "Japanese"
    * 	}
    * <script>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DatePicker.js";`
    * @constructor
    * @extends DateComponentBase
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DatePicker.js", JSImport.Default)
  @js.native
  open class default () extends DatePicker
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DatePicker.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DatePicker.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date-picker` component provides an input field with assigned calendar which opens on user action.
    * The `ui5-date-picker` allows users to select a localized date using touch,
    * mouse, or keyboard input. It consists of two parts: the date input field and the
    * date picker.
    *
    * ### Usage
    *
    * The user can enter a date by:
    *
    * - Using the calendar that opens in a popup
    * - Typing it in directly in the input field
    *
    * When the user makes an entry and presses the enter key, the calendar shows the corresponding date.
    * When the user directly triggers the calendar display, the actual date is displayed.
    *
    * ### Formatting
    *
    * If a date is entered by typing it into
    * the input field, it must fit to the used date format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](http://unicode.org/reports/tr35/#Date_Field_Symbol_Table).
    *
    * For example, if the `format-pattern` is "yyyy-MM-dd",
    * a valid value string is "2015-07-30" and the same is displayed in the input.
    *
    * ### Keyboard Handling
    * The `ui5-date-picker` provides advanced keyboard handling.
    * If the `ui5-date-picker` is focused,
    * you can open or close the drop-down by pressing [F4], [Alt] + [Up] or [Alt] + [Down] keys.
    * Once the drop-down is opened, you can use the [Up], [Down], [Left] or [Right] arrow keys
    * to navigate through the dates and select one by pressing the `Space` or `Enter` keys. Moreover you can
    * use TAB to reach the buttons for changing month and year.
    *
    * If the `ui5-date-picker` input field is focused and its corresponding picker dialog is not opened,
    * then users can increment or decrement the date referenced by `dateValue` property
    * by using the following shortcuts:
    *
    * - [Page Down] - Decrements the corresponding day of the month by one
    * - [Shift] + [Page Down] - Decrements the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Down] - Decrements the corresponding year by one
    * - [Page Up] - Increments the corresponding day of the month by one
    * - [Shift] + [Page Up] - Increments the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Up] - Increments the corresponding year by one
    *
    * ### Calendar types
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the `primaryCalendarType` property and import one or more of the following modules:
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";`
    *
    * Or, you can use the global configuration and set the `calendarType` key:
    *
    * ```html
    * <script data-id="sap-ui-config" type="application/json">
    * 	{
    * 		"calendarType": "Japanese"
    * 	}
    * <script>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DatePicker.js";`
    * @constructor
    * @extends DateComponentBase
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Slottable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.NonDocumentTypeChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Animatable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLOrSVGElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.GlobalEventHandlers because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementContentEditable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementCSSInlineStyle because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Element because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLElement because Already inherited
  - js.Object because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.UI5Element because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.default because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement because var conflicts: __id, __shouldHydrate, _changedState, _childChangeListeners, _componentStateFinalizedEventProvider, _doNotSyncAttributes, _domRefReadyPromise, _fullyConnected, _getRealDomRef, _inDOM, _individualSlot, _internals, _invalidationEventProvider, _jsxEvents, _jsxProps, _rendered, _slotChangeListeners, _slotsAssignedNodes, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, eventDetails, hidden, id, inert, initializedProperties, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined formFormattedValue, formElementAnchor, formValidityMessage, name, formValidity */ @js.native
  trait DatePicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDateComponentBaseMod.default {
    
    var _calendar: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.default = js.native
    
    var _calendarCurrentPicker: Picker = js.native
    
    def _calendarPickersMode: CalendarPickersMode = js.native
    
    /**
      * Used to provide selectedDates to the calendar based on the component's state
      * Override in derivatives to provide different rules for setting the calendar's selected dates
      * @protected
      */
    def _calendarSelectedDates: js.Array[String] = js.native
    
    /**
      * Override in derivatives to change calendar selection mode
      * @protected
      */
    def _calendarSelectionMode: /* template literal string: ${CalendarSelectionMode} */ String = js.native
    
    /**
      * Used to provide a timestamp to the Calendar (to focus it to a relevant date when open) based on the component's state
      * Override in derivatives to provide the calendar a timestamp based on their properties
      * By default focus the calendar on the selected date if set, or the current day otherwise
      * @protected
      */
    def _calendarTimestamp: Double = js.native
    
    def _canOpenPicker(): Boolean = js.native
    
    /**
      * Checks if the provided value is valid and within valid range.
      * @protected
      * @param value
      */
    def _checkValueValidity(value: String): Boolean = js.native
    
    def _click(e: MouseEvent): Unit = js.native
    
    var _dateTimeInput: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDateTimeInputMod.default = js.native
    
    def _displayFormat: String = js.native
    
    def _headerTitleText: String = js.native
    
    /**
      * Defines whether the value help icon is hidden
      * @private
      */
    def _iconMode: Decorative | Interactive = js.native
    
    /**
      * @param amount
      * @param unit
      * @param preserveDate whether to preserve the day of the month (f.e. 15th of March + 1 month = 15th of April)
      * @protected
      */
    def _modifyDateValue(amount: Double, unit: String): Unit = js.native
    def _modifyDateValue(amount: Double, unit: String, preserveDate: Boolean): Unit = js.native
    
    /**
      * The ui5-input "change" event handler - fire change event when the user focuses out of the input
      * @protected
      */
    def _onInputChange(e: Event): Unit = js.native
    
    /**
      * The ui5-input "input" event handler - fire input even when the user types
      * @protected
      */
    def _onInputInput(e: Event): Unit = js.native
    
    /**
      * The ui5-input "submit" event handler - fire change event when the user presses enter
      * @protected
      */
    def _onInputSubmit(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @protected
      */
    def _placeholder: String = js.native
    
    var _respPopoverConfig: js.UndefOr[js.Object] = js.native
    
    /**
      * Defines whether the dialog on mobile should have header
      * @private
      */
    def _shouldHideHeader: Boolean = js.native
    
    def _toggleAndFocusInput(): Unit = js.native
    
    def _togglePicker(): Unit = js.native
    
    def _updateValueAndFireEvents(value: String, normalizeValue: Boolean, events: js.Array[change | `value-changed` | input]): Unit = js.native
    def _updateValueAndFireEvents(
      value: String,
      normalizeValue: Boolean,
      events: js.Array[change | `value-changed` | input],
      updateValue: Boolean
    ): Unit = js.native
    
    def _updateValueState(): Unit = js.native
    
    def accInfo: InputAccInfo = js.native
    
    /**
      * Defines the aria-label attribute for the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def dateAriaDescription: String = js.native
    
    /**
      * Currently selected date represented as a Local JavaScript Date instance.
      * @public
      * @default null
      */
    def dateValue: js.Date | Null = js.native
    
    def dateValueUTC: js.Date | Null = js.native
    
    /**
      * Determines whether the component is displayed as disabled.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_DatePicker: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any) & Open = js.native
    
    /**
      * Returns the first picker depending on the CalendarPickerMode
      */
    def firstPicker: Picker = js.native
    
    def formElementAnchor(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    @JSName("formElementAnchor")
    var formElementAnchor_FDatePicker: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | js.Promise[js.UndefOr[HTMLElement]]]]] = js.native
    
    def formFormattedValue: FormData | String | Null = js.native
    @JSName("formFormattedValue")
    var formFormattedValue_FDatePicker: FormData | String | Null = js.native
    
    def formValidity: ValidityStateFlags = js.native
    
    def formValidityMessage: String = js.native
    @JSName("formValidityMessage")
    var formValidityMessage_FDatePicker: js.UndefOr[String] = js.native
    
    @JSName("formValidity")
    var formValidity_FDatePicker: js.UndefOr[ValidityStateFlags] = js.native
    
    /**
      * Formats a Java Script date object into a string representing a locale date
      * according to the `formatPattern` property of the DatePicker instance
      * @public
      * @param date A Java Script date object to be formatted as string
      * @returns The date as string
      */
    def formatValue(date: js.Date): String = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateText: Boolean = js.native
    
    /**
      * Defines the visibility of the week numbers column.
      *
      * **Note:** For calendars other than Gregorian,
      * the week numbers are not displayed regardless of what is set.
      * @default false
      * @public
      * @since 1.0.0-rc.8
      */
    var hideWeekNumbers: Boolean = js.native
    
    /**
      * Checks if a date is between the minimum and maximum date.
      * @public
      * @param value A value to be checked
      */
    def isInValidRange(value: String): Boolean = js.native
    
    /**
      * Checks if a value is valid against the current date format of the DatePicker.
      * @public
      * @param value A value to be tested against the current date format
      */
    def isValid(value: String): Boolean = js.native
    
    var liveValue: js.UndefOr[String] = js.native
    
    /**
      * Determines the name by which the component will be identified upon submission in an HTML form.
      *
      * **Note:** This property is only applicable within the context of an HTML Form element.
      * @default undefined
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The parser understands many formats, but we need one format
      * @protected
      */
    def normalizeValue(value: String): String = js.native
    
    /**
      * The user clicked the "month" button in the header
      */
    def onHeaderShowMonthPress(): Unit = js.native
    
    /**
      * The user clicked the "year" button in the header
      */
    def onHeaderShowYearPress(): Unit = js.native
    
    /**
      * @protected
      */
    def onResponsivePopoverAfterClose(): Unit = js.native
    
    def onResponsivePopoverAfterOpen(): Unit = js.native
    
    def onResponsivePopoverBeforeOpen(): Unit = js.native
    
    /**
      * The user selected a new date in the calendar
      * @param e
      * @protected
      */
    def onSelectedDatesChange(e: CustomEvent): Unit = js.native
    
    /**
      * Defines the open or closed state of the popover.
      * @public
      * @default false
      * @since 2.0.0
      */
    var open: Boolean = js.native
    
    def openIconName: String = js.native
    
    def openIconTitle: String = js.native
    
    def pickerAccessibleName: String = js.native
    
    /**
      * Defines a short hint, intended to aid the user with data entry when the
      * component has no value.
      *
      * **Note:** When no placeholder is set, the format pattern is displayed as a placeholder.
      * Passing an empty string as the value of this property will make the component appear empty - without placeholder or format pattern.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component is displayed as read-only.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @since 1.0.0-rc.9
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    var responsivePopover: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default
      ] = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def showFooter: Boolean = js.native
    
    def showHeader: Boolean = js.native
    
    def styles: MainWidth = js.native
    
    def `type`: InputType = js.native
    
    /**
      * Defines a formatted date value.
      * @default ""
      * @formEvents change input
      * @formProperty
      * @public
      */
    var value: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateDefaultText: js.UndefOr[String] = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      * @since 1.0.0-rc.7
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    def valueStateTextMappings: ValueStateAnnouncement = js.native
  }
  
  trait DatePickerChangeEventDetail extends StObject {
    
    var valid: Boolean
    
    var value: String
  }
  object DatePickerChangeEventDetail {
    
    inline def apply(valid: Boolean, value: String): DatePickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatePickerInputEventDetail extends StObject {
    
    var valid: Boolean
    
    var value: String
  }
  object DatePickerInputEventDetail {
    
    inline def apply(valid: Boolean, value: String): DatePickerInputEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerInputEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerInputEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DatePickerValueStateChangeEventDetail extends StObject {
    
    var valid: Boolean
    
    var valueState: /* template literal string: ${ValueState} */ String
  }
  object DatePickerValueStateChangeEventDetail {
    
    inline def apply(valid: Boolean, valueState: /* template literal string: ${ValueState} */ String): DatePickerValueStateChangeEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], valueState = valueState.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatePickerValueStateChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DatePickerValueStateChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValueState(value: /* template literal string: ${ValueState} */ String): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.day
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.month
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.year
  */
  trait Picker extends StObject
  object Picker {
    
    inline def day: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.day = "day".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.day]
    
    inline def month: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.month = "month".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.month]
    
    inline def year: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.year = "year".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.year]
  }
  
  type ValueStateAnnouncement = Record[Exclude[ValueState, None], String]
}
