package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionsList extends StObject {
  
  var suggestionsList: js.UndefOr[js.ThisFunction0[/* this */ default, JsxTemplateResult]] = js.undefined
}
object SuggestionsList {
  
  inline def apply(): SuggestionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionsList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionsList] (val x: Self) extends AnyVal {
    
    inline def setSuggestionsList(value: js.ThisFunction0[/* this */ default, JsxTemplateResult]): Self = StObject.set(x, "suggestionsList", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsListUndefined: Self = StObject.set(x, "suggestionsList", js.undefined)
  }
}
