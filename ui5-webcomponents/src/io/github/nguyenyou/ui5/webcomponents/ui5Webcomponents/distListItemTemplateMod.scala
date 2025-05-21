package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.PartialListItemHooks
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplateResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemTemplateMod {
  
  @JSImport("@ui5/webcomponents/dist/ListItemTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(hooks: PartialListItemHooks): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hooks.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait ListItemHooks extends StObject {
    
    def iconBegin(): JsxTemplateResult
    @JSName("iconBegin")
    var iconBegin_Original: JsxTemplate
    
    def iconEnd(): JsxTemplateResult
    @JSName("iconEnd")
    var iconEnd_Original: JsxTemplate
    
    def imageBegin(): JsxTemplateResult
    @JSName("imageBegin")
    var imageBegin_Original: JsxTemplate
    
    def listItemContent(): JsxTemplateResult
    @JSName("listItemContent")
    var listItemContent_Original: JsxTemplate
    
    def listItemPreContent(): JsxTemplateResult
    @JSName("listItemPreContent")
    var listItemPreContent_Original: JsxTemplate
    
    def selectionElement(): JsxTemplateResult
    @JSName("selectionElement")
    var selectionElement_Original: JsxTemplate
  }
  object ListItemHooks {
    
    inline def apply(
      iconBegin: () => JsxTemplateResult,
      iconEnd: () => JsxTemplateResult,
      imageBegin: () => JsxTemplateResult,
      listItemContent: () => JsxTemplateResult,
      listItemPreContent: () => JsxTemplateResult,
      selectionElement: () => JsxTemplateResult
    ): ListItemHooks = {
      val __obj = js.Dynamic.literal(iconBegin = js.Any.fromFunction0(iconBegin), iconEnd = js.Any.fromFunction0(iconEnd), imageBegin = js.Any.fromFunction0(imageBegin), listItemContent = js.Any.fromFunction0(listItemContent), listItemPreContent = js.Any.fromFunction0(listItemPreContent), selectionElement = js.Any.fromFunction0(selectionElement))
      __obj.asInstanceOf[ListItemHooks]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemHooks] (val x: Self) extends AnyVal {
      
      inline def setIconBegin(value: () => JsxTemplateResult): Self = StObject.set(x, "iconBegin", js.Any.fromFunction0(value))
      
      inline def setIconEnd(value: () => JsxTemplateResult): Self = StObject.set(x, "iconEnd", js.Any.fromFunction0(value))
      
      inline def setImageBegin(value: () => JsxTemplateResult): Self = StObject.set(x, "imageBegin", js.Any.fromFunction0(value))
      
      inline def setListItemContent(value: () => JsxTemplateResult): Self = StObject.set(x, "listItemContent", js.Any.fromFunction0(value))
      
      inline def setListItemPreContent(value: () => JsxTemplateResult): Self = StObject.set(x, "listItemPreContent", js.Any.fromFunction0(value))
      
      inline def setSelectionElement(value: () => JsxTemplateResult): Self = StObject.set(x, "selectionElement", js.Any.fromFunction0(value))
    }
  }
}
