package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.IButton
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Branding
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ContentInfo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Contentitemvisibilitychange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.SearchField
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.group
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.link
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.toolbar
import org.scalajs.dom.CSSStyleDeclaration
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @class
  * ### Overview
  *
  * The `ui5-shellbar` is meant to serve as an application header
  * and includes numerous built-in features, such as: logo, profile image/icon, title, search field, notifications and so on.
  *
  * ### Stable DOM Refs
  *
  * You can use the following stable DOM refs for the `ui5-shellbar`:
  *
  * - logo
  * - notifications
  * - overflow
  * - profile
  * - product-switch
  *
  * ### Keyboard Handling
  *
  * #### Fast Navigation
  * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
  * In order to use this functionality, you need to import the following module:
  * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
  *
  * ### ES6 Module Import
  * `import "@ui5/webcomponents-fiori/dist/ShellBar.js";`
  * @csspart root - Used to style the outermost wrapper of the `ui5-shellbar`
  * @constructor
  * @extends UI5Element
  * @public
  * @since 0.8.0
  */
@js.native
trait ShellBar
  extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
  
  /* private */ var _allowChildNavigation: Any = js.native
  
  /* private */ var _allowInputNavigation: Any = js.native
  
  def _attachSearchFieldListeners(): Unit = js.native
  def _attachSearchFieldListeners(searchField: HTMLElement): Unit = js.native
  
  var _autoRestoreSearchField: Boolean = js.native
  
  def _brandingText: js.UndefOr[String] = js.native
  
  var _cachedHiddenContent: js.Array[HTMLElement] = js.native
  
  def _calculateCSSREMValue(styleSet: CSSStyleDeclaration, propertyName: String): Double = js.native
  
  def _cancelBtnText: String = js.native
  
  var _contentInfo: js.Array[IShellBarContentItem] = js.native
  
  def _contentItemsRole: js.UndefOr[group] = js.native
  
  def _contentItemsText: js.UndefOr[String] = js.native
  
  var _defaultItemPressPrevented: Boolean = js.native
  
  def _detachSearchFieldListeners(): Unit = js.native
  def _detachSearchFieldListeners(searchField: HTMLElement): Unit = js.native
  
  def _enableContentAreaAccessibility: Boolean = js.native
  
  def _fireContentItemVisibilityChangeEvent(): Unit = js.native
  
  def _focusNextItem(items: js.Array[HTMLElement], currentIndex: Double): Unit = js.native
  
  def _focusPreviousItem(items: js.Array[HTMLElement], currentIndex: Double): Unit = js.native
  
  def _getContentInfo(): js.Array[IShellBarContentItem] = js.native
  
  /**
    * Returns all items that will be placed in the right of the bar as icons / dom elements.
    */
  def _getItemsInfo(): js.Array[IShelBarItemInfo] = js.native
  
  def _getMenuPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
  
  def _getOverflowPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
  
  def _getRightChildItems(): js.Array[HTMLElement] = js.native
  
  def _handleActionListClick(): js.Promise[Unit] = js.native
  
  def _handleActionsOverflow(): ContentInfo = js.native
  
  def _handleBarBreakpoints(): Unit = js.native
  
  def _handleCancelButtonPress(): Unit = js.native
  
  @JSName("_handleCustomActionPress")
  def _handleCustomActionPress_click(
    e: UI5CustomEvent[
      io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
      click
    ]
  ): Unit = js.native
  
  @JSName("_handleNotificationsPress")
  def _handleNotificationsPress_click(
    e: UI5CustomEvent[
      io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
      click
    ]
  ): Unit = js.native
  
  def _handleOverflowPress(): Unit = js.native
  
  @JSName("_handleProductSwitchPress")
  def _handleProductSwitchPress_click(
    e: UI5CustomEvent[
      io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
      click
    ]
  ): Unit = js.native
  
  def _handleProfilePress(): Unit = js.native
  
  def _handleResize(): js.Promise[Unit] | Unit = js.native
  @JSName("_handleResize")
  var _handleResize_Original: ResizeObserverCallback = js.native
  
  def _handleSearchIconPress(): Unit = js.native
  
  def _headerPress(): Unit = js.native
  
  var _hiddenIcons: js.Array[IShelBarItemInfo] = js.native
  
  def _hideItems(items: js.Array[IShellBarHidableItem]): js.Array[IShellBarHidableItem] = js.native
  
  var _isInitialRendering: Boolean = js.native
  
  def _isVisible(element: HTMLElement): Boolean = js.native
  
  var _itemsInfo: js.Array[IShelBarItemInfo] = js.native
  
  var _lastOffsetWidth: Double = js.native
  
  def _logoAreaText: String = js.native
  
  def _logoKeydown(e: KeyboardEvent): Unit = js.native
  
  def _logoKeyup(e: KeyboardEvent): Unit = js.native
  
  def _logoPress(): Unit = js.native
  
  def _logoText: String = js.native
  
  def _menuItemPress(e: CustomEvent): Unit = js.native
  
  def _menuPopoverAfterClose(): Unit = js.native
  
  def _menuPopoverBeforeOpen(): Unit = js.native
  
  var _menuPopoverExpanded: Boolean = js.native
  
  def _notificationsText: String = js.native
  
  var _observableContent: js.Array[HTMLElement] = js.native
  
  def _observeContentItems(): Unit = js.native
  
  def _onKeyDown(e: KeyboardEvent): Unit = js.native
  
  def _onSearch(e: Event): Unit = js.native
  
  def _onSearchBound(e: Event): Unit = js.native
  
  def _onSearchClose(e: Event): Unit = js.native
  
  def _onSearchCloseBound(e: Event): Unit = js.native
  
  def _onSearchOpen(e: Event): Unit = js.native
  
  def _onSearchOpenBound(e: Event): Unit = js.native
  
  def _overflowActions(): Unit = js.native
  
  var _overflowNotifications: String | Null = js.native
  
  def _overflowPopoverAfterClose(): Unit = js.native
  
  def _overflowPopoverBeforeOpen(): Unit = js.native
  
  var _overflowPopoverExpanded: Boolean = js.native
  
  def _overflowText: String = js.native
  
  def _productSwitchBtnText: String = js.native
  
  def _productsText: String = js.native
  
  def _profileText: String = js.native
  
  def _resetItemsVisibility(items: js.Array[HTMLElement]): Unit = js.native
  
  def _rightChildRole: js.UndefOr[toolbar] = js.native
  
  def _searchBtnOpen: String = js.native
  
  def _searchFieldDescription: String = js.native
  
  def _searchFieldText: String = js.native
  
  def _searchText: String = js.native
  
  def _shellbarText: String = js.native
  
  def _toggleActionPopover(): Unit = js.native
  
  def _updateContentInfo(newContentInfo: js.Array[IShellBarContentItem]): Unit = js.native
  
  def _updateItemsInfo(newItemsInfo: js.Array[IShelBarItemInfo]): Unit = js.native
  
  def _updateOverflowNotifications(): Unit = js.native
  
  def _updateSearchFieldState(): Unit = js.native
  
  def accInfo: Branding = js.native
  
  def accLogoRole: link | button = js.native
  
  /**
    * Defines additional accessibility attributes on different areas of the component.
    *
    * The accessibilityAttributes object has the following fields,
    * where each field is an object supporting one or more accessibility attributes:
    *
    * - **logo** - `logo.role` and `logo.name`.
    * - **notifications** - `notifications.expanded` and `notifications.hasPopup`.
    * - **profile** - `profile.expanded`, `profile.hasPopup` and `profile.name`.
    * - **product** - `product.expanded` and `product.hasPopup`.
    * - **search** - `search.hasPopup`.
    * - **overflow** - `overflow.expanded` and `overflow.hasPopup`.
    * - **branding** - `branding.name`.
    *
    * The accessibility attributes support the following values:
    *
    * - **role**: Defines the accessible ARIA role of the logo area.
    * Accepts the following string values: `button` or `link`.
    *
    * - **expanded**: Indicates whether the button, or another grouping element it controls,
    * is currently expanded or collapsed.
    * Accepts the following string values: `true` or `false`.
    *
    * - **hasPopup**: Indicates the availability and type of interactive popup element,
    * such as menu or dialog, that can be triggered by the button.
    *
    * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
    * - **name**: Defines the accessible ARIA name of the area.
    * Accepts any string.
    *
    * @default {}
    * @public
    * @since 1.10.0
    */
  var accessibilityAttributes: ShellBarAccessibilityAttributes = js.native
  
  /**
    * Defines the assistant slot.
    *
    * @since 2.0.0
    * @public
    */
  var assistant: js.Array[IButton] = js.native
  
  def autoSearchField: Boolean = js.native
  
  /**
    * Defines the branding slot.
    * The `ui5-shellbar-branding` component is intended to be placed inside this slot.
    * Content placed here takes precedence over the `primaryTitle` property and the `logo` content slot.
    *
    * **Note:** The `branding` slot is in an experimental state and is a subject to change.
    *
    * @since 2.12.0
    * @public
    */
  var branding: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarBrandingMod.default
  ] = js.native
  
  /**
    * @private
    */
  var breakpointSize: String = js.native
  
  /**
    * Closes the overflow area.
    * Useful to manually close the overflow after having suppressed automatic closing with preventDefault() of ShellbarItem's press event
    * @public
    */
  def closeOverflow(): Unit = js.native
  
  /**
    * Define the items displayed in the content area.
    *
    * Use the `data-hide-order` attribute with numeric value to specify the order of the items to be hidden when the space is not enough.
    * Lower values will be hidden first.
    *
    * **Note:** The `content` slot is in an experimental state and is a subject to change.
    *
    * @public
    * @since 2.7.0
    */
  var content: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ] = js.native
  
  def contentItems: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ] = js.native
  
  def contentItemsHidden: js.Array[HTMLElement] = js.native
  
  var contentItemsObserver: MutationObserver = js.native
  
  def contentItemsSorted: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ] = js.native
  
  def contentItemsWrappersSorted: js.Array[HTMLElement] = js.native
  
  def customItemsInfo: js.Array[IShelBarItemInfo] = js.native
  
  /**
    * Disables the automatic search field expansion/collapse when the available space is not enough.
    *
    * **Note:** The `disableSearchCollapse` property is in an experimental state and is a subject to change.
    * @default false
    * @public
    */
  var disableSearchCollapse: Boolean = js.native
  
  def domCalculatedValues(cssVar: String): Double = js.native
  
  def endContent: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ] = js.native
  
  def endContentInfoSorted: js.Array[IShellBarContentItem] = js.native
  
  @JSName("eventDetails")
  var eventDetails_ShellBar: Contentitemvisibilitychange = js.native
  
  /**
    * Returns the `search` icon DOM ref.
    * @returns The search icon DOM ref
    * @public
    * @since 2.10.0
    */
  def getSearchButtonDomRef(): js.Promise[HTMLElement | Null] = js.native
  
  def hasAssistant: Boolean = js.native
  
  def hasBranding: Boolean = js.native
  
  def hasContentItems: Boolean = js.native
  
  def hasLogo: Boolean = js.native
  
  def hasMatchingContent: Boolean = js.native
  
  def hasMenuItems: Boolean = js.native
  
  def hasMidContent: Boolean = js.native
  
  def hasProfile: Boolean = js.native
  
  def hasSearchField: Boolean = js.native
  
  def hasSelfCollapsibleSearch: Boolean = js.native
  
  def hidableDomElements: js.Array[HTMLElement] = js.native
  
  /**
    * Defines the visibility state of the search button.
    *
    * **Note:** The `hideSearchButton` property is in an experimental state and is a subject to change.
    * @default false
    * @public
    */
  var hideSearchButton: Boolean = js.native
  
  def imageBtnText: js.UndefOr[String] = js.native
  
  def isIconHidden(name: String): Boolean = js.native
  
  def isSBreakPoint: Boolean = js.native
  
  /**
    * Defines the `ui5-shellbar` additional items.
    *
    * **Note:**
    * You can use the `<ui5-shellbar-item></ui5-shellbar-item>`.
    * @public
    */
  var items: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarItemMod.default
  ] = js.native
  
  /**
    * Defines the logo of the `ui5-shellbar`.
    * For example, you can use `ui5-avatar` or `img` elements as logo.
    * @since 1.0.0-rc.8
    * @public
    */
  var logo: js.Array[HTMLElement] = js.native
  
  /**
    * Returns the `logo` DOM ref.
    * @public
    * @default null
    * @since 1.0.0-rc.16
    */
  def logoDomRef: HTMLElement | Null = js.native
  
  /**
    * Defines the items displayed in menu after a click on a start button.
    *
    * **Note:** You can use the  `<ui5-li></ui5-li>` and its ancestors.
    * @since 0.10
    * @public
    */
  var menuItems: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
  ] = js.native
  
  var menuPopover: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default | Null
  ] = js.native
  
  /**
    * The container is positioned in the center of the `ui5-shellbar` and occupies one-third of the total length of the `ui5-shellbar`.
    *
    * **Note:** If set, the `searchField` slot is not rendered.
    * @private
    */
  var midContent: js.Array[HTMLElement] = js.native
  
  /**
    * Defines the `notificationsCount`,
    * displayed in the notification icon top-right corner.
    * @default undefined
    * @public
    */
  var notificationsCount: js.UndefOr[String] = js.native
  
  /**
    * Returns the `notifications` icon DOM ref.
    * @public
    * @default null
    * @since 1.0.0-rc.16
    */
  def notificationsDomRef: HTMLElement | Null = js.native
  
  def onInitialRendering(): js.Promise[Unit] = js.native
  
  /**
    * Returns the `overflow` icon DOM ref.
    * @public
    * @default null
    * @since 1.0.0-rc.16
    */
  def overflowDomRef: HTMLElement | Null = js.native
  
  def overflowInner: HTMLElement | Null = js.native
  
  var overflowPopover: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default | Null
  ] = js.native
  
  def overflowWrapper: HTMLElement | Null = js.native
  
  def overflowed: Boolean = js.native
  
  def popoverHorizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
  
  /**
    * Defines the `primaryTitle`.
    *
    * **Note:** The `primaryTitle` would be hidden on S screen size (less than approx. 700px).
    * @default undefined
    * @public
    */
  var primaryTitle: js.UndefOr[String] = js.native
  
  /**
    * Returns the `product-switch` icon DOM ref.
    * @public
    * @default null
    * @since 1.0.0-rc.16
    */
  def productSwitchDomRef: HTMLElement | Null = js.native
  
  /**
    * You can pass `ui5-avatar` to set the profile image/icon.
    * If no profile slot is set - profile will be excluded from actions.
    *
    * **Note:** We recommend not using the `size` attribute of `ui5-avatar` because
    * it should have specific size by design in the context of `ui5-shellbar` profile.
    * @since 1.0.0-rc.6
    * @public
    */
  var profile: js.Array[HTMLElement] = js.native
  
  /**
    * Returns the `profile` icon DOM ref.
    * @public
    * @default null
    * @since 1.0.0-rc.16
    */
  def profileDomRef: HTMLElement | Null = js.native
  
  def search: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null = js.native
  
  /**
    * Defines the `ui5-input`, that will be used as a search field.
    * @public
    */
  var searchField: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default] = js.native
  
  /**
    * Defines the `secondaryTitle`.
    *
    * **Note:** The `secondaryTitle` would be hidden on S and M screen sizes (less than approx. 1300px).
    * @default undefined
    * @public
    */
  var secondaryTitle: js.UndefOr[String] = js.native
  
  /**
    * Use this method to change the state of the search filed according to internal logic.
    * An event is fired to notify the change.
    */
  def setSearchState(expanded: Boolean): js.Promise[Unit] = js.native
  
  def shouldIncludeSeparator(itemInfo: IShellBarContentItem, contentInfo: js.Array[IShellBarContentItem]): Boolean = js.native
  def shouldIncludeSeparator(itemInfo: Unit, contentInfo: js.Array[IShellBarContentItem]): Boolean = js.native
  
  def showEndSeparator: Boolean = js.native
  
  var showFullWidthSearch: Boolean = js.native
  
  def showLogoInMenuButton: Boolean = js.native
  
  def showMenuButton: String | Boolean = js.native
  
  /**
    * Defines, if the notification icon would be displayed.
    * @default false
    * @public
    */
  var showNotifications: Boolean = js.native
  
  /**
    * Defines, if the product switch icon would be displayed.
    * @default false
    * @public
    */
  var showProductSwitch: Boolean = js.native
  
  /**
    * Defines, if the Search Field would be displayed when there is a valid `searchField` slot.
    *
    * **Note:** By default the Search Field is not displayed.
    * @default false
    * @public
    */
  var showSearchField: Boolean = js.native
  
  def showStartSeparator: Boolean = js.native
  
  def showTitleInMenuButton: js.UndefOr[Boolean | _empty] = js.native
  
  /**
    * Defines a `ui5-button` in the bar that will be placed in the beginning.
    * We encourage this slot to be used for a menu button.
    * It gets overstyled to match ShellBar's styling.
    * @public
    */
  var startButton: js.Array[IButton] = js.native
  
  def startContent: js.Array[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
  ] = js.native
  
  def startContentInfoSorted: js.Array[IShellBarContentItem] = js.native
  
  def styles: SearchField = js.native
  
  /**
    * @private
    */
  var withLogo: Boolean = js.native
}
