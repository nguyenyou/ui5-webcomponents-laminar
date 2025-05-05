package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarMod.ICalendarSelectedDates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarDateMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date` component defines a calendar date to be used inside `ui5-calendar`
    * @constructor
    * @extends UI5Element
    * @implements {ICalendarSelectedDates}
    * @abstract
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CalendarDate", JSImport.Default)
  @js.native
  open class default () extends CalendarDate
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-date` component defines a calendar date to be used inside `ui5-calendar`
    * @constructor
    * @extends UI5Element
    * @implements {ICalendarSelectedDates}
    * @abstract
    * @public
    */
  @js.native
  trait CalendarDate extends ICalendarSelectedDates {
    
    /**
      * The date formatted according to the `formatPattern` property
      * of the `ui5-calendar` that hosts the component.
      * @default ""
      * @public
      */
    @JSName("value")
    var value_CalendarDate: String = js.native
  }
}
