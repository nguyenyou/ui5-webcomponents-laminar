package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemToggleEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationList as NotificationListComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object NotificationList extends WebComponent("ui5-notification-list") {

  @JSImport("@ui5/webcomponents-fiori/dist/NotificationList.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = NotificationList.type

  type Ref = NotificationListComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the text that is displayed when the component contains no items.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  // -- Events --

  /** Fired when an item is clicked.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[NotificationItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  /** Fired when the `Close` button of any item is clicked.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[NotificationItemCloseEventDetail]] = new EventProp(
    "item-close"
  )

  /** Fired when an item is toggled.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onItemToggle: EventProp[Ui5CustomEvent[Ref] & EventDetail[NotificationItemToggleEventDetail]] =
    new EventProp("item-toggle")

  // -- Slots --

}
