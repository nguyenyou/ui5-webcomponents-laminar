package io.github.nguyenyou.ui5.webcomponents.laminar
import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import com.raquo.laminar.tags.CustomHtmlTag
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadCollectionSelectionModeMod.UploadCollectionSelectionMode
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionMod.{
  UploadCollectionItemDeleteEventDetail,
  UploadCollectionSelectionChangeEventDetail
}
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionMod.{
  UploadCollection as UploadCollectionComponent
}
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UploadCollection extends WebComponent("ui5-upload-collection") {

  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollection.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UploadCollection.type

  type Ref = UploadCollectionComponent with dom.HTMLElement

  // -- Attributes --

  /** Defines the accessible ARIA name of the component.
    *
    * Default: undefined
    */
  lazy val accessibleName: HtmlAttr[String] = htmlAttr("accessible-name", StringAsIsCodec)

  /** By default there will be drag and drop overlay shown over the `UploadCollection` when files are dragged. If you
    * don't intend to use drag and drop, set this property.
    *
    * **Note:** It is up to the application developer to add handler for `drop` event and handle it. `UploadCollection`
    * only displays an overlay.
    *
    * Default: false
    */
  lazy val hideDragOverlay: HtmlAttr[Boolean] = htmlAttr("hide-drag-overlay", BooleanAsAttrPresenceCodec)

  /** Allows you to set your own text for the 'No data' description.
    *
    * Default: undefined
    */
  lazy val noDataDescription: HtmlAttr[String] = htmlAttr("no-data-description", StringAsIsCodec)

  /** Allows you to set your own text for the 'No data' text.
    *
    * Default: undefined
    */
  lazy val noDataText: HtmlAttr[String] = htmlAttr("no-data-text", StringAsIsCodec)

  /** Defines the selection mode of the `UploadCollection`.
    *
    * Default: "None"
    */
  lazy val selectionMode: HtmlAttr[UploadCollectionSelectionMode] =
    htmlAttr("selection-mode", StringUnionCodec[UploadCollectionSelectionMode])
  type UploadCollectionSelectionMode = "None" | "Single" | "SingleStart" | "SingleEnd" | "SingleAuto" | "Multiple"

  // -- Events --

  /** Fired when an element is dropped inside the drag and drop overlay.
    *
    * **Note:** The `drop` event is fired only when elements are dropped within the drag and drop overlay and ignored
    * for the other parts of the `UploadCollection`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onItemDelete: EventProp[Ui5CustomEvent[Ref] & EventDetail[UploadCollectionItemDeleteEventDetail]] =
    new EventProp("item-delete")

  /** Fired when selection is changed by user interaction in `Single` and `Multiple` modes.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onSelectionChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[UploadCollectionSelectionChangeEventDetail]] =
    new EventProp("selection-change")

  // -- Slots --

  /** Defines the `UploadCollection` header.
    *
    * **Note:** If `header` slot is provided, the labelling of the `UploadCollection` is a responsibility of the
    * application developer. `accessibleName` should be used.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute (`slot="header"`).
    * Since you can't change the DOM order of slots when declaring them within a prop, it might prove beneficial to
    * manually mount them as part of the component's children, especially when facing problems with the reading order of
    * screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val header: Slot = new Slot("header")
}
