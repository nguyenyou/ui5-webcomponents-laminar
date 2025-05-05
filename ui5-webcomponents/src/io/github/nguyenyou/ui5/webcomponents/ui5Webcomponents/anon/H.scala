package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H extends StObject {
  
  var h: Double
  
  var l: Double
  
  var s: Double
}
object H {
  
  inline def apply(h: Double, l: Double, s: Double): H = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[H]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: H] (val x: Self) extends AnyVal {
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
