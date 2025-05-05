package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverValueStateMessage extends StObject {
  
  var popoverHeader: MaxwidthString
  
  var popoverValueStateMessage: DisplayWidth
  
  var suggestionsPopover: Maxwidth
}
object PopoverValueStateMessage {
  
  inline def apply(
    popoverHeader: MaxwidthString,
    popoverValueStateMessage: DisplayWidth,
    suggestionsPopover: Maxwidth
  ): PopoverValueStateMessage = {
    val __obj = js.Dynamic.literal(popoverHeader = popoverHeader.asInstanceOf[js.Any], popoverValueStateMessage = popoverValueStateMessage.asInstanceOf[js.Any], suggestionsPopover = suggestionsPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverValueStateMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverValueStateMessage] (val x: Self) extends AnyVal {
    
    inline def setPopoverHeader(value: MaxwidthString): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
    
    inline def setPopoverValueStateMessage(value: DisplayWidth): Self = StObject.set(x, "popoverValueStateMessage", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsPopover(value: Maxwidth): Self = StObject.set(x, "suggestionsPopover", value.asInstanceOf[js.Any])
  }
}
