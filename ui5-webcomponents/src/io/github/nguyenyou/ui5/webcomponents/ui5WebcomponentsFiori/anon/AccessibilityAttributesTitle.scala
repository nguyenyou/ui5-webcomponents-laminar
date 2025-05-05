package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityAttributesTitle extends StObject {
  
  var accessibilityAttributes: `1`
  
  var title: String
}
object AccessibilityAttributesTitle {
  
  inline def apply(accessibilityAttributes: `1`, title: String): AccessibilityAttributesTitle = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAttributesTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityAttributesTitle] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: `1`): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
