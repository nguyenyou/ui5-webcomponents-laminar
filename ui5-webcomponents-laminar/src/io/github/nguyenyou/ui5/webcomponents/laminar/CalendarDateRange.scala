package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarDateRangeMod.CalendarDateRange as CalendarDateRangeComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object CalendarDateRange extends WebComponent("ui5-date-range") {

  @JSImport("@ui5/webcomponents/dist/CalendarDateRange.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = CalendarDateRange.type

  type Ref = CalendarDateRangeComponent with dom.HTMLElement

  // -- Attributes --

  /** End of date range formatted according to the `formatPattern` property of the `Calendar` that hosts the component.
    */
  lazy val endValue: HtmlAttr[String] = htmlAttr("end-value", StringAsIsCodec)

  /** Start of date range formatted according to the `formatPattern` property of the `Calendar` that hosts the
    * component.
    */
  lazy val startValue: HtmlAttr[String] = htmlAttr("start-value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
