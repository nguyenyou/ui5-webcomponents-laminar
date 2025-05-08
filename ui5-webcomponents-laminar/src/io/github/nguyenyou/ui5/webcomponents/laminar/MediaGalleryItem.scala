package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distMediaGalleryItemMod.MediaGalleryItem as MediaGalleryItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object MediaGalleryItem extends WebComponent("ui5-media-gallery-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/MediaGalleryItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = MediaGalleryItem.type

  type Ref = MediaGalleryItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines whether the component is in disabled state.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Determines the layout of the item container.
    *
    * Default: "Square"
    */
  lazy val layout: HtmlAttr[MediaGalleryItemLayout] = htmlAttr("layout", StringUnionCodec[MediaGalleryItemLayout])

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  // -- Events --

  // -- Slots --

  /** Defines the content of the thumbnail.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="thumbnail"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val thumbnail: Slot = new Slot("thumbnail")
}
