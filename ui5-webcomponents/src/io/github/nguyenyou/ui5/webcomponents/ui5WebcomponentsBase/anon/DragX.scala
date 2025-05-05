package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragX extends StObject {
  
  var dragX: Double
  
  var dragY: Double
}
object DragX {
  
  inline def apply(dragX: Double, dragY: Double): DragX = {
    val __obj = js.Dynamic.literal(dragX = dragX.asInstanceOf[js.Any], dragY = dragY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DragX] (val x: Self) extends AnyVal {
    
    inline def setDragX(value: Double): Self = StObject.set(x, "dragX", value.asInstanceOf[js.Any])
    
    inline def setDragY(value: Double): Self = StObject.set(x, "dragY", value.asInstanceOf[js.Any])
  }
}
