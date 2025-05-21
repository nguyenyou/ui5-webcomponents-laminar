package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Detailclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesValueStateMod.ValueState
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Filenameclick
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import org.scalajs.dom.File
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUploadCollectionItemMod {
  
  /**
    * @class
    *
    * ### Overview
    * A component to be used within the `ui5-upload-collection`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";`
    * @constructor
    * @extends ListItem
    * @public
    * @slot {Node[]} default - Hold the description of the `ui5-upload-collection-item`. Will be shown below the file name.
    * @since 1.0.0-rc.7
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", JSImport.Default)
  @js.native
  open class default () extends UploadCollectionItem
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/UploadCollectionItem", "default.i18nFioriBundle")
    @js.native
    def i18nFioriBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nFioriBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nFioriBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * A component to be used within the `ui5-upload-collection`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/UploadCollectionItem.js";`
    * @constructor
    * @extends ListItem
    * @public
    * @slot {Node[]} default - Hold the description of the `ui5-upload-collection-item`. Will be shown below the file name.
    * @since 1.0.0-rc.7
    */
  @js.native
  trait UploadCollectionItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.default {
    
    def _cancelRenameBtnText: String = js.native
    
    def _editButtonTooltip: String = js.native
    
    /**
      * Indicates if editing.
      * @default false
      * @private
      */
    var _editing: Boolean = js.native
    
    def _fileExtension: String = js.native
    
    def _fileNameWithoutExtension: String = js.native
    
    def _focus(): Unit = js.native
    
    def _initInputField(): js.Promise[Unit] = js.native
    
    def _onDelete(): Unit = js.native
    
    def _onDetailKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onFileNameClick(): Unit = js.native
    
    def _onInputFocusin(e: FocusEvent): Unit = js.native
    
    def _onInputKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onRename(): Unit = js.native
    
    def _onRenameCancel(e: KeyboardEvent): js.Promise[Unit] = js.native
    
    def _onRenameCancelKeyup(e: KeyboardEvent): Unit = js.native
    
    @JSName("_onRenameCancel")
    def _onRenameCancel_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): js.Promise[Unit] = js.native
    
    def _onRenameKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onRetry(): Unit = js.native
    
    def _onRetryKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onTerminate(): Unit = js.native
    
    def _onTerminateKeyup(e: KeyboardEvent): Unit = js.native
    
    def _progressText: String = js.native
    
    def _renameBtnText: String = js.native
    
    def _retryButtonTooltip: String = js.native
    
    def _showProgressIndicator: Boolean = js.native
    
    def _showRetry: Boolean = js.native
    
    def _showTerminate: Boolean = js.native
    
    def _terminateButtonTooltip: String = js.native
    
    /**
      * Disables the delete button.
      * @default false
      * @public
      */
    var disableDeleteButton: Boolean = js.native
    
    def editInpElement: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | Null = js.native
    
    @JSName("eventDetails")
    var eventDetails_UploadCollectionItem: Focused & Detailclick & Filenameclick = js.native
    
    /**
      * Holds an instance of `File` associated with this item.
      * @default null
      * @public
      */
    var file: File | Null = js.native
    
    /**
      * The name of the file.
      * @default ""
      * @public
      */
    var fileName: String = js.native
    
    /**
      * If set to `true` the file name will be clickable and it will fire `file-name-click` event upon click.
      * @default false
      * @public
      */
    var fileNameClickable: Boolean = js.native
    
    /**
      * Hides the delete button.
      * @default false
      * @public
      */
    var hideDeleteButton: Boolean = js.native
    
    /**
      * Hides the retry button when `uploadState` property is `Error`.
      * @default false
      * @public
      */
    var hideRetryButton: Boolean = js.native
    
    /**
      * Hides the terminate button when `uploadState` property is `Uploading`.
      * @default false
      * @public
      */
    var hideTerminateButton: Boolean = js.native
    
    /**
      * The upload progress in percentage.
      *
      * **Note:** Expected values are in the interval [0, 100].
      * @default 0
      * @public
      */
    var progress: Double = js.native
    
    def showEditButton: Boolean = js.native
    
    /**
      * A thumbnail, which will be shown in the beginning of the `ui5-upload-collection-item`.
      *
      * **Note:** Use `ui5-icon` or `img` for the intended design.
      * @public
      */
    var thumbnail: js.Array[HTMLElement] = js.native
    
    /**
      * Upload state.
      *
      * Depending on this property, the item displays the following:
      *
      * - `Ready` - progress indicator is displayed.
      * - `Uploading` - progress indicator and terminate button are displayed. When the terminate button is pressed, `terminate` event is fired.
      * - `Error` - progress indicator and retry button are displayed. When the retry button is pressed, `retry` event is fired.
      * - `Complete` - progress indicator is not displayed.
      *
      * @default "Ready"
      * @public
      */
    var uploadState: /* template literal string: ${UploadState} */ String = js.native
    
    def valueStateName: ValueState = js.native
  }
}
