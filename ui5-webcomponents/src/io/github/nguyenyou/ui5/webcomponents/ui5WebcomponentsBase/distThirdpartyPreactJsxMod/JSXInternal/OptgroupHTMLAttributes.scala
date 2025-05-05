package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptgroupHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var label: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object OptgroupHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): OptgroupHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptgroupHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptgroupHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & OptgroupHTMLAttributes[T]) extends AnyVal {
    
    inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
