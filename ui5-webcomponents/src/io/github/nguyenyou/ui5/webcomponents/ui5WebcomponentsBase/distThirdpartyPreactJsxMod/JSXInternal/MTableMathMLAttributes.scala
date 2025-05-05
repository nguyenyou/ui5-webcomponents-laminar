package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.axis
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.baseline
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.bottom
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.center
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.dashed
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.left
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.none
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.right
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.solid
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.top
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MTableMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#align */
  var align: js.UndefOr[Signalish[js.UndefOr[axis | baseline | bottom | center | top]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnalign */
  var columnalign: js.UndefOr[Signalish[js.UndefOr[center | left | right]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnlines */
  var columnlines: js.UndefOr[Signalish[js.UndefOr[dashed | none | solid]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#columnspacing */
  var columnspacing: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#frame */
  var frame: js.UndefOr[Signalish[js.UndefOr[dashed | none | solid]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#framespacing */
  var framespacing: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowalign */
  var rowalign: js.UndefOr[Signalish[js.UndefOr[axis | baseline | bottom | center | top]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowlines */
  var rowlines: js.UndefOr[Signalish[js.UndefOr[dashed | none | solid]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#rowspacing */
  var rowspacing: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** Non-standard attribute See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mtable#width */
  var width: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MTableMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MTableMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MTableMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MTableMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MTableMathMLAttributes[T]) extends AnyVal {
    
    inline def setAlign(value: Signalish[js.UndefOr[axis | baseline | bottom | center | top]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColumnalign(value: Signalish[js.UndefOr[center | left | right]]): Self = StObject.set(x, "columnalign", value.asInstanceOf[js.Any])
    
    inline def setColumnalignUndefined: Self = StObject.set(x, "columnalign", js.undefined)
    
    inline def setColumnlines(value: Signalish[js.UndefOr[dashed | none | solid]]): Self = StObject.set(x, "columnlines", value.asInstanceOf[js.Any])
    
    inline def setColumnlinesUndefined: Self = StObject.set(x, "columnlines", js.undefined)
    
    inline def setColumnspacing(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "columnspacing", value.asInstanceOf[js.Any])
    
    inline def setColumnspacingUndefined: Self = StObject.set(x, "columnspacing", js.undefined)
    
    inline def setFrame(value: Signalish[js.UndefOr[dashed | none | solid]]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFramespacing(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "framespacing", value.asInstanceOf[js.Any])
    
    inline def setFramespacingUndefined: Self = StObject.set(x, "framespacing", js.undefined)
    
    inline def setRowalign(value: Signalish[js.UndefOr[axis | baseline | bottom | center | top]]): Self = StObject.set(x, "rowalign", value.asInstanceOf[js.Any])
    
    inline def setRowalignUndefined: Self = StObject.set(x, "rowalign", js.undefined)
    
    inline def setRowlines(value: Signalish[js.UndefOr[dashed | none | solid]]): Self = StObject.set(x, "rowlines", value.asInstanceOf[js.Any])
    
    inline def setRowlinesUndefined: Self = StObject.set(x, "rowlines", js.undefined)
    
    inline def setRowspacing(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rowspacing", value.asInstanceOf[js.Any])
    
    inline def setRowspacingUndefined: Self = StObject.set(x, "rowspacing", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
