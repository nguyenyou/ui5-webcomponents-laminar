package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarSelectionModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CalendarSelectionMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarSelectionMode & String] = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarSelectionModeMod.CalendarSelectionMode.Multiple & String = js.native
    
    /* "Range" */ val Range: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarSelectionModeMod.CalendarSelectionMode.Range & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarSelectionModeMod.CalendarSelectionMode.Single & String = js.native
  }
  
  @js.native
  sealed trait CalendarSelectionMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CalendarSelectionMode", "CalendarSelectionMode")
  @js.native
  object CalendarSelectionMode extends StObject {
    
    /**
      * Several dates can be selected
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with CalendarSelectionMode
    
    /**
      * A range defined by a start date and an end date can be selected
      * @public
      */
    @js.native
    sealed trait Range
      extends StObject
         with CalendarSelectionMode
    
    /**
      * Only one date can be selected at a time
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with CalendarSelectionMode
  }
}
