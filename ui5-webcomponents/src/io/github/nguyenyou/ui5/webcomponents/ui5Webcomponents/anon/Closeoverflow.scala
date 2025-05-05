package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.ToolbarItemEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closeoverflow extends StObject {
  
  var click: ToolbarItemEventDetail
  
  var `close-overflow`: Unit
}
object Closeoverflow {
  
  inline def apply(click: ToolbarItemEventDetail, `close-overflow`: Unit): Closeoverflow = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.updateDynamic("close-overflow")(`close-overflow`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closeoverflow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Closeoverflow] (val x: Self) extends AnyVal {
    
    inline def setClick(value: ToolbarItemEventDetail): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def `setClose-overflow`(value: Unit): Self = StObject.set(x, "close-overflow", value.asInstanceOf[js.Any])
  }
}
