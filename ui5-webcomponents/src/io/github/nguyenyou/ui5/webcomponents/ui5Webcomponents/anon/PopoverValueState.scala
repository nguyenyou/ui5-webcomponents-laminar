package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverValueState extends StObject {
  
  var popover: Ui5selectpopovervaluestate
  
  var popoverValueState: Ui5valuestatemessageinformation
}
object PopoverValueState {
  
  inline def apply(popover: Ui5selectpopovervaluestate, popoverValueState: Ui5valuestatemessageinformation): PopoverValueState = {
    val __obj = js.Dynamic.literal(popover = popover.asInstanceOf[js.Any], popoverValueState = popoverValueState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverValueState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverValueState] (val x: Self) extends AnyVal {
    
    inline def setPopover(value: Ui5selectpopovervaluestate): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverValueState(value: Ui5valuestatemessageinformation): Self = StObject.set(x, "popoverValueState", value.asInstanceOf[js.Any])
  }
}
