package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Last extends StObject {
  
  var last: Boolean
  
  var text: String
}
object Last {
  
  inline def apply(last: Boolean, text: String): Last = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Last]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Last] (val x: Self) extends AnyVal {
    
    inline def setLast(value: Boolean): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
