package io.github.nguyenyou.ui5.webcomponents.laminar.compat

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableRowMod.TableRow as TableRowComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableRow extends WebComponent("ui5-table-row") {

  @JSImport("@ui5/webcomponents-compat/dist/TableRow.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableRow.type

  type Ref = TableRowComponent & dom.HTMLElement

  // -- Attributes --

  /** Indicates if the table row is navigated.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: false
    */
  lazy val navigated: HtmlAttr[Boolean] = htmlAttr("navigated", BooleanAsAttrPresenceCodec)

  /** Defines the row's selected state.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the visual indication and behavior of the component.
    *
    * **Note:** When set to `Active`, the item will provide visual response upon press, while with type `Inactive`-will
    * not.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents-compat**.
    *
    * Default: "Inactive"
    */
  lazy val tpe: HtmlAttr[CompatTableRowType] = htmlAttr("type", StringUnionCodec[CompatTableRowType])

  // -- Events --

  // -- Slots --

}
