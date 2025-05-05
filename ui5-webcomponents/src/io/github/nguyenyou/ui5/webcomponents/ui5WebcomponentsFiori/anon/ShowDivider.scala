package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowDivider extends StObject {
  
  var showDivider: Boolean
  
  var slotName: Any
}
object ShowDivider {
  
  inline def apply(showDivider: Boolean, slotName: Any): ShowDivider = {
    val __obj = js.Dynamic.literal(showDivider = showDivider.asInstanceOf[js.Any], slotName = slotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowDivider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShowDivider] (val x: Self) extends AnyVal {
    
    inline def setShowDivider(value: Boolean): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
    
    inline def setSlotName(value: Any): Self = StObject.set(x, "slotName", value.asInstanceOf[js.Any])
  }
}
