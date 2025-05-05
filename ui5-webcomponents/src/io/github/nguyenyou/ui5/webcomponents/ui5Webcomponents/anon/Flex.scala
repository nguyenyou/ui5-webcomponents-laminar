package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flex extends StObject {
  
  var flex: Unit
  
  var width: String
}
object Flex {
  
  inline def apply(flex: Unit, width: String): Flex = {
    val __obj = js.Dynamic.literal(flex = flex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flex] (val x: Self) extends AnyVal {
    
    inline def setFlex(value: Unit): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
