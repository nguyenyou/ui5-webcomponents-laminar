package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distRendererExecuteTemplateMod.TemplateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  var context: default
  
  def toolbarPopoverTemplate(): js.Object
  @JSName("toolbarPopoverTemplate")
  var toolbarPopoverTemplate_Original: TemplateFunction
  
  def toolbarTemplate(): js.Object
  @JSName("toolbarTemplate")
  var toolbarTemplate_Original: TemplateFunction
}
object Context {
  
  inline def apply(context: default, toolbarPopoverTemplate: () => js.Object, toolbarTemplate: () => js.Object): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], toolbarPopoverTemplate = js.Any.fromFunction0(toolbarPopoverTemplate), toolbarTemplate = js.Any.fromFunction0(toolbarTemplate))
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
    
    inline def setContext(value: default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setToolbarPopoverTemplate(value: () => js.Object): Self = StObject.set(x, "toolbarPopoverTemplate", js.Any.fromFunction0(value))
    
    inline def setToolbarTemplate(value: () => js.Object): Self = StObject.set(x, "toolbarTemplate", js.Any.fromFunction0(value))
  }
}
