package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetaHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var charSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var charset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var content: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var `http-equiv`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var httpEquiv: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var media: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MetaHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MetaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetaHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & MetaHTMLAttributes[T]) extends AnyVal {
    
    inline def setCharSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setContent(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def `setHttp-equiv`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "http-equiv", value.asInstanceOf[js.Any])
    
    inline def `setHttp-equivUndefined`: Self = StObject.set(x, "http-equiv", js.undefined)
    
    inline def setHttpEquiv(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
    
    inline def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
    
    inline def setMedia(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
