package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryMod.MediaGallerySelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryLayoutMod.MediaGalleryLayout
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuHorizontalAlignMod.MediaGalleryMenuHorizontalAlign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesMediaGalleryMenuVerticalAlignMod.MediaGalleryMenuVerticalAlign
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryMod.{
  MediaGallery as MediaGalleryComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MediaGallery extends WebComponent("ui5-media-gallery") {

  @JSImport("@ui5/webcomponents-fiori/dist/MediaGallery.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MediaGallery.type

  type Ref = MediaGalleryComponent with dom.HTMLElement

  // -- Attributes --

  /** If enabled, a `display-area-click` event is fired when the user clicks or taps on the display area.
    *
    * The display area is the central area that contains the enlarged content of the currently selected item.
    *
    * Default: false
    */
  lazy val interactiveDisplayArea: HtmlAttr[Boolean] = htmlAttr("interactive-display-area", BooleanAsAttrPresenceCodec)

  /** Determines the layout of the component.
    *
    * Default: "Auto"
    */
  lazy val layout: HtmlAttr[MediaGalleryLayout] = htmlAttr("layout", StringUnionCodec[MediaGalleryLayout])
  type MediaGalleryLayout = "Auto" | "Vertical" | "Horizontal"

  /** Determines the horizontal alignment of the thumbnails menu vs. the central display area.
    *
    * Default: "Left"
    */
  lazy val menuHorizontalAlign: HtmlAttr[MediaGalleryMenuHorizontalAlign] =
    htmlAttr("menu-horizontal-align", StringUnionCodec[MediaGalleryMenuHorizontalAlign])
  type MediaGalleryMenuHorizontalAlign = "Left" | "Right"

  /** Determines the vertical alignment of the thumbnails menu vs. the central display area.
    *
    * Default: "Bottom"
    */
  lazy val menuVerticalAlign: HtmlAttr[MediaGalleryMenuVerticalAlign] =
    htmlAttr("menu-vertical-align", StringUnionCodec[MediaGalleryMenuVerticalAlign])
  type MediaGalleryMenuVerticalAlign = "Top" | "Bottom"

  /** If set to `true`, all thumbnails are rendered in a scrollable container. If `false`, only up to five thumbnails
    * are rendered, followed by an overflow button that shows the count of the remaining thumbnails.
    *
    * Default: false
    */
  lazy val showAllThumbnails: HtmlAttr[Boolean] = htmlAttr("show-all-thumbnails", BooleanAsAttrPresenceCodec)

  // -- Events --

  /** Fired when the display area is clicked. The display area is the central area that contains the enlarged content of
    * the currently selected item.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onDisplayAreaClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("display-area-click")

  /** Fired when the thumbnails overflow button is clicked.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onOverflowClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("overflow-click")

  /** Fired when selection is changed by user interaction.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[MediaGallerySelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

}
