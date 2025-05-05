package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPalettePopoverMod.ColorPalettePopoverItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  var close: Unit
  
  var `item-click`: ColorPalettePopoverItemClickEventDetail
}
object Close {
  
  inline def apply(close: Unit, `item-click`: ColorPalettePopoverItemClickEventDetail): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def `setItem-click`(value: ColorPalettePopoverItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
  }
}
