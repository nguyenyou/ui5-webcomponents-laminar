package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsMouse extends StObject {
  
  var isMouse: Boolean
  
  var isUp: Boolean | Null
  
  var rows: js.Array[default]
  
  var selected: Boolean
  
  var shiftPressed: Boolean
}
object IsMouse {
  
  inline def apply(isMouse: Boolean, rows: js.Array[default], selected: Boolean, shiftPressed: Boolean): IsMouse = {
    val __obj = js.Dynamic.literal(isMouse = isMouse.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], shiftPressed = shiftPressed.asInstanceOf[js.Any], isUp = null)
    __obj.asInstanceOf[IsMouse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsMouse] (val x: Self) extends AnyVal {
    
    inline def setIsMouse(value: Boolean): Self = StObject.set(x, "isMouse", value.asInstanceOf[js.Any])
    
    inline def setIsUp(value: Boolean): Self = StObject.set(x, "isUp", value.asInstanceOf[js.Any])
    
    inline def setIsUpNull: Self = StObject.set(x, "isUp", null)
    
    inline def setRows(value: js.Array[default]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: default*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setShiftPressed(value: Boolean): Self = StObject.set(x, "shiftPressed", value.asInstanceOf[js.Any])
  }
}
