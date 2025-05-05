package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import io.github.nguyenyou.ui5.webcomponents.std.Extract
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarLogoAccessibilityAttributes extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[Extract[AriaRole, button | link]] = js.undefined
}
object ShellBarLogoAccessibilityAttributes {
  
  inline def apply(): ShellBarLogoAccessibilityAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellBarLogoAccessibilityAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarLogoAccessibilityAttributes] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRole(value: Extract[AriaRole, button | link]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
