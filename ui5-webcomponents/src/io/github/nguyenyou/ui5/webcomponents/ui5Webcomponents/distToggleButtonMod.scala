package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToggleButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toggle-button` component is an enhanced `ui5-button`
    * that can be toggled between pressed and normal states.
    * Users can use the `ui5-toggle-button` as a switch to turn a setting on or off.
    * It can also be used to represent an independent choice similar to a check box.
    *
    * Clicking or tapping on a `ui5-toggle-button` changes its state to `pressed`. The button returns to
    * its initial state when the user clicks or taps on it again.
    * By applying additional custom CSS-styling classes, apps can give a different style to any `ui5-toggle-button`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ToggleButton.js";`
    * @constructor
    * @extends Button
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ToggleButton.js", JSImport.Default)
  @js.native
  open class default () extends ToggleButton
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toggle-button` component is an enhanced `ui5-button`
    * that can be toggled between pressed and normal states.
    * Users can use the `ui5-toggle-button` as a switch to turn a setting on or off.
    * It can also be used to represent an independent choice similar to a check box.
    *
    * Clicking or tapping on a `ui5-toggle-button` changes its state to `pressed`. The button returns to
    * its initial state when the user clicks or taps on it again.
    * By applying additional custom CSS-styling classes, apps can give a different style to any `ui5-toggle-button`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ToggleButton.js";`
    * @constructor
    * @extends Button
    * @public
    */
  @js.native
  trait ToggleButton
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default {
    
    def _onclick(): Unit = js.native
    
    /**
      * Determines whether the component is displayed as pressed.
      * @default false
      * @public
      */
    var pressed: Boolean = js.native
  }
}
