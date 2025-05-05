package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUnderoverMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var accent: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var accentunder: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
}
object MUnderoverMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MUnderoverMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUnderoverMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUnderoverMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MUnderoverMathMLAttributes[T]) extends AnyVal {
    
    inline def setAccent(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
    
    inline def setAccentunder(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "accentunder", value.asInstanceOf[js.Any])
    
    inline def setAccentunderUndefined: Self = StObject.set(x, "accentunder", js.undefined)
  }
}
