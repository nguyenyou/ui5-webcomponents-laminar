package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionNavigationMod.TableRowActionNavigation as TableRowActionNavigationComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableRowActionNavigation extends WebComponent("ui5-table-row-action-navigation") {

  @JSImport("@ui5/webcomponents/dist/TableRowActionNavigation.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TableRowActionNavigation.type

  type Ref = TableRowActionNavigationComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the interactive state of the navigation action.
    *
    * Default: false
    */
  lazy val interactive: HtmlAttr[Boolean] = htmlAttr("interactive", BooleanAsAttrPresenceCodec)

  /** Defines the visibility of the row action.
    *
    * **Note:** Invisible row actions still take up space, allowing to hide the action while maintaining its position.
    *
    * Default: false
    */
  lazy val invisible: HtmlAttr[Boolean] = htmlAttr("invisible", BooleanAsAttrPresenceCodec)

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
