package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionMod.{
  TableRowAction as TableRowActionComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableRowAction extends WebComponent("ui5-table-row-action") {

  @JSImport("@ui5/webcomponents/dist/TableRowAction.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableRowAction.type

  type Ref = TableRowActionComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the icon of the row action.
    *
    * **Note:** For row actions to work properly, this property is mandatory.
    *
    * **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the [Icon
    * Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
    */
  lazy val icon: HtmlAttr[IconName] = htmlAttr("icon", IconName.AsStringCodec)

  /** Defines the visibility of the row action.
    *
    * **Note:** Invisible row actions still take up space, allowing to hide the action while maintaining its position.
    *
    * Default: false
    */
  lazy val invisible: HtmlAttr[Boolean] = htmlAttr("invisible", BooleanAsAttrPresenceCodec)

  /** Defines the text of the row action.
    *
    * **Note:** For row actions to work properly, this property is mandatory.
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  /** Fired when a row action is clicked.
    *
    * **Note:** Available since [v2.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.9.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("click")

  // -- Slots --

}
