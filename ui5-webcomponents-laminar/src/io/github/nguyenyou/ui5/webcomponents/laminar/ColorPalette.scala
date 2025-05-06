package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.ColorPalette as ColorPaletteComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.ColorPaletteItemClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ColorPalette extends WebComponent("ui5-color-palette") {

  @JSImport("@ui5/webcomponents/dist/ColorPalette.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ColorPalette.type

  type Ref = ColorPaletteComponent with dom.HTMLElement

  // -- Attributes --

  // -- Events --

  /** Fired when the user selects a color.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ❌    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[ColorPaletteItemClickEventDetail]] = new EventProp(
    "item-click"
  )

  // -- Slots --

}
