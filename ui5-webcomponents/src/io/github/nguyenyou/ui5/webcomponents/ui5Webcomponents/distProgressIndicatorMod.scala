package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProgressIndicatorMod {
  
  /**
    * @class
    *
    * ### Overview
    * Shows the progress of a process in a graphical way. To indicate the progress,
    * the inside of the component is filled with a color.
    *
    * ### Responsive Behavior
    * You can change the size of the Progress Indicator by changing its `width` or `height` CSS properties.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ProgressIndicator.js";`
    * @csspart bar - Used to style the main bar of the `ui5-progress-indicator`
    * @csspart remaining-bar - Used to style the remaining bar of the `ui5-progress-indicator`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents/dist/ProgressIndicator.js", JSImport.Default)
  @js.native
  open class default () extends ProgressIndicator
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ProgressIndicator.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ProgressIndicator.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * Shows the progress of a process in a graphical way. To indicate the progress,
    * the inside of the component is filled with a color.
    *
    * ### Responsive Behavior
    * You can change the size of the Progress Indicator by changing its `width` or `height` CSS properties.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ProgressIndicator.js";`
    * @csspart bar - Used to style the main bar of the `ui5-progress-indicator`
    * @csspart remaining-bar - Used to style the remaining bar of the `ui5-progress-indicator`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait ProgressIndicator
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _previousValue: Double = js.native
    
    var _transitionDuration: Double = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.16.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Specifies the text value to be displayed in the bar.
      *
      * **Note:**
      *
      * - If there is no value provided or the value is empty, the default percentage value is shown.
      * - If `hideValue` property is `true` both the `displayValue` and `value` property values are not shown.
      * @default undefined
      * @public
      */
    var displayValue: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component value is shown.
      * @default false
      * @public
      */
    var hideValue: Boolean = js.native
    
    def shouldAnimate: Boolean = js.native
    
    def showIcon: Boolean = js.native
    
    def showValueInRemainingBar: Boolean = js.native
    
    def validatedValue: Double = js.native
    
    /**
      * Specifies the numerical value in percent for the length of the component.
      *
      * **Note:**
      * If a value greater than 100 is provided, the percentValue is set to 100. In other cases of invalid value, percentValue is set to its default of 0.
      * @default 0
      * @public
      */
    var value: Double = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateText: String = js.native
    
    def valueStateTextMappings(): Record[String, String] = js.native
  }
}
