package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesExpandableTextOverflowModeMod.ExpandableTextOverflowMode
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTextEmptyIndicatorModeMod.TextEmptyIndicatorMode
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distExpandableTextMod.{
  ExpandableText as ExpandableTextComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ExpandableText extends WebComponent("ui5-expandable-text") {

  @JSImport("@ui5/webcomponents/dist/ExpandableText.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ExpandableText.type

  type Ref = ExpandableTextComponent with dom.HTMLElement

  // -- Attributes --

  /** Specifies if an empty indicator should be displayed when there is no text.
    *
    * Default: "Off"
    */
  lazy val emptyIndicatorMode: HtmlAttr[TextEmptyIndicatorMode] =
    htmlAttr("empty-indicator-mode", StringUnionCodec[TextEmptyIndicatorMode])
  type TextEmptyIndicatorMode = "Off" | "On"

  /** Maximum number of characters to be displayed initially. If the text length exceeds this limit, the text will be
    * truncated with an ellipsis, and the "More" link will be displayed.
    *
    * Default: 100
    */
  lazy val maxCharacters: HtmlAttr[Double] = htmlAttr("max-characters", DoubleAsStringCodec)

  /** Determines how the full text will be displayed.
    *
    * Default: "InPlace"
    */
  lazy val overflowMode: HtmlAttr[ExpandableTextOverflowMode] =
    htmlAttr("overflow-mode", StringUnionCodec[ExpandableTextOverflowMode])
  type ExpandableTextOverflowMode = "InPlace" | "Popover"

  /** Text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
