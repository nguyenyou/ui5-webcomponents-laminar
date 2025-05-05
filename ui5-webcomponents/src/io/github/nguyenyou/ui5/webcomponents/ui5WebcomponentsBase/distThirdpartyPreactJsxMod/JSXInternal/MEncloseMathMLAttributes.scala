package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MEncloseMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var notation: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MEncloseMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MEncloseMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MEncloseMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MEncloseMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MEncloseMathMLAttributes[T]) extends AnyVal {
    
    inline def setNotation(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
  }
}
