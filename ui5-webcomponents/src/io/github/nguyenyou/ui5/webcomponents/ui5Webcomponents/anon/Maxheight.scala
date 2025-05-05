package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxheight extends StObject {
  
  var `max-height`: String
  
  var `max-width`: String
}
object Maxheight {
  
  inline def apply(`max-height`: String, `max-width`: String): Maxheight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-height")(`max-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("max-width")(`max-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maxheight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maxheight] (val x: Self) extends AnyVal {
    
    inline def `setMax-height`(value: String): Self = StObject.set(x, "max-height", value.asInstanceOf[js.Any])
    
    inline def `setMax-width`(value: String): Self = StObject.set(x, "max-width", value.asInstanceOf[js.Any])
  }
}
