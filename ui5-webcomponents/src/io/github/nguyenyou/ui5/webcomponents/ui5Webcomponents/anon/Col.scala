package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Col extends StObject {
  
  var col: default
  
  var width: Double
}
object Col {
  
  inline def apply(col: default, width: Double): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
    
    inline def setCol(value: default): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
