package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaPressed extends StObject {
  
  var ariaPressed: js.UndefOr[Boolean] = js.undefined
  
  var ariaValueMax: js.UndefOr[Double] = js.undefined
  
  var ariaValueMin: js.UndefOr[Double] = js.undefined
  
  var ariaValueNow: js.UndefOr[Double] = js.undefined
  
  var ariaValueText: js.UndefOr[String] = js.undefined
}
object AriaPressed {
  
  inline def apply(): AriaPressed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaPressed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaPressed] (val x: Self) extends AnyVal {
    
    inline def setAriaPressed(value: Boolean): Self = StObject.set(x, "ariaPressed", value.asInstanceOf[js.Any])
    
    inline def setAriaPressedUndefined: Self = StObject.set(x, "ariaPressed", js.undefined)
    
    inline def setAriaValueMax(value: Double): Self = StObject.set(x, "ariaValueMax", value.asInstanceOf[js.Any])
    
    inline def setAriaValueMaxUndefined: Self = StObject.set(x, "ariaValueMax", js.undefined)
    
    inline def setAriaValueMin(value: Double): Self = StObject.set(x, "ariaValueMin", value.asInstanceOf[js.Any])
    
    inline def setAriaValueMinUndefined: Self = StObject.set(x, "ariaValueMin", js.undefined)
    
    inline def setAriaValueNow(value: Double): Self = StObject.set(x, "ariaValueNow", value.asInstanceOf[js.Any])
    
    inline def setAriaValueNowUndefined: Self = StObject.set(x, "ariaValueNow", js.undefined)
    
    inline def setAriaValueText(value: String): Self = StObject.set(x, "ariaValueText", value.asInstanceOf[js.Any])
    
    inline def setAriaValueTextUndefined: Self = StObject.set(x, "ariaValueText", js.undefined)
  }
}
