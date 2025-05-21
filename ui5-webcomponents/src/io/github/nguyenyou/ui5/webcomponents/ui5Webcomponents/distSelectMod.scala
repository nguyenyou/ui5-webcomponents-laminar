package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.ValidityStateFlags
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Information
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Livechange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ResponsivePopover
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Timeout
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSelectMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-select` component is used to create a drop-down list.
    *
    * ### Usage
    *
    * There are two main usages of the `ui5-select>`.
    *
    * - With Option (`ui5-option`) web component:
    *
    * The available options of the Select are defined by using the Option component.
    * The Option comes with predefined design and layout, including `icon`, `text` and `additional-text`.
    *
    * - With OptionCustom (`ui5-option-custom`) web component.
    *
    * Options with custom content are defined by using the OptionCustom component.
    * The OptionCustom component comes with no predefined layout and it expects consumers to define it.
    *
    * ### Selection
    *
    * The options can be selected via user interaction (click or with the use of the Space and Enter keys)
    * and programmatically - the Select component supports two distinct selection APIs, though mixing them is not supported:
    * - The "value" property of the Select component
    * - The "selected" property on individual options
    *
    * **Note:** If the "value" property is set but does not match any option,
    * no option will be selected and the Select component will be displayed as empty.
    *
    * **Note:** when both "value" and "selected" are both used (although discouraged),
    * the "value" property will take precedence.
    *
    * ### Keyboard Handling
    *
    * The `ui5-select` provides advanced keyboard handling.
    *
    * - [F4] / [Alt] + [Up] / [Alt] + [Down] / [Space] or [Enter] - Opens/closes the drop-down.
    * - [Up] or [Down] - If the drop-down is closed - changes selection to the next or the previous option. If the drop-down is opened - moves focus to the next or the previous option.
    * - [Space], [Enter] - If the drop-down is opened - selects the focused option.
    * - [Escape] - Closes the drop-down without changing the selection.
    * - [Home] - Navigates to first option
    * - [End] - Navigates to the last option
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Select";`
    *
    * `import "@ui5/webcomponents/dist/Option";`
    * `import "@ui5/webcomponents/dist/OptionCustom";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart popover - Used to style the popover element
    * @since 0.8.0
    */
  @JSImport("@ui5/webcomponents/dist/Select", JSImport.Default)
  @js.native
  open class default () extends Select
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Select", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside `ui5-select` as options
    * @public
    */
  @js.native
  trait IOption
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    var additionalText: js.UndefOr[String] = js.native
    
    var effectiveDisplayText: String = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var tooltip: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-select` component is used to create a drop-down list.
    *
    * ### Usage
    *
    * There are two main usages of the `ui5-select>`.
    *
    * - With Option (`ui5-option`) web component:
    *
    * The available options of the Select are defined by using the Option component.
    * The Option comes with predefined design and layout, including `icon`, `text` and `additional-text`.
    *
    * - With OptionCustom (`ui5-option-custom`) web component.
    *
    * Options with custom content are defined by using the OptionCustom component.
    * The OptionCustom component comes with no predefined layout and it expects consumers to define it.
    *
    * ### Selection
    *
    * The options can be selected via user interaction (click or with the use of the Space and Enter keys)
    * and programmatically - the Select component supports two distinct selection APIs, though mixing them is not supported:
    * - The "value" property of the Select component
    * - The "selected" property on individual options
    *
    * **Note:** If the "value" property is set but does not match any option,
    * no option will be selected and the Select component will be displayed as empty.
    *
    * **Note:** when both "value" and "selected" are both used (although discouraged),
    * the "value" property will take precedence.
    *
    * ### Keyboard Handling
    *
    * The `ui5-select` provides advanced keyboard handling.
    *
    * - [F4] / [Alt] + [Up] / [Alt] + [Down] / [Space] or [Enter] - Opens/closes the drop-down.
    * - [Up] or [Down] - If the drop-down is closed - changes selection to the next or the previous option. If the drop-down is opened - moves focus to the next or the previous option.
    * - [Space], [Enter] - If the drop-down is opened - selects the focused option.
    * - [Escape] - Closes the drop-down without changing the selection.
    * - [Home] - Navigates to first option
    * - [End] - Navigates to the last option
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Select";`
    *
    * `import "@ui5/webcomponents/dist/Option";`
    * `import "@ui5/webcomponents/dist/OptionCustom";`
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart popover - Used to style the popover element
    * @since 0.8.0
    */
  @js.native
  trait Select extends IFormInputElement {
    
    def _afterClose(): Unit = js.native
    
    def _afterOpen(): Unit = js.native
    
    /**
      * Selects the first option if no option is selected,
      * or selects the last option if multiple options are selected.
      */
    def _applyAutoSelection(): Unit = js.native
    
    def _applyFocus(): Unit = js.native
    
    def _applyFocusToSelectedItem(): Unit = js.native
    
    /**
      * Selects an option, based on the Select's "value" property,
      * or the options' "selected" property.
      */
    def _applySelection(): Unit = js.native
    
    /**
      * Selects an option by given value.
      */
    def _applySelectionByValue(value: String): Unit = js.native
    
    def _ariaRoleDescription: String = js.native
    
    def _beforeOpen(): Unit = js.native
    
    def _changeSelectedItem(oldIndex: Double, newIndex: Double): Unit = js.native
    
    def _currentlySelectedOption: IOption = js.native
    
    def _effectiveTabIndex: `0` | `-1` = js.native
    
    var _escapePressed: Boolean = js.native
    
    def _fireChangeEvent(selectedOption: IOption): Unit = js.native
    
    def _getItemIndex(item: IOption): Double = js.native
    
    def _getNextOptionIndex(): Double = js.native
    
    def _getPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default | Null = js.native
    
    def _getPreviousOptionIndex(): Double = js.native
    
    def _handleArrowNavigation(e: KeyboardEvent): Unit = js.native
    
    def _handleEndKey(e: KeyboardEvent): Unit = js.native
    
    def _handleHomeKey(e: KeyboardEvent): Unit = js.native
    
    /**
      * The user clicked on an item from the list
      * @private
      */
    def _handleItemPress(e: CustomEvent): Unit = js.native
    
    def _handleKeyboardNavigation(e: KeyboardEvent): Unit = js.native
    
    /**
      * The user selected an item with Enter or Space
      * @private
      */
    def _handleSelectionChange(): Unit = js.native
    def _handleSelectionChange(index: Double): Unit = js.native
    
    def _headerTitleText: String = js.native
    
    /**
      * @private
      */
    var _iconPressed: Boolean = js.native
    
    def _isPhone: Boolean = js.native
    
    def _isPickerOpen: Boolean = js.native
    
    def _itemMousedown(e: MouseEvent): Unit = js.native
    
    var _lastSelectedOption: IOption | Null = js.native
    
    /**
      * @private
      */
    var _listWidth: Double = js.native
    
    def _onclick(): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _respPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _scrollSelectedItem(): Unit = js.native
    
    def _searchNextItemByText(text: String): js.UndefOr[IOption] = js.native
    
    def _select(index: Double): Unit = js.native
    
    def _selectTypedItem(text: String): Unit = js.native
    
    def _selectedIndex: Double = js.native
    
    var _selectedIndexBeforeOpen: Double = js.native
    
    /**
      * Sets value by given option.
      */
    def _setValueByOption(option: IOption): Unit = js.native
    
    def _toggleRespPopover(): Unit = js.native
    
    var _typedChars: String = js.native
    
    var _typingTimeoutID: js.UndefOr[Timeout | Double] = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageInputIcon: String = js.native
    
    var _valueStorage: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @since 1.0.0-rc.9
      * @public
      * @default undefined
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the select.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    def closeValueStatePopover(): Unit = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_Select: Livechange = js.native
    
    /**
      * @private
      */
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MSelect(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MSelect: String | Null = js.native
    
    @JSName("formValidityMessage")
    def formValidityMessage_MSelect: String = js.native
    
    @JSName("formValidity")
    def formValidity_MSelect: ValidityStateFlags = js.native
    
    def hasCustomLabel: Boolean = js.native
    
    def hasValueState: Boolean = js.native
    
    def hasValueStateText: Boolean = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component.
      * When set, the component will display the icon only - the selected option's text,
      * the Select's "label" slot (if present) and the dropdown arrow won't be displayed.
      *
      * The SAP-icons font provides numerous options.
      *
      * Example:
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      *
      * **Note:** When using this property with a valid icon, Select will be rendered as icon only button and the label and the default arrow down won't be visible.
      * @default undefined
      * @private
      */
    var icon: js.UndefOr[String] = js.native
    
    def iconsCount: Double = js.native
    
    def isDisabled: js.UndefOr[`true`] = js.native
    
    def itemSelectionAnnounce(): Unit = js.native
    
    /**
      * Defines the HTML element that will be displayed in the component input part,
      * representing the selected option.
      *
      * **Note:** If not specified and `ui5-option-custom` is used,
      * either the option's `display-text` or its textContent will be displayed.
      *
      * **Note:** If not specified and `ui5-option` is used,
      * the option's textContent will be displayed.
      * @public
      * @since 1.17.0
      */
    var label: js.Array[HTMLElement] = js.native
    
    def openValueStatePopover(): Unit = js.native
    
    /**
      * @private
      */
    var opened: Boolean = js.native
    
    /**
      * Defines the component options.
      *
      * **Note:** Only one selected option is allowed.
      * If more than one option is defined as selected, the last one would be considered as the selected one.
      *
      * **Note:** Use the `ui5-option` component to define the desired options.
      * @public
      */
    var options: js.Array[IOption] = js.native
    
    /**
      * Defines whether the component is read-only.
      *
      * **Note:** A read-only component is not editable,
      * but still provides visual feedback upon user interaction.
      * @default false
      * @since 1.21.0
      * @public
      */
    var readonly: Boolean = js.native
    
    /**
      * Defines whether the component is required.
      * @since 1.0.0-rc.9
      * @default false
      * @public
      */
    var required: Boolean = js.native
    
    var responsivePopover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    /**
      * Currently selected `ui5-option` element.
      * @public
      * @default undefined
      */
    def selectedOption: js.UndefOr[IOption] = js.native
    
    def selectedOptionIcon: js.UndefOr[String] = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldOpenValueStateMessagePopover: Boolean = js.native
    
    def styles: ResponsivePopover = js.native
    
    def text: js.UndefOr[String] = js.native
    
    def toggleValueStatePopover(open: Boolean): Unit = js.native
    
    /**
      * Defines the tooltip of the select.
      * @default undefined
      * @public
      * @since 2.8.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    def value: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    def valueStateDefaultText: String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      *
      * **Note:** If the component has `suggestionItems`,
      * the `valueStateMessage` would be displayed as part of the same popover, if used on desktop, or dialog - on phone.
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    var valueStatePopover: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default] = js.native
    
    def valueStateText: String = js.native
    
    def valueStateTextId: js.UndefOr[String] = js.native
    
    def valueStateTextMappings: Information = js.native
    
    def valueStateTypeMappings: Information = js.native
    
    def valueStateTypeText: String = js.native
    
    /**
      * Defines the value of the component:
      *
      * - when get - returns the value of the component or the value/text content of the selected option.
      * - when set - selects the option with matching `value` property or text content.
      *
      * **Note:** Use either the Select's value or the Options' selected property.
      * Mixed usage could result in unexpected behavior.
      *
      * **Note:** If the given value does not match any existing option,
      * no option will be selected and the Select component will be displayed as empty.
      * @public
      * @default ""
      * @since 1.20.0
      * @formProperty
      * @formEvents change liveChange
      */
    def value_=(newValue: String): Unit = js.native
  }
  
  trait SelectChangeEventDetail extends StObject {
    
    var selectedOption: IOption
  }
  object SelectChangeEventDetail {
    
    inline def apply(selectedOption: IOption): SelectChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedOption = selectedOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedOption(value: IOption): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectLiveChangeEventDetail extends StObject {
    
    var selectedOption: IOption
  }
  object SelectLiveChangeEventDetail {
    
    inline def apply(selectedOption: IOption): SelectLiveChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedOption = selectedOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectLiveChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectLiveChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedOption(value: IOption): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    }
  }
}
