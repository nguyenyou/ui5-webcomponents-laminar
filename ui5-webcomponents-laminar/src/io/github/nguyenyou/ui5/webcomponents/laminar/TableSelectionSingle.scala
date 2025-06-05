package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionSingleMod.TableSelectionSingle as TableSelectionSingleComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableSelectionSingle extends WebComponent("ui5-table-selection-single") {

  @JSImport("@ui5/webcomponents/dist/TableSelectionSingle.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableSelectionSingle.type

  type Ref = TableSelectionSingleComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the selection behavior.
    *
    * **Note:** Available since [v2.11](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.11) of
    * **@ui5/webcomponents**.
    *
    * Default: "RowSelector"
    */
  lazy val behavior: HtmlAttr[TableSelectionBehavior] = htmlAttr("behavior", StringUnionCodec[TableSelectionBehavior])

  /** Defines the `row-key` value of the selected row.
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
