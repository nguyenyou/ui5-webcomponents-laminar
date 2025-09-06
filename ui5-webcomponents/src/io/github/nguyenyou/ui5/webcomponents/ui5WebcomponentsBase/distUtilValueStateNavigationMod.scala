package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilValueStateNavigationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/valueStateNavigation.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attachListeners(e: KeyboardEvent, links: js.Array[HTMLElement], index: Double, handlers: ControlHandlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachListeners")(e.asInstanceOf[js.Any], links.asInstanceOf[js.Any], index.asInstanceOf[js.Any], handlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ControlHandlers extends StObject {
    
    def closeValueState(): Unit
    
    def focusInput(): Unit
    
    def isPopoverOpen(): Boolean
    
    def navigateToItem(): Unit
  }
  object ControlHandlers {
    
    inline def apply(
      closeValueState: () => Unit,
      focusInput: () => Unit,
      isPopoverOpen: () => Boolean,
      navigateToItem: () => Unit
    ): ControlHandlers = {
      val __obj = js.Dynamic.literal(closeValueState = js.Any.fromFunction0(closeValueState), focusInput = js.Any.fromFunction0(focusInput), isPopoverOpen = js.Any.fromFunction0(isPopoverOpen), navigateToItem = js.Any.fromFunction0(navigateToItem))
      __obj.asInstanceOf[ControlHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlHandlers] (val x: Self) extends AnyVal {
      
      inline def setCloseValueState(value: () => Unit): Self = StObject.set(x, "closeValueState", js.Any.fromFunction0(value))
      
      inline def setFocusInput(value: () => Unit): Self = StObject.set(x, "focusInput", js.Any.fromFunction0(value))
      
      inline def setIsPopoverOpen(value: () => Boolean): Self = StObject.set(x, "isPopoverOpen", js.Any.fromFunction0(value))
      
      inline def setNavigateToItem(value: () => Unit): Self = StObject.set(x, "navigateToItem", js.Any.fromFunction0(value))
    }
  }
}
