package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var _focused: Unit
  
  var click: ItemProductSwitchItem
}
object Focused {
  
  inline def apply(_focused: Unit, click: ItemProductSwitchItem): Focused = {
    val __obj = js.Dynamic.literal(_focused = _focused.asInstanceOf[js.Any], click = click.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
    
    inline def setClick(value: ItemProductSwitchItem): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def set_focused(value: Unit): Self = StObject.set(x, "_focused", value.asInstanceOf[js.Any])
  }
}
