package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object SlotHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): SlotHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & SlotHTMLAttributes[T]) extends AnyVal {
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
