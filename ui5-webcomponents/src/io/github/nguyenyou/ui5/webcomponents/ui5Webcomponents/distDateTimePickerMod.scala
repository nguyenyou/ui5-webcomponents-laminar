package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateTimePickerMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `DateTimePicker` component alows users to select both date (day, month and year) and time (hours, minutes and seconds)
    * and for the purpose it consists of input field and Date/Time picker.
    *
    * ### Usage
    *
    * Use the `DateTimePicker` if you need a combined date and time input component.
    * Don't use it if you want to use either date, or time value.
    * In this case, use the `DatePicker` or the `TimePicker` components instead.
    *
    * The user can set date/time by:
    *
    * - using the calendar and the time selectors
    * - typing in the input field
    *
    * Programmatically, to set date/time for the `DateTimePicker`, use the `value` property
    *
    * ### Formatting
    *
    * The value entered by typing into the input field must fit to the used date/time format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](https://unicode.org/reports/tr35/tr35-dates.html#Date_Field_Symbol_Table).
    *
    * **Example:** the following format `dd/MM/yyyy, hh:mm:ss aa`
    * corresponds the `13/04/2020, 03:16:16 AM` value.
    *
    * The small 'h' defines "12" hours format and the "aa" symbols - "AM/PM" time periods.
    *
    * **Example:** the following format `dd/MM/yyyy, HH:mm:ss`
    * corresponds the `13/04/2020, 15:16:16` value.
    *
    * The capital 'H' indicates "24" hours format.
    *
    * **Note:** If the `formatPattern` does NOT include time,
    * the `DateTimePicker` will fallback to the default time format according to the locale.
    *
    * **Note:** If no placeholder is set to the `DateTimePicker`,
    * the current `formatPattern` is displayed as a placeholder.
    * If another placeholder is needed, it must be set or in case no placeholder is needed - it can be set to an empty string.
    *
    * **Note:** If the user input does NOT match the `formatPattern`,
    * the `DateTimePicker` makes an attempt to parse it based on the
    * locale settings.
    *
    * ### Responsive behavior
    *
    * The `DateTimePicker` is responsive and fully adapts to all devices.
    * For larger screens, such as tablet or desktop, it is displayed as a popover, while
    * on phone devices, it is displayed full screen.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DateTimePicker.js";`
    * @constructor
    * @extends DatePicker
    * @since 1.0.0-rc.7
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateTimePicker.js", JSImport.Default)
  @js.native
  open class default () extends DateTimePicker
  
  /**
    * @class
    *
    * ### Overview
    * The `DateTimePicker` component alows users to select both date (day, month and year) and time (hours, minutes and seconds)
    * and for the purpose it consists of input field and Date/Time picker.
    *
    * ### Usage
    *
    * Use the `DateTimePicker` if you need a combined date and time input component.
    * Don't use it if you want to use either date, or time value.
    * In this case, use the `DatePicker` or the `TimePicker` components instead.
    *
    * The user can set date/time by:
    *
    * - using the calendar and the time selectors
    * - typing in the input field
    *
    * Programmatically, to set date/time for the `DateTimePicker`, use the `value` property
    *
    * ### Formatting
    *
    * The value entered by typing into the input field must fit to the used date/time format.
    *
    * Supported format options are pattern-based on Unicode LDML Date Format notation.
    * For more information, see [UTS #35: Unicode Locale Data Markup Language](https://unicode.org/reports/tr35/tr35-dates.html#Date_Field_Symbol_Table).
    *
    * **Example:** the following format `dd/MM/yyyy, hh:mm:ss aa`
    * corresponds the `13/04/2020, 03:16:16 AM` value.
    *
    * The small 'h' defines "12" hours format and the "aa" symbols - "AM/PM" time periods.
    *
    * **Example:** the following format `dd/MM/yyyy, HH:mm:ss`
    * corresponds the `13/04/2020, 15:16:16` value.
    *
    * The capital 'H' indicates "24" hours format.
    *
    * **Note:** If the `formatPattern` does NOT include time,
    * the `DateTimePicker` will fallback to the default time format according to the locale.
    *
    * **Note:** If no placeholder is set to the `DateTimePicker`,
    * the current `formatPattern` is displayed as a placeholder.
    * If another placeholder is needed, it must be set or in case no placeholder is needed - it can be set to an empty string.
    *
    * **Note:** If the user input does NOT match the `formatPattern`,
    * the `DateTimePicker` makes an attempt to parse it based on the
    * locale settings.
    *
    * ### Responsive behavior
    *
    * The `DateTimePicker` is responsive and fully adapts to all devices.
    * For larger screens, such as tablet or desktop, it is displayed as a popover, while
    * on phone devices, it is displayed full screen.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DateTimePicker.js";`
    * @constructor
    * @extends DatePicker
    * @since 1.0.0-rc.7
    * @public
    */
  @js.native
  trait DateTimePicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.default {
    
    /**
      * Handles clicking on the `cancel` button, within the picker`s footer,
      * that would disregard the user selection.
      */
    def _cancelClick(): Unit = js.native
    
    var _clocks: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimeSelectionClocksMod.default = js.native
    
    /**
      * Handles the date/time switch available in `phoneMode` to switch
      * between the date and time views.
      * @param e
      */
    def _dateTimeSwitchChange(e: CustomEvent): Unit = js.native
    
    /**
      * Handles document resize to switch between `phoneMode` and normal appearance.
      */
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeBound")
    var _handleResizeBound_Original: ResizeObserverCallback = js.native
    
    /**
      * Defines if the `DateTimePicker` should be displayed in phone mode.
      * The phone mode turns on when the component is used on small screens or phone devices.
      * In phone mode the user can see either the calendar view, or the time view
      * and can switch between the views via toggle buttons.
      * @default false
      * @private
      */
    var _phoneMode: Boolean = js.native
    
    def _phoneView: Boolean = js.native
    
    /**
      * Selected, but not yet confirmed date/time
      * @private
      */
    var _previewValues: PreviewValues = js.native
    
    /**
      * Defines the visibility of the time view in `phoneMode`.
      * For more information, see the `phoneMode` property.
      *
      * **Note:** The date view would be displayed by default.
      * @default false
      * @private
      */
    var _showTimeView: Boolean = js.native
    
    /**
      * Handles clicking on the `submit` button, within the picker`s footer.
      */
    def _submitClick(): Unit = js.native
    
    def _submitDisabled: Boolean = js.native
    
    def _timeSelectionValue: String = js.native
    
    def btnCancelLabel: String = js.native
    
    def btnDateLabel: String = js.native
    
    def btnOKLabel: String = js.native
    
    def btnTimeLabel: String = js.native
    
    def getSelectedDateTime(): js.Date = js.native
    
    def onTimeSelectionChange(e: CustomEvent): Unit = js.native
    
    def showDateView: Boolean = js.native
    
    def showTimeView: Boolean = js.native
  }
  
  trait PreviewValues extends StObject {
    
    var calendarTimestamp: js.UndefOr[Double] = js.undefined
    
    var calendarValue: js.UndefOr[String] = js.undefined
    
    var timeSelectionValue: js.UndefOr[String] = js.undefined
  }
  object PreviewValues {
    
    inline def apply(): PreviewValues = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviewValues] (val x: Self) extends AnyVal {
      
      inline def setCalendarTimestamp(value: Double): Self = StObject.set(x, "calendarTimestamp", value.asInstanceOf[js.Any])
      
      inline def setCalendarTimestampUndefined: Self = StObject.set(x, "calendarTimestamp", js.undefined)
      
      inline def setCalendarValue(value: String): Self = StObject.set(x, "calendarValue", value.asInstanceOf[js.Any])
      
      inline def setCalendarValueUndefined: Self = StObject.set(x, "calendarValue", js.undefined)
      
      inline def setTimeSelectionValue(value: String): Self = StObject.set(x, "timeSelectionValue", value.asInstanceOf[js.Any])
      
      inline def setTimeSelectionValueUndefined: Self = StObject.set(x, "timeSelectionValue", js.undefined)
    }
  }
}
