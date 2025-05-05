package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.center
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.left
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.right
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MFracMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#denomalign */
  var denomalign: js.UndefOr[Signalish[js.UndefOr[center | left | right]]] = js.undefined
  
  var linethickness: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mfrac#numalign */
  var numalign: js.UndefOr[Signalish[js.UndefOr[center | left | right]]] = js.undefined
}
object MFracMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MFracMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MFracMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MFracMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MFracMathMLAttributes[T]) extends AnyVal {
    
    inline def setDenomalign(value: Signalish[js.UndefOr[center | left | right]]): Self = StObject.set(x, "denomalign", value.asInstanceOf[js.Any])
    
    inline def setDenomalignUndefined: Self = StObject.set(x, "denomalign", js.undefined)
    
    inline def setLinethickness(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "linethickness", value.asInstanceOf[js.Any])
    
    inline def setLinethicknessUndefined: Self = StObject.set(x, "linethickness", js.undefined)
    
    inline def setNumalign(value: Signalish[js.UndefOr[center | left | right]]): Self = StObject.set(x, "numalign", value.asInstanceOf[js.Any])
    
    inline def setNumalignUndefined: Self = StObject.set(x, "numalign", js.undefined)
  }
}
