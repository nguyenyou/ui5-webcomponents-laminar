package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.std.SubmitEvent
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Filesizeexceed
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputAccInfo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.FileList
import org.scalajs.dom.FormData
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLFormElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFileUploaderMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-file-uploader` opens a file explorer dialog and enables users to upload files.
    * The component consists of input field, but you can provide an HTML element by your choice
    * to trigger the file upload, by using the default slot.
    * Furthermore, you can set the property "hideInput" to "true" to hide the input field.
    *
    * To get all selected files, you can simply use the read-only "files" property.
    * To restrict the types of files the user can select, you can use the "accept" property.
    *
    * And, similar to all input based components, the FileUploader supports "valueState", "placeholder", "name", and "disabled" properties.
    *
    * For the `ui5-file-uploader`
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/FileUploader.js";`
    * @constructor
    * @since 1.0.0-rc.6
    * @extends UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/FileUploader.js", JSImport.Default)
  @js.native
  open class default () extends FileUploader
  object default {
    
    @JSImport("@ui5/webcomponents/dist/FileUploader.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/FileUploader.js", "default.emptyInput")
    @js.native
    def emptyInput: HTMLInputElement = js.native
    inline def emptyInput_=(x: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyInput")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/FileUploader.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait FileData extends StObject {
    
    var fileName: String
    
    var fileSize: Double
  }
  object FileData {
    
    inline def apply(fileName: String, fileSize: Double): FileData = {
      val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileData] (val x: Self) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-file-uploader` opens a file explorer dialog and enables users to upload files.
    * The component consists of input field, but you can provide an HTML element by your choice
    * to trigger the file upload, by using the default slot.
    * Furthermore, you can set the property "hideInput" to "true" to hide the input field.
    *
    * To get all selected files, you can simply use the read-only "files" property.
    * To restrict the types of files the user can select, you can use the "accept" property.
    *
    * And, similar to all input based components, the FileUploader supports "valueState", "placeholder", "name", and "disabled" properties.
    *
    * For the `ui5-file-uploader`
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/FileUploader.js";`
    * @constructor
    * @since 1.0.0-rc.6
    * @extends UI5Element
    * @public
    */
  @js.native
  trait FileUploader extends IFormInputElement {
    
    def _clearFileSelection(): Unit = js.native
    
    def _fileNamesList(files: FileList): js.Array[String] = js.native
    
    var _form: HTMLFormElement = js.native
    
    def _formWidth: Double = js.native
    
    def _getExceededFiles(files: FileList): js.Array[FileData] = js.native
    
    var _input: HTMLInputElement = js.native
    
    var _messagePopover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def _onChange(e: Event): Unit = js.native
    
    def _onClearIconClick(e: CustomEvent): Unit = js.native
    
    def _onFormSubmit(e: SubmitEvent): Unit = js.native
    
    def _onNativeInputClick(e: MouseEvent): Unit = js.native
    
    def _onTokenizerClick(e: MouseEvent): Unit = js.native
    
    def _onTokenizerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onTokenizerKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _onTokenizerMouseDown(e: MouseEvent): Unit = js.native
    
    def _onclick(): Unit = js.native
    
    def _ondrag(e: DragEvent): Unit = js.native
    
    def _ondrop(e: DragEvent): Unit = js.native
    
    def _onfocusin(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _openFileBrowser(): Unit = js.native
    
    var _selectedFilesNames: js.Array[String] = js.native
    
    var _tokenizer: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTokenizerMod.default = js.native
    
    def _tokenizerExpanded: Boolean = js.native
    
    var _tokenizerOpen: Boolean = js.native
    
    /**
      * Checks whether all files are below `maxFileSize` (if set),
      * and fires a `file-size-exceed` event if any file exceeds it.
      * @private
      */
    def _validateFiles(changedFiles: FileList): FileList = js.native
    
    /**
      * This method is relevant for sap_horizon theme only
      */
    def _valueStateMessageInputIcon: String = js.native
    
    def accInfo: InputAccInfo = js.native
    
    /**
      * Comma-separated list of file types that the component should accept.
      *
      * **Note:** Please make sure you are adding the `.` in front on the file type, e.g. `.png` in case you want to accept png's only.
      * @default undefined
      * @public
      */
    var accept: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.14.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that describe the input.
      * @default undefined
      * @public
      * @since 2.14.0
      */
    var accessibleDescriptionRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 2.13.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input.
      * @default undefined
      * @public
      * @since 2.13.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def clearIconTitle: String = js.native
    
    def closeValueStatePopover(): Unit = js.native
    
    def computedValue: String = js.native
    
    /**
      * This slot allows you to add custom content to the component, such as a button or any other interactive element to trigger the file selection dialog.
      *
      * **Note:** For best accessibility experience, set a `tabindex` of "-1" on your interactive element, or it will be set automatically.
      * This slot is intended for use cases where you want a button-only file uploader.
      * It is recommended to set `hideInput` property to "true" when using this slot.
      * Not setting `hideInput` may negatively impact the screen reader users.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    /**
      * Defines whether the component is in disabled state.
      *
      * **Note:** A disabled component is completely noninteractive.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_FileUploader: Filesizeexceed = js.native
    
    /**
      * FileList of all selected files.
      * @public
      * @default null
      */
    def files: FileList | Null = js.native
    
    /**
      * @private
      */
    var focused: Boolean = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MFileUploader(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MFileUploader: FormData | Null = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * If set to "true", the input field of component will not be rendered. Only the default slot that is passed will be rendered.
      *
      * **Note:** Use this property in combination with the default slot to achieve a button-only file uploader design.
      * @default false
      * @public
      */
    var hideInput: Boolean = js.native
    
    def inputTitle: String = js.native
    
    /**
      * Defines the maximum file size in megabytes which prevents the upload if at least one file exceeds it.
      * @default undefined
      * @since 2.2.0
      * @public
      */
    var maxFileSize: js.UndefOr[Double] = js.native
    
    /**
      * Allows multiple files to be chosen.
      * @default false
      * @public
      */
    var multiple: Boolean = js.native
    
    def openValueStatePopover(): Unit = js.native
    
    /**
      * Defines a short hint intended to aid the user with data entry when the component has no value.
      * @default undefined
      * @public
      */
    var placeholder: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the component is required.
      * @default false
      * @public
      * @since 2.13.0
      */
    var required: Boolean = js.native
    
    def resolvedPlaceholder: String = js.native
    
    def shouldDisplayDefaultValueStateMessage: Boolean = js.native
    
    def shouldOpenValueStateMessagePopover: Boolean = js.native
    
    def toggleValueStatePopover(open: Boolean): Unit = js.native
    
    /**
      * Defines the name/names of the file/files to upload.
      * @default ""
      * @formEvents change
      * @formProperty
      * @public
      */
    var value: String = js.native
    
    def valueHelpTitle: String = js.native
    
    /**
      * Defines the value state of the component.
      * @default "None"
      * @public
      */
    var valueState: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Defines the value state message that will be displayed as pop up under the component.
      *
      * **Note:** If not specified, a default text (in the respective language) will be displayed.
      *
      * **Note:** The `valueStateMessage` would be displayed,
      * when the component is in `Information`, `Critical` or `Negative` value state.
      * @since 1.0.0-rc.9
      * @public
      */
    var valueStateMessage: js.Array[HTMLElement] = js.native
    
    def valueStateText: String = js.native
    
    def valueStateTextMappings: Record[String, String] = js.native
  }
  
  trait FileUploaderChangeEventDetail extends StObject {
    
    var files: FileList | Null
  }
  object FileUploaderChangeEventDetail {
    
    inline def apply(): FileUploaderChangeEventDetail = {
      val __obj = js.Dynamic.literal(files = null)
      __obj.asInstanceOf[FileUploaderChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploaderChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: FileList): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesNull: Self = StObject.set(x, "files", null)
    }
  }
  
  trait FileUploaderFileSizeExceedEventDetail extends StObject {
    
    var filesData: js.Array[FileData]
  }
  object FileUploaderFileSizeExceedEventDetail {
    
    inline def apply(filesData: js.Array[FileData]): FileUploaderFileSizeExceedEventDetail = {
      val __obj = js.Dynamic.literal(filesData = filesData.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileUploaderFileSizeExceedEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileUploaderFileSizeExceedEventDetail] (val x: Self) extends AnyVal {
      
      inline def setFilesData(value: js.Array[FileData]): Self = StObject.set(x, "filesData", value.asInstanceOf[js.Any])
      
      inline def setFilesDataVarargs(value: FileData*): Self = StObject.set(x, "filesData", js.Array(value*))
    }
  }
}
