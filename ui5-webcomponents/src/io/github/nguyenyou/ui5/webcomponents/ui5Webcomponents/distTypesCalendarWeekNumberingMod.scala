package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCalendarWeekNumberingMod {
  
  @JSImport("@ui5/webcomponents/dist/types/CalendarWeekNumbering", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CalendarWeekNumbering & String] = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarWeekNumberingMod.CalendarWeekNumbering.Default & String = js.native
    
    /* "ISO_8601" */ val ISO_8601: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarWeekNumberingMod.CalendarWeekNumbering.ISO_8601 & String = js.native
    
    /* "MiddleEastern" */ val MiddleEastern: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarWeekNumberingMod.CalendarWeekNumbering.MiddleEastern & String = js.native
    
    /* "WesternTraditional" */ val WesternTraditional: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarWeekNumberingMod.CalendarWeekNumbering.WesternTraditional & String = js.native
  }
  
  @js.native
  sealed trait CalendarWeekNumbering extends StObject
  @JSImport("@ui5/webcomponents/dist/types/CalendarWeekNumbering", "CalendarWeekNumbering")
  @js.native
  object CalendarWeekNumbering extends StObject {
    
    /**
      * The default calendar week numbering:
      *
      * The framework determines the week numbering scheme; currently it is derived from the
      * active format locale. Future versions of ui5-webcomponents might select a different week numbering
      * scheme.
      *
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with CalendarWeekNumbering
    
    /**
      * Official calendar week numbering in most of Europe (ISO 8601 standard):
      * Monday is first day of the week, the week containing January 4th is first week of the year.
      *
      * @public
      */
    @js.native
    sealed trait ISO_8601
      extends StObject
         with CalendarWeekNumbering
    
    /**
      * Official calendar week numbering in much of the Middle East (Middle Eastern calendar):
      * Saturday is first day of the week, the week containing January 1st is first week of the year.
      *
      * @public
      */
    @js.native
    sealed trait MiddleEastern
      extends StObject
         with CalendarWeekNumbering
    
    /**
      * Official calendar week numbering in the United States, Canada, Brazil, Israel, Japan, and
      * other countries (Western traditional calendar):
      * Sunday is first day of the week, the week containing January 1st is first week of the year.
      *
      * @public
      */
    @js.native
    sealed trait WesternTraditional
      extends StObject
         with CalendarWeekNumbering
  }
}
