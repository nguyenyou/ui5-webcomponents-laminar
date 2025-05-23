package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionMod.TableSelection as TableSelectionComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableSelection extends WebComponent("ui5-table-selection") {

  @JSImport("@ui5/webcomponents/dist/TableSelection.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableSelection.type

  type Ref = TableSelectionComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the selection mode.
    *
    * Default: "Multiple"
    */
  lazy val mode: HtmlAttr[TableSelectionMode] = htmlAttr("mode", StringUnionCodec[TableSelectionMode])

  /** Defines the selected rows separated by a space.
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
