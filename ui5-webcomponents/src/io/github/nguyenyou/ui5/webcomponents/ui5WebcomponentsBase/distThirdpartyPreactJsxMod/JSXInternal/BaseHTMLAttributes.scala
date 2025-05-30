package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var href: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var target: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object BaseHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): BaseHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & BaseHTMLAttributes[T]) extends AnyVal {
    
    inline def setHref(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setTarget(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
