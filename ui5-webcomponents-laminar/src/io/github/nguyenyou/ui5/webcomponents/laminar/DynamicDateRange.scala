package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRange as DynamicDateRangeComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object DynamicDateRange extends WebComponent("ui5-dynamic-date-range") {

  @JSImport("@ui5/webcomponents/dist/DynamicDateRange.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = DynamicDateRange.type

  type Ref = DynamicDateRangeComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the options listed as a string, separated by commas and using capital case. Example: "TODAY, YESTERDAY,
    * DATERANGE"
    */
  lazy val options: HtmlAttr[String] = htmlAttr("options", StringAsIsCodec)

  // -- Events --

  /** Fired when the input operation has finished by pressing Enter or on focusout or a value is selected in the
    * popover.
    *
    * **Note:** Call `event.preventDefault()` inside the handler of this event to prevent its default action/s.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ✅      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref]] = new EventProp("change")

  // -- Slots --

}
