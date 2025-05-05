package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.statusline
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.toggle
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MActionMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/maction#actiontype */
  var actiontype: js.UndefOr[Signalish[js.UndefOr[statusline | toggle]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/maction#selection */
  var selection: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MActionMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MActionMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MActionMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MActionMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MActionMathMLAttributes[T]) extends AnyVal {
    
    inline def setActiontype(value: Signalish[js.UndefOr[statusline | toggle]]): Self = StObject.set(x, "actiontype", value.asInstanceOf[js.Any])
    
    inline def setActiontypeUndefined: Self = StObject.set(x, "actiontype", js.undefined)
    
    inline def setSelection(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
  }
}
