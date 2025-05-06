package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSeparatorMod.ToolbarSeparator as ToolbarSeparatorComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToolbarSeparator extends WebComponent("ui5-toolbar-separator") {

  @JSImport("@ui5/webcomponents/dist/ToolbarSeparator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ToolbarSeparator.type

  type Ref = ToolbarSeparatorComponent with dom.HTMLElement

  // -- Attributes --

  /** Property used to define the access of the item to the overflow Popover. If "NeverOverflow" option is set, the item
    * never goes in the Popover, if "AlwaysOverflow" - it never comes out of it.
    *
    * Default: "Default"
    */
  lazy val overflowPriority: HtmlAttr[ToolbarItemOverflowBehavior] =
    htmlAttr("overflow-priority", StringUnionCodec[ToolbarItemOverflowBehavior])
  type ToolbarItemOverflowBehavior = "Default" | "NeverOverflow" | "AlwaysOverflow"

  /** Defines if the toolbar overflow popup should close upon intereaction with the item. It will close by default.
    *
    * Default: false
    */
  lazy val preventOverflowClosing: HtmlAttr[Boolean] = htmlAttr("prevent-overflow-closing", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

}
