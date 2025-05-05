package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityAttributes extends StObject {
  
  var accessibilityAttributes: Expanded
  
  var ariaLabelButton: js.UndefOr[String] = js.undefined
  
  var title: String
}
object AccessibilityAttributes {
  
  inline def apply(accessibilityAttributes: Expanded, title: String): AccessibilityAttributes = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityAttributes] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: Expanded): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelButton(value: String): Self = StObject.set(x, "ariaLabelButton", value.asInstanceOf[js.Any])
    
    inline def setAriaLabelButtonUndefined: Self = StObject.set(x, "ariaLabelButton", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
