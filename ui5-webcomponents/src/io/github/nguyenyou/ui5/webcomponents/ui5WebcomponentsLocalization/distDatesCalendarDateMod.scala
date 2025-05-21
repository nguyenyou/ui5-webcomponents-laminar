package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesUniversalDateMod.UniversalDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesCalendarDateMod {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/CalendarDate.js", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CalendarDate {
    def this(year: CalendarDate) = this()
    def this(year: Double) = this()
    def this(year: CalendarDate, month: String) = this()
    def this(year: CalendarDate, month: Double) = this()
    def this(year: Double, month: String) = this()
    def this(year: Double, month: Double) = this()
    def this(year: Unit, month: String) = this()
    def this(year: Unit, month: Double) = this()
    def this(year: CalendarDate, month: String, date: Double) = this()
    def this(year: CalendarDate, month: Double, date: Double) = this()
    def this(year: CalendarDate, month: Unit, date: Double) = this()
    def this(year: Double, month: String, date: Double) = this()
    def this(year: Double, month: Double, date: Double) = this()
    def this(year: Double, month: Unit, date: Double) = this()
    def this(year: Unit, month: String, date: Double) = this()
    def this(year: Unit, month: Double, date: Double) = this()
    def this(year: Unit, month: Unit, date: Double) = this()
    def this(year: CalendarDate, month: String, date: Double, calendarType: String) = this()
    def this(year: CalendarDate, month: String, date: Unit, calendarType: String) = this()
    def this(year: CalendarDate, month: Double, date: Double, calendarType: String) = this()
    def this(year: CalendarDate, month: Double, date: Unit, calendarType: String) = this()
    def this(year: CalendarDate, month: Unit, date: Double, calendarType: String) = this()
    def this(year: CalendarDate, month: Unit, date: Unit, calendarType: String) = this()
    def this(year: Double, month: String, date: Double, calendarType: String) = this()
    def this(year: Double, month: String, date: Unit, calendarType: String) = this()
    def this(year: Double, month: Double, date: Double, calendarType: String) = this()
    def this(year: Double, month: Double, date: Unit, calendarType: String) = this()
    def this(year: Double, month: Unit, date: Double, calendarType: String) = this()
    def this(year: Double, month: Unit, date: Unit, calendarType: String) = this()
    def this(year: Unit, month: String, date: Double, calendarType: String) = this()
    def this(year: Unit, month: String, date: Unit, calendarType: String) = this()
    def this(year: Unit, month: Double, date: Double, calendarType: String) = this()
    def this(year: Unit, month: Double, date: Unit, calendarType: String) = this()
    def this(year: Unit, month: Unit, date: Double, calendarType: String) = this()
    def this(year: Unit, month: Unit, date: Unit, calendarType: String) = this()
  }
  object default
  
  @js.native
  trait CalendarDate extends StObject {
    
    var _oUDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesUi5dateMod.default | js.Date | UniversalDate = js.native
    
    def getCalendarType(): String = js.native
    
    def getDate(): Double = js.native
    
    def getDay(): Double = js.native
    
    def getMonth(): Double = js.native
    
    def getYear(): Double = js.native
    
    def isAfter(oCalendarDate: CalendarDate): Boolean = js.native
    
    def isBefore(oCalendarDate: CalendarDate): Boolean = js.native
    
    def isSame(oCalendarDate: CalendarDate): Boolean = js.native
    
    def isSameOrAfter(oCalendarDate: CalendarDate): Boolean = js.native
    
    def isSameOrBefore(oCalendarDate: CalendarDate): Boolean = js.native
    
    def setDate(date: Double): this.type = js.native
    
    /**
      * Sets the given month as ordinal month of the year.
      * @param {int} month An integer between 0 and 11, representing the months January through December( or their
      * equivalent month names for the given calendar).
      * If the specified value is is outside of the expected range, this method attempts to update the date information
      * accordingly. For example, if 12 is given as a month, the year will be incremented by 1, and 1 will be used for month.
      * @param {int} [date] An integer between 1 and 31, representing the day of the month, but other values are allowed.
      * 0 will result in the previous month's last day.
      * -1 will result in the day before the previous month's last day.
      * 32 will result in:
      * - first day of the next month if the current month has 31 days.
      * - second day of the next month if the current month has 30 days.
      * Other value will result in adding or subtracting days according to the given value.
      * @returns {sap.ui.unified.calendar.CalendarDate} <code>this</code> for method chaining.
      */
    def setMonth(month: Double): this.type = js.native
    def setMonth(month: Double, date: Double): this.type = js.native
    
    def setYear(year: Double): this.type = js.native
    
    def toLocalJSDate(): io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default | js.Date = js.native
    
    def toUTCJSDate(): io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default | js.Date = js.native
  }
}
