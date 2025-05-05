package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var `for`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var htmlFor: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object LabelHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): LabelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & LabelHTMLAttributes[T]) extends AnyVal {
    
    inline def setFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
  }
}
