package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var label: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var selected: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var value: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
}
object OptionHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): OptionHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & OptionHTMLAttributes[T]) extends AnyVal {
    
    inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setSelected(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
