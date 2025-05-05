package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.InputEvent
import io.github.nguyenyou.ui5.webcomponents.std.Lowercase
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.AccessibleDescription
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Information
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.InnerInput
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Max
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Select
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.TypeofInputSuggestions
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFeaturesInputSuggestionsMod.SuggestionComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.None
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.accessibleDescription
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.any
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.descr
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.scroll
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.suggestionsText
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.valueStateDesc
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaAutoComplete
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalablytyped.runtime.Instantiable4
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInputMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-input` component allows the user to enter and edit text or numeric values in one line.
    *
    * Additionally, you can provide `suggestionItems`,
    * that are displayed in a popover right under the input.
    *
    * The text field can be editable or read-only (`readonly` property),
    * and it can be enabled or disabled (`disabled` property).
    * To visualize semantic states, such as "Negative" or "Critical", the `valueState` property is provided.
    * When the user makes changes to the text, the change event is fired,
    * which enables you to react on any text change.
    *
    * ### Keyboard Handling
    * The `ui5-input` provides the following keyboard shortcuts:
    *
    * - [Escape] - Closes the suggestion list, if open. If closed or not enabled, cancels changes and reverts to the value which the Input field had when it got the focus.
    * - [Enter] or [Return] - If suggestion list is open takes over the current matching item and closes it. If value state or group header is focused, does nothing.
    * - [Down] - Focuses the next matching item in the suggestion list. Selection-change event is fired.
    * - [Up] - Focuses the previous matching item in the suggestion list. Selection-change event is fired.
    * - [Home] - If focus is in the text input, moves caret before the first character. If focus is in the list, highlights the first item and updates the input accordingly.
    * - [End] - If focus is in the text input, moves caret after the last character. If focus is in the list, highlights the last item and updates the input accordingly.
    * - [Page Up] - If focus is in the list, moves highlight up by page size (10 items by default). If focus is in the input, does nothing.
    * - [Page Down] - If focus is in the list, moves highlight down by page size (10 items by default). If focus is in the input, does nothing.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Input.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the root DOM element of the Input component
    * @csspart input - Used to style the native input element
    * @csspart clear-icon - Used to style the clear icon, which can be pressed to clear user input text
    */
  @JSImport("@ui5/webcomponents/dist/Input", JSImport.Default)
  @js.native
  open class default () extends Input
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Input", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Input", "default.SuggestionsClass")
    @js.native
    def SuggestionsClass: js.UndefOr[
        (Instantiable4[
          /* component */ SuggestionComponent, 
          /* slotName */ String, 
          /* highlight */ Boolean, 
          /* handleFocus */ Boolean, 
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFeaturesInputSuggestionsMod.default
        ]) & TypeofInputSuggestions
      ] = js.native
    inline def SuggestionsClass_=(
      x: js.UndefOr[
          (Instantiable4[
            /* component */ SuggestionComponent, 
            /* slotName */ String, 
            /* highlight */ Boolean, 
            /* handleFocus */ Boolean, 
            io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFeaturesInputSuggestionsMod.default
          ]) & TypeofInputSuggestions
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SuggestionsClass")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Input", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait INPUT_ACTIONS extends StObject
  @JSImport("@ui5/webcomponents/dist/Input", "INPUT_ACTIONS")
  @js.native
  object INPUT_ACTIONS extends StObject {
    
    @js.native
    sealed trait ACTION_ENTER
      extends StObject
         with INPUT_ACTIONS
    
    @js.native
    sealed trait ACTION_USER_INPUT
      extends StObject
         with INPUT_ACTIONS
  }
  
  /**
    * Interface for components that represent a suggestion item, usable in `ui5-input`
    * @public
    */
  @js.native
  trait IInputSuggestionItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var additionalText: js.UndefOr[String] = js.native
    
    var focused: Boolean = js.native
    
    var items: js.UndefOr[js.Array[IInputSuggestionItem]] = js.native
  }
  
  @js.native
  trait IInputSuggestionItemSelectable extends IInputSuggestionItem {
    
    var selected: Boolean = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-input` component allows the user to enter and edit text or numeric values in one line.
    *
    * Additionally, you can provide `suggestionItems`,
    * that are displayed in a popover right under the input.
    *
    * The text field can be editable or read-only (`readonly` property),
    * and it can be enabled or disabled (`disabled` property).
    * To visualize semantic states, such as "Negative" or "Critical", the `valueState` property is provided.
    * When the user makes changes to the text, the change event is fired,
    * which enables you to react on any text change.
    *
    * ### Keyboard Handling
    * The `ui5-input` provides the following keyboard shortcuts:
    *
    * - [Escape] - Closes the suggestion list, if open. If closed or not enabled, cancels changes and reverts to the value which the Input field had when it got the focus.
    * - [Enter] or [Return] - If suggestion list is open takes over the current matching item and closes it. If value state or group header is focused, does nothing.
    * - [Down] - Focuses the next matching item in the suggestion list. Selection-change event is fired.
    * - [Up] - Focuses the previous matching item in the suggestion list. Selection-change event is fired.
    * - [Home] - If focus is in the text input, moves caret before the first character. If focus is in the list, highlights the first item and updates the input accordingly.
    * - [End] - If focus is in the text input, moves caret after the last character. If focus is in the list, highlights the last item and updates the input accordingly.
    * - [Page Up] - If focus is in the list, moves highlight up by page size (10 items by default). If focus is in the input, does nothing.
    * - [Page Down] - If focus is in the list, moves highlight down by page size (10 items by default). If focus is in the input, does nothing.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Input.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart root - Used to style the root DOM element of the Input component
    * @csspart input - Used to style the native input element
    * @csspart clear-icon - Used to style the clear icon, which can be pressed to clear user input text
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
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement because var conflicts: __id, _changedState, _childChangeListeners, _componentStateFinalizedEventProvider, _doNotSyncAttributes, _domRefReadyPromise, _fullyConnected, _getRealDomRef, _inDOM, _individualSlot, _internals, _invalidationEventProvider, _jsxEvents, _jsxProps, _rendered, _slotChangeListeners, _slotsAssignedNodes, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, eventDetails, hidden, id, inert, initializedProperties, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined formFormattedValue, formElementAnchor, formValidityMessage, name, formValidity */ @js.native
  trait Input extends SuggestionComponent {
    
    /**
      * @private
      */
    var Suggestions: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFeaturesInputSuggestionsMod.default
      ] = js.native
    
    def _accInfoAriaDescription: String = js.native
    
    def _accInfoAriaDescriptionId: _empty | descr = js.native
    
    /**
      * Constantly updated value of texts collected from the accessibleNameRef elements
      * @private
      */
    var _accessibleLabelsRefTexts: js.UndefOr[String] = js.native
    
    def _afterClosePicker(): Unit = js.native
    
    def _afterOpenPicker(): Unit = js.native
    
    /**
      * Constantly updated value of texts collected from the associated labels
      * @private
      */
    var _associatedDescriptionRefTexts: js.UndefOr[String] = js.native
    
    /**
      * Constantly updated value of texts collected from the associated labels
      * @private
      */
    var _associatedLabelsTexts: js.UndefOr[String] = js.native
    
    var _changeToBeFired: js.UndefOr[Boolean] = js.native
    
    def _clear(): Unit = js.native
    
    var _clearIconClicked: js.UndefOr[Boolean] = js.native
    
    def _clearPopoverFocusAndSelection(): Unit = js.native
    
    def _click(): Unit = js.native
    
    def _closePicker(): Unit = js.native
    
    /**
      * Defines whether the clear icon is visible.
      * @default false
      * @private
      * @since 1.2.0
      */
    var _effectiveShowClearIcon: Boolean = js.native
    
    def _effectiveShowSuggestions: Boolean = js.native
    
    var _enterKeyDown: js.UndefOr[Boolean] = js.native
    
    def _flattenItems: js.Array[IInputSuggestionItem] = js.native
    
    var _focusedAfterClear: Boolean = js.native
    
    def _getFirstMatchingItem(current: String): js.UndefOr[IInputSuggestionItemSelectable] = js.native
    
    def _getValueStatePopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def _handleChange(): Unit = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleEnd(e: KeyboardEvent): Unit = js.native
    
    def _handleEnter(e: KeyboardEvent): Unit = js.native
    
    def _handleEscape(): Unit = js.native
    
    def _handleHome(e: KeyboardEvent): Unit = js.native
    
    def _handleInput(e: CustomEvent): Unit = js.native
    
    def _handleNativeInput(e: InputEvent): Unit = js.native
    
    def _handlePageDown(e: KeyboardEvent): Unit = js.native
    
    def _handlePageUp(e: KeyboardEvent): Unit = js.native
    
    def _handlePickerAfterClose(): Unit = js.native
    
    def _handlePickerAfterOpen(): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeBound")
    var _handleResizeBound_Original: ResizeObserverCallback = js.native
    
    def _handleSelect(): Unit = js.native
    
    def _handleSelectionChange(e: CustomEvent): Unit = js.native
    
    def _handleSpace(e: KeyboardEvent): Unit = js.native
    
    def _handleSuggestionItemPress(e: CustomEvent): Unit = js.native
    
    def _handleTab(): Unit = js.native
    
    def _handleTypeAhead(item: IInputSuggestionItemSelectable): Unit = js.native
    
    def _handleUp(e: KeyboardEvent): Unit = js.native
    
    def _handleValueStatePopoverAfterClose(): Unit = js.native
    
    def _headerTitleText: String = js.native
    
    def _highlightSuggestionItem(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSuggestionItemMod.default): Unit = js.native
    
    def _iconMouseDown(): Unit = js.native
    
    var _indexOfSelectedItem: Double = js.native
    
    /**
      * Defines the inner stored value of the component.
      *
      * **Note:** The property is updated upon typing. In some special cases the old value is kept (e.g. deleting the value after the dot in a float)
      * @default ""
      * @private
      */
    var _innerValue: String = js.native
    
    def _input(e: InputEvent, eventType: String): Unit = js.native
    def _input(e: CustomEvent, eventType: String): Unit = js.native
    
    var _inputAccInfo: InputAccInfo = js.native
    
    var _inputIconFocused: Boolean = js.native
    
    var _inputWidth: js.UndefOr[Double] = js.native
    
    var _isChangeTriggeredBySuggestion: Boolean = js.native
    
    def _isGroupItem(item: IInputSuggestionItem): Boolean = js.native
    
    var _isKeyNavigation: js.UndefOr[Boolean] = js.native
    
    var _isLatestValueFromSuggestions: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    def _isSuggestionsFocused: js.UndefOr[Boolean] = js.native
    
    var _keepInnerValue: Boolean = js.native
    
    var _listWidth: js.UndefOr[Double] = js.native
    
    var _nativeInputAttributes: NativeInputAttributes = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    var _performTextSelection: js.UndefOr[Boolean] = js.native
    
    /**
      * Returns the placeholder value.
      * @protected
      */
    def _placeholder: js.UndefOr[String] = js.native
    
    def _popupLabel: String = js.native
    
    def _readonly: Boolean = js.native
    
    @JSName("_scroll")
    def _scroll_scroll(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default, 
          scroll
        ]
    ): Unit = js.native
    
    def _selectMatchingItem(item: IInputSuggestionItemSelectable): Unit = js.native
    
    def _selectableItems: js.Array[IInputSuggestionItemSelectable] = js.native
    
    var _selectedText: js.UndefOr[String] = js.native
    
    var _shouldAutocomplete: js.UndefOr[Boolean] = js.native
    
    def _startsWithMatchingItems(str: String): js.Array[IInputSuggestionItemSelectable] = js.native
    
    def _updateAssociatedLabelsTexts(): Unit = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateInputIcon: String = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageInputIcon: String = js.native
    
    def _valueStatePopoverHorizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    def accInfo: AccessibleDescription = js.native
    
    def acceptSuggestion(item: IInputSuggestionItemSelectable, keyboardUsed: Boolean): Unit = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.9.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that describe the input.
      * @default undefined
      * @public
      * @since 2.9.0
      */
    var accessibleDescriptionRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def announceSelectedItem(): Unit = js.native
    
    def ariaDescribedByIds: String = js.native
    
    def ariaDescriptionText: js.UndefOr[String] = js.native
    
    def ariaDescriptionTextId: _empty | accessibleDescription = js.native
    
    def ariaValueStateHiddenText: js.UndefOr[String] = js.native
    
    def availableSuggestionsCount: js.UndefOr[String] = js.native
    
    def clearIconAccessibleName: String = js.native
    
    def closeValueStatePopover(): Unit = js.native
    
    def currentItemIndex: Double = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def enableSuggestions(): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_Input: Select = js.native
    
    def fireEventByAction(action: INPUT_ACTIONS, e: InputEvent): Unit = js.native
    
    def fireResetSelectionChange(): Unit = js.native
    
    def fireSelectionChange(item: IInputSuggestionItem, isValueFromSuggestions: Boolean): Unit = js.native
    def fireSelectionChange(item: Null, isValueFromSuggestions: Boolean): Unit = js.native
    
    var firstRendering: Boolean = js.native
    
    def formElementAnchor(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    @JSName("formElementAnchor")
    var formElementAnchor_FInput: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | js.Promise[js.UndefOr[HTMLElement]]]]] = js.native
    
    def formFormattedValue: FormData | String | Null = js.native
    @JSName("formFormattedValue")
    var formFormattedValue_FInput: FormData | String | Null = js.native
    
    def formValidity: ValidityStateFlags = js.native
    
    def formValidityMessage: String = js.native
    @JSName("formValidityMessage")
    var formValidityMessage_FInput: js.UndefOr[String] = js.native
    
    @JSName("formValidity")
    var formValidity_FInput: js.UndefOr[ValidityStateFlags] = js.native
    
    /**
      * Returns the caret position inside the native input
      * @protected
      */
    def getCaretPosition(): Double | Null = js.native
    
    def getInputDOMRef(): HTMLInputElement | Input | Null = js.native
    
    def getInputDOMRefSync(): HTMLInputElement | Null = js.native
    
    def getInputValue(): String = js.native
    
    def hasValueState: Boolean = js.native
    
    @JSName("hasValueStateMessage")
    def hasValueStateMessage_MInput: Boolean = js.native
    
    /**
      * Defines if characters within the suggestions are to be highlighted
      * in case the input value matches parts of the suggestions text.
      *
      * **Note:** takes effect when `showSuggestions` is set to `true`
      * @default false
      * @private
      * @since 1.0.0-rc.8
      */
    var highlight: Boolean = js.native
    
    /**
      * Used to define enterkeyhint of the inner input.
      * https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/enterkeyhint
      *
      * @private
      */
    var hint: js.UndefOr[/* template literal string: ${InputKeyHint} */ String] = js.native
    
    /**
      * Defines the icon to be displayed in the component.
      * @public
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconsCount: Double = js.native
    
    /**
      * Called on "focusin" of the native input HTML Element.
      * **Note:** implemented in MultiInput, but used in the Input template.
      */
    def innerFocusIn(): js.UndefOr[Unit] = js.native
    
    def inputNativeType: Lowercase[/* template literal string: ${InputType} */ String] = js.native
    
    def inputType: /* template literal string: ${InputType} */ String = js.native
    
    /**
      * Returns if the suggestions popover is scrollable.
      * The method returns `Promise` that resolves to true,
      * if the popup is scrollable and false otherwise.
      */
    def isSuggestionsScrollable(): Boolean | js.Promise[Boolean] = js.native
    
    def isTypeNumber: Boolean = js.native
    
    var isTyping: Boolean = js.native
    
    def itemSelectionAnnounce: String = js.native
    
    var lastConfirmedValue: String = js.native
    
    /**
      * Sets the maximum number of characters available in the input field.
      *
      * **Note:** This property is not compatible with the ui5-input type InputType.Number. If the ui5-input type is set to Number, the maxlength value is ignored.
      * @default undefined
      * @since 1.0.0-rc.5
      * @public
      */
    var maxlength: js.UndefOr[Double] = js.native
    
    /**
      * Determines the name by which the component will be identified upon submission in an HTML form.
      *
      * **Note:** This property is only applicable within the context of an HTML Form element.
      * @default undefined
      * @public
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * Returns a reference to the native input element
      * @protected
      */
    def nativeInput: HTMLInputElement | Null = js.native
    
    def nativeInputAttributes: Max = js.native
    
    def nativeInputWidth: Double = js.native
    
    /**
      * Defines whether the value will be autcompleted to match an item
      * @default false
      * @public
      * @since 1.4.0
      */
    var noTypeahead: Boolean = js.native
    
    def onItemMouseDown(e: MouseEvent): Unit = js.native
    
    def openValueStatePopover(): Unit = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the
      * component has no value.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    var previousValue: String = js.native
    
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
      * Removes the fractional part of floating-point number.
      * @param value the numeric value of Input of type "Number"
      */
    def removeFractionalPart(value: String): String = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 1.0.0-rc.3
      */
    var required: Boolean = js.native
    
    /**
      * Sets the caret to a certain position inside the native input
      * @protected
      */
    def setCaretPosition(): Unit = js.native
    def setCaretPosition(pos: Double): Unit = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldDisplayOnlyValueStateMessage: Boolean = js.native
    
    /**
      * Defines whether the clear icon of the input will be shown.
      * @default false
      * @public
      * @since 1.2.0
      */
    var showClearIcon: Boolean = js.native
    
    /**
      * Defines whether the component should show suggestions, if such are present.
      *
      * @default false
      * @public
      */
    var showSuggestions: Boolean = js.native
    
    def step: js.UndefOr[any] = js.native
    
    def styles: InnerInput = js.native
    
    def suggestionSeparators: None = js.native
    
    def suggestionsText: String = js.native
    
    def suggestionsTextId: _empty | suggestionsText = js.native
    
    /**
      * Defines the HTML type of the component.
      *
      * **Notes:**
      *
      * - The particular effect of this property differs depending on the browser
      * and the current language settings, especially for type `Number`.
      * - The property is mostly intended to be used with touch devices
      * that use different soft keyboard layouts depending on the given input type.
      * @default "Text"
      * @public
      */
    var `type`: /* template literal string: ${InputType} */ String = js.native
    
    /**
      * Updates the input value on item select.
      * @param item The item that is on select
      */
    def updateValueOnSelect(item: IInputSuggestionItem): Unit = js.native
    
    var valueBeforeItemSelection: String = js.native
    
    var valueBeforeSelectionStart: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * The value state message slot should contain only one root element.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      *
      * **Note:** If the component has `suggestionItems`,
      * the `valueStateMessage` would be displayed as part of the same popover, if used on desktop, or dialog - on phone.
      * @since 1.0.0-rc.6
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    var valueStateOpen: Boolean = js.native
    
    def valueStateText: js.UndefOr[String] = js.native
    
    def valueStateTextId: _empty | valueStateDesc = js.native
    
    def valueStateTextMappings(): Information = js.native
    
    def valueStateTypeMappings: Information = js.native
  }
  
  trait InputAccInfo extends StObject {
    
    var ariaAutoComplete: js.UndefOr[AriaAutoComplete] = js.undefined
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedBy: js.UndefOr[String] = js.undefined
    
    var ariaDescription: js.UndefOr[String] = js.undefined
    
    var ariaExpanded: js.UndefOr[Boolean] = js.undefined
    
    var ariaHasPopup: js.UndefOr[AriaHasPopup] = js.undefined
    
    var ariaInvalid: js.UndefOr[Boolean] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaRequired: js.UndefOr[Boolean] = js.undefined
    
    var ariaRoledescription: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
  }
  object InputAccInfo {
    
    inline def apply(): InputAccInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputAccInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputAccInfo] (val x: Self) extends AnyVal {
      
      inline def setAriaAutoComplete(value: AriaAutoComplete): Self = StObject.set(x, "ariaAutoComplete", value.asInstanceOf[js.Any])
      
      inline def setAriaAutoCompleteUndefined: Self = StObject.set(x, "ariaAutoComplete", js.undefined)
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      inline def setAriaDescribedBy(value: String): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedByUndefined: Self = StObject.set(x, "ariaDescribedBy", js.undefined)
      
      inline def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      inline def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHasPopup(value: AriaHasPopup): Self = StObject.set(x, "ariaHasPopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHasPopupUndefined: Self = StObject.set(x, "ariaHasPopup", js.undefined)
      
      inline def setAriaInvalid(value: Boolean): Self = StObject.set(x, "ariaInvalid", value.asInstanceOf[js.Any])
      
      inline def setAriaInvalidUndefined: Self = StObject.set(x, "ariaInvalid", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaRequired(value: Boolean): Self = StObject.set(x, "ariaRequired", value.asInstanceOf[js.Any])
      
      inline def setAriaRequiredUndefined: Self = StObject.set(x, "ariaRequired", js.undefined)
      
      inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoledescriptionUndefined: Self = StObject.set(x, "ariaRoledescription", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait InputEventDetail extends StObject {
    
    var inputType: String
  }
  object InputEventDetail {
    
    inline def apply(inputType: String): InputEventDetail = {
      val __obj = js.Dynamic.literal(inputType = inputType.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputEventDetail] (val x: Self) extends AnyVal {
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    }
  }
  
  trait InputSelectionChangeEventDetail extends StObject {
    
    var item: IInputSuggestionItem | Null
  }
  object InputSelectionChangeEventDetail {
    
    inline def apply(): InputSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(item = null)
      __obj.asInstanceOf[InputSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: IInputSuggestionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
    }
  }
  
  trait InputSuggestionScrollEventDetail extends StObject {
    
    var scrollContainer: HTMLElement
    
    var scrollTop: Double
  }
  object InputSuggestionScrollEventDetail {
    
    inline def apply(scrollContainer: HTMLElement, scrollTop: Double): InputSuggestionScrollEventDetail = {
      val __obj = js.Dynamic.literal(scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputSuggestionScrollEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputSuggestionScrollEventDetail] (val x: Self) extends AnyVal {
      
      inline def setScrollContainer(value: HTMLElement): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeInputAttributes extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
  }
  object NativeInputAttributes {
    
    inline def apply(): NativeInputAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NativeInputAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NativeInputAttributes] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
