package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var async: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  /** @deprecated */
  var charSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated */
  var charset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var crossOrigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var crossorigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var defer: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var integrity: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var noModule: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var nomodule: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
  
  var referrerpolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object ScriptHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): ScriptHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & ScriptHTMLAttributes[T]) extends AnyVal {
    
    inline def setAsync(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setCharSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setCrossOrigin(value: Signalish[HTMLAttributeCrossOrigin]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDefer(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setIntegrity(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setNoModule(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "noModule", value.asInstanceOf[js.Any])
    
    inline def setNoModuleUndefined: Self = StObject.set(x, "noModule", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
