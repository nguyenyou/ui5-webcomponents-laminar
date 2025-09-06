package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.EndHandle
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.end_
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.start_
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRangeSliderMod {
  
  /**
    * @class
    *
    * ### Overview
    * Represents a numerical interval and two handles (grips) to select a sub-range within it.
    * The purpose of the component to enable visual selection of sub-ranges within a given interval.
    *
    * ### Structure
    * The most important properties of the Range Slider are:
    *
    * - min - The minimum value of the slider range.
    * - max - The maximum value of the slider range.
    * - value - The current value of the slider.
    * - step - Determines the increments in which the slider will move.
    * - showTooltip - Determines if a tooltip should be displayed above the handle.
    * - showTickmarks - Displays a visual divider between the step values.
    * - labelInterval - Labels some or all of the tickmarks with their values.
    *
    * #### Notes:
    *
    * - The right and left handle can be moved individually and their positions could therefore switch.
    * - The entire range can be moved along the interval.
    *
    * ### Usage
    * The most common use case is to select and move sub-ranges on a continuous numerical scale.
    *
    * ### Responsive Behavior
    * You can move the currently selected range by clicking on it and dragging it along the interval.
    *
    * ### Keyboard Handling
    *
    * - `Left or Down Arrow` - Moves a component's handle or the entire selection one step to the left;
    * - `Right or Up Arrow` - Moves a component's handle or the entire selection one step to the right;
    * - `Left or Down Arrow + Ctrl/Cmd` - Moves a component's handle to the left or the entire range with step equal to 1/10th of the entire range;
    * - `Right or Up Arrow + Ctrl/Cmd` - Moves a component's handle to the right or the entire range with step equal to 1/10th of the entire range;
    * - `Plus` - Same as `Right or Up Arrow`;
    * - `Minus` - Same as `Left or Down Arrow`;
    * - `Home` - Moves the entire selection or the selected handle to the beginning of the component's range;
    * - `End` - Moves the entire selection or the selected handle to the end of the component's range;
    * - `Page Up` - Same as `Right or Up Arrow + Ctrl/Cmd`;
    * - `Page Down` - Same as `Left or Down Arrow + Ctrl/Cmd`;
    * - `Escape` - Resets the `startValue` and `endValue` properties to the values prior the component focusing;
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RangeSlider.js";`
    * @constructor
    * @extends SliderBase
    * @since 1.0.0-rc.11
    * @public
    * @csspart progress-container - Used to style the progress container, the horizontal bar that visually represents the range between the minimum and maximum values, of the `ui5-range-slider`.
    * @csspart progress-bar - Used to style the progress bar, which shows the progress of the `ui5-range-slider`.
    * @csspart handle - Used to style the handles of the `ui5-range-slider`.
    */
  @JSImport("@ui5/webcomponents/dist/RangeSlider.js", JSImport.Default)
  @js.native
  open class default () extends RangeSlider
  object default {
    
    @JSImport("@ui5/webcomponents/dist/RangeSlider.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/RangeSlider.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.startValue
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.endValue
  */
  trait AffectedValue extends StObject
  object AffectedValue {
    
    inline def endValue: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.endValue = "endValue".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.endValue]
    
    inline def startValue: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.startValue = "startValue".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.startValue]
  }
  
  trait AriaHandlesText extends StObject {
    
    var endHandleText: js.UndefOr[String] = js.undefined
    
    var startHandleText: js.UndefOr[String] = js.undefined
  }
  object AriaHandlesText {
    
    inline def apply(): AriaHandlesText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AriaHandlesText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AriaHandlesText] (val x: Self) extends AnyVal {
      
      inline def setEndHandleText(value: String): Self = StObject.set(x, "endHandleText", value.asInstanceOf[js.Any])
      
      inline def setEndHandleTextUndefined: Self = StObject.set(x, "endHandleText", js.undefined)
      
      inline def setStartHandleText(value: String): Self = StObject.set(x, "startHandleText", value.asInstanceOf[js.Any])
      
      inline def setStartHandleTextUndefined: Self = StObject.set(x, "startHandleText", js.undefined)
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    * Represents a numerical interval and two handles (grips) to select a sub-range within it.
    * The purpose of the component to enable visual selection of sub-ranges within a given interval.
    *
    * ### Structure
    * The most important properties of the Range Slider are:
    *
    * - min - The minimum value of the slider range.
    * - max - The maximum value of the slider range.
    * - value - The current value of the slider.
    * - step - Determines the increments in which the slider will move.
    * - showTooltip - Determines if a tooltip should be displayed above the handle.
    * - showTickmarks - Displays a visual divider between the step values.
    * - labelInterval - Labels some or all of the tickmarks with their values.
    *
    * #### Notes:
    *
    * - The right and left handle can be moved individually and their positions could therefore switch.
    * - The entire range can be moved along the interval.
    *
    * ### Usage
    * The most common use case is to select and move sub-ranges on a continuous numerical scale.
    *
    * ### Responsive Behavior
    * You can move the currently selected range by clicking on it and dragging it along the interval.
    *
    * ### Keyboard Handling
    *
    * - `Left or Down Arrow` - Moves a component's handle or the entire selection one step to the left;
    * - `Right or Up Arrow` - Moves a component's handle or the entire selection one step to the right;
    * - `Left or Down Arrow + Ctrl/Cmd` - Moves a component's handle to the left or the entire range with step equal to 1/10th of the entire range;
    * - `Right or Up Arrow + Ctrl/Cmd` - Moves a component's handle to the right or the entire range with step equal to 1/10th of the entire range;
    * - `Plus` - Same as `Right or Up Arrow`;
    * - `Minus` - Same as `Left or Down Arrow`;
    * - `Home` - Moves the entire selection or the selected handle to the beginning of the component's range;
    * - `End` - Moves the entire selection or the selected handle to the end of the component's range;
    * - `Page Up` - Same as `Right or Up Arrow + Ctrl/Cmd`;
    * - `Page Down` - Same as `Left or Down Arrow + Ctrl/Cmd`;
    * - `Escape` - Resets the `startValue` and `endValue` properties to the values prior the component focusing;
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/RangeSlider.js";`
    * @constructor
    * @extends SliderBase
    * @since 1.0.0-rc.11
    * @public
    * @csspart progress-container - Used to style the progress container, the horizontal bar that visually represents the range between the minimum and maximum values, of the `ui5-range-slider`.
    * @csspart progress-bar - Used to style the progress bar, which shows the progress of the `ui5-range-slider`.
    * @csspart handle - Used to style the handles of the `ui5-range-slider`.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Slottable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.NonDocumentTypeChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Animatable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLOrSVGElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.GlobalEventHandlers because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementContentEditable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementCSSInlineStyle because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Element because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLElement because Already inherited
  - js.Object because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.UI5Element because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.default because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement because var conflicts: __id, __shouldHydrate, _changedState, _childChangeListeners, _componentStateFinalizedEventProvider, _doNotSyncAttributes, _domRefReadyPromise, _fullyConnected, _getRealDomRef, _inDOM, _individualSlot, _internals, _invalidationEventProvider, _jsxEvents, _jsxProps, _rendered, _slotChangeListeners, _slotsAssignedNodes, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, eventDetails, formElementAnchor, hidden, id, inert, initializedProperties, innerHTML, innerText, inputMode, lang, name, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined formFormattedValue, formValidityMessage, formValidity */ @js.native
  trait RangeSlider
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSliderBaseMod.default {
    
    var _areInputValuesSwapped: Boolean = js.native
    
    def _areValuesReversed(): Boolean = js.native
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _ariaHandlesText: AriaHandlesText = js.native
    
    def _ariaLabelledByEndHandleText: String = js.native
    
    def _ariaLabelledByStartHandleText: String = js.native
    
    @JSName("_ariaLabelledByText")
    def _ariaLabelledByText_MRangeSlider: String = js.native
    
    def _ariaValueNow: Double = js.native
    
    /**
      * Calculates startValue/endValue properties when the whole range is moved.
      *
      * Uses the change of the position of the start handle and adds the initially
      * selected range to it, to determine the whole range offset.
      * @param currentPageXPos The current horizontal position of the cursor/touch
      * @param initialStartHandlePageXPos The initial horizontal position of the start handle
      * @private
      */
    def _calculateRangeOffset(currentPageXPos: Double, initialStartHandlePageXPos: Double): js.Array[Double] = js.native
    
    /**
      * Computes the new value based on the difference of the current cursor location from the
      * start of the interaction.
      * @param currentPageXPos The current horizontal position of the cursor/touch
      * @param initialStartHandlePageXPos The initial horizontal position of the start handle
      * @private
      */
    def _calculateStartValueByOffset(currentPageXPos: Double, initialStartHandlePageXPos: Double): Double = js.native
    
    def _endHandle: HTMLElement = js.native
    
    var _endValueAtBeginningOfAction: js.UndefOr[Double] = js.native
    
    var _endValueInitial: js.UndefOr[Double] = js.native
    
    var _firstHandlePositionFromStart: js.UndefOr[Double] = js.native
    
    def _getFormattedValue(value: String): String = js.native
    
    var _handeIsPressed: Boolean = js.native
    
    def _handleActionKeyPress(e: KeyboardEvent): Unit = js.native
    
    def _handleUp(): Unit = js.native
    
    /**
      * Calculates the start and end values when the 'Home" or 'End' keys
      * are pressed on the selected range bar.
      * @private
      */
    def _homeEndForSelectedRange(e: KeyboardEvent, affectedValue: String, min: Double, max: Double): Unit = js.native
    
    var _initialPageXPosition: js.UndefOr[Double] = js.native
    
    var _initialStartHandlePageX: js.UndefOr[Double] = js.native
    
    var _isEndValueValid: Boolean = js.native
    
    var _isPressInCurrentRange: Boolean = js.native
    
    var _isStartValueValid: Boolean = js.native
    
    var _lastValidEndValue: String = js.native
    
    var _lastValidStartValue: String = js.native
    
    def _onTooltopForwardFocus(e: CustomEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    /**
      * Handles focus out event of the focusable components inner elements.
      * Prevent focusout when the focus is getting initially set within the slider before the
      * slider customElement itself is finished focusing.
      *
      * Prevents the focus from leaving the Range Slider when the focus is managed between
      * its inner elements in result of user interactions.
      *
      * Resets the stored Range Slider's initial values saved when it was first focused
      * @private
      */
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    /**
      * Handles keyup logic. If one of the handles came across the other
      * swap the start and end values. Reset the affected value by the finished
      * user interaction.
      * @private
      */
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    /**
      * Determines where the press occured and which values of the Range Slider
      * handles should be updated on further interaction.
      *
      * If the press is not in the selected range or over one of the Range Slider handles
      * determines which one from the value/endValue properties has to be updated
      * after the user action (based on closest handle).
      *
      * Set flags if the press is over a handle or in the selected range,
      * in such cases no values are changed on interaction start, but could be
      * updated later when dragging.
      * @private
      */
    def _pressTargetAndAffectedValue(clientX: Double, value: Double): Unit = js.native
    
    def _progressBar: HTMLElement = js.native
    
    var _reversedValues: Boolean = js.native
    
    def _saveInteractionStartData(e: MouseEvent, newValue: Double): Unit = js.native
    /**
      * Determines and saves needed values from the start of the interaction:
      *
      * Is the value calculated is within the currently selected range;
      * Initial pageX position of the start handle affected by the interaction;
      * Initial pageX value of the pressed postion;
      * Affected value property by the action;
      * @private
      */
    def _saveInteractionStartData(e: TouchEvent, newValue: Double): Unit = js.native
    
    var _secondHandlePositionFromStart: js.UndefOr[Double] = js.native
    
    var _selectedRange: js.UndefOr[Double] = js.native
    
    /**
      * Sets the value property (start/end) that will get updated
      * by a user action depending on that user action's characteristics
      * - mouse press position - cursor coordinates relative to the start/end handles
      * - selected inner element via a keyboard navigation
      * @param affectedValue The value that will get modified by the interaction
      * @private
      */
    def _setAffectedValue(): Unit = js.native
    def _setAffectedValue(affectedValue: AffectedValue): Unit = js.native
    
    /**
      * Determines affected value (start/end) depending on the currently
      * active inner element within the Range Slider - used in the keyboard handling.
      * @private
      */
    def _setAffectedValueByFocusedElement(): Unit = js.native
    
    /**
      * Flag if press action is made on the currently selected range of values
      * @param isPressInCurrentRange Did the current press action occur in the current range (between the two handles)
      * @private
      */
    def _setIsPressInCurrentRange(isPressInCurrentRange: Boolean): Unit = js.native
    
    /**
      * Flag that we have swapped the values of the 'start' and 'end' properties,
      * to correctly switch the focus within the component from one handle to another
      * when the swapping is finished. As we only swap property values and not
      * the handle elements themselves, we must also swap their focus.
      * @private
      */
    def _setValuesAreReversed(): Unit = js.native
    
    def _startHandle: HTMLElement = js.native
    
    var _startValueAtBeginningOfAction: js.UndefOr[Double] = js.native
    
    var _startValueInitial: js.UndefOr[Double] = js.native
    
    /**
      * Swaps the start and end values of the handles if one came accros the other:
      * - If the start value is greater than the endValue swap them and their handles
      * - If the endValue become less than the start value swap them and their handles
      *
      * Switches the focus to the opposite of the currently focused handle.
      *
      * Note: Only the property values are reversed, the DOM elements of the handles
      * corresponding to them are never switched.
      * @private
      */
    def _swapValues(): Unit = js.native
    
    /**
      * Updates the visual representation of the component by calculating
      * the styles of the handles and the range selection based on the new state.
      * @private
      */
    def _updateHandlesAndRange(newValue: Double): Unit = js.native
    
    def _updateValueOnHandleDrag(event: MouseEvent): Unit = js.native
    /**
      * Updates UI and state when dragging a single Range Slider handle
      * @private
      */
    def _updateValueOnHandleDrag(event: TouchEvent): Unit = js.native
    
    def _updateValueOnRangeDrag(event: MouseEvent): Unit = js.native
    /**
      * Updates UI and state when dragging of the whole selected range
      * @private
      */
    def _updateValueOnRangeDrag(event: TouchEvent): Unit = js.native
    
    var _valueAffected: js.UndefOr[AffectedValue] = js.native
    
    def bringToFrontTooltip(handle: start_ | end_): Unit = js.native
    
    /**
      * Defines end point of a selection - position of a second handle on the slider.
      * @default 100
      * @formEvents change input
      * @formProperty
      * @public
      */
    var endValue: Double = js.native
    
    def formFormattedValue: FormData = js.native
    @JSName("formFormattedValue")
    var formFormattedValue_FRangeSlider: FormData | String | Null = js.native
    
    var formValidity: js.UndefOr[ValidityStateFlags] = js.native
    
    var formValidityMessage: js.UndefOr[String] = js.native
    
    var rangePressed: Boolean = js.native
    
    /**
      * Defines start point of a selection - position of a first handle on the slider.
      * @default 0
      * @formEvents change input
      * @formProperty
      * @public
      */
    var startValue: Double = js.native
    
    def styles: EndHandle = js.native
    
    def syncUIAndState(): Unit = js.native
    
    @JSName("tickmarksObject")
    def tickmarksObject_MRangeSlider: js.Array[Boolean] = js.native
    
    def tooltipEndValue: String = js.native
    
    def tooltipStartValue: String = js.native
    
    /**
      * Update values, stored inner state and the visual UI representation of the component.
      * If no specific type of value property is passed - the range is selected - update both handles,
      * otherwise update the handle corresponding to the affected by the user interacton value prop.
      * @private
      */
    def update(): Unit = js.native
    def update(affectedValue: String): Unit = js.native
    def update(affectedValue: String, startValue: Double): Unit = js.native
    def update(affectedValue: String, startValue: Double, endValue: Double): Unit = js.native
    def update(affectedValue: String, startValue: Unit, endValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Double, endValue: Double): Unit = js.native
    def update(affectedValue: Unit, startValue: Unit, endValue: Double): Unit = js.native
  }
}
