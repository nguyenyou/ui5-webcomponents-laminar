package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.ColorPaletteItemClickEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemclickColorPaletteItemClickEventDetail extends StObject {
  
  var `item-click`: ColorPaletteItemClickEventDetail
}
object ItemclickColorPaletteItemClickEventDetail {
  
  inline def apply(`item-click`: ColorPaletteItemClickEventDetail): ItemclickColorPaletteItemClickEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("item-click")(`item-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemclickColorPaletteItemClickEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemclickColorPaletteItemClickEventDetail] (val x: Self) extends AnyVal {
    
    inline def `setItem-click`(value: ColorPaletteItemClickEventDetail): Self = StObject.set(x, "item-click", value.asInstanceOf[js.Any])
  }
}
