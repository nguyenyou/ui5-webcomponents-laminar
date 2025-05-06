package io.github.nguyenyou.ui5.webcomponents.laminar.compat

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableGroupRowMod.{
  TableGroupRow as TableGroupRowComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableGroupRow extends WebComponent("ui5-table-group-row") {

  @JSImport("@ui5/webcomponents-compat/dist/TableGroupRow.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableGroupRow.type

  type Ref = TableGroupRowComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
