package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchMessageAreaMod.SearchMessageArea as SearchMessageAreaComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SearchMessageArea extends WebComponent("ui5-search-message-area") {

  @JSImport("@ui5/webcomponents-fiori/dist/SearchMessageArea.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SearchMessageArea.type

  type Ref = SearchMessageAreaComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the description text to be displayed.
    *
    * Default: undefined
    */
  lazy val description: HtmlAttr[String] = htmlAttr("description", StringAsIsCodec)

  /** Defines the text to be displayed.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
