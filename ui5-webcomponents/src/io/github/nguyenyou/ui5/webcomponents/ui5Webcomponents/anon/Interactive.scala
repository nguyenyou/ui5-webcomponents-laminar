package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interactive extends StObject {
  
  var icon: String
  
  var interactive: Boolean
  
  var text: String
}
object Interactive {
  
  inline def apply(icon: String, interactive: Boolean, text: String): Interactive = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], interactive = interactive.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interactive] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
