package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.toolbar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibleName extends StObject {
  
  var accessibleName: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[toolbar] = js.undefined
}
object AccessibleName {
  
  inline def apply(): AccessibleName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibleName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibleName] (val x: Self) extends AnyVal {
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
    
    inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
    
    inline def setRole(value: toolbar): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
