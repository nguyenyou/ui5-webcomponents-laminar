package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.backward
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowDirection extends StObject {
  
  var arrowDirection: js.UndefOr[forward | backward] = js.undefined
  
  var arrowVisible: js.UndefOr[Boolean] = js.undefined
  
  var gripVisible: js.UndefOr[Boolean] = js.undefined
  
  var visible: Boolean
}
object ArrowDirection {
  
  inline def apply(visible: Boolean): ArrowDirection = {
    val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowDirection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowDirection] (val x: Self) extends AnyVal {
    
    inline def setArrowDirection(value: forward | backward): Self = StObject.set(x, "arrowDirection", value.asInstanceOf[js.Any])
    
    inline def setArrowDirectionUndefined: Self = StObject.set(x, "arrowDirection", js.undefined)
    
    inline def setArrowVisible(value: Boolean): Self = StObject.set(x, "arrowVisible", value.asInstanceOf[js.Any])
    
    inline def setArrowVisibleUndefined: Self = StObject.set(x, "arrowVisible", js.undefined)
    
    inline def setGripVisible(value: Boolean): Self = StObject.set(x, "gripVisible", value.asInstanceOf[js.Any])
    
    inline def setGripVisibleUndefined: Self = StObject.set(x, "gripVisible", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
