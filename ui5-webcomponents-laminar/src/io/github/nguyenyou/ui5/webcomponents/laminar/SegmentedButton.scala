package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonMod.SegmentedButton as SegmentedButtonComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonMod.SegmentedButtonSelectionChangeEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object SegmentedButton extends WebComponent("ui5-segmented-button") {

  @JSImport("@ui5/webcomponents/dist/SegmentedButton.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = SegmentedButton.type

  type Ref = SegmentedButtonComponent & dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * **Note:** Available since [v1.0.3](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.0.3) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** Defines the component selection mode.
    *
    * **Note:** Available since [v1.14.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.14.0) of
    * **@ui5/webcomponents**.
    *
    * Default: "Single"
    */
  lazy val selectionMode: HtmlAttr[SegmentedButtonSelectionMode] =
    htmlAttr("selection-mode", StringUnionCodec[SegmentedButtonSelectionMode])

  // -- Events --

  /** Fired when the selected item changes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[SegmentedButtonSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

}
