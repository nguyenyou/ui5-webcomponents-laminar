package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var icon: String
  
  var tooltip: String
}
object Icon {
  
  inline def apply(icon: String, tooltip: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
