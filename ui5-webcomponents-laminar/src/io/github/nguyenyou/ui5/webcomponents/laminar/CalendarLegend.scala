package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendMod.CalendarLegend as CalendarLegendComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object CalendarLegend extends WebComponent("ui5-calendar-legend") {

  @JSImport("@ui5/webcomponents/dist/CalendarLegend.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = CalendarLegend.type

  type Ref = CalendarLegendComponent & dom.HTMLElement

  // -- Attributes --

  /** Hides the Non-Working day item in the legend.
    *
    * Default: false
    */
  lazy val hideNonWorkingDay: HtmlAttr[Boolean] = htmlAttr("hide-non-working-day", BooleanAsAttrPresenceCodec)

  /** Hides the Selected day item in the legend.
    *
    * Default: false
    */
  lazy val hideSelectedDay: HtmlAttr[Boolean] = htmlAttr("hide-selected-day", BooleanAsAttrPresenceCodec)

  /** Hides the Today item in the legend.
    *
    * Default: false
    */
  lazy val hideToday: HtmlAttr[Boolean] = htmlAttr("hide-today", BooleanAsAttrPresenceCodec)

  /** Hides the Working day item in the legend.
    *
    * Default: false
    */
  lazy val hideWorkingDay: HtmlAttr[Boolean] = htmlAttr("hide-working-day", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

}
