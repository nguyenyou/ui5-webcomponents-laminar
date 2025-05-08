package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarMod

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distShellBarItemMod.ShellBarItemAccessibilityAttributes
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.click
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShelBarItemInfo
  extends StObject
     with IShellBarHidableItem {
  
  var accessibilityAttributes: js.UndefOr[ShellBarItemAccessibilityAttributes] = js.undefined
  
  var accessibleName: js.UndefOr[String] = js.undefined
  
  var count: js.UndefOr[String] = js.undefined
  
  var custom: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
  
  var order: js.UndefOr[Double] = js.undefined
  
  @JSName("press")
  def press_click(
    e: UI5CustomEvent[
      io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
      click
    ]
  ): Unit
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  var refItemid: js.UndefOr[String] = js.undefined
  
  var stableDomRef: js.UndefOr[String] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object IShelBarItemInfo {
  
  inline def apply(
    classes: String,
    id: String,
    press: UI5CustomEvent[
      io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
      click
    ] => Unit,
    show: Boolean
  ): IShelBarItemInfo = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], press = js.Any.fromFunction1(press), show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShelBarItemInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShelBarItemInfo] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityAttributes(value: ShellBarItemAccessibilityAttributes): Self = StObject.set(x, "accessibilityAttributes", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityAttributesUndefined: Self = StObject.set(x, "accessibilityAttributes", js.undefined)
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
    
    inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    inline def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setPress(
      value: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ] => Unit
    ): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setRefItemid(value: String): Self = StObject.set(x, "refItemid", value.asInstanceOf[js.Any])
    
    inline def setRefItemidUndefined: Self = StObject.set(x, "refItemid", js.undefined)
    
    inline def setStableDomRef(value: String): Self = StObject.set(x, "stableDomRef", value.asInstanceOf[js.Any])
    
    inline def setStableDomRefUndefined: Self = StObject.set(x, "stableDomRef", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
