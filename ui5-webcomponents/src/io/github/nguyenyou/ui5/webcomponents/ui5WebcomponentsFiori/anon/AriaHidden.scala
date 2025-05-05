package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distFlexibleColumnLayoutMod.FCLAccessibilityRoles
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaHidden extends StObject {
  
  var ariaHidden: js.UndefOr[`true`] = js.undefined
  
  var role: js.UndefOr[FCLAccessibilityRoles] = js.undefined
}
object AriaHidden {
  
  inline def apply(): AriaHidden = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AriaHidden]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaHidden] (val x: Self) extends AnyVal {
    
    inline def setAriaHidden(value: `true`): Self = StObject.set(x, "ariaHidden", value.asInstanceOf[js.Any])
    
    inline def setAriaHiddenUndefined: Self = StObject.set(x, "ariaHidden", js.undefined)
    
    inline def setRole(value: FCLAccessibilityRoles): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
