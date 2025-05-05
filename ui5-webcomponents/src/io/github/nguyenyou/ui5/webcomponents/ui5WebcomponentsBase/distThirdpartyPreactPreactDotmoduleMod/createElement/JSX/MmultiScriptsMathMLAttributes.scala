package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MmultiScriptsMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mmultiscripts#subscriptshift */
  var subscriptshift: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mmultiscripts#superscriptshift */
  var superscriptshift: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
}
object MmultiScriptsMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MmultiScriptsMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MmultiScriptsMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MmultiScriptsMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MmultiScriptsMathMLAttributes[T]) extends AnyVal {
    
    inline def setSubscriptshift(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "subscriptshift", value.asInstanceOf[js.Any])
    
    inline def setSubscriptshiftUndefined: Self = StObject.set(x, "subscriptshift", js.undefined)
    
    inline def setSuperscriptshift(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "superscriptshift", value.asInstanceOf[js.Any])
    
    inline def setSuperscriptshiftUndefined: Self = StObject.set(x, "superscriptshift", js.undefined)
  }
}
