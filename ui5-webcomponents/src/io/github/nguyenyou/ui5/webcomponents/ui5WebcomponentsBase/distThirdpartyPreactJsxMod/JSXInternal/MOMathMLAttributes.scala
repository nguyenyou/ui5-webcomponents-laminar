package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MOMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mo#accent */
  var accent: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var fence: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var largeop: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var lspace: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var maxsize: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var minsize: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var movablelimits: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var rspace: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var separator: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var stretchy: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var symmetric: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
}
object MOMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MOMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MOMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MOMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MOMathMLAttributes[T]) extends AnyVal {
    
    inline def setAccent(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    inline def setFence(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "fence", value.asInstanceOf[js.Any])
    
    inline def setFenceUndefined: Self = StObject.set(x, "fence", js.undefined)
    
    inline def setLargeop(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "largeop", value.asInstanceOf[js.Any])
    
    inline def setLargeopUndefined: Self = StObject.set(x, "largeop", js.undefined)
    
    inline def setLspace(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "lspace", value.asInstanceOf[js.Any])
    
    inline def setLspaceUndefined: Self = StObject.set(x, "lspace", js.undefined)
    
    inline def setMaxsize(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "maxsize", value.asInstanceOf[js.Any])
    
    inline def setMaxsizeUndefined: Self = StObject.set(x, "maxsize", js.undefined)
    
    inline def setMinsize(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "minsize", value.asInstanceOf[js.Any])
    
    inline def setMinsizeUndefined: Self = StObject.set(x, "minsize", js.undefined)
    
    inline def setMovablelimits(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "movablelimits", value.asInstanceOf[js.Any])
    
    inline def setMovablelimitsUndefined: Self = StObject.set(x, "movablelimits", js.undefined)
    
    inline def setRspace(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rspace", value.asInstanceOf[js.Any])
    
    inline def setRspaceUndefined: Self = StObject.set(x, "rspace", js.undefined)
    
    inline def setSeparator(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
    
    inline def setStretchy(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "stretchy", value.asInstanceOf[js.Any])
    
    inline def setStretchyUndefined: Self = StObject.set(x, "stretchy", js.undefined)
    
    inline def setSymmetric(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "symmetric", value.asInstanceOf[js.Any])
    
    inline def setSymmetricUndefined: Self = StObject.set(x, "symmetric", js.undefined)
  }
}
