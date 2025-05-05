package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PreventFocusRestore
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ValueStateMessage
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.IInputSuggestionItem
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.IInputSuggestionItemSelectable
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesInputSuggestionsMod {
  
  /**
    * A class to manage the `Input` suggestion items.
    * @class
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Suggestions {
    def this(component: SuggestionComponent, slotName: String, highlight: Boolean, handleFocus: Boolean) = this()
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", "default.SCROLL_STEP")
    @js.native
    def SCROLL_STEP: Double = js.native
    inline def SCROLL_STEP_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_STEP")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/features/InputSuggestions", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SuggestionComponent
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _isValueStateFocused: Boolean = js.native
    
    var focused: Boolean = js.native
    
    var hasSuggestionItemSelected: Boolean = js.native
    
    var hasValueStateMessage: Boolean = js.native
    
    def onItemSelect(item: IInputSuggestionItem): Unit = js.native
    
    def onItemSelected(pressedItem: IInputSuggestionItemSelectable, keyboardUsed: Boolean): Unit = js.native
    
    var open: Boolean = js.native
    
    var suggestionItems: js.Array[IInputSuggestionItem] = js.native
    
    var typedInValue: String = js.native
    
    var value: String = js.native
  }
  
  /**
    * A class to manage the `Input` suggestion items.
    * @class
    * @private
    */
  @js.native
  trait Suggestions extends StObject {
    
    def _clearItemFocus(): Unit = js.native
    
    def _clearSelectedSuggestionAndaccInfo(): Unit = js.native
    
    def _clearValueStateFocus(): Unit = js.native
    
    def _deselectItems(): Unit = js.native
    
    def _focusValueState(): Unit = js.native
    
    def _getComponent(): SuggestionComponent = js.native
    
    /**
      * Returns the items in 1D array.
      *
      */
    def _getItems(): js.Array[IInputSuggestionItem] = js.native
    
    def _getList(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _getListWidth(): Double = js.native
    
    def _getNonGroupItems(): js.Array[IInputSuggestionItemSelectable] = js.native
    
    def _getPicker(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _getScrollContainer(): HTMLElement = js.native
    
    def _handleItemNavigation(forward: Boolean, index: Double): Unit = js.native
    
    var _handledPress: js.UndefOr[Boolean] = js.native
    
    def _hasValueState: Boolean = js.native
    
    def _isGroupItem: Boolean = js.native
    
    def _isItemIntoView(item: IInputSuggestionItem): Boolean = js.native
    
    def _isItemOnTarget(): Boolean = js.native
    
    def _isScrollable(): Boolean = js.native
    
    def _moveItemSelection(previousIdx: Double, nextIdx: Double): Unit = js.native
    
    def _onClose(): Unit = js.native
    
    var _scrollContainer: js.UndefOr[HTMLElement] = js.native
    
    def _scrollItemIntoView(item: IInputSuggestionItem): Unit = js.native
    
    def _selectNextItem(): Unit = js.native
    
    def _selectPreviousItem(): Unit = js.native
    
    def _selectedItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSuggestionItemMod.default | Null = js.native
    
    var accInfo: js.UndefOr[SuggestionsAccInfo] = js.native
    
    var attachedAfterClose: js.UndefOr[Boolean] = js.native
    
    var attachedAfterOpened: js.UndefOr[Boolean] = js.native
    
    def close(): Unit = js.native
    def close(preventFocusRestore: Boolean): Unit = js.native
    
    var component: SuggestionComponent = js.native
    
    var handleFocus: Boolean = js.native
    
    var highlight: Boolean = js.native
    
    def hightlightInput(text: String, input: String): String = js.native
    
    def isOpened(): Boolean = js.native
    
    def itemSelectionAnnounce: String = js.native
    
    def onDown(e: KeyboardEvent, indexOfItem: Double): Boolean = js.native
    
    def onEnd(e: KeyboardEvent): Boolean = js.native
    
    def onEnter(e: KeyboardEvent): Boolean = js.native
    
    def onHome(e: KeyboardEvent): Boolean = js.native
    
    def onItemPress(e: CustomEvent): Unit = js.native
    
    def onItemSelect(item: IInputSuggestionItem): Unit = js.native
    
    def onItemSelected(selectedItem: IInputSuggestionItemSelectable, keyboardUsed: Boolean): Unit = js.native
    def onItemSelected(selectedItem: Null, keyboardUsed: Boolean): Unit = js.native
    
    def onPageDown(e: KeyboardEvent): Boolean = js.native
    
    def onPageUp(e: KeyboardEvent): Boolean = js.native
    
    def onSpace(e: KeyboardEvent): Boolean = js.native
    
    def onTab(): Boolean = js.native
    
    def onUp(e: KeyboardEvent, indexOfItem: Double): Boolean = js.native
    
    var selectedItemIndex: Double = js.native
    
    var slotName: String = js.native
    
    def template: js.ThisFunction1[
        /* this */ io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default, 
        /* hooks */ js.UndefOr[ValueStateMessage], 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_jsx-runtime.JSX.Element */ Any
      ] = js.native
    
    def toggle(bToggle: Boolean, options: PreventFocusRestore): Unit = js.native
    
    def updateSelectedItemPosition(pos: Double): Unit = js.native
  }
  
  trait SuggestionsAccInfo extends StObject {
    
    var additionalText: js.UndefOr[String] = js.undefined
    
    var currentPos: js.UndefOr[Double] = js.undefined
    
    var isGroup: Boolean
    
    var itemText: String
    
    var listSize: js.UndefOr[Double] = js.undefined
  }
  object SuggestionsAccInfo {
    
    inline def apply(isGroup: Boolean, itemText: String): SuggestionsAccInfo = {
      val __obj = js.Dynamic.literal(isGroup = isGroup.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuggestionsAccInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuggestionsAccInfo] (val x: Self) extends AnyVal {
      
      inline def setAdditionalText(value: String): Self = StObject.set(x, "additionalText", value.asInstanceOf[js.Any])
      
      inline def setAdditionalTextUndefined: Self = StObject.set(x, "additionalText", js.undefined)
      
      inline def setCurrentPos(value: Double): Self = StObject.set(x, "currentPos", value.asInstanceOf[js.Any])
      
      inline def setCurrentPosUndefined: Self = StObject.set(x, "currentPos", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setItemText(value: String): Self = StObject.set(x, "itemText", value.asInstanceOf[js.Any])
      
      inline def setListSize(value: Double): Self = StObject.set(x, "listSize", value.asInstanceOf[js.Any])
      
      inline def setListSizeUndefined: Self = StObject.set(x, "listSize", js.undefined)
    }
  }
}
