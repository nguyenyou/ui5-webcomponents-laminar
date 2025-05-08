package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsDialogMod.UserSettingsDialog as UserSettingsDialogComponent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsDialogMod.UserSettingsItemSelectEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserSettingsDialog extends WebComponent("ui5-user-settings-dialog") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserSettingsDialog.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UserSettingsDialog.type

  type Ref = UserSettingsDialogComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the headerText of the item.
    *
    * Default: undefined
    */
  lazy val headerText: HtmlAttr[String] = htmlAttr("header-text", StringAsIsCodec)

  /** Defines, if the User Settings Dialog is opened.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines if the Search Field would be displayed.
    *
    * **Note:** By default the Search Field is not displayed.
    *
    * Default: false
    */
  lazy val showSearchField: HtmlAttr[Boolean] = htmlAttr("show-search-field", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired before the settings dialog is closed.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onBeforeClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("before-close")

  /** Fired when a settings dialog is closed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when a settings dialog is open.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  /** Fired when an item is selected.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ❌    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[UserSettingsItemSelectEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the fixed user settings items.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="fixedItems"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val fixedItems: Slot = new Slot("fixedItems")
}
