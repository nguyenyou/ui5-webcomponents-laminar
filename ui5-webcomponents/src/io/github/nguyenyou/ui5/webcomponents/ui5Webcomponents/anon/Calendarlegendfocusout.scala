package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendMod.CalendarLegendItemSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Calendarlegendfocusout extends StObject {
  
  var `calendar-legend-focus-out`: Unit
  
  var `calendar-legend-selection-change`: CalendarLegendItemSelectionChangeEventDetail
}
object Calendarlegendfocusout {
  
  inline def apply(
    `calendar-legend-focus-out`: Unit,
    `calendar-legend-selection-change`: CalendarLegendItemSelectionChangeEventDetail
  ): Calendarlegendfocusout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("calendar-legend-focus-out")(`calendar-legend-focus-out`.asInstanceOf[js.Any])
    __obj.updateDynamic("calendar-legend-selection-change")(`calendar-legend-selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Calendarlegendfocusout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Calendarlegendfocusout] (val x: Self) extends AnyVal {
    
    inline def `setCalendar-legend-focus-out`(value: Unit): Self = StObject.set(x, "calendar-legend-focus-out", value.asInstanceOf[js.Any])
    
    inline def `setCalendar-legend-selection-change`(value: CalendarLegendItemSelectionChangeEventDetail): Self = StObject.set(x, "calendar-legend-selection-change", value.asInstanceOf[js.Any])
  }
}
