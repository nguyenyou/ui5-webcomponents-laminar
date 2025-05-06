package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesUploadStateMod.UploadState
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.ListItemAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListItemTypeMod.ListItemType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUploadCollectionItemMod.UploadCollectionItem as UploadCollectionItemComponent
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object UploadCollectionItem extends WebComponent("ui5-upload-collection-item") {

  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = UploadCollectionItem.type

  type Ref = UploadCollectionItemComponent with dom.HTMLElement

  // -- Attributes --

  /** Disables the delete button.
    *
    * Default: false
    */
  lazy val disableDeleteButton: HtmlAttr[Boolean] = htmlAttr("disable-delete-button", BooleanAsAttrPresenceCodec)

  /** The name of the file.
    */
  lazy val fileName: HtmlAttr[String] = htmlAttr("file-name", StringAsIsCodec)

  /** If set to `true` the file name will be clickable and it will fire `file-name-click` event upon click.
    *
    * Default: false
    */
  lazy val fileNameClickable: HtmlAttr[Boolean] = htmlAttr("file-name-clickable", BooleanAsAttrPresenceCodec)

  /** Hides the delete button.
    *
    * Default: false
    */
  lazy val hideDeleteButton: HtmlAttr[Boolean] = htmlAttr("hide-delete-button", BooleanAsAttrPresenceCodec)

  /** Hides the retry button when `uploadState` property is `Error`.
    *
    * Default: false
    */
  lazy val hideRetryButton: HtmlAttr[Boolean] = htmlAttr("hide-retry-button", BooleanAsAttrPresenceCodec)

  /** Hides the terminate button when `uploadState` property is `Uploading`.
    *
    * Default: false
    */
  lazy val hideTerminateButton: HtmlAttr[Boolean] = htmlAttr("hide-terminate-button", BooleanAsAttrPresenceCodec)

  /** Defines the highlight state of the list items. Available options are: `"None"` (by default), `"Positive"`,
    * `"Critical"`, `"Information"` and `"Negative"`.
    *
    * **Note:** Available since [v1.24](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.24) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: "None"
    */
  lazy val highlight: HtmlAttr[Highlight] = htmlAttr("highlight", StringUnionCodec[Highlight])
  type Highlight = "None" | "Positive" | "Critical" | "Negative" | "Information"

  /** The navigated state of the list item. If set to `true`, a navigation indicator is displayed at the end of the list
    * item.
    *
    * **Note:** Available since [v1.10.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.10.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: false
    */
  lazy val navigated: HtmlAttr[Boolean] = htmlAttr("navigated", BooleanAsAttrPresenceCodec)

  /** The upload progress in percentage.
    *
    * **Note:** Expected values are in the interval [0, 100].
    *
    * Default: 0
    */
  lazy val progress: HtmlAttr[Double] = htmlAttr("progress", DoubleAsStringCodec)

  /** Defines the selected state of the component.
    *
    * Default: false
    */
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** Defines the text of the tooltip that would be displayed for the list item.
    *
    * **Note:** Available since [v1.23.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.23.0) of
    * **@ui5/webcomponents-fiori**.
    *
    * Default: undefined
    */
  lazy val tooltip: HtmlAttr[String] = htmlAttr("tooltip", StringAsIsCodec)

  /** Defines the visual indication and behavior of the list items. Available options are `Active` (by default),
    * `Inactive`, `Detail` and `Navigation`.
    *
    * **Note:** When set to `Active` or `Navigation`, the item will provide visual response upon press and hover, while
    * with type `Inactive` and `Detail` - will not.
    *
    * Default: "Active"
    */
  lazy val tpe: HtmlAttr[ListItemType] = htmlAttr("type", StringUnionCodec[ListItemType])
  type ListItemType = "Inactive" | "Active" | "Detail" | "Navigation"

  /** Upload state.
    *
    * Depending on this property, the item displays the following:
    *
    *   - `Ready` - progress indicator is displayed.
    *   - `Uploading` - progress indicator and terminate button are displayed. When the terminate button is pressed,
    *     `terminate` event is fired.
    *   - `Error` - progress indicator and retry button are displayed. When the retry button is pressed, `retry` event
    *     is fired.
    *   - `Complete` - progress indicator is not displayed.
    *
    * Default: "Ready"
    */
  lazy val uploadState: HtmlAttr[UploadState] = htmlAttr("upload-state", StringUnionCodec[UploadState])
  type UploadState = "Complete" | "Error" | "Ready" | "Uploading"

  // -- Events --

  /** Fired when the user clicks on the detail button when type is `Detail`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onDetailClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("detail-click")

  /** Fired when the file name is clicked.
    *
    * **Note:** This event is only available when `fileNameClickable` property is `true`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onFileNameClick: EventProp[Ui5CustomEvent[Ref]] = new EventProp("file-name-click")

  /** Fired when the `fileName` property gets changed.
    *
    * **Note:** An edit button is displayed on each item, when the `UploadCollectionItem` `type` property is set to
    * `Detail`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onRename: EventProp[Ui5CustomEvent[Ref]] = new EventProp("rename")

  /** Fired when the retry button is pressed.
    *
    * **Note:** Retry button is displayed when `uploadState` property is set to `Error`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onRetry: EventProp[Ui5CustomEvent[Ref]] = new EventProp("retry")

  /** Fired when the terminate button is pressed.
    *
    * **Note:** Terminate button is displayed when `uploadState` property is set to `Uploading`.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onTerminate: EventProp[Ui5CustomEvent[Ref]] = new EventProp("terminate")

  // -- Slots --

  /** Defines the delete button, displayed in "Delete" mode. **Note:** While the slot allows custom buttons, to match
    * design guidelines, please use the `ui5-button` component. **Note:** When the slot is not present, a built-in
    * delete button will be displayed.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="deleteButton"`). Since you can't change the DOM order of slots when declaring them within a prop, it might
    * prove beneficial to manually mount them as part of the component's children, especially when facing problems with
    * the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    *
    * **Note:** Available since [v1.9.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v1.9.0) of
    * **@ui5/webcomponents-fiori**.
    */
  lazy val deleteButton: Slot = new Slot("deleteButton")

  /** A thumbnail, which will be shown in the beginning of the `UploadCollectionItem`.
    *
    * **Note:** Use `ui5-icon` or `img` for the intended design.
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
