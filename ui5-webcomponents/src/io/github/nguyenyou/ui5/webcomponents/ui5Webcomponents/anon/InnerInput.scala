package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerInput extends StObject {
  
  var innerInput: Padding
  
  var popoverHeader: MaxwidthString
  
  var suggestionPopoverHeader: Display
  
  var suggestionsPopover: Maxwidth
}
object InnerInput {
  
  inline def apply(
    innerInput: Padding,
    popoverHeader: MaxwidthString,
    suggestionPopoverHeader: Display,
    suggestionsPopover: Maxwidth
  ): InnerInput = {
    val __obj = js.Dynamic.literal(innerInput = innerInput.asInstanceOf[js.Any], popoverHeader = popoverHeader.asInstanceOf[js.Any], suggestionPopoverHeader = suggestionPopoverHeader.asInstanceOf[js.Any], suggestionsPopover = suggestionsPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InnerInput] (val x: Self) extends AnyVal {
    
    inline def setInnerInput(value: Padding): Self = StObject.set(x, "innerInput", value.asInstanceOf[js.Any])
    
    inline def setPopoverHeader(value: MaxwidthString): Self = StObject.set(x, "popoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionPopoverHeader(value: Display): Self = StObject.set(x, "suggestionPopoverHeader", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsPopover(value: Maxwidth): Self = StObject.set(x, "suggestionsPopover", value.asInstanceOf[js.Any])
  }
}
