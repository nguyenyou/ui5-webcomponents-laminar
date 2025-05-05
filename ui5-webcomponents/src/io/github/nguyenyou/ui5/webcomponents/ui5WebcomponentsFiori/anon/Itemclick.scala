package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNotificationListMod.NotificationItemToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Itemclick extends StObject {
  
  var `item-click`: NotificationItemClickEventDetail
  
  var `item-close`: NotificationItemCloseEventDetail
  
  var `item-toggle`: NotificationItemToggleEventDetail
  
  var `load-more`: Unit
}
object Itemclick {
  
  inline def apply(
    `item-click`: NotificationItemClickEventDetail,
    `item-close`: NotificationItemCloseEventDetail,
    `item-toggle`: NotificationItemToggleEventDetail,
    `load-more`: Unit
  ): Itemclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-close")(`item-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-toggle")(`item-toggle`.asInstanceOf[js.Any])
    __obj.updateDynamic("load-more")(`load-more`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Itemclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Itemclick] (val x: Self) extends AnyVal {
    
    inline def `setItem-click`(value: NotificationItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
    
    inline def `setItem-close`(value: NotificationItemCloseEventDetail): Self = StObject.set(x, "item-close", value.asInstanceOf[js.Any])
    
    inline def `setItem-toggle`(value: NotificationItemToggleEventDetail): Self = StObject.set(x, "item-toggle", value.asInstanceOf[js.Any])
    
    inline def `setLoad-more`(value: Unit): Self = StObject.set(x, "load-more", value.asInstanceOf[js.Any])
  }
}
