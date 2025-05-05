package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notifications extends StObject {
  
  var notifications: AccessibilityAttributes
  
  var overflow: AccessibilityAttributesHasPopupAriaHasPopup
  
  var products: Title
  
  var profile: Title
  
  var search: AccessibilityAttributesTitle
}
object Notifications {
  
  inline def apply(
    notifications: AccessibilityAttributes,
    overflow: AccessibilityAttributesHasPopupAriaHasPopup,
    products: Title,
    profile: Title,
    search: AccessibilityAttributesTitle
  ): Notifications = {
    val __obj = js.Dynamic.literal(notifications = notifications.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Notifications] (val x: Self) extends AnyVal {
    
    inline def setNotifications(value: AccessibilityAttributes): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: AccessibilityAttributesHasPopupAriaHasPopup): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: Title): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Title): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: AccessibilityAttributesTitle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
