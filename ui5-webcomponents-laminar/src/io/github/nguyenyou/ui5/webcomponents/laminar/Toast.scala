package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToastMod.Toast as ToastComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object Toast extends WebComponent("ui5-toast") {

  @JSImport("@ui5/webcomponents/dist/Toast.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = Toast.type

  type Ref = ToastComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the duration in milliseconds for which component remains on the screen before it's automatically closed.
    *
    * **Note:** The minimum supported value is `500` ms and even if a lower value is set, the duration would remain
    * `500` ms.
    *
    * Default: 3000
    */
  lazy val duration: HtmlAttr[Double] = htmlAttr("duration", DoubleAsStringCodec)

  /** Indicates whether the component is open (visible).
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines the placement of the component.
    *
    * Default: "BottomCenter"
    */
  lazy val placement: HtmlAttr[ToastPlacement] = htmlAttr("placement", StringUnionCodec[ToastPlacement])

  // -- Events --

  /** Fired after the component is auto closed.
    *
    * **Note:** Available since [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  // -- Slots --

}
