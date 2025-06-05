package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeYearRangePickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.ICalendarPicker
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`20`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`6`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`8`
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distYearRangePickerMod {
  
  /**
    * @class
    *
    * Displays year ranges which help navigate through years faster.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/YearRangePicker.js", JSImport.Default)
  @js.native
  open class default () extends YearRangePicker {
    
    /* CompleteClass */
    override def _hasNextPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _hasPreviousPage(): Boolean = js.native
    
    /* CompleteClass */
    override def _showNextPage(): Unit = js.native
    
    /* CompleteClass */
    override def _showPreviousPage(): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/YearRangePicker.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/YearRangePicker.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait YearRange extends StObject {
    
    var _tabIndex: Double
    
    var ariaDisabled: js.UndefOr[Boolean] = js.undefined
    
    var ariaSelected: Boolean
    
    var classes: String
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var parts: String
    
    var range: String
    
    var rangeInSecType: js.UndefOr[String] = js.undefined
    
    var selected: Boolean
    
    var timestamp: String
  }
  object YearRange {
    
    inline def apply(
      _tabIndex: Double,
      ariaSelected: Boolean,
      classes: String,
      disabled: Boolean,
      focusRef: Boolean,
      parts: String,
      range: String,
      selected: Boolean,
      timestamp: String
    ): YearRange = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearRange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearRange] (val x: Self) extends AnyVal {
      
      inline def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setParts(value: String): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeInSecType(value: String): Self = StObject.set(x, "rangeInSecType", value.asInstanceOf[js.Any])
      
      inline def setRangeInSecTypeUndefined: Self = StObject.set(x, "rangeInSecType", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def set_tabIndex(value: Double): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * Displays year ranges which help navigate through years faster.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @js.native
  trait YearRangePicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _getGridStartYear(): Double = js.native
    
    def _getInitialFocusedIndex(): Double = js.native
    
    def _getPageSize(): `6` | `8` = js.native
    
    def _getRangeSize(): `8` | `20` = js.native
    
    def _getRowSize(): `1` | `2` = js.native
    
    /**
      * Returns the centered timestamp for the year picker.
      * @private
      */
    def _getYearPickerCenteredTimestamp(oldTimestamp: Double): Double = js.native
    
    def _getYearRange(
      timestamp: Double,
      isFocused: Boolean,
      isSelected: Boolean,
      isSelectedBetween: Boolean,
      yearRangeText: String,
      secYearRangeText: String,
      isDisabled: Boolean
    ): YearRange = js.native
    def _getYearRange(
      timestamp: Double,
      isFocused: Boolean,
      isSelected: Boolean,
      isSelectedBetween: Boolean,
      yearRangeText: String,
      secYearRangeText: Unit,
      isDisabled: Boolean
    ): YearRange = js.native
    
    def _getYearRangeFormattedText(
      startDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      endDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      yearFormat: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDateFormatMod.default
    ): String = js.native
    
    def _getYearRanges(): YearRanges = js.native
    
    var _gridStartYear: js.UndefOr[Double] = js.native
    
    var _hidden: Boolean = js.native
    
    /**
      * Returns true if the timestamp is inside the selection range.
      * @private
      */
    def _isInsideSelectionRange(timestamp: Double): Boolean = js.native
    
    def _isYearRangeSelected(startYear: Double, endYear: Double): Boolean = js.native
    
    def _modifyGridStartBy(years: Double): Unit = js.native
    
    /**
      * Modifies timestamp by a given amount of year ranges and, if necessary, loads the prev/next page.
      * @param amount
      * @private
      */
    def _modifyTimestampBy(amount: Double): Unit = js.native
    
    def _onHomeOrEnd(homePressed: Boolean): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * Set the hovered day as the "_secondTimestamp".
      *
      * @param e
      * @private
      */
    def _onmouseover(e: MouseEvent): Unit = js.native
    
    /**
      * When _showRangeSelection is "true" and the first year in the range is selected, this is the currently hovered or focused year range.
      *
      * @private
      */
    var _secondTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * User selected range with the mouse or pressed Enter/Space.
      * @param e
      * @private
      */
    def _selectYearRange(e: Event): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
    def _shouldShowOneColumn(): Boolean = js.native
    
    /**
      * Defines if the YearRangePicker should visualize the selected dates as a range.
      * @default false
      *
      * @private
      */
    var _showRangeSelection: Boolean = js.native
    
    /**
      * In range selection, the currently focused or hovered year range is considered the "second timestamp".
      * @private
      */
    def _updateSecondTimestamp(): Unit = js.native
    
    var _yearRanges: YearRanges = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_YearRangePicker: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any) & ChangeYearRangePickerChangeEventDetail = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def roleDescription: String = js.native
    
    /**
      * An array of UTC timestamps representing the selected date
      * or dates depending on the capabilities of the picker component.
      * @default []
      */
    var selectedDates: js.Array[Double] = js.native
  }
  
  trait YearRangePickerChangeEventDetail extends StObject {
    
    var timestamp: Double
  }
  object YearRangePickerChangeEventDetail {
    
    inline def apply(timestamp: Double): YearRangePickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearRangePickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearRangePickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait YearRangePickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object YearRangePickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): YearRangePickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearRangePickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearRangePickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  type YearRanges = js.Array[js.Array[YearRange]]
}
