package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Bottom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Timeout
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBusyIndicatorMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-busy-indicator` signals that some operation is going on and that the
    * user must wait. It does not block the current UI screen so other operations could be triggered in parallel.
    * It displays 3 dots and each dot expands and shrinks at a different rate, resulting in a cascading flow of animation.
    *
    * ### Usage
    * For the `ui5-busy-indicator` you can define the size, the text and whether it is shown or hidden.
    * In order to hide it, use the "active" property.
    *
    * In order to show busy state over an HTML element, simply nest the HTML element in a `ui5-busy-indicator` instance.
    *
    * **Note:** Since `ui5-busy-indicator` has `display: inline-block;` by default and no width of its own,
    * whenever you need to wrap a block-level element, you should set `display: block` to the busy indicator as well.
    *
    * #### When to use:
    *
    * - The user needs to be able to cancel the operation.
    * - Only part of the application or a particular component is affected.
    *
    * #### When not to use:
    *
    * - The operation takes less than one second.
    * - You need to block the screen and prevent the user from starting another activity.
    * - Do not show multiple busy indicators at once.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/BusyIndicator.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Determines the content over which the component will appear.
    * @since 0.12.0
    */
  @JSImport("@ui5/webcomponents/dist/BusyIndicator.js", JSImport.Default)
  @js.native
  open class default () extends BusyIndicator
  object default {
    
    @JSImport("@ui5/webcomponents/dist/BusyIndicator.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/BusyIndicator.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-busy-indicator` signals that some operation is going on and that the
    * user must wait. It does not block the current UI screen so other operations could be triggered in parallel.
    * It displays 3 dots and each dot expands and shrinks at a different rate, resulting in a cascading flow of animation.
    *
    * ### Usage
    * For the `ui5-busy-indicator` you can define the size, the text and whether it is shown or hidden.
    * In order to hide it, use the "active" property.
    *
    * In order to show busy state over an HTML element, simply nest the HTML element in a `ui5-busy-indicator` instance.
    *
    * **Note:** Since `ui5-busy-indicator` has `display: inline-block;` by default and no width of its own,
    * whenever you need to wrap a block-level element, you should set `display: block` to the busy indicator as well.
    *
    * #### When to use:
    *
    * - The user needs to be able to cancel the operation.
    * - Only part of the application or a particular component is affected.
    *
    * #### When not to use:
    *
    * - The operation takes less than one second.
    * - You need to block the screen and prevent the user from starting another activity.
    * - Do not show multiple busy indicators at once.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/BusyIndicator.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @slot {Array<Node>} default - Determines the content over which the component will appear.
    * @since 0.12.0
    */
  @js.native
  trait BusyIndicator
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _busyTimeoutId: js.UndefOr[Timeout] = js.native
    
    def _handleKeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines if the component is currently in busy state.
      * @private
      */
    var _isBusy: Boolean = js.native
    
    def _keydownHandler(e: KeyboardEvent): Unit = js.native
    
    def _preventEvent(e: KeyboardEvent): Unit = js.native
    
    def _preventEventHandler(e: KeyboardEvent): Unit = js.native
    
    /**
      * Moves the focus to busy area when coming with SHIFT + TAB
      */
    def _redirectFocus(e: FocusEvent): Unit = js.native
    
    /**
      * Defines if the busy indicator is visible on the screen. By default it is not.
      * @default false
      * @public
      */
    var active: Boolean = js.native
    
    def ariaTitle: String = js.native
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will be visible on the screen.
      * @default 1000
      * @public
      */
    var delay: Double = js.native
    
    var focusForward: js.UndefOr[Boolean] = js.native
    
    def hasContent: Boolean = js.native
    
    def labelId: js.UndefOr[String] = js.native
    
    /**
      * Defines the size of the component.
      * @default "M"
      * @public
      */
    var size: /* template literal string: ${BusyIndicatorSize} */ String = js.native
    
    /**
      * Defines text to be displayed below the component. It can be used to inform the user of the current operation.
      * @public
      * @default undefined
      * @since 1.0.0-rc.7
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Defines the placement of the text.
      *
      * @default "Bottom"
      * @public
      */
    var textPlacement: /* template literal string: ${BusyIndicatorTextPlacement} */ String = js.native
    
    def textPosition: Bottom = js.native
  }
}
