package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ReturnType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeTimeSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.FnCall
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimepickerUtilsTimeSliderMod.HoursConfiguration
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.hours
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.minutes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.seconds
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimePickerInternalsMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-picker-internals` is helper component that contains shared methods used in `ui5-time-selection-clocks`
    * and `<ui5-time-selection-inputs>` components and should not be used separately.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.15.0
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/TimePickerInternals", JSImport.Default)
  @js.native
  open class default () extends TimePickerInternals
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TimePickerInternals", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TimePickerInternals", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait TimePickerComponentIndexMap extends StObject {
    
    var hours: Double
    
    var minutes: Double
    
    var seconds: Double
  }
  object TimePickerComponentIndexMap {
    
    inline def apply(hours: Double, minutes: Double, seconds: Double): TimePickerComponentIndexMap = {
      val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerComponentIndexMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerComponentIndexMap] (val x: Self) extends AnyVal {
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimePickerEntityAttributes extends StObject {
    
    var max: Double
    
    var min: Double
    
    var step: Double
  }
  object TimePickerEntityAttributes {
    
    inline def apply(max: Double, min: Double, step: Double): TimePickerEntityAttributes = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerEntityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerEntityAttributes] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimePickerEntityProperties extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var attributes: js.UndefOr[TimePickerEntityAttributes] = js.undefined
    
    var displayStep: js.UndefOr[Double] = js.undefined
    
    var entity: js.UndefOr[String] = js.undefined
    
    var focused: js.UndefOr[Boolean] = js.undefined
    
    var hasSeparator: js.UndefOr[Boolean] = js.undefined
    
    var hideFractions: js.UndefOr[Boolean] = js.undefined
    
    var itemMax: js.UndefOr[Double] = js.undefined
    
    var itemMin: js.UndefOr[Double] = js.undefined
    
    var label: String
    
    var lastItemReplacement: js.UndefOr[Double] = js.undefined
    
    var prependZero: Boolean
    
    var skipAnimation: js.UndefOr[Boolean] = js.undefined
    
    var stringValue: js.UndefOr[String] = js.undefined
    
    var textValue: js.UndefOr[String] = js.undefined
    
    var value: Double
  }
  object TimePickerEntityProperties {
    
    inline def apply(label: String, prependZero: Boolean, value: Double): TimePickerEntityProperties = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], prependZero = prependZero.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerEntityProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerEntityProperties] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAttributes(value: TimePickerEntityAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setDisplayStep(value: Double): Self = StObject.set(x, "displayStep", value.asInstanceOf[js.Any])
      
      inline def setDisplayStepUndefined: Self = StObject.set(x, "displayStep", js.undefined)
      
      inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
      
      inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setHasSeparator(value: Boolean): Self = StObject.set(x, "hasSeparator", value.asInstanceOf[js.Any])
      
      inline def setHasSeparatorUndefined: Self = StObject.set(x, "hasSeparator", js.undefined)
      
      inline def setHideFractions(value: Boolean): Self = StObject.set(x, "hideFractions", value.asInstanceOf[js.Any])
      
      inline def setHideFractionsUndefined: Self = StObject.set(x, "hideFractions", js.undefined)
      
      inline def setItemMax(value: Double): Self = StObject.set(x, "itemMax", value.asInstanceOf[js.Any])
      
      inline def setItemMaxUndefined: Self = StObject.set(x, "itemMax", js.undefined)
      
      inline def setItemMin(value: Double): Self = StObject.set(x, "itemMin", value.asInstanceOf[js.Any])
      
      inline def setItemMinUndefined: Self = StObject.set(x, "itemMin", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLastItemReplacement(value: Double): Self = StObject.set(x, "lastItemReplacement", value.asInstanceOf[js.Any])
      
      inline def setLastItemReplacementUndefined: Self = StObject.set(x, "lastItemReplacement", js.undefined)
      
      inline def setPrependZero(value: Boolean): Self = StObject.set(x, "prependZero", value.asInstanceOf[js.Any])
      
      inline def setSkipAnimation(value: Boolean): Self = StObject.set(x, "skipAnimation", value.asInstanceOf[js.Any])
      
      inline def setSkipAnimationUndefined: Self = StObject.set(x, "skipAnimation", js.undefined)
      
      inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "stringValue", js.undefined)
      
      inline def setTextValue(value: String): Self = StObject.set(x, "textValue", value.asInstanceOf[js.Any])
      
      inline def setTextValueUndefined: Self = StObject.set(x, "textValue", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-picker-internals` is helper component that contains shared methods used in `ui5-time-selection-clocks`
    * and `<ui5-time-selection-inputs>` components and should not be used separately.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @since 1.15.0
    * @private
    */
  @js.native
  trait TimePickerInternals
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * The index of the active Clock/TogleSpinButton.
      * @default 0
      * @private
      */
    var _activeIndex: Double = js.native
    
    def _buttonAmPm(): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonMod.default | Null
      ] = js.native
    
    def _calculatePeriodChange(period: String): Unit = js.native
    
    /**
      * Contains calendar type.
      * @private
      */
    var _calendarType: js.UndefOr[/* template literal string: ${CalendarType} */ String] = js.native
    
    def _componentKey(name: String): /* keyof @ui5/webcomponents.@ui5/webcomponents/dist/TimePickerInternals.TimePickerComponentIndexMap */ hours | minutes | seconds = js.native
    
    /**
      * Contains component-to-index map.
      * @private
      */
    var _componentMap: TimePickerComponentIndexMap = js.native
    
    def _createPeriodComponent(): Unit = js.native
    
    /**
      * Contains currently available Time Picker components depending on time format.
      * @private
      */
    var _entities: js.Array[TimePickerEntityProperties] = js.native
    
    /**
      * Exact match number buffer
      * @private
      */
    var _exactMatch: js.UndefOr[Double] = js.native
    
    def _formatPattern: String = js.native
    
    /**
      * Returns index of the clock or button from the id of the event target.
      * @returns index of the clock/button
      */
    def _getIndexFromId(id: String): Double = js.native
    
    /**
      * Returns name of the clock or button from the id of the event target.
      * @returns name of the clock/button
      */
    def _getNameFromId(id: String): js.UndefOr[String] = js.native
    
    def _hasHoursComponent: Boolean = js.native
    
    def _hasMinutesComponent: Boolean = js.native
    
    def _hasPeriodsComponent: Boolean = js.native
    
    def _hasSecondsComponent: Boolean = js.native
    
    def _hours: String = js.native
    
    /**
      * Changes hours value.
      * @param hours new hours value
      */
    def _hoursChange(hours: Double): Unit = js.native
    
    def _hoursConfiguration: HoursConfiguration = js.native
    
    def _indexFromName(name: String): Double = js.native
    
    def _isPattern: Boolean = js.native
    
    /**
      * Buffer for entered by keyboard numbers
      * @private
      */
    var _keyboardBuffer: String = js.native
    
    def _minutes: String = js.native
    
    /**
      * Changes minutes value.
      * @param minutes new minutes value
      */
    def _minutesChange(minutes: Double): Unit = js.native
    
    def _neededComponents: js.Array[Boolean] = js.native
    
    def _period: js.UndefOr[String] = js.native
    
    def _periodChange(evt: MouseEvent): Unit = js.native
    
    /**
      * Contains currently available Button components depending on time format.
      * @private
      */
    var _periods: js.Array[TimeSelectionPeriodProperties] = js.native
    
    /**
      * Clears the currently existing cooldown period and starts new one if requested.
      * @param startNewCooldown whether to start new cooldown period after clearing previous one
      */
    def _resetCooldown(startNewCooldown: Boolean): Unit = js.native
    
    def _seconds: String = js.native
    
    /**
      * Changes seconds value.
      * @param seconds new seconds value
      */
    def _secondsChange(seconds: Double): Unit = js.native
    
    /**
      * Sets the exact match value. Override if necessary.
      */
    def _setExactMatch(): Unit = js.native
    
    /**
      * Shifts hours value with +/- 12 depending on hour value and day period.
      * @param hours current hours
      * @returns shifted hours
      */
    def _shiftHours(hours: Double): Double = js.native
    
    /**
      * Starts new cooldown period.
      */
    def _startCooldown(): Unit = js.native
    
    /**
      * Id of the cooldown interval
      * @private
      */
    var _typeCooldownId: js.UndefOr[ReturnType[FnCall]] = js.native
    
    def _zeroPaddedHours: Boolean = js.native
    
    def clockDialAriaLabel: String = js.native
    
    def dateValue: js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimePickerInternals: ChangeTimeSelectionChangeEventDetail = js.native
    
    /**
      * Determines the format, displayed in the input field.
      *
      * Example:
      * HH:mm:ss -> 11:42:35
      * hh:mm:ss a -> 2:23:15 PM
      * mm:ss -> 12:04 (only minutes and seconds)
      * @default undefined
      * @public
      */
    var formatPattern: js.UndefOr[String] = js.native
    
    def formatValue(date: js.Date): String = js.native
    
    def getFormat(): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsLocalization.distDateFormatMod.default = js.native
    
    def hoursLabel: String = js.native
    
    def isValid(value: String): `true` | js.Date | (js.Array[
        js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default
      ]) | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    def minutesLabel: String = js.native
    
    def normalizeValue(value: String): String = js.native
    
    def periodsArray: js.Array[String] = js.native
    
    def secondsLabel: String = js.native
    
    def setValue(date: js.Date): Unit = js.native
    
    def validDateValue: js.Date | io.github.nguyenyou.ui5.webcomponents.openui5.sapUiCoreDateUi5dateMod.default = js.native
    
    /**
      * Defines a formatted time value.
      * @default undefined
      * @public
      */
    var value: js.UndefOr[String] = js.native
  }
  
  trait TimeSelectionChangeEventDetail extends StObject {
    
    var valid: Boolean
    
    var value: js.UndefOr[String] = js.undefined
  }
  object TimeSelectionChangeEventDetail {
    
    inline def apply(valid: Boolean): TimeSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait TimeSelectionPeriodProperties extends StObject {
    
    var label: String
    
    var selected: Boolean
  }
  object TimeSelectionPeriodProperties {
    
    inline def apply(label: String, selected: Boolean): TimeSelectionPeriodProperties = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeSelectionPeriodProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimeSelectionPeriodProperties] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
}
