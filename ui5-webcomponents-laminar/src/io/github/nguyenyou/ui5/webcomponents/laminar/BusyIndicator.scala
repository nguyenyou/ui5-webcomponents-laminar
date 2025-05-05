package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorSizeMod.BusyIndicatorSize
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorTextPlacementMod.BusyIndicatorTextPlacement
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distBusyIndicatorMod.{
  BusyIndicator as BusyIndicatorComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object BusyIndicator extends WebComponent("ui5-busy-indicator") {

  @JSImport("@ui5/webcomponents/dist/BusyIndicator.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = BusyIndicator.type

  type Ref = BusyIndicatorComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines if the busy indicator is visible on the screen. By default it is
    * not.
    *
    * Default: false
    */
  lazy val active: HtmlAttr[Boolean] =
    htmlAttr("active", BooleanAsAttrPresenceCodec)

  /** Defines the delay in milliseconds, after which the busy indicator will be
    * visible on the screen.
    *
    * Default: 1000
    */
  lazy val delay: HtmlAttr[Double] = htmlAttr("delay", DoubleAsStringCodec)

  /** Defines the size of the component.
    *
    * Default: "M"
    */
  lazy val size: HtmlAttr[BusyIndicatorSize] =
    htmlAttr("size", StringUnionCodec[BusyIndicatorSize])
  type BusyIndicatorSize = "S" | "M" | "L"

  /** Defines text to be displayed below the component. It can be used to inform
    * the user of the current operation.
    *
    * Default: undefined
    */
  lazy val text: HtmlAttr[String] = htmlAttr("text", StringAsIsCodec)

  /** Defines the placement of the text.
    *
    * Default: "Bottom"
    */
  lazy val textPlacement: HtmlAttr[BusyIndicatorTextPlacement] =
    htmlAttr("text-placement", StringUnionCodec[BusyIndicatorTextPlacement])
  type BusyIndicatorTextPlacement = "Top" | "Bottom"

  // -- Events --

  // -- Slots --

}
