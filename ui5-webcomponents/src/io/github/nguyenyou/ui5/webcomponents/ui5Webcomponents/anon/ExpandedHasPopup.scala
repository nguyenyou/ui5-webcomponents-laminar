package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.menu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedHasPopup extends StObject {
  
  var expanded: Boolean
  
  var hasPopup: menu
}
object ExpandedHasPopup {
  
  inline def apply(expanded: Boolean): ExpandedHasPopup = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], hasPopup = "menu")
    __obj.asInstanceOf[ExpandedHasPopup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandedHasPopup] (val x: Self) extends AnyVal {
    
    inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setHasPopup(value: menu): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
  }
}
