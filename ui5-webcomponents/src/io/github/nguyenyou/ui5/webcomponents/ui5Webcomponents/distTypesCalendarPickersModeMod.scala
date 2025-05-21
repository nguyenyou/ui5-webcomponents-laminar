package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarPickersModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CalendarPickersMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarPickersMode & String] = js.native
    
    /* "DAY_MONTH_YEAR" */ val DAY_MONTH_YEAR: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarPickersModeMod.CalendarPickersMode.DAY_MONTH_YEAR & String = js.native
    
    /* "MONTH_YEAR" */ val MONTH_YEAR: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarPickersModeMod.CalendarPickersMode.MONTH_YEAR & String = js.native
    
    /* "YEAR" */ val YEAR: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarPickersModeMod.CalendarPickersMode.YEAR & String = js.native
  }
  
  @js.native
  sealed trait CalendarPickersMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CalendarPickersMode", "CalendarPickersMode")
  @js.native
  object CalendarPickersMode extends StObject {
    
    /**
      * User can select days, months and years
      * @private
      */
    @js.native
    sealed trait DAY_MONTH_YEAR
      extends StObject
         with CalendarPickersMode
    
    /**
      * User can select months and years
      * @private
      */
    @js.native
    sealed trait MONTH_YEAR
      extends StObject
         with CalendarPickersMode
    
    /**
      * User can select years
      * @private
      */
    @js.native
    sealed trait YEAR
      extends StObject
         with CalendarPickersMode
  }
}
