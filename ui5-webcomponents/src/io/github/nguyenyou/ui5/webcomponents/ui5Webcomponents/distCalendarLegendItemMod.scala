package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCalendarLegendItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Each `ui5-calendar-legend-item` represents a legend item, displaying a color with a label.
    * The color is determined by the `type` property and the label by the `text` property.
    * If a `ui5-special-date` is used within the `ui5-calendar` and a type is set, clicking on a `ui5-calendar-legend-item`
    * with the same type will emphasize the respective date(s) in the calendar.
    *
    * ### Usage
    * The `ui5-calendar-legend-item` is intended to be used within the `ui5-calendar-legend` component.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CalendarLegendItem.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.23.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/CalendarLegendItem.js", JSImport.Default)
  @js.native
  open class default () extends CalendarLegendItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CalendarLegendItem.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CalendarLegendItem.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Each `ui5-calendar-legend-item` represents a legend item, displaying a color with a label.
    * The color is determined by the `type` property and the label by the `text` property.
    * If a `ui5-special-date` is used within the `ui5-calendar` and a type is set, clicking on a `ui5-calendar-legend-item`
    * with the same type will emphasize the respective date(s) in the calendar.
    *
    * ### Usage
    * The `ui5-calendar-legend-item` is intended to be used within the `ui5-calendar-legend` component.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CalendarLegendItem.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.23.0
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait CalendarLegendItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def effectiveText: String = js.native
    
    /**
      * Tab index of the component.
      * @private
      */
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    /**
      * Defines the text content of the Calendar Legend Item.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Defines the type of the Calendar Legend Item.
      * @default "None"
      * @public
      */
    var `type`: /* template literal string: ${CalendarLegendItemType} */ String = js.native
  }
}
