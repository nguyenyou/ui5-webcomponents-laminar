package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.Menu as MenuComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuBeforeOpenEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuItemClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Menu extends WebComponent("ui5-menu") {

  @JSImport("@ui5/webcomponents/dist/Menu.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Menu.type

  type Ref = MenuComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the header text of the menu (displayed on mobile).
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Determines the horizontal alignment of the menu relative to its opener control.
    *
    * Default: "Start"
    */
  lazy val horizontalAlign: HtmlAttr[PopoverHorizontalAlign] =
    htmlAttr("horizontal-align", StringUnionCodec[PopoverHorizontalAlign])

  /** Defines if a loading indicator would be displayed inside the corresponding ui5-menu popover.
    *
    * **Note:** Available since [v1.13.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.13.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the loading indicator will be displayed inside the corresponding
    * ui5-menu popover.
    *
    * **Note:** Available since [v1.13.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.13.0) of
    * **@ui5/webcomponents**.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  /** Indicates if the menu is open.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines the ID or DOM Reference of the element at which the menu is shown. When using this attribute in a
    * declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
    * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val openerId: HtmlAttr[String] = htmlAttr("opener", StringAsIsCodec)

  // -- Events --

  /** Fired before the menu is closed. This event can be cancelled, which will prevent the menu from closing.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onBeforeClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[MenuBeforeCloseEventDetail]] = new EventProp(
    "before-close"
  )

  /** Fired before the menu is opened. This event can be cancelled, which will prevent the menu from opening.
    *
    * **Note:** Since 1.14.0 the event is also fired before a sub-menu opens.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onBeforeOpen: EventProp[Ui5CustomEvent[Ref] & EventDetail[MenuBeforeOpenEventDetail]] = new EventProp(
    "before-open"
  )

  /** Fired after the menu is closed.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when an item is being clicked.
    *
    * **Note:** Since 1.17.0 the event is preventable, allowing the menu to remain open after an item is pressed.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[MenuItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  /** Fired after the menu is opened.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

}
