package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellMod.TableCell as TableCellComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableCell extends WebComponent("ui5-table-cell") {

  @JSImport("@ui5/webcomponents/dist/TableCell.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableCell.type

  type Ref = TableCellComponent & dom.HTMLElement

  // -- Attributes --

  /** Determines the horizontal alignment of table cells.
    *
    * Default: undefined
    */
  lazy val horizontalAlign: HtmlAttr[TableCellHorizontalAlign] =
    htmlAttr("horizontal-align", StringUnionCodec[TableCellHorizontalAlign])

  // -- Events --

  // -- Slots --

}
