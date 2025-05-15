package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distCalendarLegendItemMod.CalendarLegendItem as CalendarLegendItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object CalendarLegendItem extends WebComponent("ui5-calendar-legend-item") {

  @JSImport("@ui5/webcomponents/dist/CalendarLegendItem.js", JSImport.Default)
  @js.native object RawImport extends js.Object

  type Self = CalendarLegendItem.type

  type Ref = CalendarLegendItemComponent & dom.HTMLElement

  // -- Attributes --

  /**
   * Defines the text content of the Calendar Legend Item.
   *
   * Default: undefined
   */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)
  /**
   * Defines the type of the Calendar Legend Item.
   *
   * Default: "None"
   */
  lazy val tpe: HtmlAttr[CalendarLegendItemType] = htmlAttr("type", StringUnionCodec[CalendarLegendItemType])

  // -- Events --


  // -- Slots --

}

