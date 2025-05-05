package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.center
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.char
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.justify
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.left
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.right
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var abbr: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var align: js.UndefOr[Signalish[js.UndefOr[left | center | right | justify | char]]] = js.undefined
  
  var colSpan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var colspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var headers: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var rowSpan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var rowspan: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var scope: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object ThHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): ThHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & ThHTMLAttributes[T]) extends AnyVal {
    
    inline def setAbbr(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setAbbrUndefined: Self = StObject.set(x, "abbr", js.undefined)
    
    inline def setAlign(value: Signalish[js.UndefOr[left | center | right | justify | char]]): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColSpan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
    
    inline def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
    
    inline def setHeaders(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setRowSpan(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    inline def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
    
    inline def setScope(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
