package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuSeparatorMod.{
  MenuSeparator as MenuSeparatorComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MenuSeparator extends WebComponent("ui5-menu-separator") {

  @JSImport("@ui5/webcomponents/dist/MenuSeparator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MenuSeparator.type

  type Ref = MenuSeparatorComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
