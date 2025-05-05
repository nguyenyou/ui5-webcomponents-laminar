package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelegateResizeHandlerMod {
  
  /**
    * Allows to register/deregister resize observers for a DOM element
    *
    * @public
    * @class
    */
  @JSImport("@ui5/webcomponents-base/dist/delegate/ResizeHandler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ResizeHandler
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/delegate/ResizeHandler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @public
      * @param element UI5 Web Component or DOM Element to be unobserved
      * @param callback Callback to be removed
      */
    /* static member */
    inline def deregister(element: HTMLElement, callback: ResizeObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deregister")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @public
      * @param element UI5 Web Component or DOM Element to be observed
      * @param callback Callback to be executed
      */
    /* static member */
    inline def register(element: HTMLElement, callback: ResizeObserverCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(element.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  /**
    * Allows to register/deregister resize observers for a DOM element
    *
    * @public
    * @class
    */
  trait ResizeHandler extends StObject
  
  type ResizeObserverCallback = js.Function0[js.Promise[Unit] | Unit]
}
