package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderRowMod.TableHeaderRow as TableHeaderRowComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableHeaderRow extends WebComponent("ui5-table-header-row") {

  @JSImport("@ui5/webcomponents/dist/TableHeaderRow.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableHeaderRow.type

  type Ref = TableHeaderRowComponent with dom.HTMLElement

  // -- Attributes --

  /** Sticks the `TableHeaderRow` to the top of a table.
    *
    * Note: If used in combination with overflowMode "Scroll", the table needs a defined height for the sticky header to
    * work as expected.
    *
    * Default: false
    */
  lazy val sticky: HtmlAttr[Boolean] = htmlAttr("sticky", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

}
