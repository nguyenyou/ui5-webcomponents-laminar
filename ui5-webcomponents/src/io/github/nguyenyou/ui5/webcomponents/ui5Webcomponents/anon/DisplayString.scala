package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayString extends StObject {
  
  var display: String
  
  var width: js.UndefOr[String] = js.undefined
}
object DisplayString {
  
  inline def apply(display: String): DisplayString = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayString] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
