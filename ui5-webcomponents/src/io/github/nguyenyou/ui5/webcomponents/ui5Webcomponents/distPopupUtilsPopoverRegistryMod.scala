package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopupUtilsPopoverRegistryMod {
  
  @JSImport("@ui5/webcomponents/dist/popup-utils/PopoverRegistry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addOpenedPopover(instance: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addOpenedPopover")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getRegistry(): js.Array[RegisteredPopover] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegistry")().asInstanceOf[js.Array[RegisteredPopover]]
  
  inline def removeOpenedPopover(instance: default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeOpenedPopover")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait RegisteredPopover extends StObject {
    
    var instance: default
    
    var parentPopovers: js.Array[default]
  }
  object RegisteredPopover {
    
    inline def apply(instance: default, parentPopovers: js.Array[default]): RegisteredPopover = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], parentPopovers = parentPopovers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredPopover]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegisteredPopover] (val x: Self) extends AnyVal {
      
      inline def setInstance(value: default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setParentPopovers(value: js.Array[default]): Self = StObject.set(x, "parentPopovers", value.asInstanceOf[js.Any])
      
      inline def setParentPopoversVarargs(value: default*): Self = StObject.set(x, "parentPopovers", js.Array(value*))
    }
  }
}
