package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputTemplateMod.TemplateHook
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostContent extends StObject {
  
  def postContent(): JsxTemplateResult
  @JSName("postContent")
  var postContent_Original: TemplateHook
  
  def preContent(): JsxTemplateResult
  @JSName("preContent")
  var preContent_Original: TemplateHook
  
  var suggestionsList: js.UndefOr[TemplateHook] = js.undefined
}
object PostContent {
  
  inline def apply(postContent: () => JsxTemplateResult, preContent: () => JsxTemplateResult): PostContent = {
    val __obj = js.Dynamic.literal(postContent = js.Any.fromFunction0(postContent), preContent = js.Any.fromFunction0(preContent))
    __obj.asInstanceOf[PostContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostContent] (val x: Self) extends AnyVal {
    
    inline def setPostContent(value: () => JsxTemplateResult): Self = StObject.set(x, "postContent", js.Any.fromFunction0(value))
    
    inline def setPreContent(value: () => JsxTemplateResult): Self = StObject.set(x, "preContent", js.Any.fromFunction0(value))
    
    inline def setSuggestionsList(value: () => JsxTemplateResult): Self = StObject.set(x, "suggestionsList", js.Any.fromFunction0(value))
    
    inline def setSuggestionsListUndefined: Self = StObject.set(x, "suggestionsList", js.undefined)
  }
}
