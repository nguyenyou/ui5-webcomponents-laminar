package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalTextClasses extends StObject {
  
  var additionalTextClasses: String
  
  var itemClasses: String
}
object AdditionalTextClasses {
  
  inline def apply(additionalTextClasses: String, itemClasses: String): AdditionalTextClasses = {
    val __obj = js.Dynamic.literal(additionalTextClasses = additionalTextClasses.asInstanceOf[js.Any], itemClasses = itemClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalTextClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdditionalTextClasses] (val x: Self) extends AnyVal {
    
    inline def setAdditionalTextClasses(value: String): Self = StObject.set(x, "additionalTextClasses", value.asInstanceOf[js.Any])
    
    inline def setItemClasses(value: String): Self = StObject.set(x, "itemClasses", value.asInstanceOf[js.Any])
  }
}
