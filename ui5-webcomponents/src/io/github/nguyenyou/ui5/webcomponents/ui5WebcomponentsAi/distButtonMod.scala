package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.anon.Arrowbuttonclick
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-ai-button` component serves as a button for AI-related scenarios. Users can trigger actions by clicking or tapping the `ui5-ai-button`
    * or by pressing keyboard keys like [Enter] or [Space].
    *
    * ### Usage
    *
    * For the `ui5-ai-button` user interface, you can define one or more button states by placing `ui5-ai-button-state` components in their default slot.
    * Each state has a name for identification and can include text, an icon, and an end icon, as needed for its purpose.
    * You can define a split mode for the `ui5-ai-button`, which will results in displaying an arrow button for additional actions.
    *
    * You can choose from a set of predefined designs for `ui5-ai-button` (as in `ui5-button`) to match the desired styling.
    *
    * The `ui5-ai-button` can be activated by clicking or tapping it. You can change the button state in the click event handler. When the button is
    * in split mode, you can activate the default button action by clicking or tapping it, or by pressing keyboard keys like [Enter] or [Space].
    * You can activate the arrow button by clicking or tapping it, or by pressing keyboard keys like [Arrow Up], [Arrow Down], or [F4].
    * To display additional actions, you can attach a menu to the arrow button.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-ai/dist/Button.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental The Button and ButtonState web components are availabe since 2.0 under an experimental flag and their API and behaviour are subject to change.
    */
  @JSImport("@ui5/webcomponents-ai/dist/Button.js", JSImport.Default)
  @js.native
  open class default () extends Button
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-ai-button` component serves as a button for AI-related scenarios. Users can trigger actions by clicking or tapping the `ui5-ai-button`
    * or by pressing keyboard keys like [Enter] or [Space].
    *
    * ### Usage
    *
    * For the `ui5-ai-button` user interface, you can define one or more button states by placing `ui5-ai-button-state` components in their default slot.
    * Each state has a name for identification and can include text, an icon, and an end icon, as needed for its purpose.
    * You can define a split mode for the `ui5-ai-button`, which will results in displaying an arrow button for additional actions.
    *
    * You can choose from a set of predefined designs for `ui5-ai-button` (as in `ui5-button`) to match the desired styling.
    *
    * The `ui5-ai-button` can be activated by clicking or tapping it. You can change the button state in the click event handler. When the button is
    * in split mode, you can activate the default button action by clicking or tapping it, or by pressing keyboard keys like [Enter] or [Space].
    * You can activate the arrow button by clicking or tapping it, or by pressing keyboard keys like [Arrow Up], [Arrow Down], or [F4].
    * To display additional actions, you can attach a menu to the arrow button.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-ai/dist/Button.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental The Button and ButtonState web components are availabe since 2.0 under an experimental flag and their API and behaviour are subject to change.
    */
  @js.native
  trait Button
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Keeps the current state object of the component.
      * @private
      */
    var _currentStateObject: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distButtonStateMod.default
      ] = js.native
    
    def _effectiveState: String = js.native
    
    def _effectiveStateObject: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distButtonStateMod.default
      ] = js.native
    
    /**
      * Starts the fade-in animation.
      * @private
      */
    def _fadeIn(): Unit = js.native
    
    /**
      * Starts the fade-out animation.
      * @private
      */
    def _fadeOut(): js.Promise[Unit] = js.native
    
    def _hasText: Boolean = js.native
    
    var _hiddenSplitButton: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSplitButtonMod.default
      ] = js.native
    
    def _hideArrowButton: Boolean = js.native
    
    /**
      * Handles the arrow-button-click event when `ui5-ai-button` is in split mode.
      * @private
      */
    def _onArrowClick(e: CustomEvent): Unit = js.native
    
    /**
      * Handles the click event.
      * @private
      */
    def _onClick(e: CustomEvent): Unit = js.native
    
    /**
      * Resets the fade phases when the animation is completed.
      * @private
      */
    def _resetFade(): Unit = js.native
    
    var _splitButton: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSplitButtonMod.default
      ] = js.native
    
    def _stateEndIcon: js.UndefOr[String] = js.native
    
    def _stateIcon: js.UndefOr[String] = js.native
    
    def _stateIconOnly: Boolean = js.native
    
    def _stateText: js.UndefOr[String] = js.native
    
    /**
      * Defines the active state of the arrow button in split mode.
      * Set to true when the button is in split mode and a menu with additional options
      * is opened by the arrow button. Set back to false when the menu is closed.
      * @default false
      * @public
      * @since 2.6.0
      */
    var arrowButtonPressed: Boolean = js.native
    
    /**
      * Defines the component design.
      * @default "Default"
      * @public
      */
    var design: js.UndefOr[/* template literal string: ${ButtonDesign} */ String] = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_Button: Arrowbuttonclick = js.native
    
    /**
      * Determines if the button is in icon-only mode.
      * This property is animation related only.
      * @default false
      * @private
      */
    var iconOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the current state of the component.
      *
      * @default undefined
      * @public
      */
    var state: js.UndefOr[String] = js.native
    
    /**
      * Defines the available states of the component.
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that
      * you only use `ui5-ai-button-state` components in order to preserve the intended design.
      * @public
      */
    var states: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsAi.distButtonStateMod.default
      ] = js.native
  }
}
