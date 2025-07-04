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

  /** Defines the selection behavior.
    *
    * **Note:** Available since [v2.11](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.11) of
    * **@ui5/webcomponents**.
    *
    * Default: "RowSelector"
    */
  lazy val behavior: HtmlAttr[TableSelectionBehavior] = htmlAttr("behavior", StringUnionCodec[TableSelectionBehavior])

  /** Defines the selector of the header row.
    *
    * **Note:** Available since [v2.12](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.12) of
    * **@ui5/webcomponents**.
    *
    * Default: "SelectAll"
    */
  lazy val headerSelector: HtmlAttr[TableSelectionMultiHeaderSelector] =
    htmlAttr("header-selector", StringUnionCodec[TableSelectionMultiHeaderSelector])

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
