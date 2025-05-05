package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: Boolean
  
  var ariaLabel: String
}
object Active {
  
  inline def apply(active: Boolean, ariaLabel: String): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], ariaLabel = ariaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Active] (val x: Self) extends AnyVal {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
  }
}
