package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexWidth extends StObject {
  
  var flex: String
  
  var width: Unit
}
object FlexWidth {
  
  inline def apply(flex: String, width: Unit): FlexWidth = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexWidth] (val x: Self) extends AnyVal {
    
    inline def setFlex(value: String): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Unit): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
