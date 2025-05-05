package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.FCLAccessibilityRoles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var name: String
  
  var role: FCLAccessibilityRoles
}
object Name {
  
  inline def apply(name: String, role: FCLAccessibilityRoles): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRole(value: FCLAccessibilityRoles): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
