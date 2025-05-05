package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`inline`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.block
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var display: js.UndefOr[Signalish[js.UndefOr[block | `inline`]]] = js.undefined
}
object MathMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MathMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MathMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MathMathMLAttributes[T]) extends AnyVal {
    
    inline def setDisplay(value: Signalish[js.UndefOr[block | `inline`]]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
  }
}
