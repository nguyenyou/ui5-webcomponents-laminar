package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTitleLevelMod.TitleLevel
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesWrappingTypeMod.WrappingType
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTitleMod.Title as TitleComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Title extends WebComponent("ui5-title") {

  @JSImport("@ui5/webcomponents/dist/Title.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Title.type

  type Ref = TitleComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the component level. Available options are: `"H6"` to `"H1"`. This property does not influence the style
    * of the component. Use the property `size` for this purpose instead.
    *
    * Default: "H2"
    */
  lazy val level: HtmlAttr[TitleLevel] = htmlAttr("level", StringUnionCodec[TitleLevel])
  type TitleLevel = "H1" | "H2" | "H3" | "H4" | "H5" | "H6"

  /** Defines the visual appearance of the title. Available options are: `"H6"` to `"H1"`.
    *
    * Default: "H5"
    */
  lazy val size: HtmlAttr[TitleLevel] = htmlAttr("size", StringUnionCodec[TitleLevel])

  /** Defines how the text of a component will be displayed when there is not enough space.
    *
    * **Note:** for option "Normal" the text will wrap and the words will not be broken based on hyphenation.
    *
    * Default: "Normal"
    */
  lazy val wrappingType: HtmlAttr[WrappingType] = htmlAttr("wrapping-type", StringUnionCodec[WrappingType])
  type WrappingType = "None" | "Normal"

  // -- Events --

  // -- Slots --

}
