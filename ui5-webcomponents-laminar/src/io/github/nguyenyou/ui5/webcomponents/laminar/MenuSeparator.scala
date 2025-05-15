package io.github.nguyenyou.ui5.webcomponents.laminar

import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuSeparatorMod.MenuSeparator as MenuSeparatorComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MenuSeparator extends WebComponent("ui5-menu-separator") {

  @JSImport("@ui5/webcomponents/dist/MenuSeparator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MenuSeparator.type

  type Ref = MenuSeparatorComponent & dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
