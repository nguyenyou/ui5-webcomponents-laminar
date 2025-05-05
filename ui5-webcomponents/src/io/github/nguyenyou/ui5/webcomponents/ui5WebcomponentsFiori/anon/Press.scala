package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemMod.NotificationListItemCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListItemMod.NotificationListItemPressEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Press extends StObject {
  
  var _press: NotificationListItemPressEventDetail
  
  var close: NotificationListItemCloseEventDetail
}
object Press {
  
  inline def apply(_press: NotificationListItemPressEventDetail, close: NotificationListItemCloseEventDetail): Press = {
    val __obj = js.Dynamic.literal(_press = _press.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[Press]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Press] (val x: Self) extends AnyVal {
    
    inline def setClose(value: NotificationListItemCloseEventDetail): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def set_press(value: NotificationListItemPressEventDetail): Self = StObject.set(x, "_press", value.asInstanceOf[js.Any])
  }
}
