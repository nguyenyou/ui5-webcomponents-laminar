package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverHeader extends StObject {
  
  var popoverHeader: Width
  
  var suggestionPopoverHeader: Display
  
  var suggestionsPopover: Maxwidth
}
object PopoverHeader {
  
  inline def apply(popoverHeader: Width, suggestionPopoverHeader: Display, suggestionsPopover: Maxwidth): PopoverHeader = {
    val __obj = js.Dynamic.literal(popoverHeader = popoverHeader.asInstanceOf[js.Any], suggestionPopoverHeader = suggestionPopoverHeader.asInstanceOf[js.Any], suggestionsPopover = suggestionsPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverHeader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverHeader] (val x: Self) extends AnyVal {
    
    inline def setPopoverHeader(value: Width): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionPopoverHeader(value: Display): Self = StObject.set(x, "suggestionPopoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsPopover(value: Maxwidth): Self = StObject.set(x, "suggestionsPopover", value.asInstanceOf[js.Any])
  }
}
