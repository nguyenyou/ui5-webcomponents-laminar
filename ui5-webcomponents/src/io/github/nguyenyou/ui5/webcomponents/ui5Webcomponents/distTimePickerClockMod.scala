package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeTimePickerClockChangeEventDetail
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.WheelEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimePickerClockMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-picker-clock` allows selecting of hours,minutes or seconds (depending on property set).
    * The component supports interactions with mouse, touch and mouse wheel.
    * The step for displaying or selecting of items can be configured.
    *
    * `ui5-time-picker-clock` is used as part of `ui5-time-selection-clocks` component, which
    * is used in `ui5-time-picker` component respectively.
    *
    * ### Usage
    *
    * `ui5-time-picker-clock` can display hours, minutes or seconds
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TimePickerClock.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.15.0
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/TimePickerClock.js", JSImport.Default)
  @js.native
  open class default () extends TimePickerClock
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-picker-clock` allows selecting of hours,minutes or seconds (depending on property set).
    * The component supports interactions with mouse, touch and mouse wheel.
    * The step for displaying or selecting of items can be configured.
    *
    * `ui5-time-picker-clock` is used as part of `ui5-time-selection-clocks` component, which
    * is used in `ui5-time-picker` component respectively.
    *
    * ### Usage
    *
    * `ui5-time-picker-clock` can display hours, minutes or seconds
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TimePickerClock.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.15.0
    * @private
    */
  @js.native
  trait TimePickerClock
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _angleStep: Double = js.native
    
    /**
      * Calculates dimension variables necessary for determining of item selection.
      * @returns Dimensions object
      */
    def _calculateDimensions(): js.UndefOr[TimePickerClockDimensions] = js.native
    
    /**
      * Calculates selected and hovered values based on click/touch position.
      * @param x X position of click/touch returned by the event
      * @param y Y position of click/touch returned by the event
      */
    def _calculatePosition(x: Double, y: Double): Unit = js.native
    
    /**
      * Cancel Mouseout flag.
      * @default false
      */
    var _cancelTouchOut: Boolean = js.native
    
    var _clockWrapper: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Keeps variables used in interaction calculations.
      */
    var _dimensionParameters: TimePickerClockDimensions = js.native
    
    var _firstNumberElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Returns the real value of the passed clock item, if the replacement must be done, returns the replaced value.
      * @param value The value of the clock item
      * @returns The real/replaced value
      */
    def _fixReplacementValue(value: Double): Double = js.native
    
    def _fnOnMouseOutUp(): Unit = js.native
    
    /**
      * Returns the DOM Reference of the clock cover element
      * @returns the DOM Reference
      */
    def _getClockCoverContainerDomRef(): js.UndefOr[Element | Null] = js.native
    
    /**
      * Returns provided value as string. Padding with additional zero is applied if necessary.
      * @param value The value that should be returned as string
      * @returns The value as string
      */
    def _getStringValue(value: Double): String = js.native
    
    /**
      * Returns the Id of the DOM element of the clock item that display specific value.
      * @param value The value of the clock item
      * @returns Id of the clock item element
      */
    def _hoveredId(value: Double): String = js.native
    
    /**
      * Defines the currently hovered Time Picker Clock item.
      */
    var _hoveredItem: TimePickerClockSelectedItem = js.native
    
    /**
      * Hovered value of the clock during interactions.
      * @default -1
      */
    var _hoveredValue: Double = js.native
    
    /**
      * Defines the currently available Time Picker Clock items depending on Clock setup.
      */
    var _items: js.Array[TimePickerClockItem] = js.native
    
    def _itemsCount: Double = js.native
    
    /**
      * Mousewheel handler. Increases/decreases value of the clock.
      * @param increase whether to increase or decrease the value
      */
    def _modifyValue(increase: Boolean): Unit = js.native
    
    /**
      * Mousedown or Touchstart event flag.
      * @default false
      */
    var _mouseOrTouchDown: Boolean = js.native
    
    /**
      * Selected value of the clock during interactions.
      * @default -1
      */
    var _movSelectedValue: Double = js.native
    
    /**
      * MouseOut event handler.
      */
    def _onMouseOut(): Unit = js.native
    
    /**
      * Mouse Wheel event handler.
      * @param evt Event object
      */
    def _onMouseWheel(evt: WheelEvent): Unit = js.native
    
    /**
      * TouchEnd/MouseUp event handler.
      * @param evt Event object
      */
    def _onTouchEnd(evt: Event): Unit = js.native
    
    /**
      * TouchMove/MouseMove event handler.
      * @param evt Event object
      */
    def _onTouchMove(evt: Event): Unit = js.native
    
    /**
      * TouchStart/MouseDown event handler.
      * @param evt Event object
      */
    def _onTouchStart(evt: Event): Unit = js.native
    
    /**
      * Calculates the outer height of a HTML element.
      * @param element The element which outer height to be calculated
      * @returns Outer height of the passed HTML element
      */
    def _outerHeight(element: HTMLElement): Double = js.native
    
    /**
      * Prepares clock items objects according to current clock settings. Item objects are used for rendering purposes.
      */
    def _prepareClockItems(): Unit = js.native
    
    /**
      * Previously hovered value of the clock during interactions.
      * @default -1
      */
    var _prevHoveredValue: Double = js.native
    
    /**
      * Defines the currently selected Time Picker Clock item.
      */
    var _selectedItem: TimePickerClockSelectedItem = js.native
    
    /**
      * Calculated selected value of the clock during interactions.
      * @default -1
      */
    var _selectedValue: Double = js.native
    
    /**
      * Sets new selected value, fires change event and updates selected value object used for rendering purposes.
      * @param value a value to be set
      * @param bFinalChange whether the change is final or not
      */
    def _setSelectedValue(value: Double): Unit = js.native
    def _setSelectedValue(value: Double, bFinalChange: Boolean): Unit = js.native
    
    /**
      * Animation skip flag. If set to `true`, the component will not have transition animation when displayed.
      * @default false
      */
    var _skipAnimation: Boolean = js.native
    
    /**
      * Returns internally selected or hovered value object constructed for rendering purposes.
      * @param value currently selected or hovered value.
      * @returns Selected or hovered value object
      */
    def _updateSelectedOrHoveredItem(value: Double): TimePickerClockSelectedItem = js.native
    def _updateSelectedOrHoveredItem(value: Double, cssClass: String): TimePickerClockSelectedItem = js.native
    
    /**
      * Determines whether the component is active (visible).
      * @default false
      */
    var active: Boolean = js.native
    
    /**
      * Determines whether the component is displayed as disabled.
      * @default false
      */
    var disabled: Boolean = js.native
    
    /**
      * The step for displaying of one unit of items.
      * 1 means 1/60 of the circle.
      * The default display step is 5 which means minutes and seconds are displayed as "0", "5", "10", etc.
      * For hours the display step must be set to 1.
      * @default 5
      */
    var displayStep: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimePickerClock: ChangeTimePickerClockChangeEventDetail = js.native
    
    /**
      * If set to `true`, a surrounding circle with markers (dots) will be hidden.
      * (for example, on the 'Minutes' clock-dial, markers represent minutes).
      * @default false
      */
    var hideFractions: Boolean = js.native
    
    /**
      * Maximum item value for the circle of the clock.
      * @default -1
      */
    var itemMax: Double = js.native
    
    /**
      * Minimum item value for the circle of the clock.
      * @default -1
      */
    var itemMin: Double = js.native
    
    /**
      * Label of the clock dial - for example, 'Hours', 'Minutes', or 'Seconds'.
      * @default undefined
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * If provided, this will replace the last item displayed. Usually, the last item ('12', '24' or '60') is replaced with '0'.
      * @default -1
      */
    var lastItemReplacement: Double = js.native
    
    def noop(): Boolean = js.native
    
    /**
      * Prepend with zero flag. If `true`, values less than 10 will be prepend with 0.
      * @default false
      */
    var prependZero: Boolean = js.native
    
    /**
      * The currently selected value of the clock.
      * @default -1
      */
    var selectedValue: Double = js.native
    
    /**
      * The step for selection of items.
      * 1 means 1 unit:
      * - if the clock displays hours - 1 unit = 1 hour
      * - if the clock displays minutes/seconds - 1 unit = 1 minute/second
      * @default 1
      */
    var valueStep: Double = js.native
  }
  
  trait TimePickerClockChangeEventDetail extends StObject {
    
    var finalChange: Boolean
    
    var stringValue: String
    
    var value: Double
  }
  object TimePickerClockChangeEventDetail {
    
    inline def apply(finalChange: Boolean, stringValue: String, value: Double): TimePickerClockChangeEventDetail = {
      val __obj = js.Dynamic.literal(finalChange = finalChange.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerClockChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerClockChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setFinalChange(value: Boolean): Self = StObject.set(x, "finalChange", value.asInstanceOf[js.Any])
      
      inline def setStringValue(value: String): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimePickerClockDimensions extends StObject {
    
    var activeRadiusMax: Double
    
    var activeRadiusMin: Double
    
    var centerX: Double
    
    var centerY: Double
    
    var dotHeight: Double
    
    var numberHeight: Double
    
    var offsetX: Double
    
    var offsetY: Double
    
    var radius: Double
  }
  object TimePickerClockDimensions {
    
    inline def apply(
      activeRadiusMax: Double,
      activeRadiusMin: Double,
      centerX: Double,
      centerY: Double,
      dotHeight: Double,
      numberHeight: Double,
      offsetX: Double,
      offsetY: Double,
      radius: Double
    ): TimePickerClockDimensions = {
      val __obj = js.Dynamic.literal(activeRadiusMax = activeRadiusMax.asInstanceOf[js.Any], activeRadiusMin = activeRadiusMin.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], dotHeight = dotHeight.asInstanceOf[js.Any], numberHeight = numberHeight.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimePickerClockDimensions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerClockDimensions] (val x: Self) extends AnyVal {
      
      inline def setActiveRadiusMax(value: Double): Self = StObject.set(x, "activeRadiusMax", value.asInstanceOf[js.Any])
      
      inline def setActiveRadiusMin(value: Double): Self = StObject.set(x, "activeRadiusMin", value.asInstanceOf[js.Any])
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setDotHeight(value: Double): Self = StObject.set(x, "dotHeight", value.asInstanceOf[js.Any])
      
      inline def setNumberHeight(value: Double): Self = StObject.set(x, "numberHeight", value.asInstanceOf[js.Any])
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimePickerClockItem extends StObject {
    
    var angle: js.UndefOr[Double] = js.undefined
    
    var item: js.UndefOr[String] = js.undefined
  }
  object TimePickerClockItem {
    
    inline def apply(): TimePickerClockItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerClockItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerClockItem] (val x: Self) extends AnyVal {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  trait TimePickerClockSelectedItem
    extends StObject
       with TimePickerClockItem
       with TimePickerClockSelection
  object TimePickerClockSelectedItem {
    
    inline def apply(): TimePickerClockSelectedItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerClockSelectedItem]
    }
  }
  
  trait TimePickerClockSelection extends StObject {
    
    var itemClasses: js.UndefOr[String] = js.undefined
    
    var showMarker: js.UndefOr[Boolean] = js.undefined
  }
  object TimePickerClockSelection {
    
    inline def apply(): TimePickerClockSelection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimePickerClockSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimePickerClockSelection] (val x: Self) extends AnyVal {
      
      inline def setItemClasses(value: String): Self = StObject.set(x, "itemClasses", value.asInstanceOf[js.Any])
      
      inline def setItemClassesUndefined: Self = StObject.set(x, "itemClasses", js.undefined)
      
      inline def setShowMarker(value: Boolean): Self = StObject.set(x, "showMarker", value.asInstanceOf[js.Any])
      
      inline def setShowMarkerUndefined: Self = StObject.set(x, "showMarker", js.undefined)
    }
  }
}
