package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.HTMLElementassociatedItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Selectionchange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.none
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.PointerEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `SideNavigation` is used as a standard menu in applications.
    * It consists of three containers: header (top-aligned), main navigation section (top-aligned) and the secondary section (bottom-aligned).
    *
    *  - The header is meant for displaying user related information - profile data, avatar, etc.
    *  - The main navigation section is related to the user’s current work context
    *  - The secondary section is mostly used to link additional information that may be of interest (legal information, developer communities, external help, contact information and so on).
    *
    * ### Usage
    *
    * Use the available `ui5-side-navigation-group`, `ui5-side-navigation-item`
    * and `ui5-side-navigation-sub-item` components to build your menu.
    * The items can consist of text only or an icon with text. The use or non-use of icons must be consistent for all items on one level.
    * You must not combine entries with and without icons on the same level. We strongly recommend that you do not use icons on the second level.
    *
    * The `ui5-side-navigation` component is intended for use within an `ui5-navigation-layout` component.
    * While it can function independently, it is recommended to use it with
    * the `ui5-navigation-layout` for optimal user experience.
    *
    * ### Keyboard Handling
    *
    * ### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigation.js"`
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationGroup.js";` (for `ui5-side-navigation-group`)
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationItem.js";` (for `ui5-side-navigation-item`)
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationSubItem.js";` (for `ui5-side-navigation-sub-item`)
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.8
    * @public
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigation.js", JSImport.Default)
  @js.native
  open class default () extends SideNavigation
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/SideNavigation.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/SideNavigation.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `SideNavigation` is used as a standard menu in applications.
    * It consists of three containers: header (top-aligned), main navigation section (top-aligned) and the secondary section (bottom-aligned).
    *
    *  - The header is meant for displaying user related information - profile data, avatar, etc.
    *  - The main navigation section is related to the user’s current work context
    *  - The secondary section is mostly used to link additional information that may be of interest (legal information, developer communities, external help, contact information and so on).
    *
    * ### Usage
    *
    * Use the available `ui5-side-navigation-group`, `ui5-side-navigation-item`
    * and `ui5-side-navigation-sub-item` components to build your menu.
    * The items can consist of text only or an icon with text. The use or non-use of icons must be consistent for all items on one level.
    * You must not combine entries with and without icons on the same level. We strongly recommend that you do not use icons on the second level.
    *
    * The `ui5-side-navigation` component is intended for use within an `ui5-navigation-layout` component.
    * While it can function independently, it is recommended to use it with
    * the `ui5-navigation-layout` for optimal user experience.
    *
    * ### Keyboard Handling
    *
    * ### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigation.js"`
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationGroup.js";` (for `ui5-side-navigation-group`)
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationItem.js";` (for `ui5-side-navigation-item`)
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationSubItem.js";` (for `ui5-side-navigation-sub-item`)
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.8
    * @public
    */
  @js.native
  trait SideNavigation
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _bn: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
    
    def _findFocusedItem(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def _findSelectedItem(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
    
    var _fixedItemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _flexibleItemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _getAllItems(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def _getFocusableItems(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def _getOverflowItems(): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default
      ] = js.native
    
    def _getSelectableItems(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
    
    def _handleItemClick(
      e: KeyboardEvent,
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
    ): Unit = js.native
    def _handleItemClick(
      e: MouseEvent,
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
    ): Unit = js.native
    
    def _handleOverflowClick(): Unit = js.native
    
    def _handleResizeBound(): Unit = js.native
    
    var _isOverflow: Boolean = js.native
    
    var _menuPopoverItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default
      ] = js.native
    
    def _onAfterPopoverOpen(): Unit = js.native
    
    def _onBeforeMenuClose(): Unit = js.native
    
    def _onBeforeMenuOpen(): Unit = js.native
    
    def _onBeforePopoverClose(): Unit = js.native
    
    def _onBeforePopoverOpen(): Unit = js.native
    
    def _onMenuClose(): Unit = js.native
    
    def _onkeydownOverflow(e: KeyboardEvent): Unit = js.native
    
    def _onkeyupOverflow(e: KeyboardEvent): Unit = js.native
    
    def _overflowItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | Null = js.native
    
    /**
      * @private
      */
    var _popoverContents: SideNavigationPopoverContents = js.native
    
    def _rootRole: js.UndefOr[none] = js.native
    
    def _selectItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
    ): Unit = js.native
    
    def _updateOverflowItems(): js.UndefOr[Null] = js.native
    
    def accSideNavigationPopoverHiddenText: String = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 2.9.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def ariaRoleDescNavigationList: String = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementassociatedItem): Unit = js.native
    
    def closeMenu(): Unit = js.native
    def closeMenu(preventFocusRestore: Boolean): Unit = js.native
    
    def closePicker(): Unit = js.native
    
    /**
      * Defines whether the `ui5-side-navigation` is expanded or collapsed.
      *
      * @public
      * @default false
      */
    var collapsed: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_SideNavigation: Selectionchange = js.native
    
    /**
      * Defines the fixed items at the bottom of the component.
      *
      * **Note:** In order to achieve the best user experience, it is recommended that you keep the fixed items "flat" (do not pass sub-items)
      *
      * @public
      */
    var fixedItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def focusItem(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
    ): Unit = js.native
    
    def getEnabledFixedItems(): js.Array[ITabbable] = js.native
    
    def getEnabledFlexibleItems(): js.Array[ITabbable] = js.native
    
    def getEnabledItems(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default | io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationGroupMod.default
        ]
    ): js.Array[ITabbable] = js.native
    
    def getOverflowPopover(): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNavigationMenuMod.default = js.native
    
    def getPicker(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def getPickerTree(): SideNavigation = js.native
    
    def handlePopupItemClick(e: KeyboardEvent): Unit = js.native
    def handlePopupItemClick(e: PointerEvent): Unit = js.native
    
    def handleResize(): Unit = js.native
    
    def hasFixedItems: Boolean = js.native
    
    def hasHeader: Boolean = js.native
    
    /**
      * Defines the header of the `ui5-side-navigation`.
      *
      * **Note:** The header is displayed when the component is expanded - the property `collapsed` is false;
      *
      * @public
      * @since 1.0.0-rc.11
      */
    var header: js.Array[HTMLElement] = js.native
    
    var inPopover: Boolean = js.native
    
    def initGroupsSettings(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
        ]
    ): Unit = js.native
    
    def isOverflow: Boolean = js.native
    
    /**
      * Defines if the component is rendered on a mobile device.
      * @private
      */
    var isPhone: Boolean = js.native
    
    /**
      * @private
      */
    var isTouchDevice: Boolean = js.native
    
    /**
      * Defines the main items of the component.
      *
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def navigationMenuFooterHiddenText: String = js.native
    
    def navigationMenuPrimaryHiddenText: String = js.native
    
    def openOverflowMenu(opener: HTMLElement): Unit = js.native
    
    def openPicker(opener: HTMLElement): Unit = js.native
    
    def overflowAccessibleName: String = js.native
    
    def overflowItems: js.Array[HTMLElement] = js.native
    
    def showHeader: Boolean = js.native
  }
  
  trait SideNavigationPopoverContents extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default
    
    var subItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSubItemMod.default
      ]
  }
  object SideNavigationPopoverContents {
    
    inline def apply(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default,
      subItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSubItemMod.default
        ]
    ): SideNavigationPopoverContents = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], subItems = subItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavigationPopoverContents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationPopoverContents] (val x: Self) extends AnyVal {
      
      inline def setItem(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemMod.default
      ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setSubItems(
        value: js.Array[
              io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSubItemMod.default
            ]
      ): Self = StObject.set(x, "subItems", value.asInstanceOf[js.Any])
      
      inline def setSubItemsVarargs(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSubItemMod.default*
      ): Self = StObject.set(x, "subItems", js.Array(value*))
    }
  }
  
  trait SideNavigationSelectionChangeEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
  }
  object SideNavigationSelectionChangeEventDetail {
    
    inline def apply(
      item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
    ): SideNavigationSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[SideNavigationSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(
        value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
