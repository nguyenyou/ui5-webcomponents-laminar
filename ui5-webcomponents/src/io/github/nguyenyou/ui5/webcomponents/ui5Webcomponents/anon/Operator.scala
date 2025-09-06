package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator extends StObject {
  
  var operator: String
  
  var text: String
  
  var unitText: String
}
object Operator {
  
  inline def apply(operator: String, text: String, unitText: String): Operator = {
    val __obj = js.Dynamic.literal(operator = operator.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unitText = unitText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Operator] (val x: Self) extends AnyVal {
    
    inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUnitText(value: String): Self = StObject.set(x, "unitText", value.asInstanceOf[js.Any])
  }
}
