package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableVirtualizerMod.RangeChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableVirtualizerMod.TableVirtualizer as TableVirtualizerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableVirtualizer extends WebComponent("ui5-table-virtualizer") {

  @JSImport("@ui5/webcomponents/dist/TableVirtualizer.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = TableVirtualizer.type

  type Ref = TableVirtualizerComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the count of extra rows to be rendered at the top and bottom of the table.
   * 
   * **Note:** This property is experimental and may be changed or deleted in the future.
   *
   * Default: 0
   */
  lazy val extraRows: HtmlAttr[Double] = htmlAttr("extra-rows", DoubleAsStringCodec)
  /**
   * Defines the total count of rows in the table.
   * 
   * **Note:** For virtualization to work properly, this property is mandatory.
   *
   * Default: 100
   */
  lazy val rowCount: HtmlAttr[Double] = htmlAttr("row-count", DoubleAsStringCodec)
  /**
   * Defines the height of the rows in the table.
   * 
   * **Note:** For virtualization to work properly, this property is mandatory.
   *
   * Default: 45
   */
  lazy val rowHeight: HtmlAttr[Double] = htmlAttr("row-height", DoubleAsStringCodec)

  // -- Events --

  /**
   * Fired when the virtualizer is changed by user interaction e.g. on scrolling.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|❌|
   */
  lazy val onRangeChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[RangeChangeEventDetail]]  = new EventProp("range-change")

  // -- Slots --

}

