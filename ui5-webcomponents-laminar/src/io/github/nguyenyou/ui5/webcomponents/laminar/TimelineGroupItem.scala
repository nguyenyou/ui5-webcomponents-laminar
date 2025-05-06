package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTimelineGroupItemMod.{
  TimelineGroupItem as TimelineGroupItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object TimelineGroupItem extends WebComponent("ui5-timeline-group-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/TimelineGroupItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = TimelineGroupItem.type

  type Ref = TimelineGroupItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Determines if the group is collapsed or expanded.
    *
    * Default: false
    */
  lazy val collapsed: HtmlAttr[Boolean] = htmlAttr("collapsed", BooleanAsAttrPresenceCodec)

  /** Defines the text of the button that expands and collapses the group.
    *
    * Default: undefined
    */
  lazy val groupName: HtmlAttr[String] = htmlAttr("group-name", StringAsIsCodec)

  // -- Events --

  /** Fired when the group item is expanded or collapsed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onToggle: EventProp[Ui5CustomEvent[Ref]] = new EventProp("toggle")

  // -- Slots --

}
