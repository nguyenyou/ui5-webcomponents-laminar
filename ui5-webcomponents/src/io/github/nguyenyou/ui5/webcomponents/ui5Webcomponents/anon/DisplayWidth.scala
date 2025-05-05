package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayWidth extends StObject {
  
  var display: String
  
  var width: String
}
object DisplayWidth {
  
  inline def apply(display: String, width: String): DisplayWidth = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayWidth] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
