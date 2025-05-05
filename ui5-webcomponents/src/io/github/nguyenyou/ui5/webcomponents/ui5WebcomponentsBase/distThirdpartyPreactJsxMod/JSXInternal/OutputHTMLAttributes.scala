package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var `for`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var htmlFor: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object OutputHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): OutputHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & OutputHTMLAttributes[T]) extends AnyVal {
    
    inline def setFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
    
    inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHtmlFor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
    
    inline def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
