package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarTypeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/CalendarType.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarType & String] = js.native
    
    /* "Buddhist" */ val Buddhist: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Buddhist & String = js.native
    
    /* "Gregorian" */ val Gregorian: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Gregorian & String = js.native
    
    /* "Islamic" */ val Islamic: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Islamic & String = js.native
    
    /* "Japanese" */ val Japanese: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Japanese & String = js.native
    
    /* "Persian" */ val Persian: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType.Persian & String = js.native
  }
  
  @js.native
  sealed trait CalendarType extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/CalendarType.js", "CalendarType")
  @js.native
  object CalendarType extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait Buddhist
      extends StObject
         with CalendarType
    
    /**
      * @public
      */
    @js.native
    sealed trait Gregorian
      extends StObject
         with CalendarType
    
    /**
      * @public
      */
    @js.native
    sealed trait Islamic
      extends StObject
         with CalendarType
    
    /**
      * @public
      */
    @js.native
    sealed trait Japanese
      extends StObject
         with CalendarType
    
    /**
      * @public
      */
    @js.native
    sealed trait Persian
      extends StObject
         with CalendarType
  }
}
