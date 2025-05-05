package io.github.nguyenyou.ui5.webcomponents.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreFormatDateFormatMod {
  
  @JSImport("sap/ui/core/format/DateFormat", JSImport.Default)
  @js.native
  /**
    * @ui5-protected Do not call from applications (only from related classes in the framework)
    */
  /* protected */ open class default ()
    extends StObject
       with DateFormat
  /* static members */
  object default
  
  @js.native
  trait DateFormat extends StObject {
    
    def format(/**
      * the value to format
      */
    vJSDate: js.Array[js.Date]): String = js.native
    def format(
      /**
      * the value to format
      */
    vJSDate: js.Array[js.Date],
      /**
      * whether to use UTC
      */
    bUTC: Boolean
    ): String = js.native
    /**
      * Format a date according to the given format options.
      *
      * Uses the timezone from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone},
      * which falls back to the browser's local timezone to convert the given date.
      *
      * When using instances from getDateTimeWithTimezoneInstance, please see the corresponding documentation:
      * {@link sap.ui.core.format.DateFormat.DateTimeWithTimezone#format}.
      *
      *
      * @returns the formatted output value. If an invalid date is given, an empty string is returned.
      */
    def format(/**
      * the value to format
      */
    vJSDate: js.Date): String = js.native
    def format(/**
      * the value to format
      */
    vJSDate: js.Date, /**
      * whether to use UTC
      */
    bUTC: Boolean): String = js.native
    
    /**
      * Parse a string which is formatted according to the given format options.
      *
      * Uses the timezone from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone},
      * which falls back to the browser's local timezone to convert the given date.
      *
      * When using instances from getDateTimeWithTimezoneInstance, please see the corresponding documentation:
      * {@link sap.ui.core.format.DateFormat.DateTimeWithTimezone#parse}.
      *
      *
      * @returns the parsed value(s)
      */
    def parse(/**
      * the string containing a formatted date/time value
      */
    sValue: String): js.Date | (js.Array[
        js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
      ]) | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * whether to use UTC
      */
    bUTC: Boolean
    ): js.Date | (js.Array[
        js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
      ]) | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * whether to use UTC
      */
    bUTC: Boolean,
      /**
      * whether to use strict value check
      */
    bStrict: Boolean
    ): js.Date | (js.Array[
        js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
      ]) | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * whether to use UTC
      */
    bUTC: Unit,
      /**
      * whether to use strict value check
      */
    bStrict: Boolean
    ): js.Date | (js.Array[
        js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
      ]) | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
  }
  
  @js.native
  trait DateTimeWithTimezone extends StObject {
    
    var __implements__sap_ui_core_format_DateFormat_DateTimeWithTimezone: Boolean = js.native
    
    /**
      * Format a date object to a string according to the given timezone and format options.
      *
      * @since 1.99
      *
      * @returns the formatted output value. If an invalid date or timezone is given, an empty string is returned.
      */
    def format(): String = js.native
    def format(
      /**
      * The date to format. If it is `null` or `undefined` only the timezone will be formatted, any other invalid
      * date is formatted as empty string.
      */
    oJSDate: js.Date
    ): String = js.native
    def format(
      /**
      * The date to format. If it is `null` or `undefined` only the timezone will be formatted, any other invalid
      * date is formatted as empty string.
      */
    oJSDate: js.Date,
      /**
      * The IANA timezone ID in which the date will be calculated and formatted e.g. "America/New_York". If the
      * parameter is omitted, `null` or an empty string, the timezone will be taken from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone}.
      * For an invalid IANA time zone ID, an empty string will be returned.
      */
    sTimezone: String
    ): String = js.native
    def format(
      /**
      * The date to format. If it is `null` or `undefined` only the timezone will be formatted, any other invalid
      * date is formatted as empty string.
      */
    oJSDate: Unit,
      /**
      * The IANA timezone ID in which the date will be calculated and formatted e.g. "America/New_York". If the
      * parameter is omitted, `null` or an empty string, the timezone will be taken from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone}.
      * For an invalid IANA time zone ID, an empty string will be returned.
      */
    sTimezone: String
    ): String = js.native
    
    /**
      * Parse a string which is formatted according to the given format options to an array containing a date
      * object and the timezone.
      *
      * @since 1.99
      *
      * @returns the parsed values
      * 	 - An array containing datetime and timezone depending on the showDate, showTime and showTimezone options
      *
      * 	(Default): [Date, string], e.g. [UI5Date.getInstance("2021-11-13T13:22:33Z"), "America/New_York"]
      * 	 - `showTimezone: false`: [Date, undefined], e.g. [UI5Date.getInstance("2021-11-13T13:22:33Z"), undefined]
      *
      * 	 - `showDate: false, showTime: false`: [undefined, string], e.g. [undefined, "America/New_York"]
      */
    def parse(/**
      * the string containing a formatted date/time value
      */
    sValue: String): (js.Tuple2[
        js.UndefOr[
          js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
        ], 
        js.UndefOr[String]
      ]) | Null = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: String
    ): (js.Tuple2[
        js.UndefOr[
          js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
        ], 
        js.UndefOr[String]
      ]) | Null = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: String,
      /**
      * Whether to be strict with regards to the value ranges of date fields, e.g. for a month pattern of `MM`
      * and a value range of [1-12] `strict` ensures that the value is within the range; if it is larger than
      * `12` it cannot be parsed and `null` is returned
      */
    bStrict: Boolean
    ): (js.Tuple2[
        js.UndefOr[
          js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
        ], 
        js.UndefOr[String]
      ]) | Null = js.native
    def parse(
      /**
      * the string containing a formatted date/time value
      */
    sValue: String,
      /**
      * The IANA timezone ID which should be used to convert the date e.g. "America/New_York". If the parameter
      * is omitted, `null` or an empty string, the timezone will be taken from {@link module:sap/base/i18n/Localization.getTimezone Localization.getTimezone}.
      * For an invalid IANA timezone ID, `null` will be returned.
      */
    sTimezone: Unit,
      /**
      * Whether to be strict with regards to the value ranges of date fields, e.g. for a month pattern of `MM`
      * and a value range of [1-12] `strict` ensures that the value is within the range; if it is larger than
      * `12` it cannot be parsed and `null` is returned
      */
    bStrict: Boolean
    ): (js.Tuple2[
        js.UndefOr[
          js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
        ], 
        js.UndefOr[String]
      ]) | Null = js.native
  }
}
