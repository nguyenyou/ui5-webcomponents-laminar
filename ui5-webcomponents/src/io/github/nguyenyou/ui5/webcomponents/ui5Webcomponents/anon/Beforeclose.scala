package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.PopupBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.PopupScrollEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beforeclose extends StObject {
  
  var `before-close`: PopupBeforeCloseEventDetail
  
  var `before-open`: Unit
  
  var close: Unit
  
  var open: Unit
  
  var scroll: PopupScrollEventDetail
}
object Beforeclose {
  
  inline def apply(
    `before-close`: PopupBeforeCloseEventDetail,
    `before-open`: Unit,
    close: Unit,
    open: Unit,
    scroll: PopupScrollEventDetail
  ): Beforeclose = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.updateDynamic("before-close")(`before-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("before-open")(`before-open`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beforeclose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beforeclose] (val x: Self) extends AnyVal {
    
    inline def `setBefore-close`(value: PopupBeforeCloseEventDetail): Self = StObject.set(x, "before-close", value.asInstanceOf[js.Any])
    
    inline def `setBefore-open`(value: Unit): Self = StObject.set(x, "before-open", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: PopupScrollEventDetail): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
  }
}
