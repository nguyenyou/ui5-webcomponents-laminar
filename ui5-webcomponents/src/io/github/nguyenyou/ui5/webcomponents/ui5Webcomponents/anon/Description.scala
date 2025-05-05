package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: String
  
  var keyboardHint: String
}
object Description {
  
  inline def apply(description: String, keyboardHint: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], keyboardHint = keyboardHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Description] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setKeyboardHint(value: String): Self = StObject.set(x, "keyboardHint", value.asInstanceOf[js.Any])
  }
}
