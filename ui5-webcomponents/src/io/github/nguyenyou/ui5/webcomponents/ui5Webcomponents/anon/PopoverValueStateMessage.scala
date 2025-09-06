package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopoverValueStateMessage extends StObject {
  
  var suggestionPopoverHeader: Display
  
  var suggestionsPopover: Maxwidth
}
object PopoverValueStateMessage {
  
  inline def apply(suggestionPopoverHeader: Display, suggestionsPopover: Maxwidth): PopoverValueStateMessage = {
    val __obj = js.Dynamic.literal(suggestionPopoverHeader = suggestionPopoverHeader.asInstanceOf[js.Any], suggestionsPopover = suggestionsPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopoverValueStateMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopoverValueStateMessage] (val x: Self) extends AnyVal {
    
    inline def setSuggestionPopoverHeader(value: Display): Self = StObject.set(x, "suggestionPopoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsPopover(value: Maxwidth): Self = StObject.set(x, "suggestionsPopover", value.asInstanceOf[js.Any])
  }
}
