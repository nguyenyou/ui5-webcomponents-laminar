package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesPatchPopupMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/patchPopup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(Popup: OpenUI5Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Control extends StObject {
    
    def getDomRef(): HTMLElement | Null
  }
  object Control {
    
    inline def apply(getDomRef: () => HTMLElement | Null): Control = {
      val __obj = js.Dynamic.literal(getDomRef = js.Any.fromFunction0(getDomRef))
      __obj.asInstanceOf[Control]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
      
      inline def setGetDomRef(value: () => HTMLElement | Null): Self = StObject.set(x, "getDomRef", js.Any.fromFunction0(value))
    }
  }
  
  type OpenUI5Popup = js.Object
}
