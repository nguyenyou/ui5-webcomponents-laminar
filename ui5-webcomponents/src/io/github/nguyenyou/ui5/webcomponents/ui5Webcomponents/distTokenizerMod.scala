package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Beforemorepopoveropen
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PopoverMinwidth
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiInputMod.IToken
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.Delete
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSelectionModeMod.ListSelectionMode.None
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTokenizerMod {
  
  @JSImport("@ui5/webcomponents/dist/Tokenizer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-tokenizer` is an invisible container for `ui5-token`s that supports keyboard navigation and token selection.
    *
    * The `ui5-tokenizer` consists of two parts:
    * - Tokens - displays the available tokens.
    * - N-more indicator - contains the number of the remaining tokens that cannot be displayed due to the limited space.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-tokenizer` provides advanced keyboard handling.
    * When a token is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Left] or [Right] / [Up] or [Down] - Navigates left and right through the tokens.
    * - [Home] - Navigates to the first token.
    * - [End] - Navigates to the last token.
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete):
    *
    * - [Space] - Selects a token.
    * - [Backspace] / [Delete] - Deletes a token.
    * **Note:** The deletion of a token is handled by the application with the use of the `token-delete` event.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Tokenizer.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    * @experimental This component is availabe since 2.0 under an experimental flag and its API and behaviour are subject to change.
    */
  @JSImport("@ui5/webcomponents/dist/Tokenizer", JSImport.Default)
  @js.native
  open class default () extends Tokenizer
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Tokenizer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Tokenizer", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait ClipboardDataOperation extends StObject
  @JSImport("@ui5/webcomponents/dist/Tokenizer", "ClipboardDataOperation")
  @js.native
  object ClipboardDataOperation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ClipboardDataOperation & String] = js.native
    
    @js.native
    sealed trait copy
      extends StObject
         with ClipboardDataOperation
    /* "copy" */ val copy: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.ClipboardDataOperation.copy & String = js.native
    
    @js.native
    sealed trait cut
      extends StObject
         with ClipboardDataOperation
    /* "cut" */ val cut: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.ClipboardDataOperation.cut & String = js.native
  }
  
  inline def getTokensCountText(iTokenCount: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTokensCountText")(iTokenCount.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @class
    *
    * ### Overview
    *
    * A `ui5-tokenizer` is an invisible container for `ui5-token`s that supports keyboard navigation and token selection.
    *
    * The `ui5-tokenizer` consists of two parts:
    * - Tokens - displays the available tokens.
    * - N-more indicator - contains the number of the remaining tokens that cannot be displayed due to the limited space.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-tokenizer` provides advanced keyboard handling.
    * When a token is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Left] or [Right] / [Up] or [Down] - Navigates left and right through the tokens.
    * - [Home] - Navigates to the first token.
    * - [End] - Navigates to the last token.
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete):
    *
    * - [Space] - Selects a token.
    * - [Backspace] / [Delete] - Deletes a token.
    * **Note:** The deletion of a token is handled by the application with the use of the `token-delete` event.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Tokenizer.js";`
    *
    * @constructor
    * @extends UI5Element
    * @public
    * @since 2.0.0
    * @experimental This component is availabe since 2.0 under an experimental flag and its API and behaviour are subject to change.
    */
  @js.native
  trait Tokenizer
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaDisabled: js.UndefOr[`true`] = js.native
    
    def _ariaReadonly: js.UndefOr[`true`] = js.native
    
    def _calcNextTokenIndex(focusedToken: IToken, tokens: js.Array[IToken], backwards: Boolean): Double = js.native
    
    def _clearAllText: String = js.native
    
    def _click(e: MouseEvent): Unit = js.native
    
    def _delete(e: CustomEvent): Unit = js.native
    
    var _deletedDialogItems: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
    
    var _expandedScrollWidth: js.UndefOr[Double] = js.native
    
    def _fillClipboard(shortcutName: ClipboardDataOperation, tokens: js.Array[IToken]): Unit = js.native
    
    /**
      * @protected
      */
    def _focusLastToken(): Unit = js.native
    
    var _focusedElementBeforeOpen: js.UndefOr[HTMLElement | Null] = js.native
    
    def _getList(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.default = js.native
    
    def _getVisibleTokens(): js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
    
    def _handleArrowCtrl(e: KeyboardEvent, focusedToken: IToken, tokens: js.Array[IToken], backwards: Boolean): Unit = js.native
    
    def _handleArrowShift(
      focusedToken: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default,
      tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default],
      backwards: Boolean
    ): Unit = js.native
    
    def _handleCurrentItemAfterDeletion(nextToken: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default): Unit = js.native
    
    def _handleEndShift(e: KeyboardEvent): Unit = js.native
    
    def _handleHome(
      tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default],
      endKeyPressed: Boolean
    ): js.UndefOr[`-1`] = js.native
    
    def _handleHomeShift(e: KeyboardEvent): Unit = js.native
    
    def _handleItemNavigation(
      e: KeyboardEvent,
      tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]
    ): Unit | `-1` = js.native
    
    def _handleNMoreClick(): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleTokenSelection(e: KeyboardEvent): Unit = js.native
    def _handleTokenSelection(e: KeyboardEvent, deselectAll: Boolean): Unit = js.native
    def _handleTokenSelection(e: MouseEvent): Unit = js.native
    def _handleTokenSelection(e: MouseEvent, deselectAll: Boolean): Unit = js.native
    
    def _isPhone: Boolean = js.native
    
    var _itemNav: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _nMoreCount: Double = js.native
    
    def _nMoreListMode: None | Delete = js.native
    
    def _nMoreText: js.UndefOr[String] = js.native
    
    def _onPopoverListKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    var _preventCollapse: Boolean = js.native
    
    var _previousToken: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default | Null = js.native
    
    def _resizeHandler(): js.Promise[Unit] | Unit = js.native
    @JSName("_resizeHandler")
    var _resizeHandler_Original: ResizeObserverCallback = js.native
    
    var _scrollEnablement: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateScrollEnablementMod.default
      ] = js.native
    
    /**
      * Scrolls token to the visible area of the container.
      * Adds 4 pixels to the scroll position to ensure padding and border visibility on both ends
      * @protected
      */
    def _scrollToToken(token: IToken): Unit = js.native
    
    def _selectedTokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
    
    var _skipTabIndex: Boolean = js.native
    
    def _toggleTokenSelection(tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): Unit = js.native
    
    def _tokenClickDelete(e: CustomEvent, token: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default): Unit = js.native
    
    var _tokenDeleting: Boolean = js.native
    
    def _tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
    
    var _tokensCount: Double = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def contentDom: HTMLElement = js.native
    
    /**
      * Removes a token from the Tokenizer.
      * This method should only be used by ui5-multi-combobox and ui5-multi-input
      * @protected
      * @param token Token to be focused.
      * @param forwardFocusToPrevious Indicates whether the focus will be forwarded to previous or next token after deletion.
      */
    def deleteToken(token: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default): Unit = js.native
    def deleteToken(
      token: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default,
      forwardFocusToPrevious: Boolean
    ): Unit = js.native
    
    /**
      * Defines whether the component is disabled.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_Tokenizer: Beforemorepopoveropen = js.native
    
    /**
      * Indicates if the tokenizer should show all tokens or n more label instead
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @default false
      * @private
      */
    var expanded: Boolean = js.native
    
    def getPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def getTokenByRefId(refId: String): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default = js.native
    
    def handleAfterClose(): Unit = js.native
    
    def handleBeforeClose(): Unit = js.native
    
    def handleBeforeOpen(): Unit = js.native
    
    def handleClearAll(): Unit = js.native
    
    def handleDialogButtonPress(e: MouseEvent): Unit = js.native
    
    def hasTokens: Boolean = js.native
    
    /**
      * Hides the popover arrow.
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @default false
      * @private
      */
    var hidePopoverArrow: Boolean = js.native
    
    def itemDelete(e: CustomEvent): js.Promise[Unit] = js.native
    
    def moreLink: HTMLElement | Null = js.native
    
    def morePopoverOpener: HTMLElement = js.native
    
    def morePopoverTitle: String = js.native
    
    /**
      * Defines whether tokens are displayed on multiple lines.
      *
      * **Note:** The `multiLine` property is in an experimental state and is a subject to change.
      * @default false
      * @since 2.5.0
      * @public
      */
    var multiLine: Boolean = js.native
    
    def onTokenSelect(e: CustomEvent): Unit = js.native
    
    /**
      * Indicates if the nMore popover is open
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @default false
      * @private
      */
    var open: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element that the menu is shown at
      * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the tokenizer.
      * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @private
      * @default undefined
      */
    var opener: js.UndefOr[HTMLElement] = js.native
    
    def overflownTokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
    
    /**
      * Sets the min-width of the nMore Popover.
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @private
      */
    var popoverMinWidth: js.UndefOr[Double] = js.native
    
    /**
      * Prevents tokens to be part of the tab chain.
      * **Note:** Used inside MultiInput and MultiComboBox components.
      * @default false
      * @private
      */
    var preventInitialFocus: Boolean = js.native
    
    /**
      * Prevent opening of n-more Popover when label is clicked
      * **Note:** Used inside MultiComboBox component.
      * @default false
      * @private
      */
    var preventPopoverOpen: Boolean = js.native
    
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
      * Scrolls the container of the tokens to its end when expanded.
      * This method is used by MultiInput and MultiComboBox.
      * @protected
      */
    def scrollToEnd(): Unit = js.native
    
    /**
      * Scrolls the container of the tokens to its beginning.
      * This method is used by MultiInput and MultiComboBox.
      * @protected
      */
    def scrollToStart(): Unit = js.native
    
    /**
      * Defines whether "Clear All" button is present. Ensure `multiLine` is enabled, otherwise `showClearAll` will have no effect.
      *
      * **Note:** The `showClearAll` property is in an experimental state and is a subject to change.
      * @default false
      * @since 2.5.0
      * @public
      */
    var showClearAll: Boolean = js.native
    
    def showEffectiveClearAll: Boolean = js.native
    
    def showNMore: Boolean = js.native
    
    def styles: PopoverMinwidth = js.native
    
    def tokenizerAriaDescription: js.UndefOr[String] = js.native
    
    def tokenizerLabel: String = js.native
    
    var tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default] = js.native
  }
  
  trait TokenizerDialogButtonPressDetail extends StObject {
    
    var confirm: Boolean
  }
  object TokenizerDialogButtonPressDetail {
    
    inline def apply(confirm: Boolean): TokenizerDialogButtonPressDetail = {
      val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerDialogButtonPressDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizerDialogButtonPressDetail] (val x: Self) extends AnyVal {
      
      inline def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenizerSelectionChangeEventDetail extends StObject {
    
    var tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]
  }
  object TokenizerSelectionChangeEventDetail {
    
    inline def apply(tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): TokenizerSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizerSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTokens(value: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait TokenizerTokenDeleteEventDetail extends StObject {
    
    var tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]
  }
  object TokenizerTokenDeleteEventDetail {
    
    inline def apply(tokens: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): TokenizerTokenDeleteEventDetail = {
      val __obj = js.Dynamic.literal(tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenizerTokenDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenizerTokenDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTokens(value: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenMod.default*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
}
