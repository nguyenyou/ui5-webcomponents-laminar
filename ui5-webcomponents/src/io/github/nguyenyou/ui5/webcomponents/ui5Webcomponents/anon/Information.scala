package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Information extends StObject {
  
  var Critical: String
  
  var Information: String
  
  var Negative: String
  
  var Positive: String
}
object Information {
  
  inline def apply(Critical: String, Information: String, Negative: String, Positive: String): Information = {
    val __obj = js.Dynamic.literal(Critical = Critical.asInstanceOf[js.Any], Information = Information.asInstanceOf[js.Any], Negative = Negative.asInstanceOf[js.Any], Positive = Positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Information]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Information] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: String): Self = StObject.set(x, "Critical", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: String): Self = StObject.set(x, "Information", value.asInstanceOf[js.Any])
    
    inline def setNegative(value: String): Self = StObject.set(x, "Negative", value.asInstanceOf[js.Any])
    
    inline def setPositive(value: String): Self = StObject.set(x, "Positive", value.asInstanceOf[js.Any])
  }
}
