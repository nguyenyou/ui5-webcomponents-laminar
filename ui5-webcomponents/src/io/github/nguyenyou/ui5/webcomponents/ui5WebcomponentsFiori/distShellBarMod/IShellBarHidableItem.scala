package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellBarHidableItem extends StObject {
  
  var classes: String
  
  var id: String
  
  var show: Boolean
}
object IShellBarHidableItem {
  
  inline def apply(classes: String, id: String, show: Boolean): IShellBarHidableItem = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellBarHidableItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellBarHidableItem] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
