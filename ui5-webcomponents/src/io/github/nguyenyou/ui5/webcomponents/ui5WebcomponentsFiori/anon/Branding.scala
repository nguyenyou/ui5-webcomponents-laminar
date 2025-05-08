package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Branding extends StObject {
  
  var branding: AccessibilityAttributes2
  
  var notifications: AccessibilityAttributes
  
  var overflow: AccessibilityAttributesHasPopupAriaHasPopup
  
  var products: Title
  
  var profile: Title
  
  var search: AccessibilityAttributesTitle
}
object Branding {
  
  inline def apply(
    branding: AccessibilityAttributes2,
    notifications: AccessibilityAttributes,
    overflow: AccessibilityAttributesHasPopupAriaHasPopup,
    products: Title,
    profile: Title,
    search: AccessibilityAttributesTitle
  ): Branding = {
    val __obj = js.Dynamic.literal(branding = branding.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], overflow = overflow.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Branding] (val x: Self) extends AnyVal {
    
    inline def setBranding(value: AccessibilityAttributes2): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setNotifications(value: AccessibilityAttributes): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setOverflow(value: AccessibilityAttributesHasPopupAriaHasPopup): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setProducts(value: Title): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Title): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setSearch(value: AccessibilityAttributesTitle): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
  }
}
