package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.CloseVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToastMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toast` is a small, non-disruptive popup for success or information messages that
    * disappears automatically after a few seconds.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - You want to display a short success or information message.
    * - You do not want to interrupt users while they are performing an action.
    * - You want to confirm a successful action.
    *
    * #### When not to use:
    *
    * - You want to display error or warning message.
    * - You want to interrupt users while they are performing an action.
    * - You want to make sure that users read the message before they leave the page.
    * - You want users to be able to copy some part of the message text.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Toast.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    * @slot {Array<Node>} default
    * Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @JSImport("@ui5/webcomponents/dist/Toast.js", JSImport.Default)
  @js.native
  open class default () extends Toast
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toast` is a small, non-disruptive popup for success or information messages that
    * disappears automatically after a few seconds.
    *
    * ### Usage
    *
    * #### When to use:
    *
    * - You want to display a short success or information message.
    * - You do not want to interrupt users while they are performing an action.
    * - You want to confirm a successful action.
    *
    * #### When not to use:
    *
    * - You want to display error or warning message.
    * - You want to interrupt users while they are performing an action.
    * - You want to make sure that users read the message before they leave the page.
    * - You want users to be able to copy some part of the message text.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Toast.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    * @slot {Array<Node>} default
    * Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    */
  @js.native
  trait Toast
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusinFn(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onfocusoutFn(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeydownFn(e: KeyboardEvent): Unit = js.native
    
    def _onmouseleave(): Unit = js.native
    
    def _onmouseleaveFn(): Unit = js.native
    
    def _onmouseover(): Unit = js.native
    
    def _onmouseoverFn(): Unit = js.native
    
    def _ontransitionend(): Unit = js.native
    
    def _ontransitionendFn(): Unit = js.native
    
    def _tabindex: `0` | `-1` = js.native
    
    /**
      * Defines the duration in milliseconds for which component
      * remains on the screen before it's automatically closed.
      *
      * **Note:** The minimum supported value is `500` ms
      * and even if a lower value is set, the duration would remain `500` ms.
      * @default 3000
      * @public
      */
    var duration: Double = js.native
    
    /**
      * If the minimum duration is lower than 500ms, we force
      * it to be 500ms, as described in the documentation.
      * @private
      */
    def effectiveDuration: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_Toast: CloseVoid = js.native
    
    /**
      * Indicates whether the toast could be focused
      * This happens when ctr / command + shift + m is pressed
      * @private
      */
    var focusable: Boolean = js.native
    
    /**
      * Indicates whether the toast is focused
      * This happens when ctr / command + shift + m is pressed
      * @private
      */
    var focused: Boolean = js.native
    
    /**
      * Indicates whether the component is hovered.
      * @private
      */
    var hover: Boolean = js.native
    
    /**
      * Indicates whether the component is open (visible).
      * @default false
      * @public
      * @since 2.0.0
      */
    var open: Boolean = js.native
    
    /**
      * Defines the placement of the component.
      * @default "BottomCenter"
      * @public
      */
    var placement: /* template literal string: ${ToastPlacement} */ String = js.native
  }
}
