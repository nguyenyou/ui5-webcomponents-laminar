package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var dateTime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var datetime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object InsHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): InsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & InsHTMLAttributes[T]) extends AnyVal {
    
    inline def setCite(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setDateTime(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
