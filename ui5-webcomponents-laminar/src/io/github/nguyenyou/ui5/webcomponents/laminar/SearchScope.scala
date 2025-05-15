package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSearchScopeMod.SearchScope as SearchScopeComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SearchScope extends WebComponent("ui5-search-scope") {

  @JSImport("@ui5/webcomponents-fiori/dist/SearchScope.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = SearchScope.type

  type Ref = SearchScopeComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Indicates whether the item is selected
   *
   * Default: false
   */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  /**
   * Defines the text of the component.
   */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  // -- Events --


  // -- Slots --

}

