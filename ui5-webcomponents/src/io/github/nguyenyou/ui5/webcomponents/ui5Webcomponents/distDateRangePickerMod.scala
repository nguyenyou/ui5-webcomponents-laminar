package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import org.scalajs.dom.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateRangePickerMod {
  
  /**
    * @class
    *
    * ### Overview
    * The DateRangePicker enables the users to enter a localized date range using touch, mouse, keyboard input, or by selecting a date range in the calendar.
    *
    * ### Usage
    * The user can enter a date by:
    * Using the calendar that opens in a popup or typing it in directly in the input field (not available for mobile devices).
    * For the `ui5-daterange-picker`
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DateRangePicker.js";`
    *
    * ### Keyboard Handling
    * The `ui5-daterange-picker` provides advanced keyboard handling.
    *
    * When the `ui5-daterange-picker` input field is focused the user can
    * increment or decrement respectively the range start or end date, depending on where the cursor is.
    * The following shortcuts are available:
    *
    * - [Page Down] - Decrements the corresponding day of the month by one
    * - [Shift] + [Page Down] - Decrements the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Down] - Decrements the corresponding year by one
    * - [Page Up] - Increments the corresponding day of the month by one
    * - [Shift] + [Page Up] - Increments the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Up] - Increments the corresponding year by one
    * @constructor
    * @extends DatePicker
    * @since 1.0.0-rc.8
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateRangePicker.js", JSImport.Default)
  @js.native
  open class default () extends DateRangePicker
  
  /**
    * @class
    *
    * ### Overview
    * The DateRangePicker enables the users to enter a localized date range using touch, mouse, keyboard input, or by selecting a date range in the calendar.
    *
    * ### Usage
    * The user can enter a date by:
    * Using the calendar that opens in a popup or typing it in directly in the input field (not available for mobile devices).
    * For the `ui5-daterange-picker`
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/DateRangePicker.js";`
    *
    * ### Keyboard Handling
    * The `ui5-daterange-picker` provides advanced keyboard handling.
    *
    * When the `ui5-daterange-picker` input field is focused the user can
    * increment or decrement respectively the range start or end date, depending on where the cursor is.
    * The following shortcuts are available:
    *
    * - [Page Down] - Decrements the corresponding day of the month by one
    * - [Shift] + [Page Down] - Decrements the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Down] - Decrements the corresponding year by one
    * - [Page Up] - Increments the corresponding day of the month by one
    * - [Shift] + [Page Up] - Increments the corresponding month by one
    * - [Shift] + [Ctrl] + [Page Up] - Increments the corresponding year by one
    * @constructor
    * @extends DatePicker
    * @since 1.0.0-rc.8
    * @public
    */
  @js.native
  trait DateRangePicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.default {
    
    /**
      * Builds a string value out of two UTC timestamps - this method is the counterpart to _extractFirstTimestamp/_extractLastTimestamp
      * @private
      */
    def _buildValue(): String = js.native
    def _buildValue(firstDateTimestamp: Double): String = js.native
    def _buildValue(firstDateTimestamp: Double, lastDateTimestamp: Double): String = js.native
    def _buildValue(firstDateTimestamp: Unit, lastDateTimestamp: Double): String = js.native
    
    def _effectiveDelimiter: String = js.native
    
    def _endDateTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * Returns a UTC timestamp, representing the first date in the value string or undefined if the value is empty
      * @private
      */
    def _extractFirstTimestamp(value: String): js.UndefOr[Double] = js.native
    
    /**
      * Returns a UTC timestamp, representing the last date in the value string or undefined if the value is empty or there is just one date
      * @private
      */
    def _extractLastTimestamp(value: String): js.UndefOr[Double] = js.native
    
    /* private */ var _prevDelimiter: Any = js.native
    
    def _splitValueByDelimiter(value: String): js.Array[String] = js.native
    
    def _startDateTimestamp: js.UndefOr[Double] = js.native
    
    def _tempTimestamp: js.UndefOr[Double | _empty] = js.native
    
    /**
      * The first date in the range during selection (this is a temporary value, not the first date in the value range)
      * @private
      */
    var _tempValue: js.UndefOr[String] = js.native
    
    /**
      * Determines the symbol which separates the dates.
      * If not supplied, the default time interval delimiter for the current locale will be used.
      * @default "-"
      * @public
      */
    var delimiter: String = js.native
    
    /**
      * Returns the end date of the currently selected range as JavaScript Date instance.
      * @public
      * @default null
      */
    def endDateValue: js.Date | Null = js.native
    
    def endValue: String = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MDateRangePicker: String | FormData = js.native
    
    /**
      * Returns the start date of the currently selected range as JavaScript Date instance.
      * @public
      * @default null
      */
    def startDateValue: js.Date | Null = js.native
    
    def startValue: String = js.native
  }
}
