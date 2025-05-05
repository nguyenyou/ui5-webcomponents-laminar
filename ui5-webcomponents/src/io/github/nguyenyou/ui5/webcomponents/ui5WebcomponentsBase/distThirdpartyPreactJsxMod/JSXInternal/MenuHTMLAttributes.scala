package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MenuHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MenuHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & MenuHTMLAttributes[T]) extends AnyVal {
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
