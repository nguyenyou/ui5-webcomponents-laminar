package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.TableRow as TableRowComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableRow extends WebComponent("ui5-table-row") {

  @JSImport("@ui5/webcomponents/dist/TableRow.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableRow.type

  type Ref = TableRowComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the interactive state of the row.
    *
    * Default: false
    */
  lazy val interactive: HtmlAttr[Boolean] = htmlAttr("interactive", BooleanAsAttrPresenceCodec)

  /** Defines whether the row is movable.
    *
    * **Note:** Available since [v2.6.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.6.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val movable: HtmlAttr[Boolean] = htmlAttr("movable", BooleanAsAttrPresenceCodec)

  /** Defines the navigated state of the row.
    *
    * Default: false
    */
  lazy val navigated: HtmlAttr[Boolean] = htmlAttr("navigated", BooleanAsAttrPresenceCodec)

  /** Defines the position of the row related to the total number of rows within the table when the `TableVirtualizer`
    * feature is used.
    *
    * **Note:** Available since [v2.5.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.5.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val position: HtmlAttr[Double] = htmlAttr("position", DoubleAsStringCodec)

  /** Unique identifier of the row.
    *
    * **Note:** For selection features to work properly, this property is mandatory, and its value must not contain
    * spaces.
    *
    * Default: undefined
    */
  lazy val rowKey: HtmlAttr[String] = htmlAttr("row-key", StringAsIsCodec)

  // -- Events --

  // -- Slots --

  /** Defines the actions of the component.
    *
    * **Note:** Use `TableRowAction` or `TableRowActionNavigation` for the intended design.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="actions"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v2.7.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.7.0) of
    * **@ui5/webcomponents**.
    */
  lazy val actions: Slot = new Slot("actions")
}
