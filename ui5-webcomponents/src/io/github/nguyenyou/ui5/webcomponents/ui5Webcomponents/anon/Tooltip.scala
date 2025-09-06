package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip extends StObject {
  
  var accessibilityAttributes: ExpandedHasPopup
  
  var accessibleName: String
  
  var tooltip: String
}
object Tooltip {
  
  inline def apply(accessibilityAttributes: ExpandedHasPopup, accessibleName: String, tooltip: String): Tooltip = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any], accessibleName = accessibleName.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: ExpandedHasPopup): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
