package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellBarContentItem
  extends StObject
     with IShellBarHidableItem {
  
  var hideOrder: Double
}
object IShellBarContentItem {
  
  inline def apply(classes: String, hideOrder: Double, id: String, show: Boolean): IShellBarContentItem = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], hideOrder = hideOrder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellBarContentItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellBarContentItem] (val x: Self) extends AnyVal {
    
    inline def setHideOrder(value: Double): Self = StObject.set(x, "hideOrder", value.asInstanceOf[js.Any])
  }
}
