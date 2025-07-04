package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuItemGroupMod.UserMenuItemGroup as UserMenuItemGroupComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UserMenuItemGroup extends WebComponent("ui5-user-menu-item-group") {

  @JSImport("@ui5/webcomponents-fiori/dist/UserMenuItemGroup.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UserMenuItemGroup.type

  type Ref = UserMenuItemGroupComponent & dom.HTMLElement

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
