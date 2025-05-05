package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoComplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var autocomplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var defaultValue: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
  
  var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var multiple: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var required: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var size: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var value: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
}
object SelectHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): SelectHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & SelectHTMLAttributes[T]) extends AnyVal {
    
    inline def setAutoComplete(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setDefaultValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMultiple(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequired(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setSize(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
