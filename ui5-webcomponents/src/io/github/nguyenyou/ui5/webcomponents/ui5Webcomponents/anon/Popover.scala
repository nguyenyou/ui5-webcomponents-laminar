package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Popover extends StObject {
  
  var popover: Ui5popoverwithvaluestateheader
  
  var popoverValueState: Ui5valuestatemessageerror
}
object Popover {
  
  inline def apply(popover: Ui5popoverwithvaluestateheader, popoverValueState: Ui5valuestatemessageerror): Popover = {
    val __obj = js.Dynamic.literal(popover = popover.asInstanceOf[js.Any], popoverValueState = popoverValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Popover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Popover] (val x: Self) extends AnyVal {
    
    inline def setPopover(value: Ui5popoverwithvaluestateheader): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverValueState(value: Ui5valuestatemessageerror): Self = StObject.set(x, "popoverValueState", value.asInstanceOf[js.Any])
  }
}
