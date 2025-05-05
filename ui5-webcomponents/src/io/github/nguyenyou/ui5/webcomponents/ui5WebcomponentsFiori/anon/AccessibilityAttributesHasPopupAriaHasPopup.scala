package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityAttributesHasPopupAriaHasPopup extends StObject {
  
  var accessibilityAttributes: HasPopupAriaHasPopup
  
  var title: String
}
object AccessibilityAttributesHasPopupAriaHasPopup {
  
  inline def apply(accessibilityAttributes: HasPopupAriaHasPopup, title: String): AccessibilityAttributesHasPopupAriaHasPopup = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAttributesHasPopupAriaHasPopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityAttributesHasPopupAriaHasPopup] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: HasPopupAriaHasPopup): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
