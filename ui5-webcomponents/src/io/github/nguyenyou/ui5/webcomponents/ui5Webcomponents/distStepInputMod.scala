package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Min
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Valuestatechange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputAccInfo
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Timeout
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distStepInputMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-step-input` consists of an input field and buttons with icons to increase/decrease the value
    * with the predefined step.
    *
    * The user can change the value of the component by pressing the increase/decrease buttons,
    * by typing a number directly, by using the keyboard up/down and page up/down,
    * or by using the mouse scroll wheel. Decimal values are supported.
    *
    * ### Usage
    *
    * The default step is 1 but the app developer can set a different one.
    *
    * App developers can set a maximum and minimum value for the `StepInput`.
    * The increase/decrease button and the up/down keyboard navigation become disabled when
    * the value reaches the max/min or a new value is entered from the input which is greater/less than the max/min.
    *
    * #### When to use:
    *
    * - To adjust amounts, quantities, or other values quickly.
    * - To adjust values for a specific step.
    *
    * #### When not to use:
    *
    * - To enter a static number (for example, postal code, phone number, or ID). In this case,
    * use the regular `ui5-input` instead.
    * - To display a value that rarely needs to be adjusted and does not pertain to a particular step.
    * In this case, use the regular `ui5-input` instead.
    * - To enter dates and times. In this case, use date/time related components instead.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/StepInput.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.13
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/StepInput.js", JSImport.Default)
  @js.native
  open class default () extends StepInput
  object default {
    
    @JSImport("@ui5/webcomponents/dist/StepInput.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/StepInput.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-step-input` consists of an input field and buttons with icons to increase/decrease the value
    * with the predefined step.
    *
    * The user can change the value of the component by pressing the increase/decrease buttons,
    * by typing a number directly, by using the keyboard up/down and page up/down,
    * or by using the mouse scroll wheel. Decimal values are supported.
    *
    * ### Usage
    *
    * The default step is 1 but the app developer can set a different one.
    *
    * App developers can set a maximum and minimum value for the `StepInput`.
    * The increase/decrease button and the up/down keyboard navigation become disabled when
    * the value reaches the max/min or a new value is entered from the input which is greater/less than the max/min.
    *
    * #### When to use:
    *
    * - To adjust amounts, quantities, or other values quickly.
    * - To adjust values for a specific step.
    *
    * #### When not to use:
    *
    * - To enter a static number (for example, postal code, phone number, or ID). In this case,
    * use the regular `ui5-input` instead.
    * - To display a value that rarely needs to be adjusted and does not pertain to a particular step.
    * In this case, use the regular `ui5-input` instead.
    * - To enter dates and times. In this case, use date/time related components instead.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/StepInput.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.13
    * @public
    */
  @js.native
  trait StepInput extends IFormInputElement {
    
    var _btnDown: js.UndefOr[Boolean] = js.native
    
    /**
      * Calculates the time which should be waited until _spinValue function is called.
      */
    def _calcWaitTimeout(): Double = js.native
    
    def _decIconClickable: Boolean = js.native
    
    var _decIconDisabled: Boolean = js.native
    
    def _decSpin(): Unit = js.native
    
    def _decValue(): Unit = js.native
    
    def _displayValue: String = js.native
    
    def _fireChangeEvent(): Unit = js.native
    
    def _incIconClickable: Boolean = js.native
    
    var _incIconDisabled: Boolean = js.native
    
    def _incSpin(): Unit = js.native
    
    def _incValue(): Unit = js.native
    
    var _initialValueState: js.UndefOr[/* template literal string: ${ValueState} */ String] = js.native
    
    var _inputFocused: Boolean = js.native
    
    def _isFocused: Boolean = js.native
    
    def _isValueChanged(inputValue: Double): Boolean = js.native
    
    def _isValueWithCorrectPrecision: Boolean = js.native
    
    /**
      * Value modifier - modifies the value of the component, validates the new value and enables/disables increment and
      * decrement buttons according to the value and min/max values (if set). Fires `change` event when requested
      * @private
      * @param modifier modifies the value of the component with the given modifier (positive or negative)
      * @param fireChangeEvent if `true`, fires `change` event when the value is changed
      */
    def _modifyValue(modifier: Double): Unit = js.native
    def _modifyValue(modifier: Double, fireChangeEvent: Boolean): Unit = js.native
    
    def _onButtonFocusOut(): Unit = js.native
    
    def _onInput(e: CustomEvent): Unit = js.native
    
    def _onInputChange(): Unit = js.native
    
    def _onInputFocusIn(): Unit = js.native
    
    def _onInputFocusOut(): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _preciseValue(value: Double): Double = js.native
    
    var _previousValue: js.UndefOr[Double] = js.native
    
    /**
      * Resets spin process
      */
    def _resetSpin(): Unit = js.native
    
    /**
      * Resets spin process when mouse outs + or - buttons
      */
    def _resetSpinOut(): Unit = js.native
    
    def _setButtonState(): Unit = js.native
    
    def _setDefaultInputValueIfNeeded(): Unit = js.native
    
    var _speed: Double = js.native
    
    var _spinStarted: Boolean = js.native
    
    var _spinTimeoutId: js.UndefOr[Timeout] = js.native
    
    /**
      * Called when the increment or decrement button is pressed and held to set new value.
      * @private
      * @param increment - is this the increment button or not so the values should be spin accordingly up or down
      * @param resetVariables - whether to reset the spin-related variables or not
      */
    def _spinValue(increment: Boolean): Unit = js.native
    def _spinValue(increment: Boolean, resetVariables: Boolean): Unit = js.native
    
    def _updateValueAndValidate(inputValue: Double): Unit = js.native
    
    def _updateValueState(): Unit = js.native
    
    def _validate(): Unit = js.native
    
    var _waitTimeout: Double = js.native
    
    def accInfo: InputAccInfo = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def decIconTitle: String = js.native
    
    /**
      * Determines whether the component is displayed as disabled.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_StepInput: Valuestatechange = js.native
    
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MStepInput(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MStepInput: FormData | String | Null = js.native
    
    def incIconTitle: String = js.native
    
    def innerInput: HTMLInputElement = js.native
    
    def input: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default = js.native
    
    def inputAttributes: Min = js.native
    
    def inputOuter: Element = js.native
    
    /**
      * Defines a maximum value of the component.
      * @default undefined
      * @public
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * Defines a minimum value of the component.
      * @default undefined
      * @public
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Defines a short hint, intended to aid the user with data entry when the
      * component has no value.
      *
      * **Note:** When no placeholder is set, the format pattern is displayed as a placeholder.
      * Passing an empty string as the value of this property will make the component appear empty - without placeholder or format pattern.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component is displayed as read-only.
      * @default false
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    /**
      * Defines a step of increasing/decreasing the value of the component.
      * @default 1
      * @public
      */
    var step: Double = js.native
    
    def `type`: InputType = js.native
    
    /**
      * Defines a value of the component.
      * @default 0
      * @public
      */
    var value: Double = js.native
    
    /**
      * Determines the number of digits after the decimal point of the component.
      * @default 0
      * @public
      */
    var valuePrecision: Double = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
  }
  
  trait StepInputValueStateChangeEventDetail extends StObject {
    
    var valid: Boolean
    
    var valueState: /* template literal string: ${ValueState} */ String
  }
  object StepInputValueStateChangeEventDetail {
    
    inline def apply(valid: Boolean, valueState: /* template literal string: ${ValueState} */ String): StepInputValueStateChangeEventDetail = {
      val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any], valueState = valueState.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepInputValueStateChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StepInputValueStateChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValueState(value: /* template literal string: ${ValueState} */ String): Self = StObject.set(x, "valueState", value.asInstanceOf[js.Any])
    }
  }
}
