package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.h.JSX

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSupMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/msup#superscriptshift */
  var superscriptshift: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
}
object MSupMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MSupMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MSupMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MSupMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MSupMathMLAttributes[T]) extends AnyVal {
    
    inline def setSuperscriptshift(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "superscriptshift", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptshiftUndefined: Self = StObject.set(x, "superscriptshift", js.undefined)
  }
}
