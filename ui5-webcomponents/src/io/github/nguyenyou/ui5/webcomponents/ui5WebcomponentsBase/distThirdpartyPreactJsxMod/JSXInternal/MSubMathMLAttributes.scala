package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSubMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msub#subscriptshift */
  var subscriptshift: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MSubMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MSubMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSubMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSubMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MSubMathMLAttributes[T]) extends AnyVal {
    
    inline def setSubscriptshift(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "subscriptshift", value.asInstanceOf[js.Any])
    
    inline def setSubscriptshiftUndefined: Self = StObject.set(x, "subscriptshift", js.undefined)
  }
}
