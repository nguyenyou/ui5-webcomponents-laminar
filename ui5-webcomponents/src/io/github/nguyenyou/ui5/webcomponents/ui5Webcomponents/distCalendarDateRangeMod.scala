package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.ICalendarSelectedDates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarDateRangeMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date-range` component defines a range of dates to be used inside `ui5-calendar`
    * @constructor
    * @extends UI5Element
    * @implements {ICalendarSelectedDates}
    * @abstract
    * @public
    * @since 2.0.0
    */
  @JSImport("@ui5/webcomponents/dist/CalendarDateRange", JSImport.Default)
  @js.native
  open class default () extends CalendarDateRange
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date-range` component defines a range of dates to be used inside `ui5-calendar`
    * @constructor
    * @extends UI5Element
    * @implements {ICalendarSelectedDates}
    * @abstract
    * @public
    * @since 2.0.0
    */
  @js.native
  trait CalendarDateRange extends ICalendarSelectedDates {
    
    /**
      * End of date range formatted according to the `formatPattern` property
      * of the `ui5-calendar` that hosts the component.
      * @default ""
      * @public
      */
    @JSName("endValue")
    var endValue_CalendarDateRange: String = js.native
    
    /**
      * Start of date range formatted according to the `formatPattern` property
      * of the `ui5-calendar` that hosts the component.
      * @default ""
      * @public
      */
    @JSName("startValue")
    var startValue_CalendarDateRange: String = js.native
  }
}
