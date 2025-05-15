package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableGrowingMod.TableGrowing as TableGrowingComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TableGrowing extends WebComponent("ui5-table-growing") {

  @JSImport("@ui5/webcomponents/dist/TableGrowing.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = TableGrowing.type

  type Ref = TableGrowingComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the mode of the <code>ui5-table</code> growing.
   * 
   * Available options are:
   * 
   * Button - Shows a More button at the bottom of the table, pressing it will load more rows.
   * 
   * Scroll - The rows are loaded automatically by scrolling to the bottom of the table. If the table is not scrollable,
   * a growing button will be rendered instead to ensure growing functionality.
   *
   * Default: "Button"
   */
  lazy val mode: HtmlAttr[TableGrowingMode] = htmlAttr("mode", StringUnionCodec[TableGrowingMode])
  /**
   * Defines the text that will be displayed below the `text` inside the growing button.
   * Has no effect when mode is set to Scroll.
   *
   * Default: undefined
   */
  lazy val subtext: HtmlAttr[String] = htmlAttr("subtext", StringAsIsCodec)
  /**
   * Defines the text that will be displayed inside the growing button.
   * Has no effect when mode is set to `Scroll`.
   * 
   * **Note:** When not provided and the mode is set to Button, a default text is displayed, corresponding to the
   * current language.
   *
   * Default: undefined
   */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  /**
   * Fired when the growing button is pressed or the user scrolls to the end of the table.
   *
  * | cancelable | bubbles |
  * | :--------: | :-----: |
  * | ❌|✅|
   */
  lazy val onLoadMore: EventProp[Ui5CustomEvent[Ref]]  = new EventProp("load-more")

  // -- Slots --

}

