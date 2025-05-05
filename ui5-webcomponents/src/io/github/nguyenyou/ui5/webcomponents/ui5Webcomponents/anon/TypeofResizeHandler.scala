package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofResizeHandler extends StObject {
  
  /**
    * @public
    * @param element UI5 Web Component or DOM Element to be unobserved
    * @param callback Callback to be removed
    */
  /* static member */
  def deregister(element: HTMLElement, callback: ResizeObserverCallback): Unit
  
  /**
    * @public
    * @param element UI5 Web Component or DOM Element to be observed
    * @param callback Callback to be executed
    */
  /* static member */
  def register(element: HTMLElement, callback: ResizeObserverCallback): Unit
}
object TypeofResizeHandler {
  
  inline def apply(
    deregister: (HTMLElement, ResizeObserverCallback) => Unit,
    register: (HTMLElement, ResizeObserverCallback) => Unit
  ): TypeofResizeHandler = {
    val __obj = js.Dynamic.literal(deregister = js.Any.fromFunction2(deregister), register = js.Any.fromFunction2(register))
    __obj.asInstanceOf[TypeofResizeHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofResizeHandler] (val x: Self) extends AnyVal {
    
    inline def setDeregister(value: (HTMLElement, ResizeObserverCallback) => Unit): Self = StObject.set(x, "deregister", js.Any.fromFunction2(value))
    
    inline def setRegister(value: (HTMLElement, ResizeObserverCallback) => Unit): Self = StObject.set(x, "register", js.Any.fromFunction2(value))
  }
}
