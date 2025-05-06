package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.UserSettingsItem as UserSettingsItemComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.UserSettingsItemViewSelectEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserSettingsItem extends WebComponent("ui5-user-settings-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UserSettingsItem.type

  type Ref = UserSettingsItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Defines the headerText of the item.
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Defines the icon of the component.
    *
    * Default: "globe"
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Indicates whether a loading indicator should be shown.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Indicates why the control is in loading state.
    *
    * Default: undefined
    */
  lazy val loadingReason: HtmlAttr[String] = htmlAttr("loading-reason", StringAsIsCodec)

  /** Shows item tab.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the user settings item.
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the tooltip of the component.
    *
    * A tooltip attribute should be provided to represent the meaning or function when the component is collapsed and
    * only the icon is visible.
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  // -- Events --

  /** Fired when a selected view changed.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[UserSettingsItemViewSelectEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the page views of the user settings item.
    *
    * If there are no tab views, the first page view will be shown unless there is selected one. If there is selected
    * page view it will be shown no matter if there are tab views.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="pages"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val pages: Slot = new Slot("pages")
}
