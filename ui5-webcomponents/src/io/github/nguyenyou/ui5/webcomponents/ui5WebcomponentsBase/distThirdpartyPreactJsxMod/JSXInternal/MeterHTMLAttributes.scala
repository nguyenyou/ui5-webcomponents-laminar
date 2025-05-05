package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeterHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var form: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var high: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var low: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var max: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var min: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var optimum: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var value: js.UndefOr[Signalish[js.UndefOr[String | Double]]] = js.undefined
}
object MeterHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MeterHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MeterHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & MeterHTMLAttributes[T]) extends AnyVal {
    
    inline def setForm(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setHigh(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    inline def setLow(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    inline def setMax(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOptimum(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
    
    inline def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
    
    inline def setValue(value: Signalish[js.UndefOr[String | Double]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
