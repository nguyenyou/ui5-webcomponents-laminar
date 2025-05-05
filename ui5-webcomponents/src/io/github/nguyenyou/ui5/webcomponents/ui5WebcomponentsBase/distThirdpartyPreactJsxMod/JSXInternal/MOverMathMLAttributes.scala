package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MOverMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var accent: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
}
object MOverMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MOverMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MOverMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MOverMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MOverMathMLAttributes[T]) extends AnyVal {
    
    inline def setAccent(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
    
    inline def setAccentUndefined: Self = StObject.set(x, "accent", js.undefined)
  }
}
