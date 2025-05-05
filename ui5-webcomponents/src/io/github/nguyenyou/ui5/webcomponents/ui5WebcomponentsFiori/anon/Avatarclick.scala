package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuMod.UserMenuItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserMenuMod.UserMenuOtherAccountClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Avatarclick extends StObject {
  
  var `avatar-click`: Unit
  
  var `change-account`: UserMenuOtherAccountClickEventDetail
  
  var close: Unit
  
  var `edit-accounts-click`: Unit
  
  var `item-click`: UserMenuItemClickEventDetail
  
  var `manage-account-click`: Unit
  
  var open: Unit
  
  var `sign-out-click`: Unit
}
object Avatarclick {
  
  inline def apply(
    `avatar-click`: Unit,
    `change-account`: UserMenuOtherAccountClickEventDetail,
    close: Unit,
    `edit-accounts-click`: Unit,
    `item-click`: UserMenuItemClickEventDetail,
    `manage-account-click`: Unit,
    open: Unit,
    `sign-out-click`: Unit
  ): Avatarclick = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("avatar-click")(`avatar-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("change-account")(`change-account`.asInstanceOf[js.Any])
    __obj.updateDynamic("edit-accounts-click")(`edit-accounts-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("manage-account-click")(`manage-account-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("sign-out-click")(`sign-out-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avatarclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Avatarclick] (val x: Self) extends AnyVal {
    
    inline def `setAvatar-click`(value: Unit): Self = StObject.set(x, "avatar-click", value.asInstanceOf[js.Any])
    
    inline def `setChange-account`(value: UserMenuOtherAccountClickEventDetail): Self = StObject.set(x, "change-account", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def `setEdit-accounts-click`(value: Unit): Self = StObject.set(x, "edit-accounts-click", value.asInstanceOf[js.Any])
    
    inline def `setItem-click`(value: UserMenuItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
    
    inline def `setManage-account-click`(value: Unit): Self = StObject.set(x, "manage-account-click", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setSign-out-click`(value: Unit): Self = StObject.set(x, "sign-out-click", value.asInstanceOf[js.Any])
  }
}
