package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSpacerMod.ToolbarSpacer as ToolbarSpacerComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToolbarSpacer extends WebComponent("ui5-toolbar-spacer") {

  @JSImport("@ui5/webcomponents/dist/ToolbarSpacer.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ToolbarSpacer.type

  type Ref = ToolbarSpacerComponent with dom.HTMLElement

  // -- Attributes --

  /** Property used to define the access of the item to the overflow Popover. If "NeverOverflow" option is set, the item
    * never goes in the Popover, if "AlwaysOverflow" - it never comes out of it.
    *
    * Default: "Default"
    */
  lazy val overflowPriority: HtmlAttr[ToolbarItemOverflowBehavior] =
    htmlAttr("overflow-priority", StringUnionCodec[ToolbarItemOverflowBehavior])

  /** Defines if the toolbar overflow popup should close upon intereaction with the item. It will close by default.
    *
    * Default: false
    */
  lazy val preventOverflowClosing: HtmlAttr[Boolean] = htmlAttr("prevent-overflow-closing", BooleanAsAttrPresenceCodec)

  /** Defines the width of the spacer.
    *
    * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
    *
    * Default: undefined
    */
  lazy val width: HtmlAttr[String] = htmlAttr("width", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
