package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarSpacerMod.ShellBarSpacer as ShellBarSpacerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ShellBarSpacer extends WebComponent("ui5-shellbar-spacer") {

  @JSImport("@ui5/webcomponents-fiori/dist/ShellBarSpacer.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ShellBarSpacer.type

  type Ref = ShellBarSpacerComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
