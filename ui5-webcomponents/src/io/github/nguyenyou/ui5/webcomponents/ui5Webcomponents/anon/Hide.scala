package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesCalendarLegendItemTypeMod.CalendarLegendItemType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hide extends StObject {
  
  var hide: Boolean
  
  var `type`: CalendarLegendItemType
}
object Hide {
  
  inline def apply(hide: Boolean, `type`: CalendarLegendItemType): Hide = {
    val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hide] (val x: Self) extends AnyVal {
    
    inline def setHide(value: Boolean): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setType(value: CalendarLegendItemType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
