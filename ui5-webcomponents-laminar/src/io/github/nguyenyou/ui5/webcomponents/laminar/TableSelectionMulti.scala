package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionMultiMod.TableSelectionMulti as TableSelectionMultiComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableSelectionMulti extends WebComponent("ui5-table-selection-multi") {

  @JSImport("@ui5/webcomponents/dist/TableSelectionMulti.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableSelectionMulti.type

  type Ref = TableSelectionMultiComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the `row-key` values of selected rows, with each value separated by a space.
    *
    * Default: undefined
    */
  lazy val selected: HtmlAttr[String] = htmlAttr("selected", StringAsIsCodec)

  // -- Events --

  /** Fired when the selection is changed by user interaction.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
