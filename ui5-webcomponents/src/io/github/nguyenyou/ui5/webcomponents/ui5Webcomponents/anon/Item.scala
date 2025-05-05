package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.ListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var item: ListItem
  
  var selected: Boolean
}
object Item {
  
  inline def apply(item: ListItem, selected: Boolean): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setItem(value: ListItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
