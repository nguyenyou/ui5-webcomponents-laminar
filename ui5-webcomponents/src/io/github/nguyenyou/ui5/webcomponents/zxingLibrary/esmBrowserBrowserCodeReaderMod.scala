package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.std.EventListener
import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.anon.DHeight
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmBrowserDecodeContinuouslyCallbackMod.DecodeContinuouslyCallback
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmBrowserHtmlvisualmediaelementMod.HTMLVisualMediaElement
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmBrowserVideoInputDeviceMod.VideoInputDevice
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreBinaryBitmapMod.default
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreDecodeHintTypeMod.DecodeHintType
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreReaderMod.Reader
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.HTMLVideoElement
import org.scalajs.dom.MediaDeviceInfo
import org.scalajs.dom.MediaStream
import org.scalajs.dom.MediaStreamConstraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBrowserBrowserCodeReaderMod {
  
  @JSImport("@zxing/library/esm/browser/BrowserCodeReader", "BrowserCodeReader")
  @js.native
  open class BrowserCodeReader protected () extends StObject {
    /**
      * Creates an instance of BrowserCodeReader.
      * @param {Reader} reader The reader instance to decode the barcode
      * @param {number} [timeBetweenScansMillis=500] the time delay between subsequent successful decode tries
      *
      * @memberOf BrowserCodeReader
      */
    def this(reader: Reader) = this()
    def this(reader: Reader, timeBetweenScansMillis: Double) = this()
    def this(reader: Reader, timeBetweenScansMillis: Double, _hints: Map[DecodeHintType, Any]) = this()
    def this(reader: Reader, timeBetweenScansMillis: Unit, _hints: Map[DecodeHintType, Any]) = this()
    
    /**
      * Sets up the video source so it can be decoded when loaded.
      *
      * @param source The video source element.
      */
    /* private */ var _decodeFromVideoElementSetup: Any = js.native
    
    /* private */ var _decodeOnLoadImage: Any = js.native
    
    /* private */ var _decodeOnLoadVideo: Any = js.native
    
    /* private */ var _decodeOnLoadVideoContinuously: Any = js.native
    
    /**
      * Cleans canvas references 🖌
      */
    /* private */ var _destroyCaptureCanvas: Any = js.native
    
    /* private */ var _destroyImageElement: Any = js.native
    
    /* private */ var _destroyVideoElement: Any = js.native
    
    /* protected */ var _hints: js.UndefOr[Map[DecodeHintType, Any]] = js.native
    
    /**
      * This will break the loop.
      */
    /* private */ var _stopAsyncDecode: Any = js.native
    
    /**
      * This will break the loop.
      */
    /* private */ var _stopContinuousDecode: Any = js.native
    
    /**
      * Delay time between decode attempts made by the scanner.
      */
    /* protected */ var _timeBetweenDecodingAttempts: Double = js.native
    
    /**
      * Defines what the videoElement src will be.
      *
      * @param videoElement
      * @param stream
      */
    def addVideoSource(videoElement: HTMLVideoElement, stream: MediaStream): Unit = js.native
    
    /**
      * Sets the new stream and request a new decoding-with-delay.
      *
      * @param stream The stream to be shown in the video element.
      * @param decodeFn A callback for the decode method.
      */
    /* protected */ def attachStreamToVideo(stream: MediaStream, videoSource: String): js.Promise[HTMLVideoElement] = js.native
    /* protected */ def attachStreamToVideo(stream: MediaStream, videoSource: HTMLVideoElement): js.Promise[HTMLVideoElement] = js.native
    
    /**
      * If enumerateDevices under navigator is supported.
      */
    def canEnumerateDevices: Boolean = js.native
    
    /**
      * The HTML canvas element, used to draw the video or image's frame for decoding.
      */
    /* protected */ var captureCanvas: HTMLCanvasElement = js.native
    
    /**
      * The HTML canvas element context.
      */
    /* protected */ var captureCanvasContext: CanvasRenderingContext2D = js.native
    
    /**
      * Unbinds a HTML video src property.
      *
      * @param videoElement
      */
    /* private */ var cleanVideoSource: Any = js.native
    
    /**
      * Creates a binaryBitmap based in some image source.
      *
      * @param mediaElement HTML element containing drawable image source.
      */
    def createBinaryBitmap(mediaElement: HTMLVisualMediaElement): default = js.native
    
    /**
      * 🖌 Prepares the canvas for capture and scan frames.
      */
    def createCaptureCanvas(): HTMLCanvasElement = js.native
    def createCaptureCanvas(mediaElement: HTMLVisualMediaElement): HTMLCanvasElement = js.native
    
    /**
      * Gets the BinaryBitmap for ya! (and decodes it)
      */
    def decode(element: HTMLVisualMediaElement): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default = js.native
    
    /**
      * Call the encapsulated readers decode
      */
    def decodeBitmap(binaryBitmap: default): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default = js.native
    
    /**
      * Continuously decodes from video input.
      */
    def decodeContinuously(element: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): Unit = js.native
    
    /**
      * Continuously tries to decode the barcode from a stream obtained from the given constraints while showing the video in the specified video element.
      *
      * @param {MediaStream} [constraints] the media stream constraints to get s valid media stream to decode from
      * @param {string|HTMLVideoElement} [video] the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeFromConstraints(constraints: MediaStreamConstraints, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromConstraints(
      constraints: MediaStreamConstraints,
      videoSource: HTMLVideoElement,
      callbackFn: DecodeContinuouslyCallback
    ): js.Promise[Unit] = js.native
    
    /**
      * Decodes the barcode from an image.
      *
      * @param {(string|HTMLImageElement)} [source] The image element that can be either an element id or the element itself. Can be undefined in which case the decoding will be done from the imageUrl parameter.
      * @param {string} [url]
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeFromImage(): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImage(source: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImage(source: String, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImage(source: HTMLImageElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImage(source: HTMLImageElement, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImage(source: Unit, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes something from an image HTML element.
      */
    def decodeFromImageElement(source: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImageElement(source: HTMLImageElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes an image from a URL.
      */
    def decodeFromImageUrl(): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromImageUrl(url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes the barcode from the device specified by deviceId while showing the video in the specified video element.
      *
      * @param deviceId the id of one of the devices obtained after calling getVideoInputDevices. Can be undefined, in this case it will decode from one of the available devices, preffering the main camera (environment facing) if available.
      * @param video the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns The decoding result.
      *
      * @memberOf BrowserCodeReader
      *
      * @deprecated Use `decodeOnceFromVideoDevice` instead.
      */
    def decodeFromInputVideoDevice(): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromInputVideoDevice(deviceId: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromInputVideoDevice(deviceId: String, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromInputVideoDevice(deviceId: String, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromInputVideoDevice(deviceId: Unit, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromInputVideoDevice(deviceId: Unit, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Continuously decodes the barcode from the device specified by device while showing the video in the specified video element.
      *
      * @param {string|null} [deviceId] the id of one of the devices obtained after calling getVideoInputDevices. Can be undefined, in this case it will decode from one of the available devices, preffering the main camera (environment facing) if available.
      * @param {string|HTMLVideoElement|null} [video] the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns {Promise<void>}
      *
      * @memberOf BrowserCodeReader
      *
      * @deprecated Use `decodeFromVideoDevice` instead.
      */
    def decodeFromInputVideoDeviceContinuously(deviceId: String, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromInputVideoDeviceContinuously(deviceId: String, videoSource: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromInputVideoDeviceContinuously(deviceId: String, videoSource: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromInputVideoDeviceContinuously(deviceId: Null, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromInputVideoDeviceContinuously(deviceId: Null, videoSource: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromInputVideoDeviceContinuously(deviceId: Null, videoSource: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * In one attempt, tries to decode the barcode from a stream obtained from the given constraints while showing the video in the specified video element.
      *
      * @param {MediaStream} [constraints] the media stream constraints to get s valid media stream to decode from
      * @param {string|HTMLVideoElement} [video] the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeFromStream(stream: MediaStream, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromStream(stream: MediaStream, videoSource: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * Decodes the barcode from a video.
      *
      * @param {(string|HTMLImageElement)} [source] The image element that can be either an element id or the element itself. Can be undefined in which case the decoding will be done from the imageUrl parameter.
      * @param {string} [url]
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeFromVideo(): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideo(source: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideo(source: String, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideo(source: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideo(source: HTMLVideoElement, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideo(source: Unit, url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes continuously the barcode from a video.
      *
      * @param {(string|HTMLImageElement)} [source] The image element that can be either an element id or the element itself. Can be undefined in which case the decoding will be done from the imageUrl parameter.
      * @param {string} [url]
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      *
      * @experimental
      */
    def decodeFromVideoContinuously(source: String, url: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoContinuously(source: String, url: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoContinuously(source: HTMLVideoElement, url: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoContinuously(source: HTMLVideoElement, url: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoContinuously(source: Null, url: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoContinuously(source: Null, url: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * Continuously tries to decode the barcode from the device specified by device while showing the video in the specified video element.
      *
      * @param {string|null} [deviceId] the id of one of the devices obtained after calling getVideoInputDevices. Can be undefined, in this case it will decode from one of the available devices, preffering the main camera (environment facing) if available.
      * @param {string|HTMLVideoElement|null} [video] the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns {Promise<void>}
      *
      * @memberOf BrowserCodeReader
      */
    def decodeFromVideoDevice(deviceId: String, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoDevice(deviceId: String, videoSource: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoDevice(deviceId: String, videoSource: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoDevice(deviceId: Null, videoSource: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoDevice(deviceId: Null, videoSource: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoDevice(deviceId: Null, videoSource: Null, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * Decodes something from an image HTML element.
      */
    def decodeFromVideoElement(source: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeFromVideoElement(source: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes something from an image HTML element.
      */
    def decodeFromVideoElementContinuously(source: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    def decodeFromVideoElementContinuously(source: HTMLVideoElement, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * Decodes an image from a URL.
      */
    def decodeFromVideoUrl(url: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Decodes an image from a URL.
      *
      * @experimental
      */
    def decodeFromVideoUrlContinuously(url: String, callbackFn: DecodeContinuouslyCallback): js.Promise[Unit] = js.native
    
    /**
      * Tries to decode from the video input until it finds some value.
      */
    def decodeOnce(element: HTMLVisualMediaElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnce(element: HTMLVisualMediaElement, retryIfNotFound: Boolean): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnce(element: HTMLVisualMediaElement, retryIfNotFound: Boolean, retryIfChecksumOrFormatError: Boolean): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnce(element: HTMLVisualMediaElement, retryIfNotFound: Unit, retryIfChecksumOrFormatError: Boolean): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * In one attempt, tries to decode the barcode from a stream obtained from the given constraints while showing the video in the specified video element.
      *
      * @param constraints the media stream constraints to get s valid media stream to decode from
      * @param video the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeOnceFromConstraints(constraints: MediaStreamConstraints): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromConstraints(constraints: MediaStreamConstraints, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromConstraints(constraints: MediaStreamConstraints, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * In one attempt, tries to decode the barcode from a stream obtained from the given constraints while showing the video in the specified video element.
      *
      * @param {MediaStream} [constraints] the media stream constraints to get s valid media stream to decode from
      * @param {string|HTMLVideoElement} [video] the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns {Promise<Result>} The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeOnceFromStream(stream: MediaStream): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromStream(stream: MediaStream, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromStream(stream: MediaStream, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * In one attempt, tries to decode the barcode from the device specified by deviceId while showing the video in the specified video element.
      *
      * @param deviceId the id of one of the devices obtained after calling getVideoInputDevices. Can be undefined, in this case it will decode from one of the available devices, preffering the main camera (environment facing) if available.
      * @param video the video element in page where to show the video while decoding. Can be either an element id or directly an HTMLVideoElement. Can be undefined, in which case no video will be shown.
      * @returns The decoding result.
      *
      * @memberOf BrowserCodeReader
      */
    def decodeOnceFromVideoDevice(): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromVideoDevice(deviceId: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromVideoDevice(deviceId: String, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromVideoDevice(deviceId: String, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromVideoDevice(deviceId: Unit, videoSource: String): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    def decodeOnceFromVideoDevice(deviceId: Unit, videoSource: HTMLVideoElement): js.Promise[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default] = js.native
    
    /**
      * Overwriting this allows you to manipulate the next frame in anyway you want before decode.
      */
    def drawFrameOnCanvas(srcElement: HTMLVideoElement): Unit = js.native
    def drawFrameOnCanvas(srcElement: HTMLVideoElement, dimensions: DHeight): Unit = js.native
    def drawFrameOnCanvas(srcElement: HTMLVideoElement, dimensions: DHeight, canvasElementContext: CanvasRenderingContext2D): Unit = js.native
    def drawFrameOnCanvas(srcElement: HTMLVideoElement, dimensions: Unit, canvasElementContext: CanvasRenderingContext2D): Unit = js.native
    
    /**
      * Ovewriting this allows you to manipulate the snapshot image in anyway you want before decode.
      */
    def drawImageOnCanvas(srcElement: HTMLImageElement): Unit = js.native
    def drawImageOnCanvas(srcElement: HTMLImageElement, dimensions: DHeight): Unit = js.native
    def drawImageOnCanvas(srcElement: HTMLImageElement, dimensions: DHeight, canvasElementContext: CanvasRenderingContext2D): Unit = js.native
    def drawImageOnCanvas(srcElement: HTMLImageElement, dimensions: Unit, canvasElementContext: CanvasRenderingContext2D): Unit = js.native
    
    /**
      * Let's you find a device using it's Id.
      */
    def findDeviceById(deviceId: String): js.Promise[MediaDeviceInfo] = js.native
    
    /**
      *
      */
    /* protected */ def getCaptureCanvas(): HTMLCanvasElement = js.native
    /* protected */ def getCaptureCanvas(mediaElement: HTMLVisualMediaElement): HTMLCanvasElement = js.native
    
    /**
      *
      */
    /* protected */ def getCaptureCanvasContext(): CanvasRenderingContext2D = js.native
    /* protected */ def getCaptureCanvasContext(mediaElement: HTMLVisualMediaElement): CanvasRenderingContext2D = js.native
    
    /**
      * Searches and validates a media element.
      */
    def getMediaElement(mediaElementId: String, `type`: String): HTMLVisualMediaElement = js.native
    
    /**
      * Obtain the list of available devices with type 'videoinput'.
      *
      * @returns {Promise<VideoInputDevice[]>} an array of available video input devices
      *
      * @memberOf BrowserCodeReader
      *
      * @deprecated Use `listVideoInputDevices` instead.
      */
    def getVideoInputDevices(): js.Promise[js.Array[VideoInputDevice]] = js.native
    
    /**
      * If navigator is present.
      */
    def hasNavigator: Boolean = js.native
    
    /**
      * Sets the hints.
      */
    def hints: Map[DecodeHintType, Any] = js.native
    /**
      * Sets the hints.
      */
    def hints_=(hints: Map[DecodeHintType, Any]): Unit = js.native
    
    /**
      * The HTML image element, used as a fallback for the video element when decoding.
      */
    /* protected */ var imageElement: HTMLImageElement = js.native
    
    /**
      * Should contain the current registered listener for image loading,
      * used to unregister that listener when needed.
      */
    /* protected */ def imageLoadedListener(evt: Event): Unit = js.native
    /**
      * Should contain the current registered listener for image loading,
      * used to unregister that listener when needed.
      */
    /* protected */ @JSName("imageLoadedListener")
    var imageLoadedListener_Original: EventListener = js.native
    
    def isImageLoaded(img: HTMLImageElement): Boolean = js.native
    
    /**
      * If mediaDevices under navigator is supported.
      */
    def isMediaDevicesSuported: Boolean = js.native
    
    /**
      * Checks if the given video element is currently playing.
      */
    def isVideoPlaying(video: HTMLVideoElement): Boolean = js.native
    
    /**
      * Lists all the available video input devices.
      */
    def listVideoInputDevices(): js.Promise[js.Array[MediaDeviceInfo]] = js.native
    
    /**
      * Binds listeners and callbacks to the videoElement.
      *
      * @param element
      * @param callbackFn
      */
    /* protected */ def playVideoOnLoad(element: HTMLVideoElement, callbackFn: EventListener): Unit = js.native
    
    /**
      *
      * @param videoElement
      */
    /* protected */ def playVideoOnLoadAsync(videoElement: HTMLVideoElement): js.Promise[Unit] = js.native
    
    def prepareImageElement(): HTMLImageElement = js.native
    def prepareImageElement(imageSource: String): HTMLImageElement = js.native
    def prepareImageElement(imageSource: HTMLImageElement): HTMLImageElement = js.native
    
    /**
      * Sets a HTMLVideoElement for scanning or creates a new one.
      *
      * @param videoSource The HTMLVideoElement to be set.
      */
    def prepareVideoElement(): HTMLVideoElement = js.native
    def prepareVideoElement(videoSource: String): HTMLVideoElement = js.native
    def prepareVideoElement(videoSource: HTMLVideoElement): HTMLVideoElement = js.native
    
    /* protected */ val reader: Reader = js.native
    
    /**
      * Resets the code reader to the initial state. Cancels any ongoing barcode scanning from video or camera.
      *
      * @memberOf BrowserCodeReader
      */
    def reset(): Unit = js.native
    
    /**
      * Breaks the decoding loop.
      */
    def stopAsyncDecode(): Unit = js.native
    
    /**
      * Breaks the decoding loop.
      */
    def stopContinuousDecode(): Unit = js.native
    
    /**
      * Stops the continuous scan and cleans the stream.
      */
    /* protected */ def stopStreams(): Unit = js.native
    
    /**
      * The stream output from camera.
      */
    /* protected */ var stream: MediaStream = js.native
    
    /** Time between two decoding tries in milli seconds. */
    def timeBetweenDecodingAttempts: Double = js.native
    /**
      * Change the time span the decoder waits between two decoding tries.
      *
      * @param {number} millis Time between two decoding tries in milli seconds.
      */
    def timeBetweenDecodingAttempts_=(millis: Double): Unit = js.native
    
    /* protected */ var timeBetweenScansMillis: Double = js.native
    
    /**
      * Just tries to play the video and logs any errors.
      * The play call is only made is the video is not already playing.
      */
    def tryPlayVideo(videoElement: HTMLVideoElement): js.Promise[Unit] = js.native
    
    /**
      * Should contain the current registered listener for video loaded-metadata,
      * used to unregister that listener when needed.
      */
    /* protected */ def videoCanPlayListener(evt: Event): Unit = js.native
    /**
      * Should contain the current registered listener for video loaded-metadata,
      * used to unregister that listener when needed.
      */
    /* protected */ @JSName("videoCanPlayListener")
    var videoCanPlayListener_Original: EventListener = js.native
    
    /**
      * The HTML video element, used to display the camera stream.
      */
    /* protected */ var videoElement: HTMLVideoElement = js.native
    
    /**
      * Should contain the current registered listener for video play-ended,
      * used to unregister that listener when needed.
      */
    /* protected */ def videoEndedListener(evt: Event): Unit = js.native
    /**
      * Should contain the current registered listener for video play-ended,
      * used to unregister that listener when needed.
      */
    /* protected */ @JSName("videoEndedListener")
    var videoEndedListener_Original: EventListener = js.native
    
    /**
      * Should contain the current registered listener for video playing,
      * used to unregister that listener when needed.
      */
    /* protected */ def videoPlayingEventListener(evt: Event): Unit = js.native
    /**
      * Should contain the current registered listener for video playing,
      * used to unregister that listener when needed.
      */
    /* protected */ @JSName("videoPlayingEventListener")
    var videoPlayingEventListener_Original: EventListener = js.native
  }
}
