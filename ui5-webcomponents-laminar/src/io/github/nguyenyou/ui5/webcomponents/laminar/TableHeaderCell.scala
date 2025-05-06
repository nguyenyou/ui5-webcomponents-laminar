package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.TableHeaderCell as TableHeaderCellComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableHeaderCell extends WebComponent("ui5-table-header-cell") {

  @JSImport("@ui5/webcomponents/dist/TableHeaderCell.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableHeaderCell.type

  type Ref = TableHeaderCellComponent with dom.HTMLElement

  // -- Attributes --

  /** Determines the horizontal alignment of table cells.
    *
    * Default: undefined
    */
  lazy val horizontalAlign: HtmlAttr[TableCellHorizontalAlign] =
    htmlAttr("horizontal-align", StringUnionCodec[TableCellHorizontalAlign])
  type TableCellHorizontalAlign = "Left" | "Start" | "Right" | "End" | "Center"

  /** Defines the importance of the column.
    *
    * This property affects the popin behaviour. Columns with higher importance will move into the popin area later then
    * less important columns.
    *
    * Default: 0
    */
  lazy val importance: HtmlAttr[Double] = htmlAttr("importance", DoubleAsStringCodec)

  /** Defines the maximum width of the column.
    *
    * Default: "auto"
    */
  lazy val maxWidth: HtmlAttr[String] = htmlAttr("max-width", StringAsIsCodec)

  /** Defines the minimum width of the column.
    *
    * If the table is in `Popin` mode and the minimum width does not fit anymore, the column will move into the popin.
    *
    * **Note:** If `minWidth` has the `auto` value, the table ensures that the column is wider than at least `3rem`.
    *
    * Default: "auto"
    */
  lazy val minWidth: HtmlAttr[String] = htmlAttr("min-width", StringAsIsCodec)

  /** Defines if the column is hidden in the popin.
    *
    * **Note:** Please be aware that hiding the column in the popin might lead to accessibility issues as users might
    * not be able to access the content of the column on small screens.
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val popinHidden: HtmlAttr[Boolean] = htmlAttr("popin-hidden", BooleanAsAttrPresenceCodec)

  /** The text for the column when it pops in.
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val popinText: HtmlAttr[String] = htmlAttr("popin-text", StringAsIsCodec)

  /** Defines the sort indicator of the column.
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "None"
    */
  lazy val sortIndicator: HtmlAttr[SortOrder] = htmlAttr("sort-indicator", StringUnionCodec[SortOrder])
  type SortOrder = "None" | "Ascending" | "Descending"

  /** Defines the width of column.
    *
    * Default: "auto"
    */
  lazy val width: HtmlAttr[String] = htmlAttr("width", StringAsIsCodec)

  // -- Events --

  // -- Slots --

  /** Defines the action of the column.
    *
    * **Note:** While multiple actions are technically possible, this is not supported.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="action"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.8.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.8.0) of
    * **@ui5/webcomponents**.
    */
  lazy val action: Slot = new Slot("action")
}
