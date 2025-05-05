package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarContentItemVisibilityChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarLogoClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarMenuItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarNotificationsClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarProductSwitchClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarProfileClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod.ShellBarSearchButtonEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contentitemvisibilitychange extends StObject {
  
  var `content-item-visibility-change`: ShellBarContentItemVisibilityChangeEventDetail
  
  var `logo-click`: ShellBarLogoClickEventDetail
  
  var `menu-item-click`: ShellBarMenuItemClickEventDetail
  
  var `notifications-click`: ShellBarNotificationsClickEventDetail
  
  var `product-switch-click`: ShellBarProductSwitchClickEventDetail
  
  var `profile-click`: ShellBarProfileClickEventDetail
  
  var `search-button-click`: ShellBarSearchButtonEventDetail
}
object Contentitemvisibilitychange {
  
  inline def apply(
    `content-item-visibility-change`: ShellBarContentItemVisibilityChangeEventDetail,
    `logo-click`: ShellBarLogoClickEventDetail,
    `menu-item-click`: ShellBarMenuItemClickEventDetail,
    `notifications-click`: ShellBarNotificationsClickEventDetail,
    `product-switch-click`: ShellBarProductSwitchClickEventDetail,
    `profile-click`: ShellBarProfileClickEventDetail,
    `search-button-click`: ShellBarSearchButtonEventDetail
  ): Contentitemvisibilitychange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-item-visibility-change")(`content-item-visibility-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("logo-click")(`logo-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("menu-item-click")(`menu-item-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("notifications-click")(`notifications-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("product-switch-click")(`product-switch-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("profile-click")(`profile-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("search-button-click")(`search-button-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentitemvisibilitychange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Contentitemvisibilitychange] (val x: Self) extends AnyVal {
    
    inline def `setContent-item-visibility-change`(value: ShellBarContentItemVisibilityChangeEventDetail): Self = StObject.set(x, "content-item-visibility-change", value.asInstanceOf[js.Any])
    
    inline def `setLogo-click`(value: ShellBarLogoClickEventDetail): Self = StObject.set(x, "logo-click", value.asInstanceOf[js.Any])
    
    inline def `setMenu-item-click`(value: ShellBarMenuItemClickEventDetail): Self = StObject.set(x, "menu-item-click", value.asInstanceOf[js.Any])
    
    inline def `setNotifications-click`(value: ShellBarNotificationsClickEventDetail): Self = StObject.set(x, "notifications-click", value.asInstanceOf[js.Any])
    
    inline def `setProduct-switch-click`(value: ShellBarProductSwitchClickEventDetail): Self = StObject.set(x, "product-switch-click", value.asInstanceOf[js.Any])
    
    inline def `setProfile-click`(value: ShellBarProfileClickEventDetail): Self = StObject.set(x, "profile-click", value.asInstanceOf[js.Any])
    
    inline def `setSearch-button-click`(value: ShellBarSearchButtonEventDetail): Self = StObject.set(x, "search-button-click", value.asInstanceOf[js.Any])
  }
}
