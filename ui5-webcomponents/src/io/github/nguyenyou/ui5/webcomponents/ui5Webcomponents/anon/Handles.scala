package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handles extends StObject {
  
  var handles: js.UndefOr[JsxTemplate] = js.undefined
  
  var handlesAriaText: js.UndefOr[JsxTemplate] = js.undefined
  
  var progressBar: js.UndefOr[JsxTemplate] = js.undefined
}
object Handles {
  
  inline def apply(): Handles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handles] (val x: Self) extends AnyVal {
    
    inline def setHandles(value: () => JsxTemplateResult): Self = StObject.set(x, "handles", js.Any.fromFunction0(value))
    
    inline def setHandlesAriaText(value: () => JsxTemplateResult): Self = StObject.set(x, "handlesAriaText", js.Any.fromFunction0(value))
    
    inline def setHandlesAriaTextUndefined: Self = StObject.set(x, "handlesAriaText", js.undefined)
    
    inline def setHandlesUndefined: Self = StObject.set(x, "handles", js.undefined)
    
    inline def setProgressBar(value: () => JsxTemplateResult): Self = StObject.set(x, "progressBar", js.Any.fromFunction0(value))
    
    inline def setProgressBarUndefined: Self = StObject.set(x, "progressBar", js.undefined)
  }
}
