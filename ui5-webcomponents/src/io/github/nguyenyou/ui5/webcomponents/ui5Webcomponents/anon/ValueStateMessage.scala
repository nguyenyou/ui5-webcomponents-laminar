package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueStateMessage extends StObject {
  
  var suggestionsList: js.UndefOr[js.ThisFunction0[/* this */ default, JsxTemplateResult]] = js.undefined
  
  def valueStateMessage(): JsxTemplateResult
  
  def valueStateMessageInputIcon(): String
}
object ValueStateMessage {
  
  inline def apply(valueStateMessage: () => JsxTemplateResult, valueStateMessageInputIcon: () => String): ValueStateMessage = {
    val __obj = js.Dynamic.literal(valueStateMessage = js.Any.fromFunction0(valueStateMessage), valueStateMessageInputIcon = js.Any.fromFunction0(valueStateMessageInputIcon))
    __obj.asInstanceOf[ValueStateMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueStateMessage] (val x: Self) extends AnyVal {
    
    inline def setSuggestionsList(value: js.ThisFunction0[/* this */ default, JsxTemplateResult]): Self = StObject.set(x, "suggestionsList", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsListUndefined: Self = StObject.set(x, "suggestionsList", js.undefined)
    
    inline def setValueStateMessage(value: () => JsxTemplateResult): Self = StObject.set(x, "valueStateMessage", js.Any.fromFunction0(value))
    
    inline def setValueStateMessageInputIcon(value: () => String): Self = StObject.set(x, "valueStateMessageInputIcon", js.Any.fromFunction0(value))
  }
}
