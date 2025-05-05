package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.SelectChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSelectMod.SelectLiveChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Livechange extends StObject {
  
  var change: SelectChangeEventDetail
  
  var close: Unit
  
  var input: Unit
  
  var `live-change`: SelectLiveChangeEventDetail
  
  var open: Unit
  
  var `selected-item-changed`: Unit
}
object Livechange {
  
  inline def apply(
    change: SelectChangeEventDetail,
    close: Unit,
    input: Unit,
    `live-change`: SelectLiveChangeEventDetail,
    open: Unit,
    `selected-item-changed`: Unit
  ): Livechange = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("live-change")(`live-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("selected-item-changed")(`selected-item-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Livechange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Livechange] (val x: Self) extends AnyVal {
    
    inline def setChange(value: SelectChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def `setLive-change`(value: SelectLiveChangeEventDetail): Self = StObject.set(x, "live-change", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setSelected-item-changed`(value: Unit): Self = StObject.set(x, "selected-item-changed", value.asInstanceOf[js.Any])
  }
}
