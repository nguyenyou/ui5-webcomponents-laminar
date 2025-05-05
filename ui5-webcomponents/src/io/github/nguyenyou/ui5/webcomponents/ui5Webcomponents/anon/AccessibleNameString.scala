package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibleNameString extends StObject {
  
  var accessibleName: String
}
object AccessibleNameString {
  
  inline def apply(accessibleName: String): AccessibleNameString = {
    val __obj = js.Dynamic.literal(accessibleName = accessibleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibleNameString] (val x: Self) extends AnyVal {
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
  }
}
