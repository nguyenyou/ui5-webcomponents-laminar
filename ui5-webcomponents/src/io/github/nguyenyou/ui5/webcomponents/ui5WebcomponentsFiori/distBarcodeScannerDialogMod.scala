package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.InstanceType
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Interval
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.Close
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.ScanHeight
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.Exception
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.Result
import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.MediaStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBarcodeScannerDialogMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `BarcodeScannerDialog` component provides barcode scanning functionality for all devices that support the `MediaDevices.getUserMedia()` native API.
    * Opening the dialog launches the device camera and scans for known barcode formats.
    *
    * A `scanSuccess` event fires whenever a barcode is identified
    * and a `scanError` event fires when the scan failed (for example, due to missing permisions).
    *
    * Internally, the component  uses the zxing-js/library third party OSS.
    *
    * For a list of supported barcode formats, see the [zxing-js/library](https://github.com/zxing-js/library) documentation.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @JSImport("@ui5/webcomponents-fiori/dist/BarcodeScannerDialog.js", JSImport.Default)
  @js.native
  open class default () extends BarcodeScannerDialog
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/BarcodeScannerDialog.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/BarcodeScannerDialog.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `BarcodeScannerDialog` component provides barcode scanning functionality for all devices that support the `MediaDevices.getUserMedia()` native API.
    * Opening the dialog launches the device camera and scans for known barcode formats.
    *
    * A `scanSuccess` event fires whenever a barcode is identified
    * and a `scanError` event fires when the scan failed (for example, due to missing permisions).
    *
    * Internally, the component  uses the zxing-js/library third party OSS.
    *
    * For a list of supported barcode formats, see the [zxing-js/library](https://github.com/zxing-js/library) documentation.
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.15
    */
  @js.native
  trait BarcodeScannerDialog
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _busyIndicatorText: String = js.native
    
    /**
      * CALCULATIONS
      *
      * The following methods are used to calculate the capture region
      * and draw it on the overlay canvas.
      * The capture region is a square area in the center of the video element
      * where the barcode scanning is performed.
      * The region is defined as a proportion of the video element's dimensions.
      * The overlay canvas is used to draw a semi-transparent black overlay
      * over the video element and a red border around the capture region.
      * The overlay canvas is updated on every frame to ensure the capture region is always visible.
      * The capture region is used to crop the video frame and extract the barcode image.
      * The extracted image is then processed by the zxing-js library to decode the barcode.
      */
    def _calculateCaptureRegion(clientWidth: Double, clientHeight: Double): ScanHeight = js.native
    
    def _cancelButtonText: String = js.native
    
    def _captureFrame(): HTMLCanvasElement = js.native
    
    def _closeDialog(): Unit = js.native
    
    var _codeReader: InstanceType[Instantiable0[BrowserMultiFormatReader]] = js.native
    
    def _drawCaptureRegion(): Unit = js.native
    
    def _getOverlayCanvasElement(): HTMLCanvasElement = js.native
    
    def _getTempCanvasElement(): HTMLCanvasElement = js.native
    
    def _getUserPermission(): js.Promise[MediaStream] = js.native
    
    def _getVideoElement(): HTMLVideoElement = js.native
    
    def _handleCaptureRegionBound(): Unit = js.native
    
    def _handleDrawCaptureRegion(): Unit = js.native
    
    def _handleScanError(error: Exception): Unit = js.native
    
    def _handleScanSuccess(result: Result): Unit = js.native
    
    def _handleVideoPlaying(): Unit = js.native
    
    def _handleVideoPlayingBound(): Unit = js.native
    
    def _hasGetUserMedia(): Boolean = js.native
    
    def _open: Boolean = js.native
    
    /**
      * HANDLERS
      */
    def _processFrame(): js.Promise[Unit] = js.native
    
    def _resetReader(): Unit = js.native
    
    var _scanInterval: Interval | Null = js.native
    
    var _tempCanvas: HTMLCanvasElement = js.native
    
    var dialog: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDialogMod.default] = js.native
    
    @JSName("eventDetails")
    var eventDetails_BarcodeScannerDialog: Close = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * **Note:** When you provide custom content for the `footer` slot, the default close button is not rendered.
      * This means you need to include your own mechanism within the custom `footer` to close the dialog,
      * such as a button with an event listener that closes the dialog.
      *
      * **Note:** If the `footer` slot is not provided, a default footer with a close button is rendered automatically,
      * allowing users to close the dialog without any additional implementation.
      *
      * @public
      * @since 2.4.0
      */
    var footer: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header HTML Element.
      *
      * **Note:** If `header` slot is provided, the labelling of the dialog is a responsibility of the application developer.
      * `accessibleName` should be used.
      *
      * @public
      * @since 2.4.0
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Indicates whether the scanner is ready to scan.
      * @default false
      * @private
      */
    var isReadyToScan: Boolean = js.native
    
    /**
      * Indicates whether a loading indicator should be displayed while the scanner is loading.
      * @default false
      * @private
      */
    var loading: Boolean = js.native
    
    /**
      * Indicates whether the dialog is open.
      *
      * @public
      * @default false
      * @since 1.24.0
      */
    var open: Boolean = js.native
  }
  
  trait BarcodeScannerDialogScanErrorEventDetail extends StObject {
    
    var message: String
  }
  object BarcodeScannerDialogScanErrorEventDetail {
    
    inline def apply(message: String): BarcodeScannerDialogScanErrorEventDetail = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScannerDialogScanErrorEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarcodeScannerDialogScanErrorEventDetail] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait BarcodeScannerDialogScanSuccessEventDetail extends StObject {
    
    var rawBytes: js.typedarray.Uint8Array
    
    var text: String
  }
  object BarcodeScannerDialogScanSuccessEventDetail {
    
    inline def apply(rawBytes: js.typedarray.Uint8Array, text: String): BarcodeScannerDialogScanSuccessEventDetail = {
      val __obj = js.Dynamic.literal(rawBytes = rawBytes.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[BarcodeScannerDialogScanSuccessEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BarcodeScannerDialogScanSuccessEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRawBytes(value: js.typedarray.Uint8Array): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /* was `typeof imported_library.BrowserMultiFormatReader` */
  type BrowserMultiFormatReader = io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.BrowserMultiFormatReader
}
