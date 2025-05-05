package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverMinwidth extends StObject {
  
  var popover: Minwidth
}
object PopoverMinwidth {
  
  inline def apply(popover: Minwidth): PopoverMinwidth = {
    val __obj = js.Dynamic.literal(popover = popover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverMinwidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverMinwidth] (val x: Self) extends AnyVal {
    
    inline def setPopover(value: Minwidth): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
  }
}
