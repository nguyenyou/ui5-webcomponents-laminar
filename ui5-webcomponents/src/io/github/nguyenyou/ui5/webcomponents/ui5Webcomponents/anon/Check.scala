package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuBeforeOpenEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.MenuNavigateOutOfEndContentEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Check extends StObject {
  
  var `before-close`: MenuBeforeCloseEventDetail
  
  var `before-open`: MenuBeforeOpenEventDetail
  
  var check: Unit
  
  var close: Unit
  
  var `close-menu`: Unit
  
  var `exit-end-content`: MenuNavigateOutOfEndContentEventDetail
  
  var open: Unit
}
object Check {
  
  inline def apply(
    `before-close`: MenuBeforeCloseEventDetail,
    `before-open`: MenuBeforeOpenEventDetail,
    check: Unit,
    close: Unit,
    `close-menu`: Unit,
    `exit-end-content`: MenuNavigateOutOfEndContentEventDetail,
    open: Unit
  ): Check = {
    val __obj = js.Dynamic.literal(check = check.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("before-close")(`before-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("before-open")(`before-open`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-menu")(`close-menu`.asInstanceOf[js.Any])
    __obj.updateDynamic("exit-end-content")(`exit-end-content`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Check]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Check] (val x: Self) extends AnyVal {
    
    inline def `setBefore-close`(value: MenuBeforeCloseEventDetail): Self = StObject.set(x, "before-close", value.asInstanceOf[js.Any])
    
    inline def `setBefore-open`(value: MenuBeforeOpenEventDetail): Self = StObject.set(x, "before-open", value.asInstanceOf[js.Any])
    
    inline def setCheck(value: Unit): Self = StObject.set(x, "check", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def `setClose-menu`(value: Unit): Self = StObject.set(x, "close-menu", value.asInstanceOf[js.Any])
    
    inline def `setExit-end-content`(value: MenuNavigateOutOfEndContentEventDetail): Self = StObject.set(x, "exit-end-content", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
