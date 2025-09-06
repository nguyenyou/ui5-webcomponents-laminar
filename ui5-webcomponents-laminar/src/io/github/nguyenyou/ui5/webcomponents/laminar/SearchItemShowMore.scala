package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchItemShowMoreMod.SearchItemShowMore as SearchItemShowMoreComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SearchItemShowMore extends WebComponent("ui5-search-item-show-more") {

  @JSImport("@ui5/webcomponents-fiori/dist/SearchItemShowMore.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SearchItemShowMore.type

  type Ref = SearchItemShowMoreComponent & dom.HTMLElement

  // -- Attributes --

  /** Specifies the number of additional items available to show. This value replaces the placeholder (N) in the "Show
    * more (N)" text. If not set, the placeholder will remain as (N).
    *
    * Default: undefined
    */
  lazy val itemsToShowCount: HtmlAttr[Double] = htmlAttr("items-to-show-count", DoubleAsStringCodec)

  /** Defines whether the show more item is selected.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

}
