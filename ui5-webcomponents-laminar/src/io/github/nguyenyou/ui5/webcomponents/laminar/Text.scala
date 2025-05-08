package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTextMod.Text as TextComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Text extends WebComponent("ui5-text") {

  @JSImport("@ui5/webcomponents/dist/Text.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Text.type

  type Ref = TextComponent & dom.HTMLElement

  // -- Attributes --

  /** Specifies if an empty indicator should be displayed when there is no text.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Off"
    */
  lazy val emptyIndicatorMode: HtmlAttr[TextEmptyIndicatorMode] =
    htmlAttr("empty-indicator-mode", StringUnionCodec[TextEmptyIndicatorMode])

  /** Defines the number of lines the text should wrap before it truncates.
    *
    * Default: Infinity
    */
  lazy val maxLines: HtmlAttr[Double] = htmlAttr("max-lines", DoubleAsStringCodec)

  // -- Events --

  // -- Slots --

}
