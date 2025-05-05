package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxwidthString extends StObject {
  
  var `max-width`: String
}
object MaxwidthString {
  
  inline def apply(`max-width`: String): MaxwidthString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxwidthString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaxwidthString] (val x: Self) extends AnyVal {
    
    inline def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
  }
}
