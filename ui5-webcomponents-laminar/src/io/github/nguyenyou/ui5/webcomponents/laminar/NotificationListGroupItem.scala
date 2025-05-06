package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesNotificationListGrowingModeMod.NotificationListGrowingMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListGroupItemMod.NotificationListGroupItem as NotificationListGroupItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object NotificationListGroupItem extends WebComponent("ui5-li-notification-group") {

  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListGroupItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = NotificationListGroupItem.type

  type Ref = NotificationListGroupItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines if the group is collapsed or expanded.
    *
    * Default: false
    */
  lazy val collapsed: HtmlAttr[Boolean] = htmlAttr("collapsed", BooleanAsAttrPresenceCodec)

  /** Defines whether the component will have growing capability by pressing a `More` button. When button is pressed
    * `load-more` event will be fired.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "None"
    */
  lazy val growing: HtmlAttr[NotificationListGrowingMode] =
    htmlAttr("growing", StringUnionCodec[NotificationListGrowingMode])
  type NotificationListGrowingMode = "Button" | "None"

  /** Defines if a busy indicator would be displayed over the item.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the busy indicator will show up for this component.
    *
    * Default: 1000
    */
  lazy val loadingDelay: HtmlAttr[Double] = htmlAttr("loading-delay", DoubleAsStringCodec)

  /** Defines if the `notification` is new or has been already read.
    *
    * **Note:** if set to `false` the `titleText` has bold font, if set to true - it has a normal font.
    *
    * Default: false
    */
  lazy val read: HtmlAttr[Boolean] = htmlAttr("read", BooleanAsAttrPresenceCodec)

  /** Defines the `titleText` of the item.
    *
    * Default: undefined
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  // -- Events --

  /** Fired when additional items are requested.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onLoadMore: EventProp[Ui5CustomEvent[Ref]] = new EventProp("load-more")

  /** Fired when the `NotificationListGroupItem` is expanded/collapsed by user interaction.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onToggle: EventProp[Ui5CustomEvent[Ref]] = new EventProp("toggle")

  // -- Slots --

}
