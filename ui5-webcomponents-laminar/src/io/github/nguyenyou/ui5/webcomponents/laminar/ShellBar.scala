package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.{
  ShellBarAccessibilityAttributes,
  ShellBarContentItemVisibilityChangeEventDetail,
  ShellBarLogoClickEventDetail,
  ShellBarMenuItemClickEventDetail,
  ShellBarNotificationsClickEventDetail,
  ShellBarProductSwitchClickEventDetail,
  ShellBarProfileClickEventDetail,
  ShellBarSearchButtonEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.{
  ShellBar as ShellBarComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ShellBar extends WebComponent("ui5-shellbar") {

  @JSImport("@ui5/webcomponents-fiori/dist/ShellBar.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ShellBar.type

  type Ref = ShellBarComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the `notificationsCount`, displayed in the notification icon
    * top-right corner.
    *
    * Default: undefined
    */
  lazy val notificationsCount: HtmlAttr[String] =
    htmlAttr("notifications-count", StringAsIsCodec)

  /** Defines the `primaryTitle`.
    *
    * **Note:** The `primaryTitle` would be hidden on S screen size (less than
    * approx. 700px).
    *
    * Default: undefined
    */
  lazy val primaryTitle: HtmlAttr[String] =
    htmlAttr("primary-title", StringAsIsCodec)

  /** Defines the `secondaryTitle`.
    *
    * **Note:** The `secondaryTitle` would be hidden on S and M screen sizes
    * (less than approx. 1300px).
    *
    * Default: undefined
    */
  lazy val secondaryTitle: HtmlAttr[String] =
    htmlAttr("secondary-title", StringAsIsCodec)

  /** Defines, if the notification icon would be displayed.
    *
    * Default: false
    */
  lazy val showNotifications: HtmlAttr[Boolean] =
    htmlAttr("show-notifications", BooleanAsAttrPresenceCodec)

  /** Defines, if the product switch icon would be displayed.
    *
    * Default: false
    */
  lazy val showProductSwitch: HtmlAttr[Boolean] =
    htmlAttr("show-product-switch", BooleanAsAttrPresenceCodec)

  /** Defines, if the Search Field would be displayed when there is a valid
    * `searchField` slot.
    *
    * **Note:** By default the Search Field is not displayed.
    *
    * Default: false
    */
  lazy val showSearchField: HtmlAttr[Boolean] =
    htmlAttr("show-search-field", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired, when an item from the content slot is hidden or shown. **Note:**
    * The `content-item-visibility-change` event is in an experimental state and
    * is a subject to change.
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onContentItemVisibilityChange: EventProp[
    Ui5CustomEvent[Ref] &
      EventDetail[ShellBarContentItemVisibilityChangeEventDetail]
  ] = new EventProp("content-item-visibility-change")

  /** Fired, when the logo is activated.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLogoClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarLogoClickEventDetail]
  ] = new EventProp("logo-click")

  /** Fired, when a menu item is activated
    *
    * **Note:** You can prevent closing of overflow popover by calling
    * `event.preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onMenuItemClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarMenuItemClickEventDetail]
  ] = new EventProp("menu-item-click")

  /** Fired, when the notification icon is activated.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onNotificationsClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarNotificationsClickEventDetail]
  ] = new EventProp("notifications-click")

  /** Fired, when the product switch icon is activated.
    *
    * **Note:** You can prevent closing of overflow popover by calling
    * `event.preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onProductSwitchClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarProductSwitchClickEventDetail]
  ] = new EventProp("product-switch-click")

  /** Fired, when the profile slot is present.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onProfileClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarProfileClickEventDetail]
  ] = new EventProp("profile-click")

  /** Fired, when the search button is activated.
    *
    * **Note:** You can prevent expanding/collapsing of the search field by
    * calling `event.preventDefault()`.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event
    * to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSearchButtonClick: EventProp[
    Ui5CustomEvent[Ref] & EventDetail[ShellBarSearchButtonEventDetail]
  ] = new EventProp("search-button-click")

  // -- Slots --

  /** Defines the assistant slot.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="assistant"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val assistant: Slot = new Slot("assistant")

  /** Define the items displayed in the content area.
    *
    * Use the `data-hide-order` attribute with numeric value to specify the
    * order of the items to be hidden when the space is not enough. Lower values
    * will be hidden first.
    *
    * **Note:** The `content` slot is in an experimental state and is a subject
    * to change.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="content"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since
    * [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val content: Slot = new Slot("content")

  /** Defines the logo of the `ShellBar`. For example, you can use `ui5-avatar`
    * or `img` elements as logo.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="logo"`). Since you can't change the DOM order of slots
    * when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing
    * problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val logo: Slot = new Slot("logo")

  /** Defines the items displayed in menu after a click on a start button.
    *
    * **Note:** You can use the `<ui5-li></ui5-li>` and its ancestors.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="menuItems"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val menuItems: Slot = new Slot("menuItems")

  /** You can pass `ui5-avatar` to set the profile image/icon. If no profile
    * slot is set - profile will be excluded from actions.
    *
    * **Note:** We recommend not using the `size` attribute of `ui5-avatar`
    * because it should have specific size by design in the context of
    * `ShellBar` profile.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="profile"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val profile: Slot = new Slot("profile")

  /** Defines the `ui5-input`, that will be used as a search field.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="searchField"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val searchField: Slot = new Slot("searchField")

  /** Defines a `ui5-button` in the bar that will be placed in the beginning. We
    * encourage this slot to be used for a menu button. It gets overstyled to
    * match ShellBar's styling.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot)
    * by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot)
    * attribute (`slot="startButton"`). Since you can't change the DOM order of
    * slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when
    * facing problems with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to
    * make sure your component reads the `slot` prop and appends it to the most
    * outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val startButton: Slot = new Slot("startButton")
}
