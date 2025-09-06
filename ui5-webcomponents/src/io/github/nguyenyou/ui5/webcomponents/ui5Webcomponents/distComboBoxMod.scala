package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Exclude
import io.github.nguyenyou.ui5.webcomponents.std.InputEvent
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Input
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PopoverValueStateMessage
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`hiddenText-value-state-link-shortcut`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`value-state-description`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComboBoxMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-combobox` component represents a drop-down menu with a list of the available options and a text input field to narrow down the options.
    *
    * It is commonly used to enable users to select an option from a predefined list.
    *
    * ### Structure
    * The `ui5-combobox` consists of the following elements:
    *
    * -  Input field - displays the selected option or a custom user entry. Users can type to narrow down the list or enter their own value.
    * -  Drop-down arrow - expands\collapses the option list.
    * -  Option list - the list of available options.
    *
    * ### Keyboard Handling
    *
    * The `ui5-combobox` provides advanced keyboard handling.
    *
    * - [F4], [Alt]+[Up], or [Alt]+[Down] - Toggles the picker.
    * - [Escape] - Closes the picker, if open. If closed, cancels changes and reverts the typed in value.
    * - [Enter] or [Return] - If picker is open, takes over the currently selected item and closes it.
    * - [Down] - Selects the next matching item in the picker.
    * - [Up] - Selects the previous matching item in the picker.
    * - [Page Down] - Moves selection down by page size (10 items by default).
    * - [Page Up] - Moves selection up by page size (10 items by default).
    * - [Home] - If focus is in the ComboBox, moves cursor at the beginning of text. If focus is in the picker, selects the first item.
    * - [End] - If focus is in the ComboBox, moves cursor at the end of text. If focus is in the picker, selects the last item.
    * - [Ctrl]+[Alt]+[F8] or [Command]+[Option]+[F8] - Focuses the first link in the value state message, if available. Pressing [Tab] moves the focus to the next link in the value state message, or closes the value state message if there are no more links.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ComboBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @JSImport("@ui5/webcomponents/dist/ComboBox.js", JSImport.Default)
  @js.native
  open class default () extends ComboBox
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ComboBox.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ComboBox.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-combobox` component represents a drop-down menu with a list of the available options and a text input field to narrow down the options.
    *
    * It is commonly used to enable users to select an option from a predefined list.
    *
    * ### Structure
    * The `ui5-combobox` consists of the following elements:
    *
    * -  Input field - displays the selected option or a custom user entry. Users can type to narrow down the list or enter their own value.
    * -  Drop-down arrow - expands\collapses the option list.
    * -  Option list - the list of available options.
    *
    * ### Keyboard Handling
    *
    * The `ui5-combobox` provides advanced keyboard handling.
    *
    * - [F4], [Alt]+[Up], or [Alt]+[Down] - Toggles the picker.
    * - [Escape] - Closes the picker, if open. If closed, cancels changes and reverts the typed in value.
    * - [Enter] or [Return] - If picker is open, takes over the currently selected item and closes it.
    * - [Down] - Selects the next matching item in the picker.
    * - [Up] - Selects the previous matching item in the picker.
    * - [Page Down] - Moves selection down by page size (10 items by default).
    * - [Page Up] - Moves selection up by page size (10 items by default).
    * - [Home] - If focus is in the ComboBox, moves cursor at the beginning of text. If focus is in the picker, selects the first item.
    * - [End] - If focus is in the ComboBox, moves cursor at the end of text. If focus is in the picker, selects the last item.
    * - [Ctrl]+[Alt]+[F8] or [Command]+[Option]+[F8] - Focuses the first link in the value state message, if available. Pressing [Tab] moves the focus to the next link in the value state message, or closes the value state message if there are no more links.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ComboBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.6
    */
  @js.native
  trait ComboBox extends IFormInputElement {
    
    def _addLinksEventListeners(): Unit = js.native
    
    def _afterClosePopover(): Unit = js.native
    
    def _afterOpenPopover(): Unit = js.native
    
    def _announceSelectedItem(indexOfItem: Double): Unit = js.native
    
    def _announceValueStateText(): Unit = js.native
    
    def _applyAtomicValueAndSelection(item: IComboBoxItem, filterValue: String): Unit = js.native
    
    def _arrowClick(): Unit = js.native
    
    var _autocomplete: Boolean = js.native
    
    def _beforeOpenPopover(): Unit = js.native
    
    def _clear(): Unit = js.native
    
    def _clearFocus(): Unit = js.native
    
    def _click(): Unit = js.native
    
    def _closeRespPopover(): Unit = js.native
    def _closeRespPopover(e: Event): Unit = js.native
    
    def _dialogOkButtonText: String = js.native
    
    var _effectiveShowClearIcon: Boolean = js.native
    
    def _filterItems(str: String): js.Array[IComboBoxItem] = js.native
    
    var _filteredItems: js.Array[IComboBoxItem] = js.native
    
    def _fireChangeEvent(): Unit = js.native
    
    def _focusin(e: FocusEvent): Unit = js.native
    
    def _focusout(e: FocusEvent): Unit = js.native
    
    def _getFirstMatchingItem(current: String): IComboBoxItem | Unit = js.native
    
    def _getItems(): js.Array[IComboBoxItem] = js.native
    
    def _getItemsList(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _getPicker(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _getPickerInput(): HTMLInputElement = js.native
    
    def _getValueStatePopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def _handleArrowDown(e: KeyboardEvent, indexOfItem: Double): Unit = js.native
    
    def _handleArrowUp(e: KeyboardEvent, indexOfItem: Double): Unit = js.native
    
    def _handleCtrlALtF8(): Unit = js.native
    
    def _handleEnd(e: KeyboardEvent): Unit = js.native
    
    def _handleHome(e: KeyboardEvent): Unit = js.native
    
    def _handleItemNavigation(e: KeyboardEvent, indexOfItem: Double, isForward: Boolean): Unit = js.native
    
    /**
      * Indicates whether link navigation is being handled.
      * @default false
      * @since 2.11.0
      * @private
      */
    var _handleLinkNavigation: Boolean = js.native
    
    def _handleMobileInput(e: CustomEvent): Unit = js.native
    
    def _handleMobileKeydown(e: KeyboardEvent): Unit = js.native
    
    def _handlePageDown(e: KeyboardEvent, indexOfItem: Double): Unit = js.native
    
    def _handlePageUp(e: KeyboardEvent, indexOfItem: Double): Unit = js.native
    
    def _handlePopoverFocusout(): Unit = js.native
    
    def _handlePopoverKeydown(e: KeyboardEvent): Unit = js.native
    
    def _handleTypeAhead(value: String, filterValue: String): Unit = js.native
    
    def _handleValueStatePopoverAfterClose(): Unit = js.native
    
    def _handleValueStatePopoverFocusout(): Unit = js.native
    
    def _headerTitleText: String = js.native
    
    def _iconAccessibleNameText: String = js.native
    
    var _iconPressed: Boolean = js.native
    
    var _initialRendering: Boolean = js.native
    
    def _input(e: InputEvent): Unit = js.native
    
    def _inputChange(e: Event): Unit = js.native
    
    var _isKeyNavigation: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    var _itemFocused: Boolean = js.native
    
    def _itemMousedown(e: MouseEvent): Unit = js.native
    
    def _keydown(e: KeyboardEvent): Unit = js.native
    
    def _keyup(): Unit = js.native
    
    var _lastValue: String = js.native
    
    /**
      * @private
      */
    var _linksListenersArray: js.Array[js.Function1[/* args */ Any, Unit]] = js.native
    
    var _listWidth: js.UndefOr[Double] = js.native
    
    def _makeAllVisible(item: IComboBoxItem): Unit = js.native
    
    def _onItemFocus(): Unit = js.native
    
    def _openRespPopover(): Unit = js.native
    
    def _popupLabel: String = js.native
    
    def _removeLinksEventListeners(): Unit = js.native
    
    def _resetFilter(): Unit = js.native
    
    def _resetItemVisibility(): Unit = js.native
    
    def _scrollToItem(indexOfItem: Double): Unit = js.native
    
    def _selectItem(e: CustomEvent): Unit = js.native
    
    def _selectMatchingItem(): Unit = js.native
    
    var _selectedItemText: String = js.native
    
    var _selectionPerformed: Boolean = js.native
    
    def _startsWithMatchingItems(str: String): js.Array[IComboBoxItem] = js.native
    
    def _toggleRespPopover(): Unit = js.native
    
    var _userTypedValue: String = js.native
    
    var _valueStateLinks: js.Array[HTMLElement] = js.native
    
    def _valueStateLinksShortcutsTextAccId: _empty | `hiddenText-value-state-link-shortcut` = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageIcon: String = js.native
    
    def _valueStatePopoverHorizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaDescribedByText: String = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def ariaValueStateHiddenText: String = js.native
    
    def clearIconAccessibleName: String = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_ComboBox: Input = js.native
    
    /**
      * Defines the filter type of the component.
      * @default "StartsWithPerTerm"
      * @public
      */
    var filter: /* template literal string: ${ComboBoxFilter} */ String = js.native
    
    /**
      * Defines the "live" value of the component.
      *
      * **Note:** If we have an item e.g. "Bulgaria", "B" is typed, "ulgaria" is typed ahead, value will be "Bulgaria", filterValue will be "B".
      *
      * **Note:** Initially the filter value is synced with value.
      * @default ""
      * @private
      */
    var filterValue: String = js.native
    
    /**
      * Indicates whether the input is focused
      * @private
      */
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MComboBox(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MComboBox: String = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MComboBox: String = js.native
    
    @JSName("formValidity")
    def formValidity_MComboBox: ValidityStateFlags = js.native
    
    def handleNavKeyPress(e: KeyboardEvent): Unit = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateText: Boolean = js.native
    
    /**
      * Defines the icon to be displayed in the input field.
      * @public
      * @since 1.0.0-rc.9
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconsCount: Double = js.native
    
    def inner: HTMLInputElement = js.native
    
    def itemTabIndex: Unit = js.native
    
    /**
      * Defines the component items.
      * @public
      */
    var items: js.Array[IComboBoxItem] = js.native
    
    def linksInAriaValueStateHiddenText: js.Array[HTMLElement] = js.native
    
    /**
      * Indicates whether a loading indicator should be shown in the picker.
      * @default false
      * @public
      */
    var loading: Boolean = js.native
    
    /**
      * Defines whether the value will be autocompleted to match an item
      * @default false
      * @public
      * @since 1.19.0
      */
    var noTypeahead: Boolean = js.native
    
    /**
      * Indicates whether the items picker is open.
      * @public
      * @since 2.9.0
      */
    var open: Boolean = js.native
    
    def openOnMobile: Boolean = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the
      * component has no value.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
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
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    def responsivePopoverId: String = js.native
    
    def shouldAutocomplete(e: InputEvent): Boolean = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldOpenValueStateMessagePopover: Boolean = js.native
    
    /**
      * Defines whether the clear icon of the combobox will be shown.
      * @default false
      * @public
      * @since 1.20.1
      */
    var showClearIcon: Boolean = js.native
    
    def storeResponsivePopoverWidth(): Unit = js.native
    
    def styles: PopoverValueStateMessage = js.native
    
    /**
      * Defines the value of the component.
      * @default ""
      * @formEvents change input
      * @formProperty
      * @public
      */
    var value: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateDefaultText: js.UndefOr[String] = js.native
    
    def valueStateLinksShortcutsTextAcc: String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * The value state message slot should contain only one root element.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the `ui5-combobox` is in `Information`, `Critical` or `Negative` value state.
      * @since 1.0.0-rc.9
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    /**
      * Indicates whether the value state message popover is open.
      * @private
      * @since 2.0.0
      */
    var valueStateOpen: Boolean = js.native
    
    def valueStateTextId: _empty | `value-state-description` = js.native
    
    def valueStateTextMappings: ValueStateAnnouncement = js.native
    
    def valueStateTypeMappings: ValueStateTypeAnnouncement = js.native
  }
  
  trait ComboBoxSelectionChangeEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxItemMod.default | Null
  }
  object ComboBoxSelectionChangeEventDetail {
    
    inline def apply(): ComboBoxSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(item = null)
      __obj.asInstanceOf[ComboBoxSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComboBoxSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemNull: Self = StObject.set(x, "item", null)
    }
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-combobox`
    * @public
    */
  @js.native
  trait IComboBoxItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _isVisible: js.UndefOr[Boolean] = js.native
    
    var additionalText: js.UndefOr[String] = js.native
    
    var focused: Boolean = js.native
    
    var headerText: js.UndefOr[String] = js.native
    
    var isGroupItem: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Array[IComboBoxItem]] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  
  type ValueStateAnnouncement = Record[Exclude[ValueState, None], String]
  
  type ValueStateTypeAnnouncement = Record[Exclude[ValueState, None], String]
}
