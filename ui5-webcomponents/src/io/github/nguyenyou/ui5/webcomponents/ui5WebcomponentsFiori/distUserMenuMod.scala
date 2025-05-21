package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserver
import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserverEntry
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Avatarclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.HTMLElementassociatedAcco
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserMenuMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-menu` is an SAP Fiori specific web component that is used in `ui5-shellbar`
    * and allows the user to easily see information and settings for the current user and all other logged in accounts.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserMenu.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/UserMenuItem.js";` (for `ui5-user-menu-item`)
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.5.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UserMenu.js", JSImport.Default)
  @js.native
  open class default () extends UserMenu
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UserMenu.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UserMenu.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-user-menu` is an SAP Fiori specific web component that is used in `ui5-shellbar`
    * and allows the user to easily see information and settings for the current user and all other logged in accounts.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/UserMenu.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/UserMenuItem.js";` (for `ui5-user-menu-item`)
    *
    * @constructor
    * @extends UI5Element
    * @experimental
    * @public
    * @since 2.5.0
    */
  @js.native
  trait UserMenu
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelledByAccountInformationText: String = js.native
    
    def _ariaLabelledByActions: String = js.native
    
    def _closeDialogAriaLabel: String = js.native
    
    def _closeUserMenu(): Unit = js.native
    
    def _editAccountsTooltip: String = js.native
    
    def _editAvatarTooltip: String = js.native
    
    def _handleAccountSwitch(e: CustomEvent): Unit = js.native
    
    def _handleAvatarClick(e: CustomEvent): Unit = js.native
    
    def _handleEditAccountsClick(): Unit = js.native
    
    def _handleIntersection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    def _handleManageAccountClick(): Unit = js.native
    
    def _handleMenuItemClick(e: CustomEvent): Unit = js.native
    
    def _handleMenuItemClose(): Unit = js.native
    
    def _handlePopoverAfterClose(): Unit = js.native
    
    def _handlePopoverAfterOpen(): Unit = js.native
    
    def _handleScroll(e: CustomEvent): Unit = js.native
    
    def _handleSignOutClick(): Unit = js.native
    
    def _isPhone: Boolean = js.native
    
    /**
      * @default false
      * @private
      */
    var _isScrolled: Boolean = js.native
    
    def _manageAccountButtonText: String = js.native
    
    /**
      * @private
      */
    var _observer: js.UndefOr[IntersectionObserver] = js.native
    
    def _openItemSubMenu(item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemMod.default): Unit = js.native
    
    def _otherAccounts: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
      ] = js.native
    
    def _otherAccountsButtonText: String = js.native
    
    /**
      * @private
      */
    var _responsivePopover: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default
      ] = js.native
    
    /**
      * @private
      */
    var _selectedAccount: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default = js.native
    
    /**
      * @private
      */
    var _selectedAccountManageBtn: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default] = js.native
    
    /**
      * @private
      */
    var _selectedAccountTitleEl: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTitleMod.default] = js.native
    
    def _signOutButtonText: String = js.native
    
    /**
      * @default false
      * @private
      */
    var _titleMovedToHeader: Boolean = js.native
    
    def accessibleNameText: String = js.native
    
    /**
      * Defines the user accounts.
      *
      * **Note:** If one item is used, it will be shown as the selected one. If more than one item is used, the first one will be shown as selected unless
      * there is an item with `selected` property set to `true`.
      * @public
      */
    var accounts: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
      ] = js.native
    
    def captureRef(): Unit = js.native
    def captureRef(ref: HTMLElementassociatedAcco): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_UserMenu: Avatarclick = js.native
    
    def getAccountByRefId(refId: String): io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default = js.native
    
    def getAccountDescriptionText(
      account: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
    ): String = js.native
    
    /**
      * Defines the menu items.
      * @public
      */
    var menuItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemMod.default
      ] = js.native
    
    /**
      * Defines if the User Menu is opened.
      *
      * @default false
      * @public
      */
    var open: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element at which the user menu is shown.
      * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
      * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
      * @public
      * @default undefined
      */
    var opener: js.UndefOr[HTMLElement | String] = js.native
    
    /**
      * Defines if the User Menu shows the Edit Accounts option.
      *
      * @default false
      * @public
      */
    var showEditAccounts: Boolean = js.native
    
    /**
      * Defines if the User menu shows edit button.
      *
      * @default false
      * @public
      * @since 2.7.0
      */
    var showEditButton: Boolean = js.native
    
    /**
      * Defines if the User Menu shows the Manage Account option.
      *
      * @default false
      * @public
      */
    var showManageAccount: Boolean = js.native
    
    /**
      * Defines if the User Menu shows the Other Accounts option.
      *
      * @default false
      * @public
      */
    var showOtherAccounts: Boolean = js.native
  }
  
  trait UserMenuItemClickEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemMod.default
  }
  object UserMenuItemClickEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemMod.default): UserMenuItemClickEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserMenuItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserMenuItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserMenuOtherAccountClickEventDetail extends StObject {
    
    var prevSelectedAccount: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
    
    var selectedAccount: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
  }
  object UserMenuOtherAccountClickEventDetail {
    
    inline def apply(
      prevSelectedAccount: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default,
      selectedAccount: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default
    ): UserMenuOtherAccountClickEventDetail = {
      val __obj = js.Dynamic.literal(prevSelectedAccount = prevSelectedAccount.asInstanceOf[js.Any], selectedAccount = selectedAccount.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserMenuOtherAccountClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserMenuOtherAccountClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setPrevSelectedAccount(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default): Self = StObject.set(x, "prevSelectedAccount", value.asInstanceOf[js.Any])
      
      inline def setSelectedAccount(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuAccountMod.default): Self = StObject.set(x, "selectedAccount", value.asInstanceOf[js.Any])
    }
  }
}
