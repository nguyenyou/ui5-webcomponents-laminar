package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MediaHTMLAttributes[T] {
  
  var default: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var kind: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var label: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srcLang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srclang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object TrackHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): TrackHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & TrackHTMLAttributes[T]) extends AnyVal {
    
    inline def setDefault(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setKind(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLabel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSrcLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
    
    inline def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
  }
}
