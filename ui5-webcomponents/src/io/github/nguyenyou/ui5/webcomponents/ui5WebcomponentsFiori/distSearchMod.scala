package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Open
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search` is an input with suggestions, used for user search.
    *
    * The `ui5-search` consists of several elements parts:
    * - Scope - displays a select in the beggining of the component, used for filtering results by their scope.
    * - Input field - for user input value
    * - Clear button - gives the possibility for deleting the entered value
    * - Search button - a primary button for performing search, when the user has entered a search term
    * - Suggestions - a list with available search suggestions
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/Search.js";`
    *
    * @constructor
    * @extends SearchField
    * @public
    * @since 2.9.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/Search.js", JSImport.Default)
  @js.native
  open class default () extends Search
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/Search.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/Search.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ISearchSuggestionItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var items: js.UndefOr[js.Array[ISearchSuggestionItem]] = js.native
    
    var selected: Boolean = js.native
    
    var text: String = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-search` is an input with suggestions, used for user search.
    *
    * The `ui5-search` consists of several elements parts:
    * - Scope - displays a select in the beggining of the component, used for filtering results by their scope.
    * - Input field - for user input value
    * - Clear button - gives the possibility for deleting the entered value
    * - Search button - a primary button for performing search, when the user has entered a search term
    * - Suggestions - a list with available search suggestions
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/Search.js";`
    *
    * @constructor
    * @extends SearchField
    * @public
    * @since 2.9.0
    * @experimental
    */
  @js.native
  trait Search
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchFieldMod.default {
    
    def _deselectItems(): Unit = js.native
    
    def _flattenItems: js.Array[ISearchSuggestionItem] = js.native
    
    def _getFirstMatchingItem(current: String): js.UndefOr[ISearchSuggestionItem] = js.native
    
    def _getFooterButton(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default = js.native
    
    def _getItemsList(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _getPicker(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def _handleActionKeydown(e: KeyboardEvent): Unit = js.native
    
    def _handleArrowDown(): Unit = js.native
    
    def _handleBeforeClose(e: CustomEvent): Unit = js.native
    
    def _handleBeforeOpen(): Unit = js.native
    
    def _handleCancel(): Unit = js.native
    
    def _handleClose(): Unit = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleEscape(): Unit = js.native
    
    def _handleMobileInput(e: CustomEvent): Unit = js.native
    
    def _handleOpen(): Unit = js.native
    
    def _handleTypeAhead(item: ISearchSuggestionItem): Unit = js.native
    
    /**
      * Defines the inner stored value of the component.
      *
      * **Note:** The property is updated upon typing.
      * @default ""
      * @private
      */
    var _innerValue: js.UndefOr[String] = js.native
    
    def _isGroupItem(item: HTMLElement): /* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SearchItemGroup.default */ Boolean = js.native
    
    def _isShowMoreItem(item: ISearchSuggestionItem): Boolean = js.native
    
    def _onFooterButtonClick(): Unit = js.native
    
    def _onFooterButtonKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onItemClick(e: CustomEvent): Unit = js.native
    
    def _onItemKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onMobileInputKeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * Determines whether the item selection should be performed on mobile devices.
      * Similar to _performTextSelection on desktop
      * @private
      */
    var _performItemSelectionOnMobile: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines whether a text selection should be performed.
      * @private
      */
    var _performTextSelection: js.UndefOr[Boolean] = js.native
    
    def _popoupHasAnyContent(): Boolean = js.native
    
    /**
      * Holds the currently proposed item which will be selected if the user presses Enter.
      * @private
      */
    var _proposedItem: js.UndefOr[ISearchSuggestionItem] = js.native
    
    def _selectMatchingItem(item: ISearchSuggestionItem): Unit = js.native
    
    /**
      * Based on the key pressed, determines if the autocomplete should be performed.
      * @private
      */
    var _shouldAutocomplete: js.UndefOr[Boolean] = js.native
    
    def _shouldPerformSelectionOnMobile(inputType: String): Boolean = js.native
    
    def _startsWithMatchingItems(str: String): js.Array[ISearchSuggestionItem] = js.native
    
    /**
      * Holds the typed value from the user.
      * @private
      */
    var _typedInValue: String = js.native
    
    /**
      * Holds the typed value before opening the picker.
      * @private
      */
    var _valueBeforeOpen: String = js.native
    
    /**
      * Defines the popup footer action button.
      *
      * @public
      */
    var action: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default] = js.native
    
    def cancelButtonText: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_Search: Input & Open = js.native
    
    /**
      * Defines the illustrated message to be shown in the popup.
      *
      * @public
      */
    var illustration: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distIllustratedMessageMod.default
      ] = js.native
    
    /**
      * Defines the Search suggestion items.
      *
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchItemGroupMod.default
      ] = js.native
    
    /**
      * Indicates whether a loading indicator should be shown in the popup.
      * @default false
      * @public
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the illustrated message to be shown in the popup.
      *
      * @public
      */
    var messageArea: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchMessageAreaMod.default
      ] = js.native
    
    def mobileInput: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null = js.native
    
    def nativeInput: js.UndefOr[HTMLInputElement | Null] = js.native
    
    /**
      * Defines whether the value will be autcompleted to match an item.
      * @default false
      * @public
      */
    var noTypeahead: Boolean = js.native
    
    /**
      * Indicates whether the items picker is open.
      * @public
      */
    var open: Boolean = js.native
    
    def scopeSelect: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.default | Null = js.native
    
    def suggestionsText: String = js.native
  }
  
  trait SearchEventDetails extends StObject {
    
    var item: js.UndefOr[ISearchSuggestionItem] = js.undefined
  }
  object SearchEventDetails {
    
    inline def apply(): SearchEventDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchEventDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchEventDetails] (val x: Self) extends AnyVal {
      
      inline def setItem(value: ISearchSuggestionItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
}
