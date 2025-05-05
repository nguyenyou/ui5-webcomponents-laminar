package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/ms#browser_compatibility */
  var lquote: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/ms#browser_compatibility */
  var rquote: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
}
object MSMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MSMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MSMathMLAttributes[T]) extends AnyVal {
    
    inline def setLquote(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "lquote", value.asInstanceOf[js.Any])
    
    inline def setLquoteUndefined: Self = StObject.set(x, "lquote", js.undefined)
    
    inline def setRquote(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "rquote", value.asInstanceOf[js.Any])
    
    inline def setRquoteUndefined: Self = StObject.set(x, "rquote", js.undefined)
  }
}
