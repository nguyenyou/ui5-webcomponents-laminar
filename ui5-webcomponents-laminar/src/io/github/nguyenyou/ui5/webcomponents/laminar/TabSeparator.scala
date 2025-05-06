package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTabSeparatorMod.TabSeparator as TabSeparatorComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TabSeparator extends WebComponent("ui5-tab-separator") {

  @JSImport("@ui5/webcomponents/dist/TabSeparator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TabSeparator.type

  type Ref = TabSeparatorComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
