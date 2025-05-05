package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var dateTime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var datetime: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object TimeHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): TimeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & TimeHTMLAttributes[T]) extends AnyVal {
    
    inline def setDateTime(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    inline def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
  }
}
