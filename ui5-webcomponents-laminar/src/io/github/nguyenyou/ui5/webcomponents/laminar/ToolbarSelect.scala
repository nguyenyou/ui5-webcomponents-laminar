package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSelectMod.ToolbarSelectChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarItemOverflowBehaviorMod.ToolbarItemOverflowBehavior
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSelectMod.{
  ToolbarSelect as ToolbarSelectComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ToolbarSelect extends WebComponent("ui5-toolbar-select") {

  @JSImport("@ui5/webcomponents/dist/ToolbarSelect.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ToolbarSelect.type

  type Ref = ToolbarSelectComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Receives id(or many ids) of the elements that label the select.
    *
    * Default: undefined
    */
  lazy val accessibleNameRef: HtmlAttr[String] = htmlAttr("accessible-name-ref", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

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

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" | "Information"

  /** Defines the width of the select.
    *
    * **Note:** all CSS sizes are supported - 'percentage', 'px', 'rem', 'auto', etc.
    *
    * Default: undefined
    */
  lazy val width: HtmlAttr[String] = htmlAttr("width", StringAsIsCodec)

  // -- Events --

  /** Fired when the selected option changes.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[ToolbarSelectChangeEventDetail]] = new EventProp(
    "change"
  )

  /** Fired after the component's dropdown menu closes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired after the component's dropdown menu opens.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOpen: EventProp[Ui5CustomEvent[Ref]] = new EventProp("open")

  // -- Slots --

}
