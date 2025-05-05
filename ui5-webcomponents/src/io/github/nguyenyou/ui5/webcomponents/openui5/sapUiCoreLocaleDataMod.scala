package io.github.nguyenyou.ui5.webcomponents.openui5

import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.H
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`left-to-right`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`right-to-left`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`sap-accounting`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`sap-short-indian`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`sap-short`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`sap-standard`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.`short-indian`
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.abbreviated
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.accounting
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.alphaNextToNumber
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.approximately
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.atLeast
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.atMost
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.day
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.decimal
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.era
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.few
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.full
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.group
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.h_
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.hour
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.long
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.many
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.medium
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.minusSign
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.minute
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.month
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.narrow
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.noCurrency
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.one
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.other
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.percentSign
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.plusSign
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.quarter
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.range
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.second
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.short
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.standard
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.two
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.week
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.weekday
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.wide
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.year
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.zero
import io.github.nguyenyou.ui5.webcomponents.openui5.openui5Strings.zone
import io.github.nguyenyou.ui5.webcomponents.openui5.sapBaseI18nDateCalendarTypeMod.CalendarType
import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreLocaleDataMod {
  
  @JSImport("sap/ui/core/LocaleData", JSImport.Default)
  @js.native
  /**
    * @ui5-protected Do not call from applications (only from related classes in the framework)
    */
  /* protected */ open class default () extends LocaleData
  /* static members */
  object default
  
  @js.native
  trait LocaleData
    extends io.github.nguyenyou.ui5.webcomponents.openui5.sapUiBaseObjectMod.default {
    
    /**
      * Whether 1 January is the first day of the first calendar week. This is the definition of the calendar
      * week in the US.
      *
      * @since 1.92.0
      *
      * @returns true if the first week of the year starts with 1 January.
      */
    def firstDayStartsFirstWeek(): Boolean = js.native
    
    /**
      * Returns the pattern for representing the calendar week number in the given style. If `iWeekNumber` is
      * given, the week number placeholder will be replaced by it.
      *
      * @since 1.32.0
      *
      * @returns The calendar week with the week number placeholder or the week number e.g. "Calendar Week {0}"
      * or "CW 01"
      */
    def getCalendarWeek(/**
      * The style of the pattern
      */
    sStyle: narrow | wide): String = js.native
    def getCalendarWeek(
      /**
      * The style of the pattern
      */
    sStyle: narrow | wide,
      /**
      * The week number, e.g. "01" or "42"
      */
    sWeekNumber: String
    ): String = js.native
    
    /**
      * Get combined datetime pattern with given date and time style. The combined datetime pattern is the datetime
      * pattern as returned by {@link #getDateTimePattern}, where date and time placeholder are replaced with
      * the corresponding patterns for the given styles.
      *
      *
      * @returns the combined datetime pattern
      */
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: full | long | medium | short,
      /**
      * the required style for the time part
      */
    sTimeStyle: full | long | medium | short
    ): String = js.native
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: full | long | medium | short,
      /**
      * the required style for the time part
      */
    sTimeStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getCombinedDateTimePattern(
      /**
      * the required style for the date part
      */
    sDateStyle: full | long | medium | short,
      /**
      * the required style for the time part
      */
    sTimeStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Get combined interval pattern using a given pattern and the fallback interval pattern.
      *
      * If a skeleton based pattern is not available or not wanted, this method can be used to create an interval
      * pattern based on a given pattern, using the fallback interval pattern.
      *
      * @since 1.46
      *
      * @returns the calculated interval pattern
      */
    def getCombinedIntervalPattern(/**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String): String = js.native
    def getCombinedIntervalPattern(
      /**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getCombinedIntervalPattern(
      /**
      * the single date pattern to use within the interval pattern
      */
    sPattern: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Returns the compact currency format pattern (like "¤000K" or "¤0M") for the given power of ten in the
      * given style, plural category, and in an optional alternative format if desired, see {@link https://ui5.sap.com/#/topic/91f2f2866f4d1014b6dd926db0e91070 Number Format - Compact Format}.
      *
      * @since 1.133.0
      *
      * @returns The compact currency format pattern, or `undefined` if no currency format pattern for the given
      * parameters is found
      */
    def getCompactCurrencyPattern(
      /**
      * The style; "sap-" prefix is used for the trailing currency code variant
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String
    ): js.UndefOr[String] = js.native
    def getCompactCurrencyPattern(
      /**
      * The style; "sap-" prefix is used for the trailing currency code variant
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String,
      /**
      * The plural category; defaults to "other" if the given plural category does not exist for this locale
      */
    sPlural: few | many | one | other | two | zero
    ): js.UndefOr[String] = js.native
    def getCompactCurrencyPattern(
      /**
      * The style; "sap-" prefix is used for the trailing currency code variant
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String,
      /**
      * The plural category; defaults to "other" if the given plural category does not exist for this locale
      */
    sPlural: few | many | one | other | two | zero,
      /**
      * The alternate currency format
      */
    sAlternative: alphaNextToNumber | noCurrency
    ): js.UndefOr[String] = js.native
    def getCompactCurrencyPattern(
      /**
      * The style; "sap-" prefix is used for the trailing currency code variant
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String,
      /**
      * The plural category; defaults to "other" if the given plural category does not exist for this locale
      */
    sPlural: Unit,
      /**
      * The alternate currency format
      */
    sAlternative: alphaNextToNumber | noCurrency
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the compact decimal format pattern (like "000K" or "0M") for the given power of ten in the given
      * style and plural category, see {@link https://ui5.sap.com/#/topic/91f2f2866f4d1014b6dd926db0e91070 Number Format - Compact Format}.
      *
      * @since 1.133.0
      *
      * @returns The compact decimal format pattern, or `undefined` if no decimal format for the given parameters
      * is found
      */
    def getCompactDecimalPattern(
      /**
      * The style
      */
    sStyle: long | short | `short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String
    ): js.UndefOr[String] = js.native
    def getCompactDecimalPattern(
      /**
      * The style
      */
    sStyle: long | short | `short-indian`,
      /**
      * The power of ten, for example "1000" or "10000"
      */
    sPowerOfTen: String,
      /**
      * The plural category; defaults to "other" if the given plural category does not exist for this locale
      */
    sPlural: few | many | one | other | two | zero
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the currency code which is corresponded with the given currency symbol.
      *
      * @since 1.27.0
      *
      * @returns The corresponded currency code defined for the given currency symbol. The given currency symbol
      * is returned if no currency code can be found by using the given currency symbol.
      */
    def getCurrencyCodeBySymbol(
      /**
      * The currency symbol which needs to be converted to currency code
      */
    sCurrencySymbol: String
    ): String = js.native
    
    /**
      * Returns the number of digits of the given currency considering a custom currency first and falling back
      * to the CLDR data if no custom currency is defined.
      *
      * @since 1.21.1
      *
      * @returns The number of digits for the given currency
      */
    def getCurrencyDigits(/**
      * The ISO 4217 currency code
      */
    sCurrency: String): int = js.native
    
    /**
      * Replaced by {@link #getCompactCurrencyPattern}.
      *
      * @since 1.51.0
      * @deprecated As of version 1.133.0. use {@link #getCompactCurrencyPattern} instead
      *
      * @returns See {@link #getCompactCurrencyPattern}
      */
    def getCurrencyFormat(
      /**
      * See {@link #getCompactCurrencyPattern}; "short-indian" and "sap-short-indian" are only available since
      * 1.133.0 for the "en-IN" locale
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPowerOfTen: String
    ): js.UndefOr[String] = js.native
    def getCurrencyFormat(
      /**
      * See {@link #getCompactCurrencyPattern}; "short-indian" and "sap-short-indian" are only available since
      * 1.133.0 for the "en-IN" locale
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPowerOfTen: String,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPlural: few | many | one | other | two | zero
    ): js.UndefOr[String] = js.native
    def getCurrencyFormat(
      /**
      * See {@link #getCompactCurrencyPattern}; "short-indian" and "sap-short-indian" are only available since
      * 1.133.0 for the "en-IN" locale
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPowerOfTen: String,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPlural: few | many | one | other | two | zero,
      /**
      * See {@link #getCompactCurrencyPattern}; since 1.133.0
      */
    sAlternative: alphaNextToNumber | noCurrency
    ): js.UndefOr[String] = js.native
    def getCurrencyFormat(
      /**
      * See {@link #getCompactCurrencyPattern}; "short-indian" and "sap-short-indian" are only available since
      * 1.133.0 for the "en-IN" locale
      */
    sStyle: short | `sap-short` | `short-indian` | `sap-short-indian`,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPowerOfTen: String,
      /**
      * See {@link #getCompactCurrencyPattern}
      */
    sPlural: Unit,
      /**
      * See {@link #getCompactCurrencyPattern}; since 1.133.0
      */
    sAlternative: alphaNextToNumber | noCurrency
    ): js.UndefOr[String] = js.native
    
    /**
      * Gets the currency format pattern for the given context or selects an alternative pattern if desired.
      *
      * CLDR format pattern:
      * See:
      * 	https://cldr.unicode.org/translation/numbers-currency/number-patterns
      *
      *
      * @returns The currency format pattern for the given parameters; `undefined` if no corresponding pattern
      * is found
      */
    def getCurrencyPattern(
      /**
      * The context of the currency pattern; "sap-" prefix is used for the trailing currency code variant
      */
    sContext: accounting | `sap-accounting` | `sap-standard` | standard
    ): js.UndefOr[String] = js.native
    def getCurrencyPattern(
      /**
      * The context of the currency pattern; "sap-" prefix is used for the trailing currency code variant
      */
    sContext: accounting | `sap-accounting` | `sap-standard` | standard,
      /**
      * The alternate currency pattern; since 1.133.0
      */
    sAlternative: alphaNextToNumber | noCurrency
    ): js.UndefOr[String] = js.native
    
    /**
      * Returns the currency symbol for the specified currency, if no symbol is found the ISO 4217 currency code
      * is returned.
      *
      * @since 1.21.1
      *
      * @returns the currency symbol
      */
    def getCurrencySymbol(/**
      * ISO 4217 currency code
      */
    sCurrency: String): String = js.native
    
    /**
      * Returns the currency symbols available for this locale. Currency symbols get accumulated by custom currency
      * symbols.
      *
      * @since 1.60
      *
      * @returns the map of all currency symbols available in this locale, e.g. { "AUD": "A$", "BRL": "R$", "EUR":
      * "€", "GBP": "£", }
      */
    def getCurrencySymbols(): Record[String, String] = js.native
    
    /**
      * Get custom datetime pattern for a given skeleton format.
      *
      * The format string does contain pattern symbols (e.g. "yMMMd" or "Hms") and will be converted into the
      * pattern in the used locale, which matches the wanted symbols best. The symbols must be in canonical order,
      * that is: Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w/W), Day-Of-Week (E/e/c), Day (d/D),
      * Hour (h/H/k/K/), Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x)
      *
      * See https://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
      *
      * @since 1.34
      *
      * @returns the best matching datetime pattern
      */
    def getCustomDateTimePattern(/**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String): String = js.native
    def getCustomDateTimePattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getCustomDateTimePattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String | js.Array[String] = js.native
    /**
      * Get interval pattern for a given skeleton format.
      *
      * The format string does contain pattern symbols (e.g. "yMMMd" or "Hms") and will be converted into the
      * pattern in the used locale, which matches the wanted symbols best. The symbols must be in canonical order,
      * that is: Era (G), Year (y/Y), Quarter (q/Q), Month (M/L), Week (w/W), Day-Of-Week (E/e/c), Day (d/D),
      * Hour (h/H/k/K/), Minute (m), Second (s), Timezone (z/Z/v/V/O/X/x)
      *
      * See https://unicode.org/reports/tr35/tr35-dates.html#availableFormats_appendItems
      *
      * @since 1.46
      *
      * @returns the best matching interval pattern if interval difference is given otherwise an array with all
      * possible interval patterns which match the given skeleton format
      */
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String | js.Array[String] = js.native
    def getCustomIntervalPattern(
      /**
      * the wanted skeleton format for the datetime pattern
      */
    sSkeleton: String,
      /**
      * is either a string which represents the symbol matching the greatest difference in the two dates to format
      * or an object which contains key-value pairs. The value is always true. The key is one of the date field
      * symbol groups whose value are different between the two dates. The key can only be set with 'Year', 'Quarter',
      * 'Month', 'Week', 'Day', 'DayPeriod', 'Hour', 'Minute', or 'Second'.
      */
    vGreatestDiff: js.Object,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String | js.Array[String] = js.native
    
    /**
      * Get date pattern in the given style.
      *
      *
      * @returns the selected date pattern
      */
    def getDatePattern(/**
      * the required style for the date pattern
      */
    sStyle: full | long | medium | short): String = js.native
    def getDatePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getDatePattern(
      /**
      * the required style for the date pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Get datetime pattern in the given style.
      *
      *
      * @returns the selected datetime pattern
      */
    def getDateTimePattern(/**
      * the required style for the datetime pattern
      */
    sStyle: full | long | medium | short): String = js.native
    def getDateTimePattern(
      /**
      * the required style for the datetime pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getDateTimePattern(
      /**
      * the required style for the datetime pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Get day periods in the given width.
      *
      *
      * @returns array of day periods (AM, PM)
      */
    def getDayPeriods(/**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getDayPeriods(
      /**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getDayPeriods(
      /**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get standalone day periods in the given width.
      *
      *
      * @returns array of day periods (AM, PM)
      */
    def getDayPeriodsStandAlone(/**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getDayPeriodsStandAlone(
      /**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getDayPeriodsStandAlone(
      /**
      * the required width for the day period names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get day names in the given width.
      *
      *
      * @returns array of day names (starting with Sunday)
      */
    def getDays(/**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide): js.Array[String] = js.native
    def getDays(
      /**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getDays(
      /**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get standalone day names in the given width.
      *
      *
      * @returns array of day names (starting with Sunday)
      */
    def getDaysStandAlone(/**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide): js.Array[String] = js.native
    def getDaysStandAlone(
      /**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getDaysStandAlone(
      /**
      * the required width for the day names
      */
    sWidth: abbreviated | narrow | short | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Replaced by {@link #getCompactDecimalPattern}.
      *
      * @since 1.25.0
      * @deprecated As of version 1.133.0. use {@link #getCompactDecimalPattern} instead
      *
      * @returns See {@link #getCompactDecimalPattern}
      */
    def getDecimalFormat(
      /**
      * See {@link #getCompactDecimalPattern}; "short-indian" is only available since 1.133.0 for the "en-IN"
      * locale
      */
    sStyle: long | short | `short-indian`,
      /**
      * See {@link #getCompactDecimalPattern}
      */
    sPowerOfTen: String
    ): js.UndefOr[String] = js.native
    def getDecimalFormat(
      /**
      * See {@link #getCompactDecimalPattern}; "short-indian" is only available since 1.133.0 for the "en-IN"
      * locale
      */
    sStyle: long | short | `short-indian`,
      /**
      * See {@link #getCompactDecimalPattern}
      */
    sPowerOfTen: String,
      /**
      * See {@link #getCompactDecimalPattern}
      */
    sPlural: few | many | one | other | two | zero
    ): js.UndefOr[String] = js.native
    
    /**
      * Get decimal format pattern.
      *
      *
      * @returns The pattern
      */
    def getDecimalPattern(): String = js.native
    
    /**
      * Returns the display name for a time unit of the given type.
      *
      * @since 1.34.0
      *
      * @returns display name
      */
    def getDisplayName(
      /**
      * the type
      */
    sType: day | era | hour | minute | month | quarter | second | week | weekday | year | zone
    ): String = js.native
    def getDisplayName(
      /**
      * the type
      */
    sType: day | era | hour | minute | month | quarter | second | week | weekday | year | zone,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns the map of era IDs to era dates.
      *
      * @since 1.32.0
      *
      * @returns the array of eras containing objects with either an _end or _start property with a date
      */
    def getEraDates(): js.Array[js.Object] = js.native
    def getEraDates(
      /**
      * The type of calendar; defaults to the calendar type either set via the "calendar-type" formatting configuration
      * option, see {@link https://ui5.sap.com/#/topic/91f2d03b6f4d1014b6dd926db0e91070 Configuration Options and URL Parameters},
      * or determined from the current locale
      */
    sCalendarType: CalendarType
    ): js.Array[js.Object] = js.native
    def getEraDates(
      /**
      * The type of calendar; defaults to the calendar type either set via the "calendar-type" formatting configuration
      * option, see {@link https://ui5.sap.com/#/topic/91f2d03b6f4d1014b6dd926db0e91070 Configuration Options and URL Parameters},
      * or determined from the current locale
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[js.Object] = js.native
    
    /**
      * Returns array of eras in the given width.
      *
      * @since 1.32.0
      *
      * @returns the array of eras
      */
    def getEras(/**
      * the width of the era name
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getEras(
      /**
      * the width of the era name
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getEras(
      /**
      * the width of the era name
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Returns the day that usually is regarded as the first day of a week in the current locale.
      *
      * Days are encoded as integer where Sunday=0, Monday=1 etc.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      *
      * @returns first day of week
      */
    def getFirstDayOfWeek(): int = js.native
    
    /**
      * Returns the interval format with the given Id (see CLDR documentation for valid Ids) or the fallback
      * format if no interval format with that Id is known.
      *
      * The empty Id ("") might be used to retrieve the interval format fallback.
      *
      * @since 1.17.0
      *
      * @returns interval format string with placeholders {0} and {1}
      */
    def getIntervalPattern(/**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String): String = js.native
    def getIntervalPattern(
      /**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getIntervalPattern(
      /**
      * Id of the interval format, e.g. "d-d"
      */
    sId: String,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Gets the locale-specific language name for the given language tag.
      *
      * The languages returned by {@link #getLanguages} from the CLDR raw data do not contain the language names
      * if they can be derived from the language and the script or the territory. If the map of languages contains
      * no entry for the given language tag, derive the language name from the used script or region.
      *
      *
      * @returns The language name, or `undefined` if the name cannot be determined
      */
    def getLanguageName(
      /**
      * The language tag, for example "en", "en-US", "en_US", "zh-Hant", or "zh_Hant"
      */
    sLanguageTag: String
    ): js.UndefOr[String] = js.native
    
    /**
      * Gets locale-specific language names, as available in the CLDR raw data.
      *
      * To avoid redundancies, with CLDR version 43 only language names are contained which cannot be derived
      * from the language and the script or the territory. If a language tag is not contained in the map, use
      * {@link #getLanguageName} to get the derived locale-specific language name for that language tag.
      *
      *
      * @returns Maps a language tag to the locale-specific language name
      */
    def getLanguages(): Record[String, String] = js.native
    
    /**
      * Get lenient symbols for the sign of a number for the given symbol type.
      *
      *
      * @returns the selected lenient symbols for the sign of a number, e.g. "-‒⁻₋−➖﹣"
      */
    def getLenientNumberSymbols(/**
      * the required type of symbol
      */
    sType: minusSign | plusSign): String = js.native
    
    /**
      * Returns the required minimal number of days for the first week of a year.
      *
      * This is the minimal number of days of the week which must be contained in the new year for the week to
      * become the first week of the year. Depending on the country, this is just a single day (in the US) or
      * at least 4 days (in most of Europe).
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      *
      * @returns minimal number of days
      */
    def getMinimalDaysInFirstWeek(): int = js.native
    
    /**
      * Get miscellaneous pattern for the given name.
      *
      *
      * @returns The pattern
      */
    def getMiscPattern(/**
      * the name of the misc pattern
      */
    sName: approximately | atLeast | atMost | range): String = js.native
    
    /**
      * Get month names in the given width.
      *
      *
      * @returns The array of month names
      */
    def getMonths(/**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getMonths(
      /**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getMonths(
      /**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get standalone month names in the given width.
      *
      *
      * @returns The array of standalone month names
      */
    def getMonthsStandAlone(/**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getMonthsStandAlone(
      /**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getMonthsStandAlone(
      /**
      * The required width for the month names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * The type of calendar; defaults to the calendar type either set in configuration or calculated from the
      * locale
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get number symbol for the given type.
      *
      *
      * @returns the selected number symbol
      */
    def getNumberSymbol(
      /**
      * the required type of symbol
      */
    sType: decimal | group | minusSign | percentSign | plusSign
    ): String = js.native
    
    /**
      * Gets the text orientation.
      *
      *
      * @returns text orientation
      */
    def getOrientation(): `left-to-right` | `right-to-left` = js.native
    
    /**
      * Get percent format pattern.
      *
      *
      * @returns The pattern
      */
    def getPercentPattern(): String = js.native
    
    /**
      * Returns an array of all plural categories available in this language.
      *
      * @since 1.50
      *
      * @returns The array of plural categories
      */
    def getPluralCategories(): js.Array[String] = js.native
    
    /**
      * Returns the plural category (zero, one, two, few, many or other) for the given number value. The number
      * must be passed as an unformatted number string with dot as decimal separator (for example "12345.67").
      * To determine the correct plural category, it is also necessary to keep the same number of decimal digits
      * as given in the formatted output string. For example "1" and "1.0" could be in different plural categories
      * as the number of decimal digits is different.
      *
      * Compact numbers (for example in "short" format) must be provided in the locale-independent CLDR compact
      * notation. This notation uses the plural rule operand "c" for the compact decimal exponent, for example
      * "1.2c3" for "1.2K" (1200) or "4c6" for "4M" (4000000).
      *
      * Note that the operand "e" is deprecated, but is a synonym corresponding to the CLDR specification for
      * "c" and may be redefined in the future.
      *
      * @since 1.50
      *
      * @returns The plural category
      */
    def getPluralCategory(/**
      * The number to find the plural category for
      */
    vNumber: String): String = js.native
    def getPluralCategory(/**
      * The number to find the plural category for
      */
    vNumber: Double): String = js.native
    
    /**
      * Returns the preferred calendar type for the current locale which exists in {@link module:sap/base/i18n/date/CalendarType}
      *
      * @since 1.28.6
      *
      * @returns the preferred calendar type
      */
    def getPreferredCalendarType(): CalendarType = js.native
    
    /**
      * Returns the preferred hour pattern symbol ("h" for 12, "H" for 24 hours) for the current locale.
      *
      * @since 1.34
      *
      * @returns the preferred hour symbol
      */
    def getPreferredHourSymbol(): h_ | H = js.native
    
    /**
      * Get quarter names in the given width.
      *
      *
      * @returns array of quarters
      */
    def getQuarters(/**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getQuarters(
      /**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getQuarters(
      /**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Get standalone quarter names in the given width.
      *
      *
      * @returns array of quarters
      */
    def getQuartersStandAlone(/**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide): js.Array[String] = js.native
    def getQuartersStandAlone(
      /**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): js.Array[String] = js.native
    def getQuartersStandAlone(
      /**
      * the required width for the quarter names
      */
    sWidth: abbreviated | narrow | wide,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): js.Array[String] = js.native
    
    /**
      * Returns the relative day resource pattern (like "Today", "Yesterday", "{0} days ago") based on the given
      * difference of days (0 means today, 1 means tomorrow, -1 means yesterday, ...).
      *
      * @since 1.25.0
      *
      * @returns the relative day resource pattern
      */
    def getRelativeDay(/**
      * the difference in days
      */
    iDiff: int): String = js.native
    def getRelativeDay(
      /**
      * the difference in days
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns the relative resource pattern with unit 'hour' (like "in {0} hour(s)", "{0} hour(s) ago" under
      * locale 'en') based on the given difference value (positive value means in the future and negative value
      * means in the past).
      *
      * There's no pattern defined for 0 difference and the function returns null if 0 is given. In the 0 difference
      * case, you can use the getRelativeMinute or getRelativeSecond function to format the difference using
      * unit 'minute' or 'second'.
      *
      * @since 1.31.0
      *
      * @returns the relative resource pattern in unit 'hour'. The method returns null if 0 is given as parameter.
      */
    def getRelativeHour(/**
      * the difference in hours
      */
    iDiff: int): String | Null = js.native
    def getRelativeHour(
      /**
      * the difference in hours
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String | Null = js.native
    
    /**
      * Returns the relative resource pattern with unit 'minute' (like "in {0} minute(s)", "{0} minute(s) ago"
      * under locale 'en') based on the given difference value (positive value means in the future and negative
      * value means in the past).
      *
      * There's no pattern defined for 0 difference and the function returns null if 0 is given. In the 0 difference
      * case, you can use the getRelativeSecond function to format the difference using unit 'second'.
      *
      * @since 1.31.0
      *
      * @returns the relative resource pattern in unit 'minute'. The method returns null if 0 is given as parameter.
      */
    def getRelativeMinute(/**
      * the difference in minutes
      */
    iDiff: int): String | Null = js.native
    def getRelativeMinute(
      /**
      * the difference in minutes
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String | Null = js.native
    
    /**
      * Returns the relative month resource pattern (like "This month", "Last month", "{0} months ago") based
      * on the given difference of months (0 means this month, 1 means next month, -1 means last month, ...).
      *
      * @since 1.25.0
      *
      * @returns the relative month resource pattern
      */
    def getRelativeMonth(/**
      * the difference in months
      */
    iDiff: int): String = js.native
    def getRelativeMonth(
      /**
      * the difference in months
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns the relative format pattern with given scale (year, month, week, ...) and difference value.
      *
      * @since 1.34
      *
      * @returns the relative format pattern
      */
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: day | hour | minute | month | second | week | year,
      /**
      * the difference in the given scale unit
      */
    iDiff: int
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: day | hour | minute | month | second | week | year,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Boolean
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: day | hour | minute | month | second | week | year,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Boolean,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    def getRelativePattern(
      /**
      * the scale the relative pattern is needed for
      */
    sScale: day | hour | minute | month | second | week | year,
      /**
      * the difference in the given scale unit
      */
    iDiff: int,
      /**
      * whether a future or past pattern should be used
      */
    bFuture: Unit,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns relative time patterns for the given scales as an array of objects containing scale, value and
      * pattern.
      *
      * The array may contain the following values: "year", "month", "week", "day", "hour", "minute" and "second".
      * If no scales are given, patterns for all available scales will be returned.
      *
      * The return array will contain objects looking like:
      * ```javascript
      *
      * {
      *     scale: "minute",
      *     sign: 1,
      *     pattern: "in {0} minutes"
      * }
      * ```
      *
      *
      * @since 1.34
      *
      * @returns An array of all relative time patterns
      */
    def getRelativePatterns(
      /**
      * The scales for which the available patterns should be returned
      */
    aScales: js.Array[day | hour | minute | month | second | week | year]
    ): js.Array[RelativeTimePattern] = js.native
    def getRelativePatterns(
      /**
      * The scales for which the available patterns should be returned
      */
    aScales: js.Array[day | hour | minute | month | second | week | year],
      /**
      * Since 1.32.10 and 1.34.4, the style of the scale patterns
      */
    sStyle: narrow | short | wide
    ): js.Array[RelativeTimePattern] = js.native
    
    /**
      * Returns the relative resource pattern with unit 'second' (like now, "in {0} seconds", "{0} seconds ago"
      * under locale 'en') based on the given difference value (0 means now, positive value means in the future
      * and negative value means in the past).
      *
      * @since 1.31.0
      *
      * @returns the relative resource pattern in unit 'second'
      */
    def getRelativeSecond(/**
      * the difference in seconds
      */
    iDiff: int): String = js.native
    def getRelativeSecond(
      /**
      * the difference in seconds
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns the relative week resource pattern (like "This week", "Last week", "{0} weeks ago") based on
      * the given difference of weeks (0 means this week, 1 means next week, -1 means last week, ...).
      *
      * @since 1.31.0
      *
      * @returns the relative week resource pattern
      */
    def getRelativeWeek(/**
      * the difference in weeks
      */
    iDiff: int): String = js.native
    def getRelativeWeek(
      /**
      * the difference in weeks
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Returns the relative year resource pattern (like "This year", "Last year", "{0} year ago") based on the
      * given difference of years (0 means this year, 1 means next year, -1 means last year, ...).
      *
      * @since 1.25.0
      *
      * @returns the relative year resource pattern
      */
    def getRelativeYear(/**
      * the difference in years
      */
    iDiff: int): String = js.native
    def getRelativeYear(
      /**
      * the difference in years
      */
    iDiff: int,
      /**
      * Since 1.32.10 and 1.34.4, the style of the pattern
      */
    sStyle: narrow | short | wide
    ): String = js.native
    
    /**
      * Retrieves the unit format pattern for a specific unit name considering the unit mappings.
      * See:
      * 	sap.ui.core.LocaleData#getUnitFromMapping
      *
      * @since 1.54
      *
      * @returns The unit format pattern for the given unit name as a map from a pattern key like `"unitPattern-count-other"`
      * to the corresponding pattern
      */
    def getResolvedUnitFormat(/**
      * unit name, e.g. "duration-hour" or "my"
      */
    sUnit: String): Record[String, String] = js.native
    
    /**
      * Gets locale-specific script names, as available in the CLDR raw data.
      *
      * To avoid redundancies, with CLDR version 43 only scripts are contained for which the language-specific
      * name is different from the script key. If a script key is not contained in the map, use the script key
      * as script name.
      *
      *
      * @returns Maps a script key to the locale-specific script name
      */
    def getScripts(): Record[String, String] = js.native
    
    /**
      * Gets locale-specific territory names, as available in the CLDR raw data.
      *
      * To avoid redundancies, with CLDR version 43 only territories are contained for which the language-specific
      * name is different from the territory key.
      *
      *
      * @returns Maps a territory key to the locale-specific territory name
      */
    def getTerritories(): Record[String, String] = js.native
    
    /**
      * Get time pattern in the given style.
      *
      *
      * @returns the selected time pattern
      */
    def getTimePattern(/**
      * the required style for the time pattern
      */
    sStyle: full | long | medium | short): String = js.native
    def getTimePattern(
      /**
      * the required style for the time pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: CalendarType
    ): String = js.native
    def getTimePattern(
      /**
      * the required style for the time pattern
      */
    sStyle: full | long | medium | short,
      /**
      * the type of calendar. If it's not set, it falls back to the calendar type either set in configuration
      * or calculated from locale.
      */
    sCalendarType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CalendarType * / any */ String
    ): String = js.native
    
    /**
      * Retrieves the localized display name of a unit by sUnit, e.g. "duration-hour".
      *
      * @since 1.54
      *
      * @returns The localized display name for the requested unit, e.g. `"Hour"`. Return empty string `""` if
      * not found
      */
    def getUnitDisplayName(/**
      * the unit key, e.g. "duration-hour"
      */
    sUnit: String): String = js.native
    
    /**
      * Retrieves the unit format pattern for a specific unit name, see {@link #getResolvedUnitFormat} for an
      * example of a unit format pattern.
      *
      * Note: Does not take unit mapping into consideration.
      *
      * @since 1.54
      *
      * @returns The unit format pattern for the given unit name as a map from a pattern key like `"unitPattern-count-other"`
      * to the corresponding pattern or `undefined` if no corresponding pattern is found
      */
    def getUnitFormat(/**
      * unit name, e.g. "duration-hour"
      */
    sUnit: String): js.UndefOr[Record[String, String]] = js.native
    
    /**
      * Retrieves unit format patterns for all units see {@link #getResolvedUnitFormat} for an example of a unit
      * format pattern.
      *
      * Note: Does not take unit mapping into consideration.
      *
      * @since 1.54
      *
      * @returns The unit format patterns as a map from a unit key to a map from a pattern key like `"unitPattern-count-other"`
      * to the corresponding pattern
      */
    def getUnitFormats(): Record[String, Record[String, String]] = js.native
    
    /**
      * Looks up the unit from defined unit mapping. E.g. for defined unit mapping ` { "my": "my-custom-unit",
      * "cm": "length-centimeter" } `
      *
      * Call: `getUnitFromMapping("my")` would result in `"my-custom-unit"`
      *
      * @since 1.54
      *
      * @returns unit from the mapping
      */
    def getUnitFromMapping(/**
      * mapping identifier
      */
    sMapping: String): String = js.native
    
    /**
      * Returns the last day of a weekend for the given locale.
      *
      * Days are encoded in the same way as for {@link #getFirstDayOfWeek}.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      *
      * @returns last day of weekend
      */
    def getWeekendEnd(): int = js.native
    
    /**
      * Returns the first day of a weekend for the given locale.
      *
      * Days are encoded in the same way as for {@link #getFirstDayOfWeek}.
      *
      * All week data information in the CLDR is provided for territories (countries). If the locale of this
      * LocaleData doesn't contain country information (e.g. if it contains only a language), then the "likelySubtag"
      * information of the CLDR is taken into account to guess the "most likely" territory for the locale.
      *
      *
      * @returns first day of weekend
      */
    def getWeekendStart(): int = js.native
  }
  
  trait RelativeTimePattern extends StObject {
    
    /**
      * The string with the locale-specific representation of the relative time pattern
      */
    var pattern: String
    
    /**
      * The scale of the pattern
      */
    var scale: day | hour | minute | month | second | week | year
    
    /**
      * `-1`, if the pattern is for the past; `1` otherwise
      */
    var sign: Double
  }
  object RelativeTimePattern {
    
    inline def apply(pattern: String, scale: day | hour | minute | month | second | week | year, sign: Double): RelativeTimePattern = {
      val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any])
      __obj.asInstanceOf[RelativeTimePattern]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RelativeTimePattern] (val x: Self) extends AnyVal {
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setScale(value: day | hour | minute | month | second | week | year): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setSign(value: Double): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
    }
  }
}
