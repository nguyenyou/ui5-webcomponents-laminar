package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'name' | 'expanded' | 'hasPopup'> */
trait ShellBarProfileAccessibilityAttributes extends StObject {
  
  var expanded: js.UndefOr[Boolean] = js.undefined
  
  var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object ShellBarProfileAccessibilityAttributes {
  
  inline def apply(): ShellBarProfileAccessibilityAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellBarProfileAccessibilityAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarProfileAccessibilityAttributes] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
    
    inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
    
    inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
