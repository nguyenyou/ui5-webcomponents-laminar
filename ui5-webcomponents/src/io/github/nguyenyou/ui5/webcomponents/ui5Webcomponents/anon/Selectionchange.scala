package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.CalendarSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectionchange extends StObject {
  
  var `selection-change`: CalendarSelectionChangeEventDetail
  
  var `show-month-view`: Unit
  
  var `show-year-range-view`: Unit
  
  var `show-year-view`: Unit
}
object Selectionchange {
  
  inline def apply(
    `selection-change`: CalendarSelectionChangeEventDetail,
    `show-month-view`: Unit,
    `show-year-range-view`: Unit,
    `show-year-view`: Unit
  ): Selectionchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-month-view")(`show-month-view`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-year-range-view")(`show-year-range-view`.asInstanceOf[js.Any])
    __obj.updateDynamic("show-year-view")(`show-year-view`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectionchange] (val x: Self) extends AnyVal {
    
    inline def `setSelection-change`(value: CalendarSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
    
    inline def `setShow-month-view`(value: Unit): Self = StObject.set(x, "show-month-view", value.asInstanceOf[js.Any])
    
    inline def `setShow-year-range-view`(value: Unit): Self = StObject.set(x, "show-year-range-view", value.asInstanceOf[js.Any])
    
    inline def `setShow-year-view`(value: Unit): Self = StObject.set(x, "show-year-view", value.asInstanceOf[js.Any])
  }
}
