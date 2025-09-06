package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.AriaLabelMonthButton
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.MonthButtonInfo
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Selectionchange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.day
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.month
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.year
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.yearrange
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-calendar` component allows users to select one or more dates.
    *
    * Currently selected dates are represented with instances of `ui5-date` as
    * children of the `ui5-calendar`. The value property of each `ui5-date` must be a
    * date string, correctly formatted according to the `ui5-calendar`'s `formatPattern` property.
    * Whenever the user changes the date selection, `ui5-calendar` will automatically create/remove instances
    * of `ui5-date` in itself, unless you prevent this behavior by calling `preventDefault()` for the
    * `selection-change` event. This is useful if you want to control the selected dates externally.
    *
    * ### Usage
    *
    * The user can navigate to a particular date by:
    *
    * - Pressing over a month inside the months view
    * - Pressing over an year inside the years view
    *
    * The user can confirm a date selection by pressing over a date inside the days view.
    *
    * ### Keyboard Handling
    * The `ui5-calendar` provides advanced keyboard handling.
    * When a picker is showed and focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - Day picker:
    *
    * - [F4] - Shows month picker
    * - [Shift] + [F4] - Shows year picker
    * - [Page Up] - Navigate to the previous month
    * - [Page Down] - Navigate to the next month
    * - [Shift] + [Page Up] - Navigate to the previous year
    * - [Shift] + [Page Down] - Navigate to the next year
    * - [Ctrl] + [Shift] + [Page Up] - Navigate ten years backwards
    * - [Ctrl] + [Shift] + [Page Down] - Navigate ten years forwards
    * - [Home] - Navigate to the first day of the week
    * - [End] - Navigate to the last day of the week
    * - [Ctrl] + [Home] - Navigate to the first day of the month
    * - [Ctrl] + [End] - Navigate to the last day of the month
    *
    * - Month picker:
    *
    * - [Page Up] - Navigate to the previous year
    * - [Page Down] - Navigate to the next year
    * - [Home] - Navigate to the first month of the current row
    * - [End] - Navigate to the last month of the current row
    * - [Ctrl] + [Home] - Navigate to the first month of the current year
    * - [Ctrl] + [End] - Navigate to the last month of the year
    *
    * - Year picker:
    *
    * - [Page Up] - Navigate to the previous year range
    * - [Page Down] - Navigate the next year range
    * - [Home] - Navigate to the first year of the current row
    * - [End] - Navigate to the last year of the current row
    * - [Ctrl] + [Home] - Navigate to the first year of the current year range
    * - [Ctrl] + [End] - Navigate to the last year of the current year range
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### Calendar types
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the `primaryCalendarType` property and import one or more of the following modules:
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";`
    *
    * Or, you can use the global configuration and set the `calendarType` key:
    *
    * ```html
    * <script data-id="sap-ui-config" type="application/json">
    * 	{
    * 		"calendarType": "Japanese"
    * 	}
    * </script>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Calendar.js";`
    * @constructor
    * @extends CalendarPart
    * @public
    * @csspart day-cell - Used to style the day cells.
    * @csspart day-cell-selected - Used to style the day cells when selected.
    * @csspart day-cell-selected-between - Used to style the day cells in between of selected dates in range.
    * @csspart month-cell - Used to style the month cells.
    * @csspart month-cell-selected - Used to style the month cells when selected.
    * @csspart month-cell-selected-between - Used to style the day cells in between of selected months in range.
    * @csspart month-picker-root - Used to style the month picker root container.
    * @csspart year-cell - Used to style the year cells.
    * @csspart year-cell-selected - Used to style the year cells when selected.
    * @csspart year-cell-selected-between - Used to style the year cells in between of selected years in range.
    * @csspart year-picker-root - Used to style the year picker root container.
    * @csspart year-range-cell - Used to style the year range cells.
    * @csspart year-range-cell-selected - Used to style the year range cells when selected.
    * @csspart year-range-cell-selected-between - Used to style the year range cells in between of selected year ranges.
    * @csspart year-range-picker-root - Used to style the year range picker root container.
    * @csspart calendar-header-middle-button - Used to style the calendar header middle buttons (month/year/year-range buttons).
    * @csspart calendar-header-arrow-button - Used to style the calendar header navigation arrow buttons (previous/next buttons).
    * @since 1.0.0-rc.11
    */
  @JSImport("@ui5/webcomponents/dist/Calendar.js", JSImport.Default)
  @js.native
  open class default () extends Calendar
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Calendar.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Calendar.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-calendar` component allows users to select one or more dates.
    *
    * Currently selected dates are represented with instances of `ui5-date` as
    * children of the `ui5-calendar`. The value property of each `ui5-date` must be a
    * date string, correctly formatted according to the `ui5-calendar`'s `formatPattern` property.
    * Whenever the user changes the date selection, `ui5-calendar` will automatically create/remove instances
    * of `ui5-date` in itself, unless you prevent this behavior by calling `preventDefault()` for the
    * `selection-change` event. This is useful if you want to control the selected dates externally.
    *
    * ### Usage
    *
    * The user can navigate to a particular date by:
    *
    * - Pressing over a month inside the months view
    * - Pressing over an year inside the years view
    *
    * The user can confirm a date selection by pressing over a date inside the days view.
    *
    * ### Keyboard Handling
    * The `ui5-calendar` provides advanced keyboard handling.
    * When a picker is showed and focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - Day picker:
    *
    * - [F4] - Shows month picker
    * - [Shift] + [F4] - Shows year picker
    * - [Page Up] - Navigate to the previous month
    * - [Page Down] - Navigate to the next month
    * - [Shift] + [Page Up] - Navigate to the previous year
    * - [Shift] + [Page Down] - Navigate to the next year
    * - [Ctrl] + [Shift] + [Page Up] - Navigate ten years backwards
    * - [Ctrl] + [Shift] + [Page Down] - Navigate ten years forwards
    * - [Home] - Navigate to the first day of the week
    * - [End] - Navigate to the last day of the week
    * - [Ctrl] + [Home] - Navigate to the first day of the month
    * - [Ctrl] + [End] - Navigate to the last day of the month
    *
    * - Month picker:
    *
    * - [Page Up] - Navigate to the previous year
    * - [Page Down] - Navigate to the next year
    * - [Home] - Navigate to the first month of the current row
    * - [End] - Navigate to the last month of the current row
    * - [Ctrl] + [Home] - Navigate to the first month of the current year
    * - [Ctrl] + [End] - Navigate to the last month of the year
    *
    * - Year picker:
    *
    * - [Page Up] - Navigate to the previous year range
    * - [Page Down] - Navigate the next year range
    * - [Home] - Navigate to the first year of the current row
    * - [End] - Navigate to the last year of the current row
    * - [Ctrl] + [Home] - Navigate to the first year of the current year range
    * - [Ctrl] + [End] - Navigate to the last year of the current year range
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### Calendar types
    * The component supports several calendar types - Gregorian, Buddhist, Islamic, Japanese and Persian.
    * By default the Gregorian Calendar is used. In order to use the Buddhist, Islamic, Japanese or Persian calendar,
    * you need to set the `primaryCalendarType` property and import one or more of the following modules:
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Buddhist.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Islamic.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Japanese.js";`
    *
    * `import "@ui5/webcomponents-localization/dist/features/calendar/Persian.js";`
    *
    * Or, you can use the global configuration and set the `calendarType` key:
    *
    * ```html
    * <script data-id="sap-ui-config" type="application/json">
    * 	{
    * 		"calendarType": "Japanese"
    * 	}
    * </script>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Calendar.js";`
    * @constructor
    * @extends CalendarPart
    * @public
    * @csspart day-cell - Used to style the day cells.
    * @csspart day-cell-selected - Used to style the day cells when selected.
    * @csspart day-cell-selected-between - Used to style the day cells in between of selected dates in range.
    * @csspart month-cell - Used to style the month cells.
    * @csspart month-cell-selected - Used to style the month cells when selected.
    * @csspart month-cell-selected-between - Used to style the day cells in between of selected months in range.
    * @csspart month-picker-root - Used to style the month picker root container.
    * @csspart year-cell - Used to style the year cells.
    * @csspart year-cell-selected - Used to style the year cells when selected.
    * @csspart year-cell-selected-between - Used to style the year cells in between of selected years in range.
    * @csspart year-picker-root - Used to style the year picker root container.
    * @csspart year-range-cell - Used to style the year range cells.
    * @csspart year-range-cell-selected - Used to style the year range cells when selected.
    * @csspart year-range-cell-selected-between - Used to style the year range cells in between of selected year ranges.
    * @csspart year-range-picker-root - Used to style the year range picker root container.
    * @csspart calendar-header-middle-button - Used to style the calendar header middle buttons (month/year/year-range buttons).
    * @csspart calendar-header-arrow-button - Used to style the calendar header navigation arrow buttons (previous/next buttons).
    * @since 1.0.0-rc.11
    */
  @js.native
  trait Calendar
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarPartMod.default {
    
    /**
      * Which picker is currently visible to the user: day/month/year/yearRange
      * @private
      */
    var _currentPicker: day | month | year | yearrange = js.native
    
    def _currentPickerDOM: ICalendarPicker = js.native
    
    def _currentYearRange: CalendarYearRangeT = js.native
    
    def _fireEventAndUpdateSelectedDates(selectedDates: js.Array[Double]): Unit = js.native
    
    var _headerMonthButtonText: js.UndefOr[String] = js.native
    
    var _headerYearButtonText: js.UndefOr[String] = js.native
    
    var _headerYearButtonTextSecType: js.UndefOr[String] = js.native
    
    var _headerYearRangeButtonText: js.UndefOr[String] = js.native
    
    var _headerYearRangeButtonTextSecType: js.UndefOr[String] = js.native
    
    def _isDayPickerHidden: Boolean = js.native
    
    /**
      * The month button is hidden when the month picker or year picker is shown
      * @private
      */
    def _isHeaderMonthButtonHidden: Boolean = js.native
    
    /**
      * The year button is shown only in the day & month pickers
      * @private
      */
    def _isHeaderYearButtonHidden: Boolean = js.native
    
    /**
      * The year range picker button is shown only in the year picker
      * @private
      */
    def _isHeaderYearRangeButtonHidden: Boolean = js.native
    
    def _isMonthPickerHidden: Boolean = js.native
    
    def _isValidCalendarDate(dateString: String): Boolean = js.native
    
    def _isYearPickerHidden: Boolean = js.native
    
    def _isYearRangePickerHidden: Boolean = js.native
    
    var _nextButtonDisabled: Boolean = js.native
    
    /**
      * Makes sure that _currentPicker is always set to a value, allowed by _pickersMode
      */
    def _normalizeCurrentPicker(): Unit = js.native
    
    def _onCalendarLegendSelectionChange(e: CustomEvent): Unit = js.native
    
    def _onLegendFocusOut(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _pickersMode: /* template literal string: ${CalendarPickersMode} */ String = js.native
    
    var _previousButtonDisabled: Boolean = js.native
    
    var _rangeStartYear: js.UndefOr[Double] = js.native
    
    /**
      * @private
      */
    def _selectedDatesTimestamps: js.Array[Double] = js.native
    
    /**
      * Defines the selected item type of the calendar legend item (if such exists).
      * @private
      */
    var _selectedItemType: /* template literal string: ${CalendarLegendItemType} */ String = js.native
    
    def _setSecondaryCalendarTypeButtonText(): Unit = js.native
    
    /**
      * @private
      */
    def _setSelectedDates(selectedDates: js.Array[Double]): Unit = js.native
    
    def _specialCalendarDates: js.Array[SpecialCalendarDateT] = js.native
    
    def _specialDates: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSpecialCalendarDateMod.default
      ] = js.native
    
    var _valueIsProcessed: Boolean = js.native
    
    def accInfo: AriaLabelMonthButton = js.native
    
    /**
      * Defines the calendar legend of the component.
      * @public
      * @since 1.23.0
      */
    var calendarLegend: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendMod.default
      ] = js.native
    
    /**
      * Defines the selected date or dates (depending on the `selectionMode` property)
      * for this calendar as instances of `ui5-date` or `ui5-date-range`.
      * Use `ui5-date` for single or multiple selection, and `ui5-date-range` for range selection.
      * @public
      */
    var dates: js.Array[ICalendarSelectedDates] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Calendar: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any) & Selectionchange = js.native
    
    def headerNextButtonText: String = js.native
    
    def headerPreviousButtonText: String = js.native
    
    /**
      * Defines the visibility of the week numbers column.
      *
      * **Note:** For calendars other than Gregorian,
      * the week numbers are not displayed regardless of what is set.
      * @default false
      * @public
      */
    var hideWeekNumbers: Boolean = js.native
    
    /**
      * The year clicked the "Next" button in the header
      */
    def onHeaderNextPress(): Unit = js.native
    
    /**
      * The year clicked the "Previous" button in the header
      */
    def onHeaderPreviousPress(): Unit = js.native
    
    /**
      * The user clicked the "month" button in the header
      */
    def onHeaderShowMonthPress(): Unit = js.native
    
    /**
      * The user clicked the "year" button in the header
      */
    def onHeaderShowYearPress(): Unit = js.native
    
    /**
      * The user clicked the "year range" button in the YearPicker header
      */
    def onHeaderShowYearRangePress(): Unit = js.native
    
    def onMonthButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onMonthButtonKeyUp(e: KeyboardEvent): Unit = js.native
    
    def onNavigate(e: CustomEvent): Unit = js.native
    
    def onNextButtonClick(e: MouseEvent): Unit = js.native
    
    def onPrevButtonClick(e: MouseEvent): Unit = js.native
    
    def onSelectedDatesChange(e: CustomEvent): Unit = js.native
    
    def onSelectedMonthChange(e: CustomEvent): Unit = js.native
    
    def onSelectedYearChange(e: CustomEvent): Unit = js.native
    
    def onSelectedYearRangeChange(e: CustomEvent): Unit = js.native
    
    def onYearButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onYearButtonKeyUp(e: KeyboardEvent): Unit = js.native
    
    def onYearRangeButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def onYearRangeButtonKeyUp(e: KeyboardEvent): Unit = js.native
    
    def secondMonthButtonText: String = js.native
    
    def secondaryCalendarTypeButtonText: js.UndefOr[MonthButtonInfo] = js.native
    
    /**
      * Returns an array of UTC timestamps, representing the selected dates.
      * @protected
      * @deprecated
      */
    def selectedDates: js.Array[Double] = js.native
    /**
      * Creates instances of `ui5-date` or `ui5-date-range` inside this `ui5-calendar` with values, equal to the provided UTC timestamps
      * @protected
      * @deprecated
      * @param selectedDates Array of UTC timestamps
      */
    def selectedDates_=(selectedDates: js.Array[Double]): Unit = js.native
    
    /**
      * Defines the type of selection used in the calendar component.
      * Accepted property values are:
      *
      * - `CalendarSelectionMode.Single` - enables a single date selection.(default value)
      * - `CalendarSelectionMode.Range` - enables selection of a date range.
      * - `CalendarSelectionMode.Multiple` - enables selection of multiple dates.
      * @default "Single"
      * @public
      */
    var selectionMode: /* template literal string: ${CalendarSelectionMode} */ String = js.native
    
    def showMonth(): Unit = js.native
    
    def showYear(): Unit = js.native
    
    def showYearRange(): Unit = js.native
    
    /**
      * Defines the special dates, visually emphasized in the calendar.
      * @public
      * @since 1.23.0
      */
    var specialDates: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSpecialCalendarDateMod.default
      ] = js.native
  }
  
  trait CalendarSelectionChangeEventDetail extends StObject {
    
    var selectedDates: js.Array[Double]
    
    var selectedValues: js.Array[String]
    
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object CalendarSelectionChangeEventDetail {
    
    inline def apply(selectedDates: js.Array[Double], selectedValues: js.Array[String]): CalendarSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedDates = selectedDates.asInstanceOf[js.Any], selectedValues = selectedValues.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedDates(value: js.Array[Double]): Self = StObject.set(x, "selectedDates", value.asInstanceOf[js.Any])
      
      inline def setSelectedDatesVarargs(value: Double*): Self = StObject.set(x, "selectedDates", js.Array(value*))
      
      inline def setSelectedValues(value: js.Array[String]): Self = StObject.set(x, "selectedValues", value.asInstanceOf[js.Any])
      
      inline def setSelectedValuesVarargs(value: String*): Self = StObject.set(x, "selectedValues", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait CalendarYearRangeT extends StObject {
    
    var endYear: Double
    
    var startYear: Double
  }
  object CalendarYearRangeT {
    
    inline def apply(endYear: Double, startYear: Double): CalendarYearRangeT = {
      val __obj = js.Dynamic.literal(endYear = endYear.asInstanceOf[js.Any], startYear = startYear.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarYearRangeT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarYearRangeT] (val x: Self) extends AnyVal {
      
      inline def setEndYear(value: Double): Self = StObject.set(x, "endYear", value.asInstanceOf[js.Any])
      
      inline def setStartYear(value: Double): Self = StObject.set(x, "startYear", value.asInstanceOf[js.Any])
    }
  }
  
  trait ICalendarPicker extends StObject {
    
    var _autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var _currentYearRange: js.UndefOr[CalendarYearRangeT] = js.undefined
    
    def _hasNextPage(): Boolean
    
    def _hasPreviousPage(): Boolean
    
    def _showNextPage(): Unit
    
    def _showPreviousPage(): Unit
  }
  object ICalendarPicker {
    
    inline def apply(
      _hasNextPage: () => Boolean,
      _hasPreviousPage: () => Boolean,
      _showNextPage: () => Unit,
      _showPreviousPage: () => Unit
    ): ICalendarPicker = {
      val __obj = js.Dynamic.literal(_hasNextPage = js.Any.fromFunction0(_hasNextPage), _hasPreviousPage = js.Any.fromFunction0(_hasPreviousPage), _showNextPage = js.Any.fromFunction0(_showNextPage), _showPreviousPage = js.Any.fromFunction0(_showPreviousPage))
      __obj.asInstanceOf[ICalendarPicker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICalendarPicker] (val x: Self) extends AnyVal {
      
      inline def set_autoFocus(value: Boolean): Self = StObject.set(x, "_autoFocus", value.asInstanceOf[js.Any])
      
      inline def set_autoFocusUndefined: Self = StObject.set(x, "_autoFocus", js.undefined)
      
      inline def set_currentYearRange(value: CalendarYearRangeT): Self = StObject.set(x, "_currentYearRange", value.asInstanceOf[js.Any])
      
      inline def set_currentYearRangeUndefined: Self = StObject.set(x, "_currentYearRange", js.undefined)
      
      inline def set_hasNextPage(value: () => Boolean): Self = StObject.set(x, "_hasNextPage", js.Any.fromFunction0(value))
      
      inline def set_hasPreviousPage(value: () => Boolean): Self = StObject.set(x, "_hasPreviousPage", js.Any.fromFunction0(value))
      
      inline def set_showNextPage(value: () => Unit): Self = StObject.set(x, "_showNextPage", js.Any.fromFunction0(value))
      
      inline def set_showPreviousPage(value: () => Unit): Self = StObject.set(x, "_showPreviousPage", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-calendar`.
    *
    * **Note:** Use with `ui5-date` or `ui5-date-range` as calendar date selection types.
    * @public
    */
  @js.native
  trait ICalendarSelectedDates
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var endValue: js.UndefOr[String] = js.native
    
    var startValue: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  
  trait SpecialCalendarDateT extends StObject {
    
    var specialDateTimestamp: Double
    
    var tooltip: js.UndefOr[String] = js.undefined
    
    var `type`: /* template literal string: ${CalendarLegendItemType} */ String
  }
  object SpecialCalendarDateT {
    
    inline def apply(
      specialDateTimestamp: Double,
      `type`: /* template literal string: ${CalendarLegendItemType} */ String
    ): SpecialCalendarDateT = {
      val __obj = js.Dynamic.literal(specialDateTimestamp = specialDateTimestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpecialCalendarDateT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpecialCalendarDateT] (val x: Self) extends AnyVal {
      
      inline def setSpecialDateTimestamp(value: Double): Self = StObject.set(x, "specialDateTimestamp", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setType(value: /* template literal string: ${CalendarLegendItemType} */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
