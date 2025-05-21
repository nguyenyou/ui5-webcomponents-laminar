package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToggleSpinButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-toggle-spin-button` is explicitly used in the new design of `ui5-time-picker`.
    * It extends `ui5-toggle-button` with some specific accessibility-related properties in order to
    * have spin button look and feel from accessibility point of view. This component should not be used separately.
    * @constructor
    * @extends ToggleButton
    * @since 1.15.0
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/ToggleSpinButton", JSImport.Default)
  @js.native
  open class default () extends ToggleSpinButton
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-toggle-spin-button` is explicitly used in the new design of `ui5-time-picker`.
    * It extends `ui5-toggle-button` with some specific accessibility-related properties in order to
    * have spin button look and feel from accessibility point of view. This component should not be used separately.
    * @constructor
    * @extends ToggleButton
    * @since 1.15.0
    * @private
    */
  @js.native
  trait ToggleSpinButton
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleButtonMod.default {
    
    /**
      * Defines the ARIA valuemax of the component.
      * @default -1
      */
    var valueMax: Double = js.native
    
    /**
      * Defines the ARIA valuemin of the component.
      * @default -1
      */
    var valueMin: Double = js.native
    
    /**
      * Defines the ARIA valuenow of the component.
      * @default -1
      */
    var valueNow: Double = js.native
    
    /**
      * Defines the ARIA valuetext of the component.
      * @default undefined
      */
    var valueText: js.UndefOr[String] = js.native
  }
}
