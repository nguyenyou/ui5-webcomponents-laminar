package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSpaceMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var depth: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var height: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var width: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MSpaceMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MSpaceMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSpaceMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSpaceMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MSpaceMathMLAttributes[T]) extends AnyVal {
    
    inline def setDepth(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    inline def setHeight(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
