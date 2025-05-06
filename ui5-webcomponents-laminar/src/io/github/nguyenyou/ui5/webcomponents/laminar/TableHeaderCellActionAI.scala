package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellActionBaseMod.TableHeaderCellActionClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellActionAIMod.TableHeaderCellActionAI as TableHeaderCellActionAIComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableHeaderCellActionAI extends WebComponent("ui5-table-header-cell-action-ai") {

  @JSImport("@ui5/webcomponents/dist/TableHeaderCellActionAI.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableHeaderCellActionAI.type

  type Ref = TableHeaderCellActionAIComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  /** Fired when a header cell action is clicked.
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[TableHeaderCellActionClickEventDetail]] = new EventProp(
    "click"
  )

  // -- Slots --

}
