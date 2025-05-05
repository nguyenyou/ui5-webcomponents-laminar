package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.h.JSX

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.axis
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.baseline
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.bottom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.center
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.left
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.right
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.top
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MTrMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.MathMLAttributes[T] {
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtr#columnalign */
  var columnalign: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[center | left | right]]
  ] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtr#rowalign */
  var rowalign: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[axis | baseline | bottom | center | top]]
  ] = js.undefined
}
object MTrMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MTrMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MTrMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MTrMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MTrMathMLAttributes[T]) extends AnyVal {
    
    inline def setColumnalign(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[center | left | right]]
    ): Self = StObject.set(x, "columnalign", value.asInstanceOf[js.Any])
    
    inline def setColumnalignUndefined: Self = StObject.set(x, "columnalign", js.undefined)
    
    inline def setRowalign(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[axis | baseline | bottom | center | top]]
    ): Self = StObject.set(x, "rowalign", value.asInstanceOf[js.Any])
    
    inline def setRowalignUndefined: Self = StObject.set(x, "rowalign", js.undefined)
  }
}
