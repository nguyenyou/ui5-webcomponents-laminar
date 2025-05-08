package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchFieldMod.SearchFieldScopeSelectionChangeDetails
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarSearchMod.ShellBarSearch as ShellBarSearchComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ShellBarSearch extends WebComponent("ui5-shellbar-search") {

  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarSearch.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ShellBarSearch.type

  type Ref = ShellBarSearchComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA description of the field.
    *
    * Default: undefined
    */
  lazy val accessibleDescription: HtmlAttr[String] = htmlAttr("accessible-description", StringAsIsCodec)

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Indicates whether a loading indicator should be shown in the popup.
    *
    * Default: false
    */
  lazy val loading: HtmlAttr[Boolean] = htmlAttr("loading", BooleanAsAttrPresenceCodec)

  /** Defines whether the value will be autcompleted to match an item.
    *
    * Default: false
    */
  lazy val noTypeahead: HtmlAttr[Boolean] = htmlAttr("no-typeahead", BooleanAsAttrPresenceCodec)

  /** Indicates whether the items picker is open.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines a short hint intended to aid the user with data entry when the component has no value.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)

  /** Defines whether the clear icon of the search will be shown.
    *
    * Default: false
    */
  lazy val showClearIcon: HtmlAttr[Boolean] = htmlAttr("show-clear-icon", BooleanAsAttrPresenceCodec)

  /** Defines the value of the component.
    *
    * **Note:** The property is updated upon typing.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  /** Fired when the popup is closed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when typing in input or clear icon is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onInput: EventProp[Ui5CustomEvent[Ref]] = new EventProp("input")

  /** Fired when the popup is opened.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  /** Fired when the scope has changed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onScopeChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[SearchFieldScopeSelectionChangeDetails]] =
    new EventProp("scope-change")

  /** Fired when the user has triggered search with Enter key or Search Button press.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onSearch: EventProp[Ui5CustomEvent[Ref]] = new EventProp("search")

  // -- Slots --

  /** Defines the popup footer action button.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="action"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val action: Slot = new Slot("action")

  /** Defines the illustrated message to be shown in the popup.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="illustration"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val illustration: Slot = new Slot("illustration")

  /** Defines the illustrated message to be shown in the popup.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="messageArea"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val messageArea: Slot = new Slot("messageArea")

  /** Defines the component scope options.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="scopes"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val scopes: Slot = new Slot("scopes")
}
