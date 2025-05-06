package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPalettePopoverMod.ColorPalettePopover as ColorPalettePopoverComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPalettePopoverMod.ColorPalettePopoverItemClickEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object ColorPalettePopover extends WebComponent("ui5-color-palette-popover") {

  @JSImport("@ui5/webcomponents/dist/ColorPalettePopover.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = ColorPalettePopover.type

  type Ref = ColorPalettePopoverComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the default color of the component.
    *
    * **Note:** The default color should be a part of the ColorPalette colors`
    *
    * Default: undefined
    */
  lazy val defaultColor: HtmlAttr[String] = htmlAttr("default-color", StringAsIsCodec)

  /** Defines the open | closed state of the popover.
    *
    * **Note:** Available since [v1.21.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.21.0) of
    * **@ui5/webcomponents**.
    *
    * Default: false
    */
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Defines the ID or DOM Reference of the element that the popover is shown at. When using this attribute in a
    * declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
    * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
    *
    * **Note:** Available since [v1.21.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.21.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val openerId: HtmlAttr[String] = htmlAttr("opener", StringAsIsCodec)

  /** Defines whether the user can choose the default color from a button.
    *
    * Default: false
    */
  lazy val showDefaultColor: HtmlAttr[Boolean] = htmlAttr("show-default-color", BooleanAsAttrPresenceCodec)

  /** Defines whether the user can choose a custom color from a component.
    *
    * Default: false
    */
  lazy val showMoreColors: HtmlAttr[Boolean] = htmlAttr("show-more-colors", BooleanAsAttrPresenceCodec)

  /** Defines whether the user can see the last used colors in the bottom of the component
    *
    * Default: false
    */
  lazy val showRecentColors: HtmlAttr[Boolean] = htmlAttr("show-recent-colors", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the `ColorPalettePopover` is closed due to user interaction.
    *
    * **Note:** Available since [v1.21.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.21.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onClose: EventProp[Ui5CustomEvent[Ref]] = new EventProp("close")

  /** Fired when the user selects a color.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemClick: EventProp[Ui5CustomEvent[Ref] & EventDetail[ColorPalettePopoverItemClickEventDetail]] =
    new EventProp("item-click")

  // -- Slots --

}
