package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonthButtonInfo extends StObject {
  
  var monthButtonInfo: Any
  
  var monthButtonText: Any
  
  var yearButtonText: String
}
object MonthButtonInfo {
  
  inline def apply(monthButtonInfo: Any, monthButtonText: Any, yearButtonText: String): MonthButtonInfo = {
    val __obj = js.Dynamic.literal(monthButtonInfo = monthButtonInfo.asInstanceOf[js.Any], monthButtonText = monthButtonText.asInstanceOf[js.Any], yearButtonText = yearButtonText.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthButtonInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonthButtonInfo] (val x: Self) extends AnyVal {
    
    inline def setMonthButtonInfo(value: Any): Self = StObject.set(x, "monthButtonInfo", value.asInstanceOf[js.Any])
    
    inline def setMonthButtonText(value: Any): Self = StObject.set(x, "monthButtonText", value.asInstanceOf[js.Any])
    
    inline def setYearButtonText(value: String): Self = StObject.set(x, "yearButtonText", value.asInstanceOf[js.Any])
  }
}
