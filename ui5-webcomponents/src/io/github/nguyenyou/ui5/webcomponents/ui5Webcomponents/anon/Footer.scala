package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerPopoverTemplateMod.TemplateHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  var content: js.UndefOr[TemplateHook] = js.undefined
  
  var footer: js.UndefOr[TemplateHook] = js.undefined
  
  var header: js.UndefOr[TemplateHook] = js.undefined
}
object Footer {
  
  inline def apply(): Footer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Footer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Footer] (val x: Self) extends AnyVal {
    
    inline def setContent(value: () => Unit): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFooter(value: () => Unit): Self = StObject.set(x, "footer", js.Any.fromFunction0(value))
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setHeader(value: () => Unit): Self = StObject.set(x, "header", js.Any.fromFunction0(value))
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
  }
}
