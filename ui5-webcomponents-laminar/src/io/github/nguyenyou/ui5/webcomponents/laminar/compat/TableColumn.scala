package io.github.nguyenyou.ui5.webcomponents.laminar.compat
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableColumnMod.{
  TableColumn as TableColumnComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableColumn extends WebComponent("ui5-table-column") {

  @JSImport("@ui5/webcomponents-compat/dist/TableColumn.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableColumn.type

  type Ref = TableColumnComponent with dom.HTMLElement

  // -- Attributes --

  /** According to your `minWidth` settings, the component can be hidden in different screen sizes.
    *
    * Setting this property to `true`, shows this column as pop-in instead of hiding it.
    *
    * Default: false
    */
  lazy val demandPopin: HtmlAttr[Boolean] = htmlAttr("demand-popin", BooleanAsAttrPresenceCodec)

  /** Defines the minimum table width required to display this column. By default it is always displayed.
    *
    * The responsive behavior of the `Table` is determined by this property. As an example, by setting `minWidth`
    * property to `400` sets the minimum width to 400 pixels, and shows this column on tablet (and desktop) but hides it
    * on mobile.
    *
    * For further responsive design options, see `demandPopin` property.
    *
    * Default: Infinity
    */
  lazy val minWidth: HtmlAttr[Double] = htmlAttr("min-width", DoubleAsStringCodec)

  /** Defines how the popin row is displayed.
    *
    * **The available values are:**
    *
    *   - `Block`
    *   - `Inline`
    *
    * Default: "Block"
    */
  lazy val popinDisplay: HtmlAttr[TableColumnPopinDisplay] =
    htmlAttr("popin-display", StringUnionCodec[TableColumnPopinDisplay])
  type TableColumnPopinDisplay = "Block" | "Inline"

  /** The text for the column when it pops in.
    *
    * Default: undefined
    */
  lazy val popinText: HtmlAttr[String] = htmlAttr("popin-text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
