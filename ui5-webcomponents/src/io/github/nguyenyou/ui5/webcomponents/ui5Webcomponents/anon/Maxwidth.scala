package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxwidth extends StObject {
  
  var `max-width`: String
  
  var `min-width`: String
}
object Maxwidth {
  
  inline def apply(`max-width`: String, `min-width`: String): Maxwidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("min-width")(`min-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxwidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maxwidth] (val x: Self) extends AnyVal {
    
    inline def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-width`(value: String): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
  }
}
