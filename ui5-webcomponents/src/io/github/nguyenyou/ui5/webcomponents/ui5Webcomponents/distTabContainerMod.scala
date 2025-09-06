package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Element
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Index
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.IndexWidth
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Moveover
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PickAccessibilityAttribut
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Placement
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.IButton
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.TabInOverflow
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.TabInStrip
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabSeparatorMod.TabSeparatorInOverflow
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabSeparatorMod.TabSeparatorInStrip
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`slim-arrow-down`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`slim-arrow-up`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTabContainerMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-tabcontainer` represents a collection of tabs with associated content.
    * Navigation through the tabs changes the content display of the currently active content area.
    * A tab can be labeled with text only, or icons with text.
    *
    * ### Structure
    *
    * The `ui5-tabcontainer` can hold two types of entities:
    *
    * - `ui5-tab` - contains all the information on an item (text and icon)
    * - `ui5-tab-separator` - used to separate tabs with a line
    *
    * ### Hierarchies
    * Multiple sub tabs could be placed underneath one main tab. Nesting allows deeper hierarchies with indentations
    * to indicate the level of each nested tab. When a tab has both sub tabs and own content its click area is split
    * to allow the user to display the content or alternatively to expand / collapse the list of sub tabs.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TabContainer.js";`
    *
    * `import "@ui5/webcomponents/dist/Tab.js";` (for `ui5-tab`)
    *
    * `import "@ui5/webcomponents/dist/TabSeparator.js";` (for `ui5-tab-separator`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart content - Used to style the content of the component
    * @csspart tabstrip - Used to style the tabstrip of the component
    */
  @JSImport("@ui5/webcomponents/dist/TabContainer.js", JSImport.Default)
  @js.native
  open class default () extends TabContainer
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TabContainer.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TabContainer.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def registerTabStyles(styles: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerTabStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * Interface for components that may be slotted inside `ui5-tabcontainer` as items
    *
    * **Note:** Use directly `ui5-tab` or `ui5-tab-seprator`. Implementing the interface does not guarantee that the class can work as a tab.
    * @public
    */
  @js.native
  trait ITab
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def getDomRefInStrip(): js.UndefOr[HTMLElement] = js.native
    
    var isSeparator: Boolean = js.native
    
    var items: js.UndefOr[js.Array[ITab]] = js.native
    
    def receiveOverflowInfo(arg0: TabContainerOverflowInfo): Unit = js.native
    
    def receiveStripInfo(arg0: TabContainerStripInfo): Unit = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-tabcontainer` represents a collection of tabs with associated content.
    * Navigation through the tabs changes the content display of the currently active content area.
    * A tab can be labeled with text only, or icons with text.
    *
    * ### Structure
    *
    * The `ui5-tabcontainer` can hold two types of entities:
    *
    * - `ui5-tab` - contains all the information on an item (text and icon)
    * - `ui5-tab-separator` - used to separate tabs with a line
    *
    * ### Hierarchies
    * Multiple sub tabs could be placed underneath one main tab. Nesting allows deeper hierarchies with indentations
    * to indicate the level of each nested tab. When a tab has both sub tabs and own content its click area is split
    * to allow the user to display the content or alternatively to expand / collapse the list of sub tabs.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TabContainer.js";`
    *
    * `import "@ui5/webcomponents/dist/Tab.js";` (for `ui5-tab`)
    *
    * `import "@ui5/webcomponents/dist/TabSeparator.js";` (for `ui5-tab-separator`)
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart content - Used to style the content of the component
    * @csspart tabstrip - Used to style the tabstrip of the component
    */
  @js.native
  trait TabContainer
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _animationRunning: Boolean = js.native
    
    def _closePopover(): Unit = js.native
    
    var _contentCollapsed: Boolean = js.native
    
    var _endOverflowText: String = js.native
    
    def _findFirstVisibleItem(
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      containerWidth: Double,
      selectedItemWidth: Double
    ): Double = js.native
    def _findFirstVisibleItem(
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      containerWidth: Double,
      selectedItemWidth: Double,
      startIndex: Double
    ): Double = js.native
    
    def _findLastVisibleItem(
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      containerWidth: Double,
      selectedItemWidth: Double
    ): Double = js.native
    def _findLastVisibleItem(
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      containerWidth: Double,
      selectedItemWidth: Double,
      startIndex: Double
    ): Double = js.native
    
    def _findSiblings(tab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default): js.Array[ITab] = js.native
    
    def _findTabInOverflow(realTab: ITab): js.UndefOr[TabSeparatorInOverflow] = js.native
    
    def _flatten(items: js.Array[ITab]): js.Array[ITab] = js.native
    
    def _getEndOverflow(): HTMLElement = js.native
    
    def _getEndOverflowBtnDOM(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    def _getFirstFocusableItemInOverflow(): TabInOverflow = js.native
    
    def _getFocusableRefs(): js.Array[IButton] = js.native
    
    def _getHeader(): HTMLElement = js.native
    
    def _getItemWidth(itemDomRef: HTMLElement): Double = js.native
    
    def _getPopoverItemsFor(targetOwner: TabContainerPopoverOwner): js.Array[ITab] = js.native
    
    def _getPopoverOwner(opener: HTMLElement): TabContainerPopoverOwner = js.native
    
    def _getRootTab(): js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default] = js.native
    def _getRootTab(tab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default): js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default] = js.native
    
    def _getSelectedItemIndexAndWidth(itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip]): IndexWidth = js.native
    def _getSelectedItemIndexAndWidth(itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip], selectedTabDomRef: TabInStrip): IndexWidth = js.native
    
    def _getSelectedTabInOverflow(): TabInOverflow = js.native
    
    def _getStartOverflow(): HTMLElement = js.native
    
    def _getStartOverflowBtnDOM(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    def _getTabStrip(): HTMLElement = js.native
    
    def _getTabs(): js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default] = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    def _hasEndOverflow(
      containerWidth: Double,
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      selectedItemIndexAndWidth: Index
    ): Boolean = js.native
    
    var _hasScheduledPopoverOpen: Boolean = js.native
    
    def _hasStartOverflow(
      containerWidth: Double,
      itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip],
      selectedItemIndexAndWidth: Index
    ): Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _itemsFlat: js.Array[ITab] = js.native
    
    def _moveHeaderItem(tab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default, e: KeyboardEvent): Unit = js.native
    
    def _onDragStart(e: DragEvent): Unit = js.native
    
    def _onHeaderDragEnter(e: DragEvent): Unit = js.native
    
    def _onHeaderDragLeave(e: DragEvent): Unit = js.native
    
    def _onHeaderDragOver(e: DragEvent): Unit = js.native
    def _onHeaderDragOver(e: DragEvent, isLongDragOver: Boolean): Unit = js.native
    
    def _onHeaderDrop(e: DragEvent): Unit = js.native
    
    def _onHeaderFocusin(e: FocusEvent): Unit = js.native
    
    def _onHeaderItemSelect(tab: HTMLElement): Unit = js.native
    
    def _onItemSelect(selectedTabId: String): Unit = js.native
    
    def _onOverflowClick(e: Event): js.Promise[Unit] = js.native
    
    def _onOverflowKeyDown(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _onOverflowListItemClick(e: CustomEvent): js.Promise[Unit] = js.native
    
    def _onPopoverListKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onPopoverListMove(e: CustomEvent): Unit = js.native
    
    def _onPopoverListMoveOver(e: CustomEvent): Unit = js.native
    
    def _onTabExpandButtonClick(e: Event): js.Promise[Unit] = js.native
    
    def _onTabStripClick(e: Event): js.Promise[Unit] = js.native
    
    def _onTabStripKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onTabStripKeyUp(e: KeyboardEvent): Unit = js.native
    
    var _popoverItemsFlat: js.Array[ITab] = js.native
    
    def _respPopover(): js.Promise[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default
      ] = js.native
    
    var _selectedTab: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default] = js.native
    
    def _sendOverflowPresentationInfos(items: js.Array[ITab]): Unit = js.native
    
    def _sendStripPresentationInfos(items: js.Array[ITab]): Unit = js.native
    
    def _setItemsForStrip(): Unit = js.native
    
    def _setPopoverInitialFocus(): Unit = js.native
    
    def _setPopoverItems(items: js.Array[ITab]): Unit = js.native
    
    def _showPopoverAt(opener: HTMLElement): js.Promise[Unit] = js.native
    def _showPopoverAt(opener: HTMLElement, setInitialFocus: Boolean): js.Promise[Unit] = js.native
    def _showPopoverAt(opener: HTMLElement, setInitialFocus: Boolean, preventInitialFocus: Boolean): js.Promise[Unit] = js.native
    def _showPopoverAt(opener: HTMLElement, setInitialFocus: Unit, preventInitialFocus: Boolean): js.Promise[Unit] = js.native
    
    var _startOverflowText: String = js.native
    
    def _togglePopover(opener: HTMLElement): js.Promise[Unit] = js.native
    def _togglePopover(opener: HTMLElement, setInitialFocus: Boolean): js.Promise[Unit] = js.native
    
    def _updateEndOverflow(itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip]): Unit = js.native
    
    def _updateMediaRange(width: Double): Unit = js.native
    
    def _updateOverflowCounters(): Unit = js.native
    
    def _updateStartAndEndOverflow(itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip]): Unit = js.native
    def _updateStartAndEndOverflow(itemsDomRefs: js.Array[TabInStrip | TabSeparatorInStrip], firstVisibleIndex: Double): Unit = js.native
    
    var _width: js.UndefOr[Double] = js.native
    
    def accInvisibleText: String = js.native
    
    /**
      * Returns all slotted tabs and their subTabs in a flattened array.
      * The order of tabs is depth-first.
      *
      * @public
      * @default []
      */
    def allItems: js.Array[ITab] = js.native
    
    /**
      * Defines whether the tab content is collapsed.
      * @default false
      * @public
      */
    var collapsed: Boolean = js.native
    
    /**
      * Sets the background color of the Tab Container's content as `Solid`, `Transparent`, or `Translucent`.
      * @default "Solid"
      * @since 1.10.0
      * @public
      */
    var contentBackgroundDesign: /* template literal string: ${BackgroundDesign} */ String = js.native
    
    def dropIndicatorDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_TabContainer: Moveover = js.native
    
    def hasItems: Boolean = js.native
    
    /**
      * Sets the background color of the Tab Container's header as `Solid`, `Transparent`, or `Translucent`.
      * @default "Solid"
      * @since 1.10.0
      * @public
      */
    var headerBackgroundDesign: /* template literal string: ${BackgroundDesign} */ String = js.native
    
    def isModeStartAndEnd: Boolean = js.native
    
    /**
      * Defines the tabs.
      *
      * **Note:** Use `ui5-tab` and `ui5-tab-separator` for the intended design.
      * @public
      */
    var items: js.Array[ITab] = js.native
    
    /**
      * Defines the current media query size.
      * @private
      */
    var mediaRange: js.UndefOr[String] = js.native
    
    def mixedMode: Boolean = js.native
    
    def nextIconACCName: String = js.native
    
    /**
      * Defines if automatic tab selection is deactivated.
      *
      * **Note:** By default, if none of the child tabs have the `selected` property set, the first tab will be automatically selected.
      * Setting this property to `true` allows preventing this behavior.
      * @default false
      * @public
      * @since 2.9.0
      */
    var noAutoSelection: Boolean = js.native
    
    def overflowBtnAccessibilityAttributes: PickAccessibilityAttribut = js.native
    
    /**
      * Defines the button which will open the overflow menu. If nothing is provided to this slot,
      * the default button will be used.
      * @public
      * @since 1.0.0-rc.9
      */
    var overflowButton: js.Array[IButton] = js.native
    
    def overflowButtonText: String = js.native
    
    def overflowMenuIcon: `slim-arrow-down` | `slim-arrow-up` = js.native
    
    def overflowMenuTitle: String = js.native
    
    /**
      * Defines the overflow mode of the header (the tab strip). If you have a large number of tabs, only the tabs that can fit on screen will be visible.
      * All other tabs that can 't fit on the screen are available in an overflow tab "More".
      *
      * **Note:**
      * Only one overflow at the end would be displayed by default,
      * but when set to `StartAndEnd`, there will be two overflows on both ends, and tab order will not change on tab selection.
      * @default "End"
      * @since 1.1.0
      * @public
      */
    var overflowMode: /* template literal string: ${OverflowMode} */ String = js.native
    
    def popoverCancelButtonText: String = js.native
    
    def previousIconACCName: String = js.native
    
    var responsivePopover: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default
      ] = js.native
    
    /**
      * Fires the `tab-select` event and changes the internal reference for the currently selected tab.
      * If the event is prevented, the current tab is not changed.
      * @private
      * @param selectedTab selected tab instance
      * @param selectedTabIndex selected tab index for an array containing all tabs and sub tabs. **Note:** Use the method `allTabs` to get this array.
      * @returns true if the tab selection is successful, false if it was prevented
      */
    def selectTab(
      selectedTab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default,
      selectedTabIndex: Double
    ): Boolean = js.native
    
    def slideContentDown(element: HTMLElement): js.Promise[Unit | js.Error] = js.native
    
    def slideContentUp(element: HTMLElement): js.Promise[Unit | js.Error] = js.native
    
    def standardTabLayout: Boolean = js.native
    
    /**
      * Defines the button which will open the start overflow menu if available. If nothing is provided to this slot,
      * the default button will be used.
      * @public
      * @since 1.1.0
      */
    var startOverflowButton: js.Array[IButton] = js.native
    
    /**
      * Defines the alignment of the content and the `additionalText` of a tab.
      *
      * **Note:**
      * The content and the `additionalText` would be displayed vertically by default,
      * but when set to `Inline`, they would be displayed horizontally.
      * @default "Standard"
      * @public
      */
    var tabLayout: /* template literal string: ${TabLayout} */ String = js.native
    
    def tablistAriaDescribedById: js.UndefOr[String] = js.native
    
    def tabsAtTheBottom: Boolean = js.native
    
    /**
      * Defines the placement of the tab strip relative to the actual tabs' content.
      *
      * **Note:** By default the tab strip is displayed above the tabs' content area and this is the recommended
      * layout for most scenarios. Set to `Bottom` only when the component is at the
      * bottom of the page and you want the tab strip to act as a menu.
      * @default "Top"
      * @since 1.0.0-rc.7
      * @private
      */
    var tabsPlacement: /* template literal string: ${TabContainerTabsPlacement} */ String = js.native
    
    def textOnly: Boolean = js.native
    
    def withAdditionalText: Boolean = js.native
  }
  
  trait TabContainerMoveEventDetail extends StObject {
    
    var destination: Placement
    
    var source: Element
  }
  object TabContainerMoveEventDetail {
    
    inline def apply(destination: Placement, source: Element): TabContainerMoveEventDetail = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContainerMoveEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainerMoveEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: Placement): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait TabContainerOverflowInfo extends StObject {
    
    def getElementInOverflow(): js.UndefOr[HTMLElement]
    
    var style: Record[String, Any]
  }
  object TabContainerOverflowInfo {
    
    inline def apply(getElementInOverflow: () => js.UndefOr[HTMLElement], style: Record[String, Any]): TabContainerOverflowInfo = {
      val __obj = js.Dynamic.literal(getElementInOverflow = js.Any.fromFunction0(getElementInOverflow), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContainerOverflowInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainerOverflowInfo] (val x: Self) extends AnyVal {
      
      inline def setGetElementInOverflow(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "getElementInOverflow", js.Any.fromFunction0(value))
      
      inline def setStyle(value: Record[String, Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.`start-overflow`
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.ui5WebcomponentsStrings.`end-overflow`
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distTabMod.TabInStrip
  */
  trait TabContainerPopoverOwner extends StObject
  
  trait TabContainerStripInfo extends StObject {
    
    def getElementInStrip(): js.UndefOr[HTMLElement]
    
    var isInline: js.UndefOr[Boolean] = js.undefined
    
    var isTopLevelTab: js.UndefOr[Boolean] = js.undefined
    
    var mixedMode: js.UndefOr[Boolean] = js.undefined
    
    var posinset: js.UndefOr[Double] = js.undefined
    
    var setsize: js.UndefOr[Double] = js.undefined
  }
  object TabContainerStripInfo {
    
    inline def apply(getElementInStrip: () => js.UndefOr[HTMLElement]): TabContainerStripInfo = {
      val __obj = js.Dynamic.literal(getElementInStrip = js.Any.fromFunction0(getElementInStrip))
      __obj.asInstanceOf[TabContainerStripInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainerStripInfo] (val x: Self) extends AnyVal {
      
      inline def setGetElementInStrip(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "getElementInStrip", js.Any.fromFunction0(value))
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setIsInlineUndefined: Self = StObject.set(x, "isInline", js.undefined)
      
      inline def setIsTopLevelTab(value: Boolean): Self = StObject.set(x, "isTopLevelTab", value.asInstanceOf[js.Any])
      
      inline def setIsTopLevelTabUndefined: Self = StObject.set(x, "isTopLevelTab", js.undefined)
      
      inline def setMixedMode(value: Boolean): Self = StObject.set(x, "mixedMode", value.asInstanceOf[js.Any])
      
      inline def setMixedModeUndefined: Self = StObject.set(x, "mixedMode", js.undefined)
      
      inline def setPosinset(value: Double): Self = StObject.set(x, "posinset", value.asInstanceOf[js.Any])
      
      inline def setPosinsetUndefined: Self = StObject.set(x, "posinset", js.undefined)
      
      inline def setSetsize(value: Double): Self = StObject.set(x, "setsize", value.asInstanceOf[js.Any])
      
      inline def setSetsizeUndefined: Self = StObject.set(x, "setsize", js.undefined)
    }
  }
  
  trait TabContainerTabSelectEventDetail extends StObject {
    
    var tab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default
    
    var tabIndex: Double
  }
  object TabContainerTabSelectEventDetail {
    
    inline def apply(tab: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default, tabIndex: Double): TabContainerTabSelectEventDetail = {
      val __obj = js.Dynamic.literal(tab = tab.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabContainerTabSelectEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabContainerTabSelectEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTab(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabMod.default): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    }
  }
}
