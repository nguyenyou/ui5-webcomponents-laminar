package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.{
  ColorPaletteItem as ColorPaletteItemComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ColorPaletteItem extends WebComponent("ui5-color-palette-item") {

  @JSImport("@ui5/webcomponents/dist/ColorPaletteItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ColorPaletteItem.type

  type Ref = ColorPaletteItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines if the component is selected.
    *
    * **Note:** Only one item must be selected per
    * <code>ui5-color-palette</code>. If more than one item is defined as
    * selected, the last one would be considered as the selected one.
    *
    * **Note:** Available since
    * [v2.0.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.0.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] =
    htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the colour of the component.
    *
    * **Note:** The value should be a valid CSS color.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  // -- Events --

  // -- Slots --

}
