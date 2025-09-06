package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemMod.NotificationListItem as NotificationListItemComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemMod.NotificationListItemCloseEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object NotificationListItem extends WebComponent("ui5-li-notification") {

  @JSImport("@ui5/webcomponents-fiori/dist/NotificationListItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = NotificationListItem.type

  type Ref = NotificationListItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the `Important` label of the item.
    *
    * Default: "Standard"
    */
  lazy val importance: HtmlAttr[NotificationListItemImportance] =
    htmlAttr("importance", StringUnionCodec[NotificationListItemImportance])

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

  /** Defines if the `Close` button would be displayed.
    *
    * Default: false
    */
  lazy val showClose: HtmlAttr[Boolean] = htmlAttr("show-close", BooleanAsAttrPresenceCodec)

  /** Defines the status indicator of the item.
    *
    * Default: "None"
    */
  lazy val state: HtmlAttr[ValueState] = htmlAttr("state", StringUnionCodec[ValueState])

  /** Defines the `titleText` of the item.
    *
    * Default: undefined
    */
  lazy val titleText: HtmlAttr[String] = htmlAttr("title-text", StringAsIsCodec)

  /** Defines if the `titleText` and `description` should wrap, they truncate by default.
    *
    * **Note:** by default the `titleText` and `description`, and a `ShowMore/Less` button would be displayed.
    *
    * Default: "None"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])

  // -- Events --

  /** Fired when the `Close` button is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref] & EventDetail[NotificationListItemCloseEventDetail]] = new EventProp(
    "close"
  )

  // -- Slots --

  /** Defines the avatar, displayed in the `NotificationListItem`.
    *
    * **Note:** Consider using the `ui5-avatar` to display icons, initials or images.
    *
    * **Note:** In order to be complaint with the UX guidlines and for best experience, we recommend using avatars with
    * 2rem X 2rem in size (32px X 32px). In case you are using the `ui5-avatar` you can set its `size` property to `XS`
    * to get the required size - `<ui5-avatar size="XS"></ui5-avatar>`.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="avatar"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val avatar: Slot = new Slot("avatar")

  /** Defines the elements, displayed in the footer of the of the component.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="footnotes"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val footnotes: Slot = new Slot("footnotes")

  /** Defines the menu, displayed in the `NotificationListItem`.
    *
    * **Note:** Use this for implementing actions.
    *
    * **Note:** Should be used instead `u5-notification-action`, which is deprecated as of version 2.0.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="menu"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val menu: Slot = new Slot("menu")
}
