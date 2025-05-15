package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxItemMod.MultiComboBoxItem as MultiComboBoxItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MultiComboBoxItem extends WebComponent("ui5-mcb-item") {

  @JSImport("@ui5/webcomponents/dist/MultiComboBoxItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MultiComboBoxItem.type

  type Ref = MultiComboBoxItemComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the additional text of the component.
    *
    * Default: undefined
    */
  lazy val additionalText: HtmlAttr[String] = htmlAttr("additional-text", StringAsIsCodec)

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the component.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
