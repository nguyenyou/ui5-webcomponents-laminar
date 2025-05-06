package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFilterItemOptionMod.FilterItemOption as FilterItemOptionComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FilterItemOption extends WebComponent("ui5-filter-item-option") {

  @JSImport("@ui5/webcomponents-fiori/dist/FilterItemOption.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FilterItemOption.type

  type Ref = FilterItemOptionComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines if the component is selected.
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
