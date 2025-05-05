package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var role: js.UndefOr[AriaRole] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object Role {
  
  inline def apply(): Role = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
    
    inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
