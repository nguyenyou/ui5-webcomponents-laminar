package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@ui5/webcomponents.@ui5/webcomponents/dist/Menu.MenuItemClickEventDetail, 'item'> & {  associatedItem :@ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationSelectableItemBase.default} */
trait PickMenuItemClickEventDet extends StObject {
  
  var associatedItem: default
  
  var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default
}
object PickMenuItemClickEventDet {
  
  inline def apply(
    associatedItem: default,
    item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default
  ): PickMenuItemClickEventDet = {
    val __obj = js.Dynamic.literal(associatedItem = associatedItem.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickMenuItemClickEventDet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickMenuItemClickEventDet] (val x: Self) extends AnyVal {
    
    inline def setAssociatedItem(value: default): Self = StObject.set(x, "associatedItem", value.asInstanceOf[js.Any])
    
    inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
