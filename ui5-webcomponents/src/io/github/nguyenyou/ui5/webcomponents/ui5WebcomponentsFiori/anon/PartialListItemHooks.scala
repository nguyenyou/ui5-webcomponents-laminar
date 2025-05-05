package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@ui5/webcomponents.@ui5/webcomponents/dist/ListItemTemplate.ListItemHooks> */
trait PartialListItemHooks extends StObject {
  
  var iconBegin: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
  
  var iconEnd: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
  
  var imageBegin: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
  
  var listItemContent: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
  
  var listItemPreContent: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
  
  var selectionElement: js.UndefOr[js.Function0[JsxTemplateResult]] = js.undefined
}
object PartialListItemHooks {
  
  inline def apply(): PartialListItemHooks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemHooks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialListItemHooks] (val x: Self) extends AnyVal {
    
    inline def setIconBegin(value: () => JsxTemplateResult): Self = StObject.set(x, "iconBegin", js.Any.fromFunction0(value))
    
    inline def setIconBeginUndefined: Self = StObject.set(x, "iconBegin", js.undefined)
    
    inline def setIconEnd(value: () => JsxTemplateResult): Self = StObject.set(x, "iconEnd", js.Any.fromFunction0(value))
    
    inline def setIconEndUndefined: Self = StObject.set(x, "iconEnd", js.undefined)
    
    inline def setImageBegin(value: () => JsxTemplateResult): Self = StObject.set(x, "imageBegin", js.Any.fromFunction0(value))
    
    inline def setImageBeginUndefined: Self = StObject.set(x, "imageBegin", js.undefined)
    
    inline def setListItemContent(value: () => JsxTemplateResult): Self = StObject.set(x, "listItemContent", js.Any.fromFunction0(value))
    
    inline def setListItemContentUndefined: Self = StObject.set(x, "listItemContent", js.undefined)
    
    inline def setListItemPreContent(value: () => JsxTemplateResult): Self = StObject.set(x, "listItemPreContent", js.Any.fromFunction0(value))
    
    inline def setListItemPreContentUndefined: Self = StObject.set(x, "listItemPreContent", js.undefined)
    
    inline def setSelectionElement(value: () => JsxTemplateResult): Self = StObject.set(x, "selectionElement", js.Any.fromFunction0(value))
    
    inline def setSelectionElementUndefined: Self = StObject.set(x, "selectionElement", js.undefined)
  }
}
