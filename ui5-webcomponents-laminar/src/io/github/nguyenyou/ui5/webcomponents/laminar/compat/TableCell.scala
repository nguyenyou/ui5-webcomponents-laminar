package io.github.nguyenyou.ui5.webcomponents.laminar.compat

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.TableCell as TableCellComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableCell extends WebComponent("ui5-table-cell") {

  @JSImport("@ui5/webcomponents-compat/dist/TableCell.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = TableCell.type

  type Ref = TableCellComponent & dom.HTMLElement

  // -- Attributes --


  // -- Events --


  // -- Slots --

}

