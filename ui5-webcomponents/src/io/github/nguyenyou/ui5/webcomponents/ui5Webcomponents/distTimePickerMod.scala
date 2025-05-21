package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Exclude
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Valuechanged
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputAccInfo
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`value-changed`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.change
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimePickerMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-time-picker` component provides an input field with assigned clocks which are opened on user action.
    * The `ui5-time-picker` allows users to select a localized time using touch, mouse, or keyboard input.
    * It consists of two parts: the time input field and the clocks.
    *
    * ### Usage
    * The user can enter a time by:
    *
    * - Using the clocks that are displayed in a popup
    * - Typing it in directly in the input field
    *
    * When the user makes an entry and chooses the enter key, the clocks show the corresponding time (hours, minutes and seconds separately).
    * When the user directly triggers the clocks display, the actual time is displayed.
    * For the `ui5-time-picker`
    *
    * ### Formatting
    *
    * If a time is entered by typing it into
    * the input field, it must fit to the used time format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](http://unicode.org/reports/tr35/#Date_Field_Symbol_Table).
    *
    * For example, if the `format-pattern` is "HH:mm:ss",
    * a valid value string is "11:42:35" and the same is displayed in the input.
    *
    * ### Keyboard handling
    * [F4], [Alt]+[Up], [Alt]+[Down] Open/Close picker dialog and move focus to it.
    *
    * When closed:
    *
    * - [Page Up] - Increments hours by 1. If 12 am is reached, increment hours to 1 pm and vice versa.
    * - [Page Down] - Decrements the corresponding field by 1. If 1 pm is reached, decrement hours to 12 am and vice versa.
    * - [Shift]+[Page Up] - Increments minutes by 1.
    * - [Shift]+[Page Down] - Decrements minutes by 1.
    * - [Shift]+[Ctrl]+[Page Up] - Increments seconds by 1.
    * - [Shift]+[Ctrl]+[Page Down] - Decrements seconds by 1.
    * -
    *
    * When opened:
    *
    * - [Page Up] - Increments hours by 1. If 12 am is reached, increment hours to 1 pm and vice versa.
    * - [Page Down] - Decrements the corresponding field by 1. If 1 pm is reached, decrement hours to 12 am and vice versa.
    * - [Shift]+[Page Up] - Increments minutes by 1.
    * - [Shift]+[Page Down] - Decrements minutes by 1.
    * - [Shift]+[Ctrl]+[Page Up] - Increments seconds by 1.
    * - [Shift]+[Ctrl]+[Page Down] - Decrements seconds by 1.
    * - [A] or [P] - Selects AM or PM respectively.
    * - [0]-[9] - Allows direct time selecting (hours/minutes/seconds).
    * - [:] - Allows switching between hours/minutes/seconds clocks. If the last clock is displayed and [:] is pressed, the first clock is beind displayed.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TimePicker.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @JSImport("@ui5/webcomponents/dist/TimePicker.js", JSImport.Default)
  @js.native
  open class default () extends TimePicker
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TimePicker.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TimePicker.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-time-picker` component provides an input field with assigned clocks which are opened on user action.
    * The `ui5-time-picker` allows users to select a localized time using touch, mouse, or keyboard input.
    * It consists of two parts: the time input field and the clocks.
    *
    * ### Usage
    * The user can enter a time by:
    *
    * - Using the clocks that are displayed in a popup
    * - Typing it in directly in the input field
    *
    * When the user makes an entry and chooses the enter key, the clocks show the corresponding time (hours, minutes and seconds separately).
    * When the user directly triggers the clocks display, the actual time is displayed.
    * For the `ui5-time-picker`
    *
    * ### Formatting
    *
    * If a time is entered by typing it into
    * the input field, it must fit to the used time format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](http://unicode.org/reports/tr35/#Date_Field_Symbol_Table).
    *
    * For example, if the `format-pattern` is "HH:mm:ss",
    * a valid value string is "11:42:35" and the same is displayed in the input.
    *
    * ### Keyboard handling
    * [F4], [Alt]+[Up], [Alt]+[Down] Open/Close picker dialog and move focus to it.
    *
    * When closed:
    *
    * - [Page Up] - Increments hours by 1. If 12 am is reached, increment hours to 1 pm and vice versa.
    * - [Page Down] - Decrements the corresponding field by 1. If 1 pm is reached, decrement hours to 12 am and vice versa.
    * - [Shift]+[Page Up] - Increments minutes by 1.
    * - [Shift]+[Page Down] - Decrements minutes by 1.
    * - [Shift]+[Ctrl]+[Page Up] - Increments seconds by 1.
    * - [Shift]+[Ctrl]+[Page Down] - Decrements seconds by 1.
    * -
    *
    * When opened:
    *
    * - [Page Up] - Increments hours by 1. If 12 am is reached, increment hours to 1 pm and vice versa.
    * - [Page Down] - Decrements the corresponding field by 1. If 1 pm is reached, decrement hours to 12 am and vice versa.
    * - [Shift]+[Page Up] - Increments minutes by 1.
    * - [Shift]+[Page Down] - Decrements minutes by 1.
    * - [Shift]+[Ctrl]+[Page Up] - Increments seconds by 1.
    * - [Shift]+[Ctrl]+[Page Down] - Decrements seconds by 1.
    * - [A] or [P] - Selects AM or PM respectively.
    * - [0]-[9] - Allows direct time selecting (hours/minutes/seconds).
    * - [:] - Allows switching between hours/minutes/seconds clocks. If the last clock is displayed and [:] is pressed, the first clock is beind displayed.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TimePicker.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @js.native
  trait TimePicker extends IFormInputElement {
    
    def _canOpenInputsPopover(): Boolean = js.native
    
    def _canOpenPicker(): Boolean = js.native
    
    var _dateTimeInput: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDateTimeInputMod.default = js.native
    
    def _displayFormat: String = js.native
    
    def _effectiveValue: String = js.native
    
    /**
      * @protected
      */
    def _formatPattern: js.UndefOr[String] = js.native
    
    def _getInputField(): HTMLInputElement | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null = js.native
    
    def _handleInputChange(e: CustomEvent): Unit = js.native
    
    def _handleInputClick(e: MouseEvent): Unit = js.native
    
    def _handleInputLiveChange(e: CustomEvent): Unit = js.native
    
    /**
      * The listener for this event can't be passive as it calls preventDefault()
      * @param e Wheel Event
      * @private
      */
    def _handleWheel(e: WheelEvent): Unit = js.native
    
    /**
      * Hides mobile device keyboard by temporary setting the input to readonly state.
      */
    def _hideMobileKeyboard(): Unit = js.native
    
    var _inputsPopover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    var _isInputsPopoverOpen: Boolean = js.native
    
    def _isMobileDevice: Boolean = js.native
    
    def _isPattern: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    def _modifyValueBy(amount: Double, unit: String): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @protected
      */
    def _placeholder: String = js.native
    
    var _timeSelectionClocks: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimeSelectionClocksMod.default
      ] = js.native
    
    def _timeSelectionValue: js.UndefOr[String] = js.native
    
    def _togglePicker(): Unit = js.native
    
    def _updateValueAndFireEvents(value: String, normalizeValue: Boolean, eventsNames: js.Array[input | change | `value-changed`]): Unit = js.native
    
    def _updateValueState(): Unit = js.native
    
    def accInfo: InputAccInfo = js.native
    
    /**
      * Defines the aria-label attribute for the component.
      * @default undefined
      * @public
      * @since 2.1.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id (or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 2.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def cancelButtonLabel: String = js.native
    
    /**
      * Closes the Inputs popover
      * @private
      * @returns Resolves when the Inputs popover is closed
      */
    def closeInputsPopover(): Unit = js.native
    
    def dateAriaDescription: String = js.native
    
    /**
      * Currently selected time represented as JavaScript Date instance
      * @public
      * @default null
      */
    def dateValue: js.Date | Null = js.native
    
    /**
      * Defines the disabled state of the comonent.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimePicker: Valuechanged = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MTimePicker(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MTimePicker: FormData | String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MTimePicker: String = js.native
    
    @JSName("formValidity")
    def formValidity_MTimePicker: ValidityStateFlags = js.native
    
    /**
      * Determines the format, displayed in the input field.
      *
      * Example:
      * HH:mm:ss -> 11:42:35
      * hh:mm:ss a -> 2:23:15 PM
      * mm:ss -> 12:04 (only minutes and seconds)
      * @default undefined
      * @public
      */
    var formatPattern: js.UndefOr[String] = js.native
    
    /**
      * Formats a Java Script date object into a string representing a locale date and time
      * according to the `formatPattern` property of the TimePicker instance
      * @param date A Java Script date object to be formatted as string
      * @public
      * @returns formatted value
      */
    def formatValue(date: js.Date): String = js.native
    
    def getFormat(): io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreFormatDateFormatMod.default = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateText: Boolean = js.native
    
    /**
      * Checks if the inputs popover is open
      * @private
      */
    def isInputsPopoverOpen(): Boolean = js.native
    
    /**
      * Checks if a value is valid against the current `formatPattern` value.
      *
      * **Note:** an empty string is considered as valid value.
      * @param value The value to be tested against the current date format
      * @public
      */
    def isValid(): Boolean = js.native
    def isValid(value: String): Boolean = js.native
    
    def normalizeValue(value: String): String = js.native
    
    def onInputsPopoverAfterClose(): Unit = js.native
    
    def onInputsPopoverAfterOpen(): Unit = js.native
    
    def onResponsivePopoverAfterClose(): Unit = js.native
    
    def onResponsivePopoverAfterOpen(): Unit = js.native
    
    def onResponsivePopoverBeforeOpen(): Unit = js.native
    
    def onTimeSelectionChange(e: CustomEvent): Unit = js.native
    
    /**
      * Defines the open or closed state of the popover.
      * @public
      * @default false
      * @since 2.0.0
      */
    var open: Boolean = js.native
    
    /**
      * @protected
      */
    def openIconName: String = js.native
    
    /**
      * Opens the Inputs popover.
      * @private
      * @returns Resolves when the Inputs popover is open
      */
    def openInputsPopover(): Unit = js.native
    
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
      * Defines the readonly state of the comonent.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @since 2.1.0
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldDisplayValueStateMessageInResponsivePopover: Boolean = js.native
    
    def shouldDisplayValueStateMessageOnDesktop: Boolean = js.native
    
    def submitButtonLabel: String = js.native
    
    def submitInputsPopover(): Unit = js.native
    
    def submitPickers(): Unit = js.native
    
    var tempValue: js.UndefOr[String] = js.native
    
    def toggleInputsPopover(): Unit = js.native
    
    /**
      * Defines a formatted time value.
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
      * Defines the value state message that will be displayed as pop up under the `ui5-time-picker`.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the `ui5-time-picker` is in `Information`, `Critical` or `Negative` value state.
      * @since 1.0.0-rc.8
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    def valueStateTextMappings: ValueStateAnnouncement = js.native
  }
  
  type TimePickerChangeEventDetail = TimePickerChangeInputEventDetail
  
  trait TimePickerChangeInputEventDetail extends StObject {
    
    var valid: Boolean
    
    var value: String
  }
  object TimePickerChangeInputEventDetail {
    
    inline def apply(valid: Boolean, value: String): TimePickerChangeInputEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerChangeInputEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerChangeInputEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TimePickerInputEventDetail = TimePickerChangeInputEventDetail
  
  type ValueStateAnnouncement = Record[Exclude[ValueState, None], String]
}
