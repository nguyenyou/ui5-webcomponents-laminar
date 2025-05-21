package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarPartMod {
  
  /**
    * @class
    *
    * Abstract base class for Calendar, DayPicker, MonthPicker and YearPicker that adds support for:
    *  - common properties (timestamp, selectedDates): declarations and methods that operate on them
    *  - other common code
    * @constructor
    * @extends DateComponentBase
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CalendarPart.js", JSImport.Default)
  @js.native
  open class default () extends CalendarPart
  
  /**
    * @class
    *
    * Abstract base class for Calendar, DayPicker, MonthPicker and YearPicker that adds support for:
    *  - common properties (timestamp, selectedDates): declarations and methods that operate on them
    *  - other common code
    * @constructor
    * @extends DateComponentBase
    * @public
    */
  @js.native
  trait CalendarPart
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDateComponentBaseMod.default {
    
    /**
      * Returns a CalendarDate instance, representing the _timestamp getter - this date is central to all components' rendering logic
      * @protected
      */
    def _calendarDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _getTimestampFromDom(domNode: HTMLElement): Double = js.native
    
    def _localDate: js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    def _maxTimestamp: Double = js.native
    
    def _minTimestamp: Double = js.native
    
    /**
      * Modify a timestamp by a certain amount of days/months/years and enforce limits
      * @param amount
      * @param unit
      * @param preserveDate whether to preserve the day of the month (f.e. 15th of March + 1 month = 15th of April)
      * @protected
      */
    def _safelyModifyTimestampBy(amount: Double, unit: String): Unit = js.native
    def _safelyModifyTimestampBy(amount: Double, unit: String, preserveDate: Boolean): Unit = js.native
    
    /**
      * Change a timestamp and enforce limits
      * @param timestamp
      * @protected
      */
    def _safelySetTimestamp(timestamp: Double): Unit = js.native
    
    /**
      * Returns the effective timestamp to be used by the respective calendar part
      * @protected
      */
    def _timestamp: Double = js.native
    
    /**
      * The timestamp of the currently focused date. Set this property to move the component's focus to a certain date.
      * **Node:** Timestamp is 10-digit Integer representing the seconds (not milliseconds) since the Unix Epoch.
      * @protected
      */
    var timestamp: js.UndefOr[Double] = js.native
  }
}
