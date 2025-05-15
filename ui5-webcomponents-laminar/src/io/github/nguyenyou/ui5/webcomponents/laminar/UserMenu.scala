package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuMod.{UserMenuOtherAccountClickEventDetail,UserMenuItemClickEventDetail}
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuMod.UserMenu as UserMenuComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserMenu extends WebComponent("ui5-user-menu") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserMenu.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = UserMenu.type

  type Ref = UserMenuComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines if the User Menu is opened.
   *
   * Default: false
   */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)
  /**
   * Defines the ID or DOM Reference of the element at which the user menu is shown.
   * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
   * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
   *
   * Default: undefined
   */
  lazy val openerId: HtmlAttr[String] = htmlAttr("opener", StringAsIsCodec)
  /**
   * Defines if the User Menu shows the Edit Accounts option.
   *
   * Default: false
   */
  lazy val showEditAccounts: HtmlAttr[Boolean] = htmlAttr("show-edit-accounts", BooleanAsAttrPresenceCodec)
  /**
   * Defines if the User menu shows edit button.
   *
   * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of **@ui5/webcomponents-fiori**.
   *
   * Default: false
   */
  lazy val showEditButton: HtmlAttr[Boolean] = htmlAttr("show-edit-button", BooleanAsAttrPresenceCodec)
  /**
   * Defines if the User Menu shows the Manage Account option.
   *
   * Default: false
   */
  lazy val showManageAccount: HtmlAttr[Boolean] = htmlAttr("show-manage-account", BooleanAsAttrPresenceCodec)
  /**
   * Defines if the User Menu shows the Other Accounts option.
   *
   * Default: false
   */
  lazy val showOtherAccounts: HtmlAttr[Boolean] = htmlAttr("show-other-accounts", BooleanAsAttrPresenceCodec)

  // -- Events --

  /**
   * Fired when the account avatar is selected.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onAvatarClick: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("avatar-click")
  /**
   * Fired when the account is switched to a different one.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|❌|
   */
  lazy val onChangeAccount: EventProp[Ui5CustomEvent[Ref] & EventDetail[UserMenuOtherAccountClickEventDetail]]  = new EventProp("change-account")
  /**
   * Fired when a user menu is close.
   *
   * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of **@ui5/webcomponents-fiori**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("close")
  /**
   * Fired when the "Edit Accounts" button is selected.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onEditAccountsClick: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("edit-accounts-click")
  /**
   * Fired when a menu item is selected.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|❌|
   */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[UserMenuItemClickEventDetail]]  = new EventProp("item-click")
  /**
   * Fired when the "Manage Account" button is selected.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onManageAccountClick: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("manage-account-click")
  /**
   * Fired when a user menu is open.
   *
   * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of **@ui5/webcomponents-fiori**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("open")
  /**
   * Fired when the "Sign Out" button is selected.
   *
   * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
   *
   * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of **@ui5/webcomponents-fiori**.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ✅|❌|
   */
  lazy val onSignOutClick: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("sign-out-click")

  // -- Slots --

  /**
   * Defines the user accounts.
   * 
   * **Note:** If one item is used, it will be shown as the selected one. If more than one item is used, the first one will be shown as selected unless
   * there is an item with `selected` property set to `true`.
   *
   * __Note:__ The content of the prop will be rendered into a [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="accounts"`).
   * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually mount them as part of the component's children, especially when facing problems with the reading order of screen readers.
   *
   * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the `slot` prop and appends it to the most outer element of your component.
  * Learn more about it [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
   */
  lazy val accounts: Slot = new Slot("accounts")
}

