package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemGroupMod.MenuItemGroup as MenuItemGroupComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MenuItemGroup extends WebComponent("ui5-menu-item-group") {

  @JSImport("@ui5/webcomponents/dist/MenuItemGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MenuItemGroup.type

  type Ref = MenuItemGroupComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the component's check mode.
    *
    * Default: "None"
    */
  lazy val checkMode: HtmlAttr[MenuItemGroupCheckMode] =
    htmlAttr("check-mode", StringUnionCodec[MenuItemGroupCheckMode])

  // -- Events --

  // -- Slots --

}
