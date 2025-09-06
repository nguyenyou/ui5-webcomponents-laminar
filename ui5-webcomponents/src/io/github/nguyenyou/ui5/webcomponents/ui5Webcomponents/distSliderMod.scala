package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Handle
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSliderMod {
  
  /**
    * @class
    *
    * ### Overview
    * The Slider component represents a numerical range and a handle (grip).
    * The purpose of the component is to enable visual selection of a value in
    * a continuous numerical range by moving an adjustable handle.
    *
    * ### Structure
    * The most important properties of the Slider are:
    *
    * - min - The minimum value of the slider range.
    * - max - The maximum value of the slider range.
    * - value - The current value of the slider range.
    * - step - Determines the increments in which the slider will move.
    * - showTooltip - Determines if a tooltip should be displayed above the handle.
    * - showTickmarks - Displays a visual divider between the step values.
    * - labelInterval - Labels some or all of the tickmarks with their values.
    *
    * ### Usage
    * The most common use case is to select values on a continuous numerical scale (e.g. temperature, volume, etc. ).
    *
    * ### Responsive Behavior
    * The `ui5-slider` component adjusts to the size of its parent container by recalculating and
    * resizing the width of the control. You can move the slider handle in several different ways:
    *
    * - Drag and drop the handle to the desired value.
    * - Click/tap on the range bar to move the handle to that location.
    *
    * ### Keyboard Handling
    *
    * - `Left or Down Arrow` - Moves the handle one step to the left, effectively decreasing the component's value by `step` amount;
    * - `Right or Up Arrow` - Moves the handle one step to the right, effectively increasing the component's value by `step` amount;
    * - `Left or Down Arrow + Ctrl/Cmd` - Moves the handle to the left with step equal to 1/10th of the entire range, effectively decreasing the component's value by 1/10th of the range;
    * - `Right or Up Arrow + Ctrl/Cmd` - Moves the handle to the right with step equal to 1/10th of the entire range, effectively increasing the component's value by 1/10th of the range;
    * - `Plus` - Same as `Right or Up Arrow`;
    * - `Minus` - Same as `Left or Down Arrow`;
    * - `Home` - Moves the handle to the beginning of the range;
    * - `End` - Moves the handle to the end of the range;
    * - `Page Up` - Same as `Right or Up + Ctrl/Cmd`;
    * - `Page Down` - Same as `Left or Down + Ctrl/Cmd`;
    * - `Escape` - Resets the value property after interaction, to the position prior the component's focusing;
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Slider.js";`
    * @constructor
    * @extends SliderBase
    * @since 1.0.0-rc.11
    * @public
    * @csspart progress-container - Used to style the progress container, the horizontal bar that visually represents the range between the minimum and maximum values, of the `ui5-slider`.
    * @csspart progress-bar - Used to style the progress bar, which shows the progress of the `ui5-slider`.
    * @csspart handle - Used to style the handle of the `ui5-slider`.
    */
  @JSImport("@ui5/webcomponents/dist/Slider.js", JSImport.Default)
  @js.native
  open class default () extends Slider
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Slider.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Slider.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The Slider component represents a numerical range and a handle (grip).
    * The purpose of the component is to enable visual selection of a value in
    * a continuous numerical range by moving an adjustable handle.
    *
    * ### Structure
    * The most important properties of the Slider are:
    *
    * - min - The minimum value of the slider range.
    * - max - The maximum value of the slider range.
    * - value - The current value of the slider range.
    * - step - Determines the increments in which the slider will move.
    * - showTooltip - Determines if a tooltip should be displayed above the handle.
    * - showTickmarks - Displays a visual divider between the step values.
    * - labelInterval - Labels some or all of the tickmarks with their values.
    *
    * ### Usage
    * The most common use case is to select values on a continuous numerical scale (e.g. temperature, volume, etc. ).
    *
    * ### Responsive Behavior
    * The `ui5-slider` component adjusts to the size of its parent container by recalculating and
    * resizing the width of the control. You can move the slider handle in several different ways:
    *
    * - Drag and drop the handle to the desired value.
    * - Click/tap on the range bar to move the handle to that location.
    *
    * ### Keyboard Handling
    *
    * - `Left or Down Arrow` - Moves the handle one step to the left, effectively decreasing the component's value by `step` amount;
    * - `Right or Up Arrow` - Moves the handle one step to the right, effectively increasing the component's value by `step` amount;
    * - `Left or Down Arrow + Ctrl/Cmd` - Moves the handle to the left with step equal to 1/10th of the entire range, effectively decreasing the component's value by 1/10th of the range;
    * - `Right or Up Arrow + Ctrl/Cmd` - Moves the handle to the right with step equal to 1/10th of the entire range, effectively increasing the component's value by 1/10th of the range;
    * - `Plus` - Same as `Right or Up Arrow`;
    * - `Minus` - Same as `Left or Down Arrow`;
    * - `Home` - Moves the handle to the beginning of the range;
    * - `End` - Moves the handle to the end of the range;
    * - `Page Up` - Same as `Right or Up + Ctrl/Cmd`;
    * - `Page Down` - Same as `Left or Down + Ctrl/Cmd`;
    * - `Escape` - Resets the value property after interaction, to the position prior the component's focusing;
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Slider.js";`
    * @constructor
    * @extends SliderBase
    * @since 1.0.0-rc.11
    * @public
    * @csspart progress-container - Used to style the progress container, the horizontal bar that visually represents the range between the minimum and maximum values, of the `ui5-slider`.
    * @csspart progress-bar - Used to style the progress bar, which shows the progress of the `ui5-slider`.
    * @csspart handle - Used to style the handle of the `ui5-slider`.
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
  trait Slider
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSliderBaseMod.default {
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    @JSName("_ariaLabelledByText")
    def _ariaLabelledByText_MSlider: String = js.native
    
    def _handleActionKeyPress(e: KeyboardEvent): Unit = js.native
    
    var _handlePositionFromStart: Double = js.native
    
    /** Called when the user finish interacting with the slider
      * @private
      */
    def _handleUp(): Unit = js.native
    
    /** Determines if the press is over the handle
      * @private
      */
    def _isHandlePressed(clientX: Double): Boolean = js.native
    
    var _lastValidInputValue: String = js.native
    
    def _onTooltopForwardFocus(e: CustomEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    var _progressPercentage: Double = js.native
    
    def _sliderHandle: Element = js.native
    
    var _tooltipInputValue: String = js.native
    
    var _tooltipInputValueState: /* template literal string: ${ValueState} */ String = js.native
    
    /** Updates the UI representation of the progress bar and handle position
      * @private
      */
    def _updateHandleAndProgress(newValue: Double): Unit = js.native
    
    var _valueInitial: js.UndefOr[Double] = js.native
    
    def formFormattedValue: String = js.native
    @JSName("formFormattedValue")
    var formFormattedValue_FSlider: FormData | String | Null = js.native
    
    var formValidity: js.UndefOr[ValidityStateFlags] = js.native
    
    var formValidityMessage: js.UndefOr[String] = js.native
    
    def inputValue: String = js.native
    
    def styles: Handle = js.native
    
    def syncUIAndState(): Unit = js.native
    
    @JSName("tickmarksObject")
    def tickmarksObject_MSlider: js.Array[Boolean] = js.native
    
    def tooltipValue: String = js.native
  }
}
