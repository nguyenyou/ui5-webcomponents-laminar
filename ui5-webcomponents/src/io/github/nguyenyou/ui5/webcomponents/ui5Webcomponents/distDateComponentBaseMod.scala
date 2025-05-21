package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Buddhist
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Gregorian
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Islamic
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Japanese
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Persian
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesCalendarTypeMod.CalendarType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDateComponentBaseMod {
  
  /**
    * @class
    *
    * Abstract class that provides common functionality for date-related components (day picker, month picker, year picker, calendar, date picker, date range picker, date time picker)
    * This includes:
    *  - "languageAware: true" metadata setting, CLDR fetch and i18n initialization
    *  - common properties (primaryCalendar, minDate, maxDate and formatPattern) declaration and methods that operate on them
    *  - additional common methods
    * @constructor
    * @abstract
    * @extends UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/DateComponentBase", JSImport.Default)
  @js.native
  open class default () extends DateComponentBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/DateComponentBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/DateComponentBase", "default.i18nBundle")
    @js.native
    def i18nBundle: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
      ] = js.native
    inline def i18nBundle_=(
      x: js.UndefOr[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * Abstract class that provides common functionality for date-related components (day picker, month picker, year picker, calendar, date picker, date range picker, date time picker)
    * This includes:
    *  - "languageAware: true" metadata setting, CLDR fetch and i18n initialization
    *  - common properties (primaryCalendar, minDate, maxDate and formatPattern) declaration and methods that operate on them
    *  - additional common methods
    * @constructor
    * @abstract
    * @extends UI5Element
    * @public
    */
  @js.native
  trait DateComponentBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _formatPattern: String = js.native
    
    def _getCalendarDateFromString(value: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
      ] = js.native
    
    def _getMinMaxCalendarDateFromString(date: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
      ] = js.native
    
    def _getStringFromTimestamp(timestamp: Double): String = js.native
    
    def _getTimeStampFromString(value: String): js.UndefOr[Double] = js.native
    
    def _isPattern: Boolean = js.native
    
    /**
      * Cached instance of DateFormat with a format pattern of "YYYY-MM-dd".
      * Used by the getISOFormat method to avoid creating a new DateFormat instance on each call.
      * @private
      */
    var _isoFormatInstance: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDateFormatMod.default
      ] = js.native
    
    def _maxDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _minDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default = js.native
    
    def _primaryCalendarType: CalendarType | Gregorian | Islamic | Japanese | Buddhist | Persian = js.native
    
    def _secondaryCalendarType: js.UndefOr[CalendarType | Gregorian | Islamic | Japanese | Buddhist | Persian] = js.native
    
    /**
      * Defines how to calculate calendar weeks and first day of the week.
      * If not set, the calendar will be displayed according to the currently set global configuration.
      * @default "Default"
      * @since 2.2.0
      * @public
      */
    var calendarWeekNumbering: /* template literal string: ${CalendarWeekNumbering} */ String = js.native
    
    /**
      * Determines the format, displayed in the input field.
      * @default undefined
      * @public
      */
    var formatPattern: js.UndefOr[String] = js.native
    
    def getFormat(): io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreFormatDateFormatMod.default = js.native
    
    def getISOFormat(): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDateFormatMod.default = js.native
    
    def hasSecondaryCalendarType: Boolean = js.native
    
    /**
      * Determines the maximum date available for selection.
      *
      * **Note:** If the formatPattern property is not set, the maxDate value must be provided in the ISO date format (YYYY-MM-dd).
      * @default ""
      * @since 1.0.0-rc.6
      * @public
      */
    var maxDate: String = js.native
    
    /**
      * Determines the minimum date available for selection.
      *
      * **Note:** If the formatPattern property is not set, the minDate value must be provided in the ISO date format (YYYY-MM-dd).
      * @default ""
      * @since 1.0.0-rc.6
      * @public
      */
    var minDate: String = js.native
    
    /**
      * Sets a calendar type used for display.
      * If not set, the calendar type of the global configuration is used.
      * @default undefined
      * @public
      */
    var primaryCalendarType: js.UndefOr[/* template literal string: ${CalendarType} */ String] = js.native
    
    /**
      * Defines the secondary calendar type.
      * If not set, the calendar will only show the primary calendar type.
      * @since 1.0.0-rc.16
      * @default undefined
      * @public
      */
    var secondaryCalendarType: js.UndefOr[/* template literal string: ${CalendarType} */ String] = js.native
  }
}
