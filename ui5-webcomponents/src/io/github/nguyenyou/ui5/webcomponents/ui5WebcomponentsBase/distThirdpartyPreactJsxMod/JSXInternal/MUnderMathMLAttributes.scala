package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUnderMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var accentunder: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
}
object MUnderMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MUnderMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MUnderMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MUnderMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MUnderMathMLAttributes[T]) extends AnyVal {
    
    inline def setAccentunder(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "accentunder", value.asInstanceOf[js.Any])
    
    inline def setAccentunderUndefined: Self = StObject.set(x, "accentunder", js.undefined)
  }
}
