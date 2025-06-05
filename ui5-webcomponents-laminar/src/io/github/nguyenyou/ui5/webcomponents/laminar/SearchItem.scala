package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchItemMod.SearchItem as SearchItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SearchItem extends WebComponent("ui5-search-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/SearchItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SearchItem.type

  type Ref = SearchItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the description that appears right under the item text, if available.
    *
    * **Note:** Available since [v2.12.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.12.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val description: HtmlAttr[String] = htmlAttr("description", StringAsIsCodec)

  /** Defines the icon name of the search item. **Note:** If provided, the image slot will be ignored.
    *
    * Default: undefined
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the scope of the search item
    *
    * Default: undefined
    */
  lazy val scopeName: HtmlAttr[String] = htmlAttr("scope-name", StringAsIsCodec)

  /** Defines whether the search item is selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the heading text of the search item.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  /** Fired when delete button is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onDelete: EventProp[Ui5CustomEvent[Ref]] = new EventProp("delete")

  // -- Slots --

  /** **Note:** While the slot allows the option of setting a custom avatar, to comply with the design guidelines, use
    * the `ui5-avatar` with size - XS.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="image"`). Since
    * you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to manually
    * mount them as part of the component's children, especially when facing problems with the reading order of screen
    * readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.12.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.12.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val image: Slot = new Slot("image")
}
