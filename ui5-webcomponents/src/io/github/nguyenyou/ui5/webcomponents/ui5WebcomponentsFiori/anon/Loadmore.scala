package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListGroupItemMod.NotificationListGroupItemToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loadmore extends StObject {
  
  var `load-more`: Unit
  
  var toggle: NotificationListGroupItemToggleEventDetail
}
object Loadmore {
  
  inline def apply(`load-more`: Unit, toggle: NotificationListGroupItemToggleEventDetail): Loadmore = {
    val __obj = js.Dynamic.literal(toggle = toggle.asInstanceOf[js.Any])
    __obj.updateDynamic("load-more")(`load-more`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadmore]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loadmore] (val x: Self) extends AnyVal {
    
    inline def `setLoad-more`(value: Unit): Self = StObject.set(x, "load-more", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: NotificationListGroupItemToggleEventDetail): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
  }
}
