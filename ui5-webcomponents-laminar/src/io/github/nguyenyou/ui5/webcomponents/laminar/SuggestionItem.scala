package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSuggestionItemMod.{
  SuggestionItem as SuggestionItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SuggestionItem extends WebComponent("ui5-suggestion-item") {

  @JSImport("@ui5/webcomponents/dist/SuggestionItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SuggestionItem.type

  type Ref = SuggestionItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the `additionalText`, displayed in the end of the item.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] =
    htmlAttr("additional-text", StringAsIsCodec)

  /** Defines the text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
