package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Exclude
import io.github.nguyenyou.ui5.webcomponents.std.InputEvent
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeClose
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PopoverValueStateMessage
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Active
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Inactive
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.Multiple
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.None
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`ui5-multi-combobox-valueStateDesc`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Timeout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.ClipboardEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMultiComboBoxMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-multi-combobox` component consists of a list box with items and a text field allowing the user to either type a value directly into the text field, or choose from the list of existing items.
    *
    * The drop-down list is used for selecting and filtering values, it enables users to select one or more options from a predefined list. The control provides an editable input field to filter the list, and a dropdown arrow to expand/collapse the list of available options.
    * The options in the list have checkboxes that permit multi-selection. Entered values are displayed as tokens.
    * ### Structure
    * The `ui5-multi-combobox` consists of the following elements:
    *
    * -  Tokenizer - a list of tokens with selected options.
    * -  Input field - displays the selected option/s as token/s. Users can type to filter the list.
    * -  Drop-down arrow - expands\collapses the option list.
    * -  Option list - the list of available options.
    *
    * ### Keyboard Handling
    *
    * The `ui5-multi-combobox` provides advanced keyboard handling.
    *
    * #### Picker
    * If the `ui5-multi-combobox` is focused,
    * you can open or close the drop-down by pressing [F4], [Alt] + [Up] or [Alt] + [Down] keys.
    * Once the drop-down is opened, you can use the `UP` and `DOWN` arrow keys
    * to navigate through the available options and select one by pressing the `Space` or `Enter` keys.
    *
    * #### Tokens
    *
    * -  Left/Right arrow keys - moves the focus selection form the currently focused token to the previous/next one (if available).
    * -  Delete -  deletes the token and focuses the previous token.
    * -  Backspace -  deletes the token and focus the next token.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MultiComboBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.11.0
    * @csspart token-\{index\} - Used to style each token(where `token-0` corresponds to the first item)
    */
  @JSImport("@ui5/webcomponents/dist/MultiComboBox", JSImport.Default)
  @js.native
  open class default () extends MultiComboBox
  object default {
    
    @JSImport("@ui5/webcomponents/dist/MultiComboBox", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the group header should be shown (if there is a filtered suggestion item for this group item)
      * @private
      */
    /* static member */
    inline def groupItemFilter(
      item: IMultiComboBoxItem,
      idx: Double,
      allItems: js.Array[IMultiComboBoxItem],
      filteredItems: js.Array[IMultiComboBoxItem]
    ): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("_groupItemFilter")(item.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], allItems.asInstanceOf[js.Any], filteredItems.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MultiComboBox", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-multi-combobox` as items
    * @public
    */
  @js.native
  trait IMultiComboBoxItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _isVisible: js.UndefOr[Boolean] = js.native
    
    var additionalText: js.UndefOr[String] = js.native
    
    var headerText: js.UndefOr[String] = js.native
    
    var isGroupItem: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Array[IMultiComboBoxItem]] = js.native
    
    var selected: Boolean = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-multi-combobox` component consists of a list box with items and a text field allowing the user to either type a value directly into the text field, or choose from the list of existing items.
    *
    * The drop-down list is used for selecting and filtering values, it enables users to select one or more options from a predefined list. The control provides an editable input field to filter the list, and a dropdown arrow to expand/collapse the list of available options.
    * The options in the list have checkboxes that permit multi-selection. Entered values are displayed as tokens.
    * ### Structure
    * The `ui5-multi-combobox` consists of the following elements:
    *
    * -  Tokenizer - a list of tokens with selected options.
    * -  Input field - displays the selected option/s as token/s. Users can type to filter the list.
    * -  Drop-down arrow - expands\collapses the option list.
    * -  Option list - the list of available options.
    *
    * ### Keyboard Handling
    *
    * The `ui5-multi-combobox` provides advanced keyboard handling.
    *
    * #### Picker
    * If the `ui5-multi-combobox` is focused,
    * you can open or close the drop-down by pressing [F4], [Alt] + [Up] or [Alt] + [Down] keys.
    * Once the drop-down is opened, you can use the `UP` and `DOWN` arrow keys
    * to navigate through the available options and select one by pressing the `Space` or `Enter` keys.
    *
    * #### Tokens
    *
    * -  Left/Right arrow keys - moves the focus selection form the currently focused token to the previous/next one (if available).
    * -  Delete -  deletes the token and focuses the previous token.
    * -  Backspace -  deletes the token and focus the next token.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MultiComboBox.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 0.11.0
    * @csspart token-\{index\} - Used to style each token(where `token-0` corresponds to the first item)
    */
  @js.native
  trait MultiComboBox extends IFormInputElement {
    
    def _afterClose(): Unit = js.native
    
    def _afterOpen(): Unit = js.native
    
    var _allSelected: Boolean = js.native
    
    def _beforeClose(): Unit = js.native
    
    def _beforeOpen(): Unit = js.native
    
    def _clear(): Unit = js.native
    
    var _clearingValue: js.UndefOr[Boolean] = js.native
    
    def _click(): Unit = js.native
    
    var _deleting: Boolean = js.native
    
    var _dialogInputValueState: /* template literal string: ${ValueState} */ String = js.native
    
    def _dialogOkButton: String = js.native
    
    var _effectiveShowClearIcon: Boolean = js.native
    
    var _effectiveValueState: /* template literal string: ${ValueState} */ String = js.native
    
    def _filterItems(str: String): js.Array[IMultiComboBoxItem] = js.native
    
    var _filteredItems: js.Array[IMultiComboBoxItem] = js.native
    
    def _forwardFocusToInner(): Unit = js.native
    
    def _getFirstMatchingItem(current: String): js.UndefOr[IMultiComboBoxItem] = js.native
    
    /**
      * Retrieves a flat structure of all MultiComboBox items from the slotted nodes.
      *
      * @private
      */
    def _getItems(): js.Array[IMultiComboBoxItem] = js.native
    
    def _getList(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _getPlaceholder: String = js.native
    
    def _getPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def _getResponsivePopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _getSelectedItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.default
      ] = js.native
    
    def _handleArrowCtrl(e: KeyboardEvent): Unit = js.native
    
    def _handleArrowDown(): js.Promise[Unit] = js.native
    
    def _handleArrowLeft(): Unit = js.native
    
    def _handleArrowNavigation(e: KeyboardEvent, isDownControl: Boolean): Unit = js.native
    
    def _handleBackspace(e: KeyboardEvent): Unit = js.native
    
    def _handleEnd(e: KeyboardEvent): Unit = js.native
    
    def _handleEnter(): Unit = js.native
    
    def _handleEscape(): Unit = js.native
    
    def _handleHome(e: KeyboardEvent): Unit = js.native
    
    def _handleInsertPaste(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _handleItemRangeSelection(e: KeyboardEvent): Unit = js.native
    
    def _handleMobileInput(e: CustomEvent): Unit = js.native
    
    def _handlePageDown(e: KeyboardEvent): Unit = js.native
    
    def _handlePageUp(e: KeyboardEvent): Unit = js.native
    
    def _handlePaste(e: ClipboardEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeBound")
    var _handleResizeBound_Original: ResizeObserverCallback = js.native
    
    def _handleSelectAll(): Unit = js.native
    
    def _handleSelectAllCheckboxClick(e: CustomEvent): Unit = js.native
    
    def _handleShow(e: KeyboardEvent): Unit = js.native
    
    def _handleTab(): Unit = js.native
    
    def _handleTokenCreationUponPaste(pastedText: String, e: ClipboardEvent): Unit = js.native
    def _handleTokenCreationUponPaste(pastedText: String, e: KeyboardEvent): Unit = js.native
    
    def _handleTypeAhead(item: IMultiComboBoxItem, filterValue: String): Unit = js.native
    
    def _headerTitleText: String = js.native
    
    def _iconAccessibleNameText: String = js.native
    
    def _iconMouseDown(): Unit = js.native
    
    var _iconPressed: Boolean = js.native
    
    def _innerInput: HTMLInputElement = js.native
    
    def _inputChange(): Unit = js.native
    
    def _inputDom: HTMLInputElement = js.native
    
    var _inputLastValue: String = js.native
    
    def _inputLiveChange(e: InputEvent): Unit = js.native
    
    var _inputWidth: Double = js.native
    
    def _isFocusInside: Boolean = js.native
    
    var _isOpenedByKeyboard: js.UndefOr[Boolean] = js.native
    
    def _isPhone: Boolean = js.native
    
    var _itemToFocus: js.UndefOr[IMultiComboBoxItem] = js.native
    
    var _itemsBeforeOpen: js.Array[MultiComboboxItemWithSelection] = js.native
    
    var _lastValue: String = js.native
    
    def _listItemsType: Inactive | Active = js.native
    
    def _listSelectionChange(e: CustomEvent): Unit = js.native
    
    var _listWidth: Double = js.native
    
    def _navigateToNextItem(): Unit = js.native
    
    def _navigateToPrevItem(): Unit = js.native
    
    def _onIconMousedown(): Unit = js.native
    
    def _onItemKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onItemTab(): Unit = js.native
    
    def _onListHeaderKeydown(e: KeyboardEvent): Unit | js.Promise[Unit] = js.native
    
    def _onMobileInputKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onPopoverFocusOut(): Unit = js.native
    
    def _onTokenizerKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _performingSelectionTwice: Boolean = js.native
    
    def _popupLabel: String = js.native
    
    var _preventTokenizerToggle: js.UndefOr[Boolean] = js.native
    
    var _previouslySelectedItems: js.Array[IMultiComboBoxItem] = js.native
    
    def _resetValueState(valueState: /* template literal string: ${ValueState} */ String): Unit = js.native
    def _resetValueState(valueState: /* template literal string: ${ValueState} */ String, callback: js.Function0[Unit]): Unit = js.native
    
    def _revertSelection(): Unit = js.native
    
    def _selectItems(matchingItems: js.Array[IMultiComboBoxItem]): Unit = js.native
    
    def _selectedTokensCount: Double = js.native
    
    def _setValueStateHeader(): Unit = js.native
    
    var _shouldAutocomplete: js.UndefOr[Boolean] = js.native
    
    var _shouldFilterItems: js.UndefOr[Boolean] = js.native
    
    def _showAllItemsButtonPressed: Boolean = js.native
    
    def _showFilteredItems(): Unit = js.native
    
    var _showMorePressed: js.UndefOr[Boolean] = js.native
    
    def _showSelectedButtonAccessibleNameText: String = js.native
    
    def _startsWithMatchingItems(str: String): js.Array[IMultiComboBoxItem] = js.native
    
    def _toggleTokenizerPopover(): Unit = js.native
    
    def _tokenDelete(e: CustomEvent): Unit = js.native
    
    def _tokenizer: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.default = js.native
    
    def _tokenizerExpanded: Boolean = js.native
    
    def _tokenizerFocusIn(): Unit = js.native
    
    def _tokenizerFocusOut(e: FocusEvent): Unit = js.native
    
    var _tokenizerFocused: Boolean = js.native
    
    def _tokensCountText: js.UndefOr[String] = js.native
    
    def _tokensCountTextId: String = js.native
    
    var _validationTimeout: Timeout | Null = js.native
    
    var _valueBeforeOpen: String = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageIcon: String = js.native
    
    def _valueStatePopoverHorizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.4.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.4.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaDescribedByText: String = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def ariaValueStateHiddenText: js.UndefOr[String] = js.native
    
    def clearIconAccessibleName: String = js.native
    
    var currentItemIdx: Double = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def editable: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_MultiComboBox: ChangeClose = js.native
    
    /**
      * Defines the filter type of the component.
      * @default "StartsWithPerTerm"
      * @public
      */
    var filter: /* template literal string: ${ComboBoxFilter} */ String = js.native
    
    var filterSelected: Boolean = js.native
    
    @JSName("filterSelectedItems")
    def filterSelectedItems_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToggleButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def fireSelectionChange(): Boolean = js.native
    
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MMultiComboBox(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MMultiComboBox: FormData | String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MMultiComboBox: String = js.native
    
    @JSName("formValidity")
    def formValidity_MMultiComboBox: ValidityStateFlags = js.native
    
    def handleBeforeTokenizerPopoverOpen(): Unit = js.native
    
    def handleCancel(): Unit = js.native
    
    def handleOK(): Unit = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateMessage: Boolean = js.native
    
    /**
      * Defines the icon to be displayed in the component.
      * @public
      * @since 1.0.0-rc.9
      */
    var icon: js.Array[HTMLElement] = js.native
    
    def iconsCount: Double = js.native
    
    def inputFocusIn(e: FocusEvent): Unit = js.native
    
    def inputFocusOut(e: FocusEvent): Unit = js.native
    
    /**
      * Defines the component items.
      * @public
      */
    var items: js.Array[IMultiComboBoxItem] = js.native
    
    var list: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default] = js.native
    
    def morePopoverOpener: HTMLElement = js.native
    
    /**
      * Defines whether the value will be autcompleted to match an item
      * @default false
      * @public
      * @since 1.4.0
      */
    var noTypeahead: Boolean = js.native
    
    /**
      * Defines if the user input will be prevented, if no matching item has been found
      * @default false
      * @public
      */
    var noValidation: Boolean = js.native
    
    /**
      * Indicates whether the items picker is open.
      * @public
      * @since 2.9.0
      */
    var open: Boolean = js.native
    
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
      * @since 1.0.0-rc.5
      */
    var required: Boolean = js.native
    
    def responsivePopoverId: String = js.native
    
    def selectAllCheckboxLabel: String = js.native
    
    var selectedItems: js.Array[IMultiComboBoxItem] = js.native
    
    def selectedItemsListMode: None | Multiple = js.native
    
    var selectedValues: js.Array[IMultiComboBoxItem] = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldDisplayOnlyValueStateMessage: Boolean = js.native
    
    /**
      * Defines whether the clear icon of the multi-combobox will be shown.
      * @default false
      * @public
      * @since 1.20.1
      */
    var showClearIcon: Boolean = js.native
    
    /**
      * Determines if the select all checkbox is visible on top of suggestions.
      * @default false
      * @public
      */
    var showSelectAll: Boolean = js.native
    
    def storeResponsivePopoverWidth(): Unit = js.native
    
    def styles: PopoverValueStateMessage = js.native
    
    def togglePopoverByDropdownIcon(): Unit = js.native
    
    /**
      * Indicates whether the tokenizer has tokens
      * @private
      */
    var tokenizerAvailable: Boolean = js.native
    
    /**
      * Indicates whether the Tokenizer n-more popover is open.
      * @private
      */
    var tokenizerOpen: Boolean = js.native
    
    /**
      * Defines the value of the component.
      *
      * **Note:** The property is updated upon typing.
      * @default ""
      * @formEvents change input
      * @formProperty
      * @public
      */
    var value: String = js.native
    
    var valueBeforeAutoComplete: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateDefaultText: String = js.native
    
    var valueStateHeader: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      * The value state message slot should contain only one root element.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      * @since 1.0.0-rc.9
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    /**
      * Indicates whether the value state message popover is open.
      * @private
      */
    var valueStateOpen: Boolean = js.native
    
    def valueStateTextId: js.UndefOr[`ui5-multi-combobox-valueStateDesc`] = js.native
    
    def valueStateTextMappings: ValueStateAnnouncement = js.native
    
    def valueStateTypeMappings: ValueStateTypeAnnouncement = js.native
  }
  
  trait MultiComboBoxSelectionChangeEventDetail extends StObject {
    
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.default
      ]
  }
  object MultiComboBoxSelectionChangeEventDetail {
    
    inline def apply(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.default
        ]
    ): MultiComboBoxSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiComboBoxSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiComboBoxSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.default
            ]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.default*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
  
  trait MultiComboboxItemWithSelection extends StObject {
    
    var ref: IMultiComboBoxItem
    
    var selected: Boolean
  }
  object MultiComboboxItemWithSelection {
    
    inline def apply(ref: IMultiComboBoxItem, selected: Boolean): MultiComboboxItemWithSelection = {
      val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiComboboxItemWithSelection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MultiComboboxItemWithSelection] (val x: Self) extends AnyVal {
      
      inline def setRef(value: IMultiComboBoxItem): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    }
  }
  
  type ValueStateAnnouncement = Record[
    Exclude[
      ValueState, 
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None
    ], 
    String
  ]
  
  type ValueStateTypeAnnouncement = Record[
    Exclude[
      ValueState, 
      io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState.None
    ], 
    String
  ]
}
