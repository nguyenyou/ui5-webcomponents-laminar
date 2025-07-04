package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Change
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.accept
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.less
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSwitchMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-switch` component is used for changing between binary states.
    *
    * The component can display texts, that will be switched, based on the component state, via the `textOn` and `textOff` properties,
    * but texts longer than 3 letters will be cutted off.
    *
    * However, users are able to customize the width of `ui5-switch` with pure CSS (`<ui5-switch style="width: 200px">`), and set widths, depending on the texts they would use.
    *
    * Note: the component would not automatically stretch to fit the whole text width.
    *
    * ### Keyboard Handling
    * The state can be changed by pressing the Space and Enter keys.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Switch";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.8.0
    * @csspart slider - Used to style the track, where the handle is being slid
    * @csspart text-on - Used to style the `textOn` property text
    * @csspart text-off - Used to style the `textOff` property text
    * @csspart handle - Used to style the handle of the switch
    */
  @JSImport("@ui5/webcomponents/dist/Switch.js", JSImport.Default)
  @js.native
  open class default () extends Switch
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Switch.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Switch.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-switch` component is used for changing between binary states.
    *
    * The component can display texts, that will be switched, based on the component state, via the `textOn` and `textOff` properties,
    * but texts longer than 3 letters will be cutted off.
    *
    * However, users are able to customize the width of `ui5-switch` with pure CSS (`<ui5-switch style="width: 200px">`), and set widths, depending on the texts they would use.
    *
    * Note: the component would not automatically stretch to fit the whole text width.
    *
    * ### Keyboard Handling
    * The state can be changed by pressing the Space and Enter keys.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Switch";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.8.0
    * @csspart slider - Used to style the track, where the handle is being slid
    * @csspart text-on - Used to style the `textOn` property text
    * @csspart text-off - Used to style the `textOff` property text
    * @csspart handle - Used to style the handle of the switch
    */
  @js.native
  trait Switch extends IFormInputElement {
    
    def _onclick(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _textOff: js.UndefOr[String] = js.native
    
    def _textOn: js.UndefOr[String] = js.native
    
    def accessibilityOffText: js.UndefOr[String] = js.native
    
    def accessibilityOnText: js.UndefOr[String] = js.native
    
    /**
      * Sets the accessible ARIA name of the component.
      *
      * **Note**: We recommend that you set an accessibleNameRef pointing to an external label or at least an `accessibleName`.
      * Providing an `accessibleNameRef` or an `accessibleName` is mandatory in the cases when `textOn` and `textOff` properties aren't set.
      * @default undefined
      * @public
      * @since 1.2.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      *
      * **Note**: We recommend that you set an accessibleNameRef pointing to an external label or at least an `accessibleName`.
      * Providing an `accessibleNameRef` or an `accessibleName` is mandatory in the cases when `textOn` and `textOff` properties aren't set.
      * @default undefined
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines if the component is checked.
      *
      * **Note:** The property can be changed with user interaction,
      * either by cliking the component, or by pressing the `Enter` or `Space` key.
      * @default false
      * @formEvents change
      * @formProperty
      * @public
      */
    var checked: Boolean = js.native
    
    /**
      * Defines the component design.
      *
      * **Note:** If `Graphical` type is set,
      * positive and negative icons will replace the `textOn` and `textOff`.
      * @public
      * @default "Textual"
      */
    var design: /* template literal string: ${SwitchDesign} */ String = js.native
    
    /**
      * Defines whether the component is disabled.
      *
      * **Note:** A disabled component is noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveAriaDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveTabIndex: js.UndefOr[`0`] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Switch: Change = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MSwitch(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MSwitch: String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MSwitch: String = js.native
    
    @JSName("formValidity")
    def formValidity_MSwitch: ValidityStateFlags = js.native
    
    def graphical: Boolean = js.native
    
    def hasNoLabel: Boolean = js.native
    
    def hiddenText: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 1.16.0
      */
    var required: Boolean = js.native
    
    def sapNextIcon: accept | less = js.native
    
    /**
      * Defines the text, displayed when the component is not checked.
      *
      * **Note:** We recommend using short texts, up to 3 letters (larger texts would be cut off).
      * @default undefined
      * @public
      */
    var textOff: js.UndefOr[String] = js.native
    
    /**
      * Defines the text, displayed when the component is checked.
      *
      * **Note:** We recommend using short texts, up to 3 letters (larger texts would be cut off).
      * @default undefined
      * @public
      */
    var textOn: js.UndefOr[String] = js.native
    
    def toggle(): Unit = js.native
    
    /**
      * Defines the tooltip of the component.
      *
      * **Note:** If applicable an external label reference should always be the preferred option to provide context to the `ui5-switch` component over a tooltip.
      * @default undefined
      * @public
      * @since 1.9.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines the form value of the component.
      * @default ""
      * @since 2.12.0
      * @public
      */
    var value: String = js.native
  }
}
