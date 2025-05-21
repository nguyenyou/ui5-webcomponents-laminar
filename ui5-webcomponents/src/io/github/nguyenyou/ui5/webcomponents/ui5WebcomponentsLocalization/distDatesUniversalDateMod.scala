package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDatesUniversalDateMod extends Shortcut {
  
  @JSImport("@ui5/webcomponents-localization/dist/dates/UniversalDate.js", JSImport.Default)
  @js.native
  val default: UniversalDate = js.native
  
  @js.native
  trait UniversalDate
    extends StObject
       with Instantiable1[/* time */ Double, UniversalDate] {
    
    def getDate(): Double = js.native
    
    def getDay(): Double = js.native
    
    def getFullYear(): Double = js.native
    
    def getHours(): Double = js.native
    
    def getInstance(
      oDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesUi5dateMod.default
    ): UniversalDate = js.native
    def getInstance(
      oDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesUi5dateMod.default,
      sCalendarType: /* template literal string: ${CalendarType} */ String
    ): UniversalDate = js.native
    def getInstance(oDate: js.Date): UniversalDate = js.native
    def getInstance(oDate: js.Date, sCalendarType: /* template literal string: ${CalendarType} */ String): UniversalDate = js.native
    
    def getMilliseconds(): Double = js.native
    
    def getMinutes(): Double = js.native
    
    def getMonth(): Double = js.native
    
    def getSeconds(): Double = js.native
    
    def getTime(): Double = js.native
    
    def getTimezoneOffset(): Double = js.native
    
    def getUTCDate(): Double = js.native
    
    def getUTCDay(): Double = js.native
    
    def getUTCFullYear(): Double = js.native
    
    def getUTCHours(): Double = js.native
    
    def getUTCMilliseconds(): Double = js.native
    
    def getUTCMinutes(): Double = js.native
    
    def getUTCMonth(): Double = js.native
    
    def getUTCSeconds(): Double = js.native
    
    def getYear(): Double = js.native
    
    var oDate: js.Date = js.native
    
    var sCalendarType: String = js.native
    
    def setDate(dayValue: Double): Double = js.native
    
    def setFullYear(yearValue: Double): Double = js.native
    def setFullYear(yearValue: Double, monthValue: Double): Double = js.native
    def setFullYear(yearValue: Double, monthValue: Double, dateValue: Double): Double = js.native
    def setFullYear(yearValue: Double, monthValue: Unit, dateValue: Double): Double = js.native
    
    def setHours(hoursValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Double, secondsValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Double, secondsValue: Double, msValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Double, secondsValue: Unit, msValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Unit, secondsValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Unit, secondsValue: Double, msValue: Double): Double = js.native
    def setHours(hoursValue: Double, minutesValue: Unit, secondsValue: Unit, msValue: Double): Double = js.native
    
    def setMilliseconds(setMilliseconds: Double): Double = js.native
    
    def setMinutes(minutesValue: Double): Double = js.native
    def setMinutes(minutesValue: Double, secondsValue: Double): Double = js.native
    def setMinutes(minutesValue: Double, secondsValue: Double, msValue: Double): Double = js.native
    def setMinutes(minutesValue: Double, secondsValue: Unit, msValue: Double): Double = js.native
    
    def setMonth(monthValue: Double): Double = js.native
    def setMonth(monthValue: Double, dayValue: Double): Double = js.native
    
    def setSeconds(secondsValue: Double): Double = js.native
    def setSeconds(secondsValue: Double, msValue: Double): Double = js.native
    
    def setUTCDate(dayValue: Double): Double = js.native
    
    def setUTCFullYear(yearValue: Double): Double = js.native
    def setUTCFullYear(yearValue: Double, monthValue: Double): Double = js.native
    def setUTCFullYear(yearValue: Double, monthValue: Double, dayValue: Double): Double = js.native
    def setUTCFullYear(yearValue: Double, monthValue: Unit, dayValue: Double): Double = js.native
    
    def setUTCHours(hoursValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Double, secondsValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Double, secondsValue: Double, msValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Double, secondsValue: Unit, msValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Unit, secondsValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Unit, secondsValue: Double, msValue: Double): Double = js.native
    def setUTCHours(hoursValue: Double, minutesValue: Unit, secondsValue: Unit, msValue: Double): Double = js.native
    
    def setUTCMilliseconds(setMilliseconds: Double): Double = js.native
    
    def setUTCMinutes(minutesValue: Double): Double = js.native
    def setUTCMinutes(minutesValue: Double, secondsValue: Double): Double = js.native
    def setUTCMinutes(minutesValue: Double, secondsValue: Double, msValue: Double): Double = js.native
    def setUTCMinutes(minutesValue: Double, secondsValue: Unit, msValue: Double): Double = js.native
    
    def setUTCMonth(monthValue: Double): Double = js.native
    def setUTCMonth(monthValue: Double, dayValue: Double): Double = js.native
    
    def setUTCSeconds(secondsValue: Double): Double = js.native
    def setUTCSeconds(secondsValue: Double, msValue: Double): Double = js.native
    
    def setYear(yearValue: Double): Double = js.native
    
    def toDateString(): String = js.native
  }
  
  type _To = UniversalDate
  
  /* This means you don't have to write `default`, but can instead just say `distDatesUniversalDateMod.foo` */
  override def _to: UniversalDate = default
}
