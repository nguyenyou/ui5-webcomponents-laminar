package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Change
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Critical
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.mixed
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.on
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCheckBoxMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Allows the user to set a binary value, such as true/false or yes/no for an item.
    *
    * The `ui5-checkbox` component consists of a box and a label that describes its purpose.
    * If it's checked, an indicator is displayed inside the box.
    * To check/uncheck the `ui5-checkbox`, the user has to click or tap the square
    * box or its label.
    *
    * The `ui5-checkbox` component only has 2 states - checked and unchecked.
    * Clicking or tapping toggles the `ui5-checkbox` between checked and unchecked state.
    *
    * ### Usage
    *
    * You can define the checkbox text with via the `text` property. If the text exceeds the available width, it is truncated by default.
    * In case you prefer text to truncate, set the `wrappingType` property to "None".
    * The touchable area for toggling the `ui5-checkbox` ends where the text ends.
    *
    * You can disable the `ui5-checkbox` by setting the `disabled` property to
    * `true`,
    * or use the `ui5-checkbox` in read-only mode by setting the `readonly`
    * property to `true`.
    *
    * ### Keyboard Handling
    *
    * The user can use the following keyboard shortcuts to toggle the checked state of the `ui5-checkbox`.
    *
    * - [Space],[Enter] - Toggles between different states: checked, not checked.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CheckBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the outermost wrapper of the `ui5-checkbox`
    * @csspart label - Used to style the label of the `ui5-checkbox`
    * @csspart icon - Used to style the icon of the `ui5-checkbox`
    */
  @JSImport("@ui5/webcomponents/dist/CheckBox", JSImport.Default)
  @js.native
  open class default () extends CheckBox
  object default {
    
    @JSImport("@ui5/webcomponents/dist/CheckBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/CheckBox", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Allows the user to set a binary value, such as true/false or yes/no for an item.
    *
    * The `ui5-checkbox` component consists of a box and a label that describes its purpose.
    * If it's checked, an indicator is displayed inside the box.
    * To check/uncheck the `ui5-checkbox`, the user has to click or tap the square
    * box or its label.
    *
    * The `ui5-checkbox` component only has 2 states - checked and unchecked.
    * Clicking or tapping toggles the `ui5-checkbox` between checked and unchecked state.
    *
    * ### Usage
    *
    * You can define the checkbox text with via the `text` property. If the text exceeds the available width, it is truncated by default.
    * In case you prefer text to truncate, set the `wrappingType` property to "None".
    * The touchable area for toggling the `ui5-checkbox` ends where the text ends.
    *
    * You can disable the `ui5-checkbox` by setting the `disabled` property to
    * `true`,
    * or use the `ui5-checkbox` in read-only mode by setting the `readonly`
    * property to `true`.
    *
    * ### Keyboard Handling
    *
    * The user can use the following keyboard shortcuts to toggle the checked state of the `ui5-checkbox`.
    *
    * - [Space],[Enter] - Toggles between different states: checked, not checked.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/CheckBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the outermost wrapper of the `ui5-checkbox`
    * @csspart label - Used to style the label of the `ui5-checkbox`
    * @csspart icon - Used to style the icon of the `ui5-checkbox`
    */
  @js.native
  trait CheckBox extends IFormInputElement {
    
    def _deactivate(): Unit = js.native
    
    def _onclick(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @public
      * @default undefined
      * @since 1.1.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component
      * @default undefined
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the active state (pressed or not) of the component.
      * @private
      */
    var active: Boolean = js.native
    
    def ariaDescribedBy: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    def ariaReadonly: js.UndefOr[`true`] = js.native
    
    def canToggle(): Boolean = js.native
    
    /**
      * Defines if the component is checked.
      *
      * **Note:** The property can be changed with user interaction,
      * either by cliking/tapping on the component, or by
      * pressing the Enter or Space key.
      * @default false
      * @formEvents change
      * @formProperty
      * @public
      */
    var checked: Boolean = js.native
    
    /**
      * Defines whether the component is disabled.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Determines whether the `ui5-checkbox` is in display only state.
      *
      * When set to `true`, the `ui5-checkbox` is not interactive, not editable, not focusable
      * and not in the tab chain. This setting is used for forms in review mode.
      *
      * **Note:** When the property `disabled` is set to `true` this property has no effect.
      * @since 1.22.0
      * @public
      * @default false
      */
    var displayOnly: Boolean = js.native
    
    def effectiveAriaChecked: Boolean | mixed = js.native
    
    def effectiveAriaDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveTabIndex: js.UndefOr[Double] = js.native
    
    @JSName("eventDetails")
    var eventDetails_CheckBox: Change = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MCheckBox(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MCheckBox: on | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MCheckBox: String = js.native
    
    @JSName("formValidity")
    def formValidity_MCheckBox: ValidityStateFlags = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines whether the component is displayed as partially checked.
      *
      * **Note:** The indeterminate state can be set only programmatically and can’t be achieved by user
      * interaction and the resulting visual state depends on the values of the `indeterminate`
      * and `checked` properties:
      *
      * -  If the component is checked and indeterminate, it will be displayed as partially checked
      * -  If the component is checked and it is not indeterminate, it will be displayed as checked
      * -  If the component is not checked, it will be displayed as not checked regardless value of the indeterminate attribute
      * @default false
      * @public
      * @since 1.0.0-rc.15
      */
    var indeterminate: Boolean = js.native
    
    def isCompletelyChecked: Boolean = js.native
    
    def isDisplayOnly: Boolean = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      *
      * **Note:** We advise against using the text property of the checkbox when there is a
      * label associated with it to avoid having two required asterisks.
      * @default false
      * @public
      * @since 1.3.0
      */
    var required: Boolean = js.native
    
    def tabbable: Boolean = js.native
    
    /**
      * Defines the text of the component.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
    
    def toggle(): this.type = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateText: js.UndefOr[String] = js.native
    
    def valueStateTextMappings(): Critical = js.native
    
    /**
      * Defines whether the component text wraps when there is not enough space.
      *
      * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
      * **Note:** for option "None" the text will be truncated with an ellipsis.
      * @default "Normal"
      * @public
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
