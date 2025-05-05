package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

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

trait MTdMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#columnalign */
  var columnalign: js.UndefOr[Signalish[js.UndefOr[center | left | right]]] = js.undefined
  
  var columnspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtd#rowalign */
  var rowalign: js.UndefOr[Signalish[js.UndefOr[axis | baseline | bottom | center | top]]] = js.undefined
  
  var rowspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
}
object MTdMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MTdMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MTdMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MTdMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MTdMathMLAttributes[T]) extends AnyVal {
    
    inline def setColumnalign(value: Signalish[js.UndefOr[center | left | right]]): Self = StObject.set(x, "columnalign", value.asInstanceOf[js.Any])
    
    inline def setColumnalignUndefined: Self = StObject.set(x, "columnalign", js.undefined)
    
    inline def setColumnspan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "columnspan", value.asInstanceOf[js.Any])
    
    inline def setColumnspanUndefined: Self = StObject.set(x, "columnspan", js.undefined)
    
    inline def setRowalign(value: Signalish[js.UndefOr[axis | baseline | bottom | center | top]]): Self = StObject.set(x, "rowalign", value.asInstanceOf[js.Any])
    
    inline def setRowalignUndefined: Self = StObject.set(x, "rowalign", js.undefined)
    
    inline def setRowspan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "rowspan", value.asInstanceOf[js.Any])
    
    inline def setRowspanUndefined: Self = StObject.set(x, "rowspan", js.undefined)
  }
}
