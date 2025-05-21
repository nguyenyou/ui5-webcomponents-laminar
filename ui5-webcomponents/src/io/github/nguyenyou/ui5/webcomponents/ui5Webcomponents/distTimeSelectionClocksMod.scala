package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeTimeSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Closepicker
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTimeSelectionClocksMod {
  
  /**
    * Fired when the picker is being closed.
    */
  @JSImport("@ui5/webcomponents/dist/TimeSelectionClocks", JSImport.Default)
  @js.native
  open class default () extends TimeSelectionClocks
  
  /**
    * Fired when the picker is being closed.
    */
  @js.native
  trait TimeSelectionClocks
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerInternalsMod.default {
    
    /**
      * Makes specific clock active.
      * @param clockIndex the index of the clock to be activated
      */
    def _activateClock(clockIndex: Double): Unit = js.native
    
    /**
      * AM/PM segmented button focusin event handler.
      */
    def _amPmFocusIn(): Unit = js.native
    
    /**
      * AM/PM segmented button focusout event handler.
      */
    def _amPmFocusOut(): Unit = js.native
    
    /**
      * Flag for focused state of AM/PM segmented button
      */
    var _amPmFocused: Boolean = js.native
    
    def _buttonComponent(indexOrName: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleSpinButtonMod.default | Null
      ] = js.native
    /**
      * Returns ToggleSpinButton component by index or name.
      * @param indexOrName the index or name of the component
      * @returns component (if exists) or undefined
      */
    def _buttonComponent(indexOrName: Double): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleSpinButtonMod.default | Null
      ] = js.native
    
    /**
      * ToggleSpinButton focusin event handler. Switches to clock which button is being focused.
      * @param evt Event object
      */
    def _buttonFocusIn(evt: Event): Unit = js.native
    
    /**
      * Clock 'change' event handler.
      * @param evt Event object
      */
    def _clockChange(evt: CustomEvent): Unit = js.native
    
    def _clockComponent(indexOrName: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerClockMod.default | Null
      ] = js.native
    /**
      * Returns TimePickerClock component by index or name.
      * @param indexOrName the index or name of the component
      * @returns component (if exists) or undefined
      */
    def _clockComponent(indexOrName: Double): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerClockMod.default | Null
      ] = js.native
    
    /**
      * TimePickerClocks focusin event handler. Focuses the active button and switches to active clock.
      * @param evt Event object
      */
    def _clocksFocusIn(evt: Event): Unit = js.native
    
    /**
      * Creates clock and button components according to the display format pattern.
      */
    def _createComponents(): Unit = js.native
    
    /**
      * Focuses the first available button.
      */
    def _focusFirstButton(): Unit = js.native
    
    /**
      * Flag for focused state of Clocks component
      */
    var _focused: Boolean = js.native
    
    /**
      * Handles direct numbers entry.
      * @param evt Event object
      */
    def _numbersInput(evt: KeyboardEvent): Unit = js.native
    
    /**
      * keydown event handler.
      * @param evt Event object
      */
    def _onkeydown(evt: KeyboardEvent): Unit = js.native
    
    /**
      * keyup event handler.
      * @param evt Event object
      */
    def _onkeyup(evt: KeyboardEvent): Unit = js.native
    
    /**
      * Flag for skipping the animation when switching between clocks.
      */
    var _skipAnimation: Boolean = js.native
    
    /**
      * Flag for pressed Space key
      */
    var _spacePressed: Boolean = js.native
    
    /**
      * Switches to the specific clock by its index in _clocks property.
      * @param clockIndex the index of the clock
      * @param skipAnimation whether to skip transition animation while displaying the next clock
      */
    def _switchClock(clockIndex: Double): Unit = js.native
    def _switchClock(clockIndex: Double, skipAnimation: Boolean): Unit = js.native
    
    /**
      * Switches to the next available clock.
      * @param wrapAround whether to switch to the first clock if there are no next clock
      * @param skipAnimation whether to skip transition animation while displaying the next clock
      */
    def _switchNextClock(): Unit = js.native
    def _switchNextClock(wrapAround: Boolean): Unit = js.native
    def _switchNextClock(wrapAround: Boolean, skipAnimation: Boolean): Unit = js.native
    def _switchNextClock(wrapAround: Unit, skipAnimation: Boolean): Unit = js.native
    
    /**
      * Switches to the specific clock by name.
      * @param clockName the name of the clock
      * @param skipAnimation whether to skip transition animation while displaying the next clock
      */
    def _switchTo(clockName: String): Unit = js.native
    def _switchTo(clockName: String, skipAnimation: Boolean): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_TimeSelectionClocks: ChangeTimeSelectionChangeEventDetail & Closepicker = js.native
  }
}
