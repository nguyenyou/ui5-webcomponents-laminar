package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuBeforeOpenEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.MenuItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beforeopen extends StObject {
  
  var `before-close`: MenuBeforeCloseEventDetail
  
  var `before-open`: MenuBeforeOpenEventDetail
  
  var close: Unit
  
  var `close-menu`: Unit
  
  var `item-click`: MenuItemClickEventDetail
  
  var open: Unit
}
object Beforeopen {
  
  inline def apply(
    `before-close`: MenuBeforeCloseEventDetail,
    `before-open`: MenuBeforeOpenEventDetail,
    close: Unit,
    `close-menu`: Unit,
    `item-click`: MenuItemClickEventDetail,
    open: Unit
  ): Beforeopen = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("before-close")(`before-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("before-open")(`before-open`.asInstanceOf[js.Any])
    __obj.updateDynamic("close-menu")(`close-menu`.asInstanceOf[js.Any])
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beforeopen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beforeopen] (val x: Self) extends AnyVal {
    
    inline def `setBefore-close`(value: MenuBeforeCloseEventDetail): Self = StObject.set(x, "before-close", value.asInstanceOf[js.Any])
    
    inline def `setBefore-open`(value: MenuBeforeOpenEventDetail): Self = StObject.set(x, "before-open", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def `setClose-menu`(value: Unit): Self = StObject.set(x, "close-menu", value.asInstanceOf[js.Any])
    
    inline def `setItem-click`(value: MenuItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
