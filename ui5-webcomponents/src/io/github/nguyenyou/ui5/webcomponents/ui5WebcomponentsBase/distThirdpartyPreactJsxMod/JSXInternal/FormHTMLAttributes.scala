package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var `accept-charset`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var acceptCharset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var action: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var autoComplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var autocomplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var encType: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var enctype: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var method: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var noValidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var novalidate: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var rel: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var target: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object FormHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): FormHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & FormHTMLAttributes[T]) extends AnyVal {
    
    inline def `setAccept-charset`(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "accept-charset", value.asInstanceOf[js.Any])
    
    inline def `setAccept-charsetUndefined`: Self = StObject.set(x, "accept-charset", js.undefined)
    
    inline def setAcceptCharset(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
    
    inline def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
    
    inline def setAction(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAutoComplete(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setEncType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setMethod(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNoValidate(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
    
    inline def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
    
    inline def setRel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
