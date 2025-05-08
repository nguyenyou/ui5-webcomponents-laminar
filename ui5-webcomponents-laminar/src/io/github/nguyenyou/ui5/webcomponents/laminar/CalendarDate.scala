package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarDateMod.CalendarDate as CalendarDateComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object CalendarDate extends WebComponent("ui5-date") {

  @JSImport("@ui5/webcomponents/dist/CalendarDate.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = CalendarDate.type

  type Ref = CalendarDateComponent & dom.HTMLElement

  // -- Attributes --

  /** The date formatted according to the `formatPattern` property of the `Calendar` that hosts the component.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
