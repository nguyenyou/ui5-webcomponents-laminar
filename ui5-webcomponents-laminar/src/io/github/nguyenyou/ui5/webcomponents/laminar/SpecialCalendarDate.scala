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

  type Ref = SpecialCalendarDateComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the type of the special date.
    *
    * Default: "None"
    */
  lazy val tpe: HtmlAttr[CalendarLegendItemType] = htmlAttr("type", StringUnionCodec[CalendarLegendItemType])

  /** The date formatted according to the `formatPattern` property of the `Calendar` that hosts the component.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
