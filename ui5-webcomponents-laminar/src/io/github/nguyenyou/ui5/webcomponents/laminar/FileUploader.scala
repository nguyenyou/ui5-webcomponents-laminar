package io.github.nguyenyou.ui5.webcomponents.laminar

import com.raquo.laminar.api.L.*
import com.raquo.laminar.codecs.*
import io.github.nguyenyou.ui5.webcomponents.laminar.shared.*
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFileUploaderMod.FileUploader as FileUploaderComponent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFileUploaderMod.FileUploaderChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distFileUploaderMod.FileUploaderFileSizeExceedEventDetail
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.*

object FileUploader extends WebComponent("ui5-file-uploader") {

  @JSImport("@ui5/webcomponents/dist/FileUploader.js", JSImport.Default)
  @js.native
  object RawImport extends js.Object

  type Self = FileUploader.type

  type Ref = FileUploaderComponent with dom.HTMLElement

  // -- Attributes --

  /** Comma-separated list of file types that the component should accept.
    *
    * **Note:** Please make sure you are adding the `.` in front on the file type, e.g. `.png` in case you want to
    * accept png's only.
    *
    * Default: undefined
    */
  lazy val accept: HtmlAttr[String] = htmlAttr("accept", StringAsIsCodec)

  /** Defines whether the component is in disabled state.
    *
    * **Note:** A disabled component is completely noninteractive.
    *
    * Default: false
    */
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** If set to "true", the input field of component will not be rendered. Only the default slot that is passed will be
    * rendered.
    *
    * Default: false
    */
  lazy val hideInput: HtmlAttr[Boolean] = htmlAttr("hide-input", BooleanAsAttrPresenceCodec)

  /** Defines the maximum file size in megabytes which prevents the upload if at least one file exceeds it.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents**.
    *
    * Default: undefined
    */
  lazy val maxFileSize: HtmlAttr[Double] = htmlAttr("max-file-size", DoubleAsStringCodec)

  /** Allows multiple files to be chosen.
    *
    * Default: false
    */
  lazy val multiple: HtmlAttr[Boolean] = htmlAttr("multiple", BooleanAsAttrPresenceCodec)

  /** Determines the name by which the component will be identified upon submission in an HTML form.
    *
    * **Note:** This property is only applicable within the context of an HTML Form element.
    *
    * Default: undefined
    */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Defines a short hint intended to aid the user with data entry when the component has no value.
    *
    * Default: undefined
    */
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)

  /** Defines the name/names of the file/files to upload.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** Defines the value state of the component.
    *
    * Default: "None"
    */
  lazy val valueState: HtmlAttr[ValueState] = htmlAttr("value-state", StringUnionCodec[ValueState])
  type ValueState = "None" | "Positive" | "Critical" | "Negative" | "Information"

  // -- Events --

  /** Event is fired when the value of the file path has been changed.
    *
    * **Note:** Keep in mind that because of the HTML input element of type file, the event is also fired in Chrome
    * browser when the Cancel button of the uploads window is pressed.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onChange: EventProp[Ui5CustomEvent[Ref] & EventDetail[FileUploaderChangeEventDetail]] = new EventProp(
    "change"
  )

  /** Event is fired when the size of a file is above the `maxFileSize` property value.
    *
    * **Note:** Available since [v2.2.0](https://github.com/SAP/ui5-webcomponents/releases/tag/v2.2.0) of
    * **@ui5/webcomponents**.
    *
    * | cancelable | bubbles |
    * |:----------:|:-------:|
    * |     ❌      |    ✅    |
    */
  lazy val onFileSizeExceed: EventProp[Ui5CustomEvent[Ref] & EventDetail[FileUploaderFileSizeExceedEventDetail]] =
    new EventProp("file-size-exceed")

  // -- Slots --

  /** Defines the value state message that will be displayed as pop up under the component.
    *
    * **Note:** If not specified, a default text (in the respective language) will be displayed.
    *
    * **Note:** The `valueStateMessage` would be displayed, when the component is in `Information`, `Critical` or
    * `Negative` value state.
    *
    * __Note:__ The content of the prop will be rendered into a
    * [&lt;slot&gt;](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/slot) by assigning the respective
    * [slot](https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/slot) attribute
    * (`slot="valueStateMessage"`). Since you can't change the DOM order of slots when declaring them within a prop, it
    * might prove beneficial to manually mount them as part of the component's children, especially when facing problems
    * with the reading order of screen readers.
    *
    * __Note:__ When passing a custom React component to this prop, you have to make sure your component reads the
    * `slot` prop and appends it to the most outer element of your component. Learn more about it
    * [here](https://sap.github.io/ui5-webcomponents-react/v2/?path=/docs/knowledge-base-handling-slots--docs).
    */
  lazy val valueStateMessage: Slot = new Slot("valueStateMessage")
}
