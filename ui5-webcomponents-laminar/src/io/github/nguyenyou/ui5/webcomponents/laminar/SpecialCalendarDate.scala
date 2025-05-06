package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSpecialCalendarDateMod.SpecialCalendarDate as SpecialCalendarDateComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SpecialCalendarDate extends WebComponent("ui5-special-date") {

  @JSImport("@ui5/webcomponents/dist/SpecialCalendarDate.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SpecialCalendarDate.type

  type Ref = SpecialCalendarDateComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the type of the special date.
    *
    * Default: "None"
    */
  lazy val tpe: HtmlAttr[CalendarLegendItemType] = htmlAttr("type", StringUnionCodec[CalendarLegendItemType])
  type CalendarLegendItemType = "Today" | "Selected" | "None" | "Working" | "NonWorking" | "Type01" | "Type02" |
    "Type03" | "Type04" | "Type05" | "Type06" | "Type07" | "Type08" | "Type09" | "Type10" | "Type11" | "Type12" |
    "Type13" | "Type14" | "Type15" | "Type16" | "Type17" | "Type18" | "Type19" | "Type20"

  /** The date formatted according to the `formatPattern` property of the `Calendar` that hosts the component.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
