package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Calendarlegendfocusout
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Hide
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarLegendMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-calendar-legend` component is designed for use within the `ui5-calendar` to display a legend.
    * Each `ui5-calendar-legend-item` represents a unique date type, specifying its visual style
    * and a corresponding textual label.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CalendarLegend.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.23.0
    */
  @JSImport("@ui5/webcomponents/dist/CalendarLegend", JSImport.Default)
  @js.native
  open class default () extends CalendarLegend
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CalendarLegend", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CalendarLegend", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-calendar-legend` component is designed for use within the `ui5-calendar` to display a legend.
    * Each `ui5-calendar-legend-item` represents a unique date type, specifying its visual style
    * and a corresponding textual label.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CalendarLegend.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.23.0
    */
  @js.native
  trait CalendarLegend
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _lastFocusedItemIndex: Double | Null = js.native
    
    def _onFocusIn(e: FocusEvent): Unit = js.native
    
    def _onFocusOut(): Unit = js.native
    
    def _onItemKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onMouseDown(e: MouseEvent): Unit = js.native
    
    def _roleDescription: String = js.native
    
    def defaultItemsMapping: js.Array[Hide] = js.native
    
    @JSName("eventDetails")
    var eventDetails_CalendarLegend: Calendarlegendfocusout = js.native
    
    def focusableElements: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default
      ] = js.native
    
    /**
      * Hides the Non-Working day item in the legend.
      * @default false
      * @public
      */
    var hideNonWorkingDay: Boolean = js.native
    
    /**
      * Hides the Selected day item in the legend.
      * @default false
      * @public
      */
    var hideSelectedDay: Boolean = js.native
    
    /**
      * Hides the Today item in the legend.
      * @default false
      * @public
      */
    var hideToday: Boolean = js.native
    
    /**
      * Hides the Working day item in the legend.
      * @default false
      * @public
      */
    var hideWorkingDay: Boolean = js.native
    
    /**
      * Defines the items of the component.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default
      ] = js.native
    
    def legendItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default
      ] = js.native
  }
  
  trait CalendarLegendItemSelectionChangeEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default
  }
  object CalendarLegendItemSelectionChangeEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default): CalendarLegendItemSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CalendarLegendItemSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CalendarLegendItemSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
