package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'name'> */
trait ShellBarBrandingAccessibilityAttributes extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
}
object ShellBarBrandingAccessibilityAttributes {
  
  inline def apply(): ShellBarBrandingAccessibilityAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellBarBrandingAccessibilityAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarBrandingAccessibilityAttributes] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
