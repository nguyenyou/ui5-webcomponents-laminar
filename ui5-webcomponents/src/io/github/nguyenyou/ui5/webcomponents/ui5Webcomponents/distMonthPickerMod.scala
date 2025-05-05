package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeMonthPickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Text
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.ICalendarPicker
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`3`
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMonthPickerMod {
  
  /**
    * Month picker component.
    * @class
    *
    * Displays months which can be selected.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/MonthPicker", JSImport.Default)
  @js.native
  open class default () extends MonthPicker {
    
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
    
    @JSImport("@ui5/webcomponents/dist/MonthPicker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MonthPicker", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait Month extends StObject {
    
    var _tabIndex: Double
    
    var ariaDisabled: js.UndefOr[Boolean] = js.undefined
    
    var ariaSelected: Boolean
    
    var classes: String
    
    var disabled: Boolean
    
    var focusRef: Boolean
    
    var name: String
    
    var nameInSecType: String
    
    var parts: String
    
    var selected: Boolean
    
    var timestamp: String
  }
  object Month {
    
    inline def apply(
      _tabIndex: Double,
      ariaSelected: Boolean,
      classes: String,
      disabled: Boolean,
      focusRef: Boolean,
      name: String,
      nameInSecType: String,
      parts: String,
      selected: Boolean,
      timestamp: String
    ): Month = {
      val __obj = js.Dynamic.literal(_tabIndex = _tabIndex.asInstanceOf[js.Any], ariaSelected = ariaSelected.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusRef = focusRef.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameInSecType = nameInSecType.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Month]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Month] (val x: Self) extends AnyVal {
      
      inline def setAriaDisabled(value: Boolean): Self = StObject.set(x, "ariaDisabled", value.asInstanceOf[js.Any])
      
      inline def setAriaDisabledUndefined: Self = StObject.set(x, "ariaDisabled", js.undefined)
      
      inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setFocusRef(value: Boolean): Self = StObject.set(x, "focusRef", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameInSecType(value: String): Self = StObject.set(x, "nameInSecType", value.asInstanceOf[js.Any])
      
      inline def setParts(value: String): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def set_tabIndex(value: Double): Self = StObject.set(x, "_tabIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type MonthInterval = js.Array[js.Array[Month]]
  
  /**
    * Month picker component.
    * @class
    *
    * Displays months which can be selected.
    * @constructor
    * @extends CalendarPart
    * @private
    */
  @js.native
  trait MonthPicker
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarPartMod.default
       with ICalendarPicker {
    
    def _buildMonths(): Unit = js.native
    
    def _getDisplayedSecondaryMonthText(timestamp: Double): Text = js.native
    
    var _hidden: Boolean = js.native
    
    /**
      * Returns true if month timestamp is inside the selection range.
      * @private
      */
    def _isMonthInsideSelectionRange(timestamp: Double): Boolean = js.native
    
    def _isOutOfSelectableRange(
      date: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      minDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default,
      maxDate: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDatesCalendarDateMod.default
    ): Boolean = js.native
    
    /**
      * Modifies timestamp by a given amount of months and,
      * if necessary, loads the prev/next page.
      * @param amount
      * @param preserveDate whether to preserve the day of the month (f.e. 15th of March + 1 month = 15th of April)
      * @private
      */
    def _modifyTimestampBy(amount: Double): Unit = js.native
    def _modifyTimestampBy(amount: Double, preserveDate: Boolean): Unit = js.native
    
    var _monthsInterval: MonthInterval = js.native
    
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
      * When selectionMode="Range" and the first month in the range is selected, this is the currently hovered or focused month.
      *
      * @private
      */
    var _secondTimestamp: js.UndefOr[Double] = js.native
    
    /**
      * Selects a month, when user made selection with mouse or using Space/Enter.
      * @param e
      * @private
      */
    def _selectMonth(e: Event): Unit = js.native
    
    /**
      * Sets the timestamp to an absolute value.
      * @param value
      * @private
      */
    def _setTimestamp(value: Double): Unit = js.native
    
    /**
      * In range selection, the currently focused or hovered month is considered the "second day".
      * @private
      */
    def _updateSecondTimestamp(): Unit = js.native
    
    def _updateSelectedDates(timestamp: Double): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_MonthPicker: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.NotEqual<this, @ui5/webcomponents-base.@ui5/webcomponents-base/dist/UI5Element.UI5Element> extends true ? object : {[k: string] : any} */ js.Any) & ChangeMonthPickerChangeEventDetail = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    def roleDescription: String = js.native
    
    def rowSize: `2` | `3` = js.native
    
    /**
      * An array of UTC timestamps representing the selected date
      * or dates depending on the capabilities of the picker component.
      * @default []
      */
    var selectedDates: js.Array[Double] = js.native
    
    /**
      * Defines the type of selection used in the month picker component.
      * Accepted property values are:
      *
      * - `CalendarSelectionMode.Single` - enables election of a single month.
      * - `CalendarSelectionMode.Range` - enables selection of a month range.
      *
      * Note that 'CalendarSelectionMode.Multiple` is not supported for Month Picker!
      * @default "Single"
      * @since 2.2.0
      */
    var selectionMode: /* template literal string: ${CalendarSelectionMode} */ String = js.native
  }
  
  trait MonthPickerChangeEventDetail extends StObject {
    
    var dates: js.Array[Double]
    
    var timestamp: Double
  }
  object MonthPickerChangeEventDetail {
    
    inline def apply(dates: js.Array[Double], timestamp: Double): MonthPickerChangeEventDetail = {
      val __obj = js.Dynamic.literal(dates = dates.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthPickerChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthPickerChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDates(value: js.Array[Double]): Self = StObject.set(x, "dates", value.asInstanceOf[js.Any])
      
      inline def setDatesVarargs(value: Double*): Self = StObject.set(x, "dates", js.Array(value*))
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait MonthPickerNavigateEventDetail extends StObject {
    
    var timestamp: Double
  }
  object MonthPickerNavigateEventDetail {
    
    inline def apply(timestamp: Double): MonthPickerNavigateEventDetail = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthPickerNavigateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MonthPickerNavigateEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
