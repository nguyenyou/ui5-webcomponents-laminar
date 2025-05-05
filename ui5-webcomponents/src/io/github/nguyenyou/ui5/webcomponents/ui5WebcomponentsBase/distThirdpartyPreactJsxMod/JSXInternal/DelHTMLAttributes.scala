package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var dateTime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var datetime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object DelHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): DelHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & DelHTMLAttributes[T]) extends AnyVal {
    
    inline def setCite(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
    
    inline def setDateTime(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
