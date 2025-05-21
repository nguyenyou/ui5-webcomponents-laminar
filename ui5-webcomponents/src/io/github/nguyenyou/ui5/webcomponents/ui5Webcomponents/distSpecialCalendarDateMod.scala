package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSpecialCalendarDateMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-special-date` component defines a special calendar date to be used inside `ui5-calendar`,
    * which is visually distinguished from the rest of the dates.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.23.0
    */
  @JSImport("@ui5/webcomponents/dist/SpecialCalendarDate", JSImport.Default)
  @js.native
  open class default () extends SpecialCalendarDate
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-special-date` component defines a special calendar date to be used inside `ui5-calendar`,
    * which is visually distinguished from the rest of the dates.
    * @constructor
    * @extends UI5Element
    * @abstract
    * @public
    * @since 1.23.0
    */
  @js.native
  trait SpecialCalendarDate
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines a tooltip text for the special date.
      * @default ""
      * @private
      */
    var _tooltip: String = js.native
    
    /**
      * Defines the type of the special date.
      * @default "None"
      * @public
      */
    var `type`: /* template literal string: ${CalendarLegendItemType} */ String = js.native
    
    /**
      * The date formatted according to the `formatPattern` property
      * of the `ui5-calendar` that hosts the component.
      * @default ""
      * @public
      */
    var value: String = js.native
  }
}
