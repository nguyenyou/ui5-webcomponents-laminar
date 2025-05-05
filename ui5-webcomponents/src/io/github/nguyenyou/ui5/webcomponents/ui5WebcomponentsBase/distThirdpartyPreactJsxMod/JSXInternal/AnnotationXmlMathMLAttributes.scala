package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationXmlMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  var encoding: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/semantics#src */
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object AnnotationXmlMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): AnnotationXmlMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotationXmlMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotationXmlMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & AnnotationXmlMathMLAttributes[T]) extends AnyVal {
    
    inline def setEncoding(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
  }
}
