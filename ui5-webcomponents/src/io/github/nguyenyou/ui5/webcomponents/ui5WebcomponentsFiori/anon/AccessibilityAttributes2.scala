package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessibilityAttributes2 extends StObject {
  
  var accessibilityAttributes: `2`
  
  var title: js.UndefOr[String] = js.undefined
}
object AccessibilityAttributes2 {
  
  inline def apply(accessibilityAttributes: `2`): AccessibilityAttributes2 = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAttributes2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessibilityAttributes2] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: `2`): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
