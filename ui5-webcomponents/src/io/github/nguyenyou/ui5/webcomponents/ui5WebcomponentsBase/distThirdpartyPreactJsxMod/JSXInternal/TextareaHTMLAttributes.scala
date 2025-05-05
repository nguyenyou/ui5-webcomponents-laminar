package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextareaHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var autoComplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var autocomplete: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var cols: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var defaultValue: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var dirName: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var disabled: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var maxLength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var maxlength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var minLength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var minlength: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var placeholder: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var readOnly: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var readonly: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var required: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var rows: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var value: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
  
  var wrap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object TextareaHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): TextareaHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextareaHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextareaHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & TextareaHTMLAttributes[T]) extends AnyVal {
    
    inline def setAutoComplete(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setCols(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setDefaultValue(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setDirName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "dirName", value.asInstanceOf[js.Any])
    
    inline def setDirNameUndefined: Self = StObject.set(x, "dirName", js.undefined)
    
    inline def setDisabled(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setMaxLength(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setMinLength(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaceholder(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadOnly(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setRequired(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setRows(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWrap(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
