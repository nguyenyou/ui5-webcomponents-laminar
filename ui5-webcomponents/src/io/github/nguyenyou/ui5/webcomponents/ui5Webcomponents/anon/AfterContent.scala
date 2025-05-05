package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterContent extends StObject {
  
  var afterContent: js.UndefOr[JsxTemplate] = js.undefined
  
  var beforeContent: js.UndefOr[JsxTemplate] = js.undefined
}
object AfterContent {
  
  inline def apply(): AfterContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterContent] (val x: Self) extends AnyVal {
    
    inline def setAfterContent(value: () => JsxTemplateResult): Self = StObject.set(x, "afterContent", js.Any.fromFunction0(value))
    
    inline def setAfterContentUndefined: Self = StObject.set(x, "afterContent", js.undefined)
    
    inline def setBeforeContent(value: () => JsxTemplateResult): Self = StObject.set(x, "beforeContent", js.Any.fromFunction0(value))
    
    inline def setBeforeContentUndefined: Self = StObject.set(x, "beforeContent", js.undefined)
  }
}
