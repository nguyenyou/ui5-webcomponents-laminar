package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalcedMaxLength extends StObject {
  
  var calcedMaxLength: js.UndefOr[Double] = js.undefined
  
  var exceededText: js.UndefOr[String] = js.undefined
  
  var leftCharactersCount: js.UndefOr[Double] = js.undefined
}
object CalcedMaxLength {
  
  inline def apply(): CalcedMaxLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalcedMaxLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalcedMaxLength] (val x: Self) extends AnyVal {
    
    inline def setCalcedMaxLength(value: Double): Self = StObject.set(x, "calcedMaxLength", value.asInstanceOf[js.Any])
    
    inline def setCalcedMaxLengthUndefined: Self = StObject.set(x, "calcedMaxLength", js.undefined)
    
    inline def setExceededText(value: String): Self = StObject.set(x, "exceededText", value.asInstanceOf[js.Any])
    
    inline def setExceededTextUndefined: Self = StObject.set(x, "exceededText", js.undefined)
    
    inline def setLeftCharactersCount(value: Double): Self = StObject.set(x, "leftCharactersCount", value.asInstanceOf[js.Any])
    
    inline def setLeftCharactersCountUndefined: Self = StObject.set(x, "leftCharactersCount", js.undefined)
  }
}
