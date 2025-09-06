package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleAriaRole extends StObject {
  
  var role: AriaRole
}
object RoleAriaRole {
  
  inline def apply(role: AriaRole): RoleAriaRole = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAriaRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RoleAriaRole] (val x: Self) extends AnyVal {
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
