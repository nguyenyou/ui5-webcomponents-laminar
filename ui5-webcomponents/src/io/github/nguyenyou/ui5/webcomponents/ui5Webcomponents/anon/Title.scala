package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var accessibilityAttributes: ExpandedHasPopup
  
  var title: String
}
object Title {
  
  inline def apply(accessibilityAttributes: ExpandedHasPopup, title: String): Title = {
    val __obj = js.Dynamic.literal(accessibilityAttributes = accessibilityAttributes.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: ExpandedHasPopup): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
