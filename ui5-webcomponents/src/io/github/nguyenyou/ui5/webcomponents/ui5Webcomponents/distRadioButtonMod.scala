package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRadioButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-radio-button` component enables users to select a single option from a set of options.
    * When a `ui5-radio-button` is selected by the user, the
    * `change` event is fired.
    * When a `ui5-radio-button` that is within a group is selected, the one
    * that was previously selected gets automatically deselected. You can group radio buttons by using the `name` property.
    *
    * **Note:** If `ui5-radio-button` is not part of a group, it can be selected once, but can not be deselected back.
    *
    * ### Keyboard Handling
    *
    * Once the `ui5-radio-button` is on focus, it might be selected by pressing the Space and Enter keys.
    *
    * The Arrow Down/Arrow Up and Arrow Left/Arrow Right keys can be used to change selection between next/previous radio buttons in one group,
    * while TAB and SHIFT + TAB can be used to enter or leave the radio button group.
    *
    * **Note:** On entering radio button group, the focus goes to the currently selected radio button.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RadioButton";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart outer-ring - Used to style the outer ring of the `ui5-radio-button`.
    * @csspart inner-ring - Used to style the inner ring of the `ui5-radio-button`.
    */
  @JSImport("@ui5/webcomponents/dist/RadioButton", JSImport.Default)
  @js.native
  open class default () extends RadioButton
  object default {
    
    @JSImport("@ui5/webcomponents/dist/RadioButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RadioButton", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-radio-button` component enables users to select a single option from a set of options.
    * When a `ui5-radio-button` is selected by the user, the
    * `change` event is fired.
    * When a `ui5-radio-button` that is within a group is selected, the one
    * that was previously selected gets automatically deselected. You can group radio buttons by using the `name` property.
    *
    * **Note:** If `ui5-radio-button` is not part of a group, it can be selected once, but can not be deselected back.
    *
    * ### Keyboard Handling
    *
    * Once the `ui5-radio-button` is on focus, it might be selected by pressing the Space and Enter keys.
    *
    * The Arrow Down/Arrow Up and Arrow Left/Arrow Right keys can be used to change selection between next/previous radio buttons in one group,
    * while TAB and SHIFT + TAB can be used to enter or leave the radio button group.
    *
    * **Note:** On entering radio button group, the focus goes to the currently selected radio button.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RadioButton";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart outer-ring - Used to style the outer ring of the `ui5-radio-button`.
    * @csspart inner-ring - Used to style the inner ring of the `ui5-radio-button`.
    */
  @js.native
  trait RadioButton extends IFormInputElement {
    
    var _checked: Boolean = js.native
    
    def _deactivate(): Unit = js.native
    
    /**
      * Defines if the component is selected in specific group
      * @default false
      * @private
      */
    var _groupChecked: Boolean = js.native
    
    var _groupRequired: Boolean = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleUp(e: KeyboardEvent): Unit = js.native
    
    var _name: String = js.native
    
    def _onclick(): this.type = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit | this.type = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    var _tabIndex: js.UndefOr[Double] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.6.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the active state (pressed or not) of the component.
      * @default false
      * @private
      */
    var active: Boolean = js.native
    
    def ariaLabelText: String = js.native
    
    def canToggle(): Boolean = js.native
    
    /**
      * Defines whether the component is checked or not.
      *
      * **Note:** The property value can be changed with user interaction,
      * either by clicking/tapping on the component,
      * or by using the Space or Enter key.
      *
      * **Note:** Only enabled radio buttons can be checked.
      * Read-only radio buttons are not selectable, and therefore are always unchecked.
      * @default false
      * @formEvents change
      * @formProperty
      * @public
      * @since 1.0.0-rc.15
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
    
    def effectiveAriaDescribedBy: js.UndefOr[String] = js.native
    
    def effectiveAriaDisabled: js.UndefOr[`true`] = js.native
    
    def effectiveTabIndex: js.UndefOr[Double] = js.native
    
    @JSName("eventDetails")
    var eventDetails_RadioButton: ChangeVoid = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MRadioButton(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MRadioButton: String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MRadioButton: String = js.native
    
    @JSName("formValidity")
    def formValidity_MRadioButton: ValidityStateFlags = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component isn't editable or selectable.
      * However, because it's focusable, it still provides visual feedback upon user interaction.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 1.9.0
      */
    var required: Boolean = js.native
    
    def syncGroup(): Unit = js.native
    def syncGroup(forceRemove: Boolean): Unit = js.native
    
    /**
      * Defines the text of the component.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
    
    def toggle(): this.type = js.native
    
    /**
      * Defines the form value of the component.
      * When a form with a radio button group is submitted, the group's value
      * will be the value of the currently selected radio button.
      * @default ""
      * @public
      */
    var value: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateText: String = js.native
    
    /**
      * Defines whether the component text wraps when there is not enough space.
      *
      * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
      * @default "Normal"
      * @public
      */
    var wrappingType: /* template literal string: ${WrappingType} */ String = js.native
  }
}
