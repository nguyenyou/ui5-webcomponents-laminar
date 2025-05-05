package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distProductSwitchItemMod.ProductSwitchItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemProductSwitchItem extends StObject {
  
  var item: ProductSwitchItem
}
object ItemProductSwitchItem {
  
  inline def apply(item: ProductSwitchItem): ItemProductSwitchItem = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemProductSwitchItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemProductSwitchItem] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ProductSwitchItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
