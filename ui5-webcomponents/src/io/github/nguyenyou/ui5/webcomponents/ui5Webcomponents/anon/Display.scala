package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Display extends StObject {
  
  var display: String
  
  var `max-width`: String
  
  var width: String
}
object Display {
  
  inline def apply(display: String, `max-width`: String, width: String): Display = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Display]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Display] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
