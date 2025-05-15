package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSelectOptionMod.ToolbarSelectOption as ToolbarSelectOptionComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToolbarSelectOption extends WebComponent("ui5-toolbar-select-option") {

  @JSImport("@ui5/webcomponents/dist/ToolbarSelectOption.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = ToolbarSelectOption.type

  type Ref = ToolbarSelectOptionComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the selected state of the component.
   *
   * Default: false
   */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  // -- Events --


  // -- Slots --

}

