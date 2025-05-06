package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxItemMod.{
  ComboBoxItem as ComboBoxItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ComboBoxItem extends WebComponent("ui5-cb-item") {

  @JSImport("@ui5/webcomponents/dist/ComboBoxItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ComboBoxItem.type

  type Ref = ComboBoxItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the additional text of the component.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] = htmlAttr("additional-text", StringAsIsCodec)

  /** Defines the text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
