package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShellBarAccessibilityAttributes extends StObject {
  
  var branding: js.UndefOr[ShellBarBrandingAccessibilityAttributes] = js.undefined
  
  var logo: js.UndefOr[ShellBarLogoAccessibilityAttributes] = js.undefined
  
  var notifications: js.UndefOr[ShellBarAreaAccessibilityAttributes] = js.undefined
  
  var overflow: js.UndefOr[ShellBarAreaAccessibilityAttributes] = js.undefined
  
  var product: js.UndefOr[ShellBarAreaAccessibilityAttributes] = js.undefined
  
  var profile: js.UndefOr[ShellBarProfileAccessibilityAttributes] = js.undefined
  
  var search: js.UndefOr[ShellBarAreaAccessibilityAttributes] = js.undefined
}
object ShellBarAccessibilityAttributes {
  
  inline def apply(): ShellBarAccessibilityAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShellBarAccessibilityAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShellBarAccessibilityAttributes] (val x: Self) extends AnyVal {
    
    inline def setBranding(value: ShellBarBrandingAccessibilityAttributes): Self = StObject.set(x, "branding", value.asInstanceOf[js.Any])
    
    inline def setBrandingUndefined: Self = StObject.set(x, "branding", js.undefined)
    
    inline def setLogo(value: ShellBarLogoAccessibilityAttributes): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setNotifications(value: ShellBarAreaAccessibilityAttributes): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setOverflow(value: ShellBarAreaAccessibilityAttributes): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setProduct(value: ShellBarAreaAccessibilityAttributes): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setProfile(value: ShellBarProfileAccessibilityAttributes): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSearch(value: ShellBarAreaAccessibilityAttributes): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
