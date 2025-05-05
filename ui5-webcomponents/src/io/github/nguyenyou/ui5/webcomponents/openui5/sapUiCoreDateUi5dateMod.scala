package io.github.nguyenyou.ui5.webcomponents.openui5

import io.github.nguyenyou.ui5.webcomponents.openui5.anon.TimeZone
import io.github.nguyenyou.ui5.webcomponents.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDateUi5dateMod {
  
  @JSImport("sap/ui/core/date/UI5Date", JSImport.Default)
  @js.native
  /**
    * @ui5-protected Do not call from applications (only from related classes in the framework)
    */
  /* protected */ open class default ()
    extends StObject
       with UI5Date
  /* static members */
  object default
  
  @js.native
  trait UI5Date
    extends StObject
       with Date {
    
    /**
      * Returns the year of this date instance minus 1900 according to the configured time zone, see `Date.prototype.getYear`.
      *
      * @deprecated As of version 1.111. as it is deprecated in the base class JavaScript Date; use {@link #getFullYear }
      * instead
      *
      * @returns The year of this date instance minus 1900 according to the configured time zone
      */
    def getYear(): int = js.native
    
    /**
      * Sets the year for this date instance plus 1900 considering the configured time zone, see `Date.prototype.setYear`.
      *
      * @deprecated As of version 1.111. as it is deprecated in the base class JavaScript Date; use {@link #setFullYear }
      * instead
      *
      * @returns The milliseconds of the new timestamp based on the UNIX epoch, or `NaN` if the timestamp could
      * not be updated
      */
    def setYear(
      /**
      * The year which is to be set for this date. If iYear is a number between 0 and 99 (inclusive), then the
      * year for this date is set to 1900 + iYear. Otherwise, the year for this date is set to iYear.
      */
    iYear: int
    ): int = js.native
    
    /**
      * Converts this date to a string, interpreting it in the UTC time zone, see `Date.prototype.toGMTString`.
      *
      *
      * @returns The converted date as string in the UTC time zone
      */
    def toGMTString(): String = js.native
    
    def toLocaleDateString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleDateString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    
    def toLocaleString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    
    def toLocaleTimeString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: String,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
    def toLocaleTimeString(
      /**
      * The locale used for formatting; by default, the string representation of {@link module:sap/base/i18n/Localization.getLanguageTag Localization.getLanguageTag}
      */
    sLocale: Unit,
      /**
      * The options object used for formatting, corresponding to the options parameter of the `Intl.DateTimeFormat`
      * constructor
      */
    oOptions: TimeZone
    ): String = js.native
  }
}
