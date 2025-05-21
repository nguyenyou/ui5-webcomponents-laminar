package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeYearPickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.ICalendarPicker
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`20`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`4`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`8`
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distYearPickerMod {
  
  /**
    * @class
    *
    * Displays years which can be selected.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/YearPicker", JSImport.Default)
  @js.native
  open class default () extends YearPicker {
    
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
    
    @JSImport("@ui5/webcomponents/dist/YearPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/YearPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait Year extends StObject {
    
    var _tabIndex: Double
    
    var ariaDisabled: js.UndefOr[Boolean] = js.undefined
    
    var ariaSelected: Boolean
    
    var classes: String
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var parts: String
    
    var selected: Boolean
    
    var timestamp: String
    
    var year: String
    
    var yearInSecType: js.UndefOr[String] = js.undefined
  }
  object Year {
    
    inline def apply(
      _tabIndex: Double,
      ariaSelected: Boolean,
      classes: String,
      disabled: Boolean,
      focusRef: Boolean,
      parts: String,
      selected: Boolean,
      timestamp: String,
      year: String
    ): Year = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Year]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Year] (val x: Self) extends AnyVal {
      
      inline def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setParts(value: String): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setYearInSecType(value: String): Self = StObject.set(x, "yearInSecType", value.asInstanceOf[js.Any])
      
      inline def setYearInSecTypeUndefined: Self = StObject.set(x, "yearInSecType", js.undefined)
      
      inline def set_tabIndex(value: Double): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type YearInterval = js.Array[js.Array[Year]]
  
  /**
    * @class
    *
    * Displays years which can be selected.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @js.native
  trait YearPicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _buildYears(): Unit = js.native
    
    def _calculateFirstYear(): Unit = js.native
    
    def _getPageSize(): `8` | `20` = js.native
    
    def _getRowSize(): `2` | `4` = js.native
    
    var _hidden: Boolean = js.native
    
    /**
      * Returns true if year timestamp is inside the selection range.
      * @private
      */
    def _isYearInsideSelectionRange(timestamp: Double): Boolean = js.native
    
    /**
      * Modifies timestamp by a given amount of years and, if necessary, loads the prev/next page.
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
      * When selectionMode="Range" and the first year in the range is selected, this is the currently hovered or focused year.
      *
      * @private
      */
    var _secondTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * User clicked with the mouser or pressed Enter/Space
      * @param e
      * @private
      */
    def _selectYear(e: Event): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
    /**
      * In range selection, the currently focused or hovered year is considered the "second day".
      * @private
      */
    def _updateSecondTimestamp(): Unit = js.native
    
    def _updateSelectedDates(timestamp: Double): Unit = js.native
    
    var _yearsInterval: YearInterval = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_YearPicker: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any) & ChangeYearPickerChangeEventDetail = js.native
    
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
    
    /**
      * Defines the type of selection used in the year picker component.
      * Accepted property values are:
      *
      * - `CalendarSelectionMode.Single` - enables election of a single year.
      * - `CalendarSelectionMode.Range` - enables selection of a year range.
      *
      * Note that 'CalendarSelectionMode.Multiple` is not supported for Year Picker!
      * @default "Single"
      * @since 2.2.0
      */
    var selectionMode: /* template literal string: ${CalendarSelectionMode} */ String = js.native
  }
  
  trait YearPickerChangeEventDetail extends StObject {
    
    var dates: js.Array[Double]
    
    var timestamp: Double
  }
  object YearPickerChangeEventDetail {
    
    inline def apply(dates: js.Array[Double], timestamp: Double): YearPickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearPickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearPickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDates(value: js.Array[Double]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: Double*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait YearPickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object YearPickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): YearPickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[YearPickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: YearPickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
