package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserver
import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserverEntry
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Itemclose
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Name
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.list
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.listbox
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.menu
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.tree
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilDragAndDropDragRegistryMod.MoveEventDetail
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-list` component allows displaying a list of items, advanced keyboard
    * handling support for navigating between items, and predefined modes to improve the development efficiency.
    *
    * The `ui5-list` is a container for the available list items:
    *
    * - `ui5-li`
    * - `ui5-li-custom`
    * - `ui5-li-group`
    *
    * To benefit from the built-in selection mechanism, you can use the available
    * selection modes, such as
    * `Single`, `Multiple` and `Delete`.
    *
    * Additionally, the `ui5-list` provides header, footer, and customization for the list item separators.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-list` provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Up] or [Down] - Navigates up and down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete),
    * when the `selectionMode` property is in use:
    *
    * - [Space] - Select an item (if `type` is 'Active') when `selectionMode` is selection
    * - [Delete] - Delete an item if `selectionMode` property is `Delete`
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/List.js";`
    *
    * `import "@ui5/webcomponents/dist/ListItemStandard.js";` (for `ui5-li`)
    *
    * `import "@ui5/webcomponents/dist/ListItemCustom.js";` (for `ui5-li-custom`)
    *
    * `import "@ui5/webcomponents/dist/ListItemGroup.js";` (for `ui5-li-group`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart growing-button - Used to style the button, that is used for growing of the component
    * @csspart growing-button-inner - Used to style the button inner element
    */
  @JSImport("@ui5/webcomponents/dist/List.js", JSImport.Default)
  @js.native
  open class default ()
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListMod.List
  object default {
    
    @JSImport("@ui5/webcomponents/dist/List.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/List.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-list` component allows displaying a list of items, advanced keyboard
    * handling support for navigating between items, and predefined modes to improve the development efficiency.
    *
    * The `ui5-list` is a container for the available list items:
    *
    * - `ui5-li`
    * - `ui5-li-custom`
    * - `ui5-li-group`
    *
    * To benefit from the built-in selection mechanism, you can use the available
    * selection modes, such as
    * `Single`, `Multiple` and `Delete`.
    *
    * Additionally, the `ui5-list` provides header, footer, and customization for the list item separators.
    *
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * The `ui5-list` provides advanced keyboard handling.
    * When a list is focused the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Up] or [Down] - Navigates up and down the items
    * - [Home] - Navigates to first item
    * - [End] - Navigates to the last item
    *
    * The user can use the following keyboard shortcuts to perform actions (such as select, delete),
    * when the `selectionMode` property is in use:
    *
    * - [Space] - Select an item (if `type` is 'Active') when `selectionMode` is selection
    * - [Delete] - Delete an item if `selectionMode` property is `Delete`
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/List.js";`
    *
    * `import "@ui5/webcomponents/dist/ListItemStandard.js";` (for `ui5-li`)
    *
    * `import "@ui5/webcomponents/dist/ListItemCustom.js";` (for `ui5-li-custom`)
    *
    * `import "@ui5/webcomponents/dist/ListItemGroup.js";` (for `ui5-li-group`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart growing-button - Used to style the button, that is used for growing of the component
    * @csspart growing-button-inner - Used to style the button inner element
    */
  @js.native
  trait List
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _afterElement: js.UndefOr[HTMLElement | Null] = js.native
    
    /**
      * Constantly updated value of texts collected from the associated labels
      * @private
      */
    var _associatedDescriptionRefTexts: js.UndefOr[String] = js.native
    
    /**
      * Constantly updated value of texts collected from the associated labels
      * @private
      */
    var _associatedLabelsRefTexts: js.UndefOr[String] = js.native
    
    var _beforeElement: js.UndefOr[HTMLElement | Null] = js.native
    
    var _dragAndDropHandler: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDelegateDragAndDropHandlerMod.default = js.native
    
    var _forwardingFocus: Boolean = js.native
    
    def _getDescriptionForGroups(): String = js.native
    
    var _groupCount: Double = js.native
    
    var _groupItemCount: Double = js.native
    
    def _growingButtonText: String = js.native
    
    def _handleDown(): Unit = js.native
    
    def _handleEnd(): Unit = js.native
    
    def _handleHome(): Unit = js.native
    
    def _handleLodeMoreUp(e: KeyboardEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeCallback(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeCallback")
    var _handleResizeCallback_Original: ResizeObserverCallback = js.native
    
    def _handleTabNext(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines if the entire list is in view port.
      * @private
      */
    var _inViewport: Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    /**
      * Defines the active state of the `More` button.
      * @private
      */
    var _loadMoreActive: Boolean = js.native
    
    def _moveItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default,
      e: KeyboardEvent
    ): Unit = js.native
    
    def _onLoadMoreClick(): Unit = js.native
    
    def _onLoadMoreKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreMousedown(): Unit = js.native
    
    def _onLoadMoreMouseup(): Unit = js.native
    
    def _ondragenter(e: DragEvent): Unit = js.native
    
    def _ondragleave(e: DragEvent): Unit = js.native
    
    def _ondragover(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _previouslyFocusedItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    def _revertSelection(
      previouslySelectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
        ]
    ): Unit = js.native
    
    var _selectionRequested: js.UndefOr[Boolean] = js.native
    
    def _shouldFocusGrowingButton(): Unit = js.native
    
    def _updateAssociatedLabelsTexts(): Unit = js.native
    
    /**
      * Defines additional accessibility attributes on different areas of the component.
      *
      * The accessibilityAttributes object has the following field:
      *
      *  - **growingButton**: `growingButton.name`.
      *
      * The accessibility attributes support the following values:
      *
      * - **name**: Defines the accessible ARIA name of the growing button.
      * Accepts any string.
      *
      * **Note:** The `accessibilityAttributes` property is in an experimental state and is a subject to change.
      * @default {}
      * @public
      * @since 2.13.0
      */
    var accessibilityAttributes: ListAccessibilityAttributes = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that describe the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescriptionRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible role of the component.
      * @public
      * @default "List"
      * @since 1.0.0-rc.15
      */
    var accessibleRole: /* template literal string: ${ListAccessibleRole} */ String = js.native
    
    def ariaDescriptionText: String = js.native
    
    def ariaLabelModeText: String = js.native
    
    def ariaLabelTxt: js.UndefOr[String] = js.native
    
    def ariaLabelledBy: js.UndefOr[String] = js.native
    
    def attachGroupHeaderEvents(): Unit = js.native
    
    def checkListInViewport(): Unit = js.native
    
    def deselectSelectedItems(): Unit = js.native
    
    def detachGroupHeaderEvents(): Unit = js.native
    
    def dropIndicatorDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_List: Itemclose = js.native
    
    def focusAfterElement(): Unit = js.native
    
    def focusBeforeElement(): Unit = js.native
    
    /**
      * Focuses the first list item and sets its tabindex to "0" via the ItemNavigation
      * @protected
      */
    def focusFirstItem(): Unit = js.native
    
    def focusFirstSelectedItem(): Unit = js.native
    
    def focusGrowingButton(): Unit = js.native
    
    /**
      * Focuses a list item and sets its tabindex to "0" via the ItemNavigation
      * @protected
      * @param item
      */
    def focusItem(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Unit = js.native
    
    def focusPreviouslyFocusedItem(): Unit = js.native
    
    /**
      * Defines the footer text.
      * @default undefined
      * @public
      */
    var footerText: js.UndefOr[String] = js.native
    
    def getAfterElement(): HTMLElement = js.native
    
    def getBeforeElement(): HTMLElement = js.native
    
    def getEnabledItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    def getFirstItem(
      filter: js.Function1[
          /* item */ io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default, 
          Boolean
        ]
    ): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    def getForwardingFocus(): Boolean = js.native
    
    def getGrowingButton(): HTMLElement = js.native
    
    def getIntersectionObserver(): IntersectionObserver = js.native
    
    def getItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    def getItemsForProcessing(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    def getPreviouslyFocusedItem(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default | Null = js.native
    
    def getSelectedItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    /**
      * Defines whether the component will have growing capability either by pressing a `More` button,
      * or via user scroll. In both cases `load-more` event is fired.
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer,
      * on IE the component will fallback to `growing="Button"`.
      * @default "None"
      * @since 1.0.0-rc.13
      * @public
      */
    var growing: /* template literal string: ${ListGrowingMode} */ String = js.native
    
    def growingButtonAriaLabel: js.UndefOr[String] = js.native
    
    def growingButtonAriaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * Defines the text that will be displayed inside the growing button.
      *
      * **Note:** If not specified a built-in text will be displayed.
      *
      * **Note:** This property takes effect if the `growing` property is set to the `Button`.
      * @default undefined
      * @since 1.24
      * @public
      */
    var growingButtonText: js.UndefOr[String] = js.native
    
    var growingIntersectionObserver: js.UndefOr[IntersectionObserver | Null] = js.native
    
    def grows: Boolean = js.native
    
    def growsOnScroll: Boolean = js.native
    
    def growsWithButton: Boolean = js.native
    
    def handleDelete(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleMultiple(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default,
      selected: Boolean
    ): Boolean = js.native
    
    def handleSingle(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleAuto(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleEnd(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def handleSingleStart(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Boolean = js.native
    
    def hasData: Boolean = js.native
    
    def hasGrowingComponent(): Boolean = js.native
    
    /**
      * Defines the component header.
      *
      * **Note:** When `header` is set, the
      * `headerText` property is ignored.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    def headerID: String = js.native
    
    /**
      * Defines the component header text.
      *
      * **Note:** If `header` is set this property is ignored.
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Determines whether the component is indented.
      * @default false
      * @public
      */
    var indent: Boolean = js.native
    
    var initialIntersection: Boolean = js.native
    
    def isDelete: Boolean = js.native
    
    def isForwardAfterElement(element: HTMLElement): Boolean = js.native
    
    def isForwardElement(element: HTMLElement): Boolean = js.native
    
    def isMultiple: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    /**
      * Defines the items of the component.
      *
      * **Note:** Use `ui5-li`, `ui5-li-custom`, and `ui5-li-group` for the intended design.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupMod.default
      ] = js.native
    
    def listAccessibleRole: menu | list | listbox | tree = js.native
    
    def listEndDOM: Element | Null = js.native
    
    var listEndObserved: Boolean = js.native
    
    /**
      * Returns an array containing the list item instances without the groups in a flat structure.
      * @default []
      * @since 2.0.0
      * @public
      */
    def listItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ] = js.native
    
    def loadMore(): Unit = js.native
    
    /**
      * Defines if the component would display a loading indicator over the list.
      * @default false
      * @public
      * @since 1.0.0-rc.6
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the loading indicator will show up for this component.
      * @default 1000
      * @public
      */
    var loadingDelay: Double = js.native
    
    /**
      * Defines the current media query size.
      * @default "S"
      * @private
      */
    var mediaRange: String = js.native
    
    def modeLabelID: String = js.native
    
    /**
      * Defines the text that is displayed when the component contains no items.
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
    
    def observeListEnd(): js.Promise[Unit] = js.native
    
    def onFocusRequested(e: CustomEvent): Unit = js.native
    
    def onForwardAfter(e: CustomEvent): Unit = js.native
    
    def onForwardAfterBound(e: CustomEvent): Unit = js.native
    
    def onForwardBefore(e: CustomEvent): Unit = js.native
    
    def onForwardBeforeBound(e: CustomEvent): Unit = js.native
    
    def onInteresection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    def onItemClose(e: CustomEvent): Unit = js.native
    
    def onItemFocused(e: CustomEvent): Unit = js.native
    
    def onItemFocusedBound(e: CustomEvent): Unit = js.native
    
    def onItemPress(e: CustomEvent): Unit = js.native
    
    def onItemTabIndexChange(e: CustomEvent): Unit = js.native
    
    def onItemTabIndexChangeBound(e: CustomEvent): Unit = js.native
    
    def onItemToggle(e: CustomEvent): Unit = js.native
    
    def onSelectionRequested(e: CustomEvent): Unit = js.native
    
    def prepareListItems(): Unit = js.native
    
    def scrollContainer: HTMLElement | Null = js.native
    
    /**
      * Defines the selection mode of the component.
      * @default "None"
      * @public
      */
    var selectionMode: /* template literal string: ${ListSelectionMode} */ String = js.native
    
    /**
      * Defines the item separator style that is used.
      * @default "All"
      * @public
      */
    var separators: /* template literal string: ${ListSeparator} */ String = js.native
    
    def setForwardingFocus(forwardingFocus: Boolean): Unit = js.native
    
    def setPreviouslyFocusedItem(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Unit = js.native
    
    def shouldRenderH1: js.UndefOr[String | `false`] = js.native
    
    def showBusyIndicatorOverlay: Boolean = js.native
    
    def showNoDataText: js.UndefOr[String | `false`] = js.native
    
    def unobserveListEnd(): Unit = js.native
  }
  
  trait ListAccessibilityAttributes extends StObject {
    
    var growingButton: js.UndefOr[Name] = js.undefined
  }
  object ListAccessibilityAttributes {
    
    inline def apply(): ListAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setGrowingButton(value: Name): Self = StObject.set(x, "growingButton", value.asInstanceOf[js.Any])
      
      inline def setGrowingButtonUndefined: Self = StObject.set(x, "growingButton", js.undefined)
    }
  }
  
  trait ListItemClickEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListItemClickEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): ListItemClickEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemCloseEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListItemCloseEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): ListItemCloseEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemDeleteEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListItemDeleteEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): ListItemDeleteEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemDeleteEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemDeleteEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemFocusEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListItemFocusEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): ListItemFocusEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemFocusEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemFocusEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait ListItemToggleEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListItemToggleEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): ListItemToggleEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemToggleEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemToggleEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type ListMoveEventDetail = MoveEventDetail
  
  trait ListSelectionChangeEventDetail extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
    
    var previouslySelectedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ]
    
    var selectedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
      ]
    
    var selectionComponentPressed: Boolean
    
    var targetItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  }
  object ListSelectionChangeEventDetail {
    
    inline def apply(
      previouslySelectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
        ],
      selectedItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
        ],
      selectionComponentPressed: Boolean,
      targetItem: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
    ): ListSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(previouslySelectedItems = previouslySelectedItems.asInstanceOf[js.Any], selectedItems = selectedItems.asInstanceOf[js.Any], selectionComponentPressed = selectionComponentPressed.asInstanceOf[js.Any], targetItem = targetItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPreviouslySelectedItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
            ]
      ): Self = StObject.set(x, "previouslySelectedItems", value.asInstanceOf[js.Any])
      
      inline def setPreviouslySelectedItemsVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default*): Self = StObject.set(x, "previouslySelectedItems", js.Array(value*))
      
      inline def setSelectedItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
            ]
      ): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default*): Self = StObject.set(x, "selectedItems", js.Array(value*))
      
      inline def setSelectionComponentPressed(value: Boolean): Self = StObject.set(x, "selectionComponentPressed", value.asInstanceOf[js.Any])
      
      inline def setTargetItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "targetItem", value.asInstanceOf[js.Any])
    }
  }
}
