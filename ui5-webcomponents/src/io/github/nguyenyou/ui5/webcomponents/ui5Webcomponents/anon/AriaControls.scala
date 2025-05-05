package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaControls extends StObject {
  
  var ariaControls: js.UndefOr[String] = js.undefined
  
  var ariaExpanded: js.UndefOr[Boolean] = js.undefined
  
  var ariaLabelledby: js.UndefOr[String] = js.undefined
  
  var button: AccessibilityAttributes
  
  var role: js.UndefOr[button] = js.undefined
}
object AriaControls {
  
  inline def apply(button: AccessibilityAttributes): AriaControls = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaControls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaControls] (val x: Self) extends AnyVal {
    
    inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
    
    inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
    
    inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    
    inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
    
    inline def setAriaLabelledby(value: String): Self = StObject.set(x, "ariaLabelledby", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelledbyUndefined: Self = StObject.set(x, "ariaLabelledby", js.undefined)
    
    inline def setButton(value: AccessibilityAttributes): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setRole(value: button): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
