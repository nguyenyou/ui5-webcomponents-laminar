package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetailsHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var open: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
}
object DetailsHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): DetailsHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetailsHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetailsHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & DetailsHTMLAttributes[T]) extends AnyVal {
    
    inline def setOpen(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
  }
}
