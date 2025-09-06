package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.OpenUI5
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.WebComponent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFeaturesPatchPopupMod {
  
  @JSImport("@ui5/webcomponents-base/dist/features/patchPopup.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOpenedPopup(popupInfo: PopupInfo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOpenedPopup")(popupInfo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getTopmostPopup(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopmostPopup")().asInstanceOf[js.Object]
  
  inline def patchPopup(Popup: OpenUI5Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("patchPopup")(Popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def removeOpenedPopup(popup: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOpenedPopup")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
  
  trait PopupInfo extends StObject {
    
    var instance: js.Object
    
    var `type`: OpenUI5 | WebComponent
  }
  object PopupInfo {
    
    inline def apply(instance: js.Object, `type`: OpenUI5 | WebComponent): PopupInfo = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupInfo] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: js.Object): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setType(value: OpenUI5 | WebComponent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
