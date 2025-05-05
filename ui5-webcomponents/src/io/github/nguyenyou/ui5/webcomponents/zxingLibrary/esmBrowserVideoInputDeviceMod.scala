package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.std.MediaDeviceInfo
import org.scalajs.dom.MediaDeviceKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBrowserVideoInputDeviceMod {
  
  @JSImport("@zxing/library/esm/browser/VideoInputDevice", "VideoInputDevice")
  @js.native
  open class VideoInputDevice protected ()
    extends StObject
       with MediaDeviceInfo {
    /**
      * Creates an instance of VideoInputDevice.
      *
      * @param {string} deviceId the video input device id
      * @param {string} label the label of the device if available
      */
    def this(deviceId: String, label: String) = this()
    def this(deviceId: String, label: String, groupId: String) = this()
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/deviceId) */
    /* standard dom */
    /* CompleteClass */
    override val deviceId: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/groupId) */
    /* standard dom */
    /* CompleteClass */
    override val groupId: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind) */
    /* standard dom */
    /* CompleteClass */
    override val kind: MediaDeviceKind = js.native
    /** @inheritdoc */
    @JSName("kind")
    val kind_VideoInputDevice: /* "videoinput" */ String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/label) */
    /* standard dom */
    /* CompleteClass */
    override val label: String = js.native
    
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/toJSON) */
    /* standard dom */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
}
