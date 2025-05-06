package io.github.nguyenyou.ui5.webcomponents.laminar
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distProductSwitchMod.ProductSwitch as ProductSwitchComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ProductSwitch extends WebComponent("ui5-product-switch") {

  @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ProductSwitch.type

  type Ref = ProductSwitchComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  // -- Slots --

}
