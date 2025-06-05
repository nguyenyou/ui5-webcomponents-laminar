package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ArrowButton
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Arrowclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSplitButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-split-button` enables users to trigger actions. It is constructed of two separate actions -
    * default action and arrow action that can be activated by clicking or tapping, or by
    * pressing certain keyboard keys - `Space` or `Enter` for default action,
    * and `Arrow Down` or `Arrow Up` for arrow action.
    *
    * ### Usage
    *
    * `ui5-split-button` consists two separate buttons:
    *
    * - for the first one (default action) you can define some `text` or an `icon`, or both.
    * - the second one (arrow action) contains only `slim-arrow-down` icon.
    *
    * You can choose a `design` from a set of predefined types (the same as for ui5-button) that offer
    * different styling to correspond to the triggered action. Both text and arrow actions have the same design.
    *
    * You can set the `ui5-split-button` as enabled or disabled. Both parts of an enabled
    * `ui5-split-button` can be pressed by clicking or tapping it, or by certain keys, which changes
    * the style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled `ui5-split-button` appears inactive and any of the two buttons
    * cannot be pressed.
    *
    * ### Keyboard Handling
    *
    * - `Space` or `Enter` - triggers the default action
    * - `Shift` or `Escape` - if `Space` is pressed, releases the default action button without triggering the click event.
    * - `Arrow Down`, `Arrow Up`, `Alt`+`Arrow Down`, `Alt`+`Arrow Up`, or `F4` - triggers the arrow action
    * There are separate events that are fired on activating of `ui5-split-button` parts:
    *
    * - `click` for the first button (default action)
    * - `arrow-click` for the second button (arrow action)
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SplitButton.js";`
    * @csspart button - Used to style the native button element
    * @csspart icon - Used to style the icon in the native button element
    * @csspart endIcon - Used to style the end icon in the native button element
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    */
  @JSImport("@ui5/webcomponents/dist/SplitButton.js", JSImport.Default)
  @js.native
  open class default () extends SplitButton
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SplitButton.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/SplitButton.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-split-button` enables users to trigger actions. It is constructed of two separate actions -
    * default action and arrow action that can be activated by clicking or tapping, or by
    * pressing certain keyboard keys - `Space` or `Enter` for default action,
    * and `Arrow Down` or `Arrow Up` for arrow action.
    *
    * ### Usage
    *
    * `ui5-split-button` consists two separate buttons:
    *
    * - for the first one (default action) you can define some `text` or an `icon`, or both.
    * - the second one (arrow action) contains only `slim-arrow-down` icon.
    *
    * You can choose a `design` from a set of predefined types (the same as for ui5-button) that offer
    * different styling to correspond to the triggered action. Both text and arrow actions have the same design.
    *
    * You can set the `ui5-split-button` as enabled or disabled. Both parts of an enabled
    * `ui5-split-button` can be pressed by clicking or tapping it, or by certain keys, which changes
    * the style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled `ui5-split-button` appears inactive and any of the two buttons
    * cannot be pressed.
    *
    * ### Keyboard Handling
    *
    * - `Space` or `Enter` - triggers the default action
    * - `Shift` or `Escape` - if `Space` is pressed, releases the default action button without triggering the click event.
    * - `Arrow Down`, `Arrow Up`, `Alt`+`Arrow Down`, `Alt`+`Arrow Up`, or `F4` - triggers the arrow action
    * There are separate events that are fired on activating of `ui5-split-button` parts:
    *
    * - `click` for the first button (default action)
    * - `arrow-click` for the second button (arrow action)
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SplitButton.js";`
    * @csspart button - Used to style the native button element
    * @csspart icon - Used to style the icon in the native button element
    * @csspart endIcon - Used to style the end icon in the native button element
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.1.0
    */
  @js.native
  trait SplitButton
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * Defines the state of the internal Button used for the Arrow button of the SplitButton.
      * @default false
      * @private
      */
    var _activeArrowButton: Boolean = js.native
    
    def _arrowButtonPress(e: MouseEvent): Unit = js.native
    
    def _arrowButtonRelease(e: MouseEvent): Unit = js.native
    
    /**
      * Defines the display of the end icon as a graphical element within the default action of the component after the button text.
      * The SAP-icons font provides different options.
      *
      * Example:
      *
      * See all available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @private
      */
    var _endIcon: js.UndefOr[String] = js.native
    
    def _fireArrowClick(): Unit = js.native
    def _fireArrowClick(e: Event): Unit = js.native
    
    def _fireClick(): Unit = js.native
    def _fireClick(e: Event): Unit = js.native
    
    def _handleArrowButtonAction(e: KeyboardEvent): Unit = js.native
    /**
      * Handles the click event and the focus on the arrow button.
      * @param e - keyboard event
      * @private
      */
    @JSName("_handleArrowButtonAction")
    def _handleArrowButtonAction_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    /**
      * Handles the default action and the active state of the respective button.
      * @param e - keyboard event
      * @private
      */
    def _handleDefaultAction(e: KeyboardEvent): Unit = js.native
    
    @JSName("_handleMouseClick")
    def _handleMouseClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    /**
      * Defines the visibility of the arrow button of the component.
      *
      * @default false
      * @private
      */
    var _hideArrowButton: Boolean = js.native
    
    /**
      * Checks if the pressed key is an arrow key.
      * @param e - keyboard event
      * @private
      */
    def _isArrowKeyAction(e: KeyboardEvent): Boolean = js.native
    
    /**
      * Checks if the pressed key is a default action key (Space or Enter).
      * @param e - keyboard event
      * @private
      */
    def _isDefaultAction(e: KeyboardEvent): Boolean = js.native
    
    def _onArrowButtonActiveStateChange(e: CustomEvent): Unit = js.native
    
    def _onFocusOut(): Unit = js.native
    
    def _onInnerButtonFocusIn(e: FocusEvent): Unit = js.native
    
    def _onKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _resetActionButtonStates(): Unit = js.native
    
    def _setTabIndexValue(): Unit = js.native
    def _setTabIndexValue(innerButtonPressed: Boolean): Unit = js.native
    
    /**
      * Indicates if there is Shift or Escape key pressed while Space key is down.
      * @default false
      * @private
      */
    var _shiftOrEscapePressedDuringSpace: Boolean = js.native
    
    /**
      * Defines the tabIndex of the component.
      * @default "0"
      * @private
      */
    var _tabIndex: Double = js.native
    
    /**
      * Defines the active state of the text button
      * @default false
      * @private
      */
    var _textButtonActive: Boolean = js.native
    
    def _textButtonRelease(): Unit = js.native
    
    def accInfo: ArrowButton = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the arrow button should have the active state styles or not.
      * @default false
      * @public
      * @since 1.21.0
      */
    var activeArrowButton: Boolean = js.native
    
    def ariaLabelText: String = js.native
    
    def arrowButton: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null
      ] = js.native
    
    def arrowButtonTooltip: String = js.native
    
    /**
      * Defines the component design.
      * @default "Default"
      * @public
      */
    var design: /* template literal string: ${ButtonDesign} */ String = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveActiveArrowButton: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_SplitButton: Arrowclick = js.native
    
    def handleTouchStart(e: MouseEvent): Unit = js.native
    def handleTouchStart(e: TouchEvent): Unit = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      *
      * Example:
      *
      * See all available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    def isTextButton: Boolean = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
    
    def textButton: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null
      ] = js.native
    
    def textButtonAccText: String | Null = js.native
  }
}
