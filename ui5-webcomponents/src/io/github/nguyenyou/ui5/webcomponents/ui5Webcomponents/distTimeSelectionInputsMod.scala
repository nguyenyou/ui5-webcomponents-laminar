package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeTimeSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Closeinputs
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesInputTypeMod.InputType
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimeSelectionInputsMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-selection-inputs` displays a popover with `ui5-input` components of type="number" and an
    * optional a AM/PM `ui5-segmented-button` according to the display format given to the `ui5-time-picker`.
    * Using of numeric input components enables display of mobile devices' native numeric keyboard, which speeds up entering of the time.
    * The popup appears only on mobile devices when there is a tap on the `ui5-time-picker` input.
    *
    * This component should not be used separately.
    * @constructor
    * @extends TimePickerInternals
    * @abstract
    * @since 1.18.0
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/TimeSelectionInputs", JSImport.Default)
  @js.native
  open class default () extends TimeSelectionInputs
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-time-selection-inputs` displays a popover with `ui5-input` components of type="number" and an
    * optional a AM/PM `ui5-segmented-button` according to the display format given to the `ui5-time-picker`.
    * Using of numeric input components enables display of mobile devices' native numeric keyboard, which speeds up entering of the time.
    * The popup appears only on mobile devices when there is a tap on the `ui5-time-picker` input.
    *
    * This component should not be used separately.
    * @constructor
    * @extends TimePickerInternals
    * @abstract
    * @since 1.18.0
    * @private
    */
  @js.native
  trait TimeSelectionInputs
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerInternalsMod.default {
    
    def _addNumericAttributes(): Unit = js.native
    
    /**
      * Creates clock and button components according to the display format pattern.
      */
    def _createComponents(): Unit = js.native
    
    var _editedInput: Double = js.native
    
    var _editedInputValue: js.UndefOr[String] = js.native
    
    /**
      * Return a value as string, formatted and prepended with zero if necessary.
      * @param num A number to format
      * @param prependZero Whether to prepend with zero or not
      * @returns Formatted value
      * @private
      */
    def _formatNumberToString(num: Double, prependZero: Boolean): String = js.native
    
    /**
      * Returns the inner input element DOM reference.
      * @param input the Input component
      * @returns inner input element
      */
    def _innerInput(input: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default): HTMLInputElement | Null = js.native
    
    /**
      * Input 'change' event handler.
      * @param value new value to set on active input
      */
    def _inputChange(value: Double): Unit = js.native
    
    def _inputComponent(indexOrName: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null
      ] = js.native
    /**
      * Returns Input component by index or name.
      * @param indexOrName the index or name of the component
      * @returns component (if exists) or undefined
      */
    def _inputComponent(indexOrName: Double): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null
      ] = js.native
    
    def _is24HoursFormat: js.UndefOr[Boolean] = js.native
    
    def _isHoursInput: Boolean = js.native
    
    def _numberType: InputType = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _oninput(): Unit = js.native
    
    def _onkeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Switches to the specific input.
      * @param index the index (in _entities array) of the input
      * @private
      */
    def _switchInput(index: Double): Unit = js.native
    
    /**
      * Switches to the next input that can de focused.
      * @param wrapAround whether to start with first clock after reaching the last one, or not
      * @private
      */
    def _switchNextInput(): Unit = js.native
    def _switchNextInput(wrapAround: Boolean): Unit = js.native
    
    def enterHoursLabel: String = js.native
    
    def enterMinutesLabel: String = js.native
    
    def enterSecondsLabel: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimeSelectionInputs: ChangeTimeSelectionChangeEventDetail & Closeinputs = js.native
  }
}
