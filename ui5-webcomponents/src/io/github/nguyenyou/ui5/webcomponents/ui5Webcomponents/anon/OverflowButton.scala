package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowButton extends StObject {
  
  var overflowButton: Tooltip
  
  var popover: AccessibleNameString
  
  var root: AccessibleName
}
object OverflowButton {
  
  inline def apply(overflowButton: Tooltip, popover: AccessibleNameString, root: AccessibleName): OverflowButton = {
    val __obj = js.Dynamic.literal(overflowButton = overflowButton.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowButton] (val x: Self) extends AnyVal {
    
    inline def setOverflowButton(value: Tooltip): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
    
    inline def setPopover(value: AccessibleNameString): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: AccessibleName): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
