package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSortItemMod.{SortItem as SortItemComponent}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SortItem extends WebComponent("ui5-sort-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/SortItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SortItem.type

  type Ref = SortItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines if the component is selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
