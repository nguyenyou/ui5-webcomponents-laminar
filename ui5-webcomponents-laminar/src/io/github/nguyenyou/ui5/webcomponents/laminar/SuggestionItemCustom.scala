package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSuggestionItemCustomMod.{
  SuggestionItemCustom as SuggestionItemCustomComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SuggestionItemCustom extends WebComponent("ui5-suggestion-item-custom") {

  @JSImport("@ui5/webcomponents/dist/SuggestionItemCustom.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SuggestionItemCustom.type

  type Ref = SuggestionItemCustomComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the text of the `SuggestionItemCustom`. **Note:** The text
    * property is considered only for autocomplete.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
