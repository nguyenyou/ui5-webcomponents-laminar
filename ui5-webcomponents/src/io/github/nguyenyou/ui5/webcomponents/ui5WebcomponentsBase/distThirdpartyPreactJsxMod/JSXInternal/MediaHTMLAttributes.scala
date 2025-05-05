package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoPlay: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var autoplay: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var controls: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var controlsList: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var crossOrigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var crossorigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var loop: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var mediaGroup: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var muted: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var playsInline: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var playsinline: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var preload: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var volume: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
}
object MediaHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MediaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & MediaHTMLAttributes[T]) extends AnyVal {
    
    inline def setAutoPlay(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
    
    inline def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
    
    inline def setControls(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setControlsList(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "controlsList", value.asInstanceOf[js.Any])
    
    inline def setControlsListUndefined: Self = StObject.set(x, "controlsList", js.undefined)
    
    inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
    
    inline def setCrossOrigin(value: Signalish[HTMLAttributeCrossOrigin]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setLoop(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMediaGroup(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
    
    inline def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
    
    inline def setMuted(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
    
    inline def setPlaysInline(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
    
    inline def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
    
    inline def setPreload(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setVolume(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
