package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchItemMod.{SearchItem as SearchItemComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SearchItem extends WebComponent("ui5-search-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/SearchItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SearchItem.type

  type Ref = SearchItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the icon name of the search item.
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the scope of the search item
    *
    * Default: false
    */
  lazy val scopeName: HtmlAttr[String] = htmlAttr("scope-name", StringAsIsCodec)

  /** Defines whether the search item is selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the heading text of the search item.
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

}
