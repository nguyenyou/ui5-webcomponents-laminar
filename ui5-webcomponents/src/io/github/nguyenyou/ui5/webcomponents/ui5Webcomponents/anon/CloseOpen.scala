package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.ToolbarItemEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarSelectMod.ToolbarSelectChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseOpen extends StObject {
  
  var change: ToolbarSelectChangeEventDetail
  
  var close: ToolbarItemEventDetail
  
  var open: ToolbarItemEventDetail
}
object CloseOpen {
  
  inline def apply(
    change: ToolbarSelectChangeEventDetail,
    close: ToolbarItemEventDetail,
    open: ToolbarItemEventDetail
  ): CloseOpen = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseOpen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseOpen] (val x: Self) extends AnyVal {
    
    inline def setChange(value: ToolbarSelectChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: ToolbarItemEventDetail): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: ToolbarItemEventDetail): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
