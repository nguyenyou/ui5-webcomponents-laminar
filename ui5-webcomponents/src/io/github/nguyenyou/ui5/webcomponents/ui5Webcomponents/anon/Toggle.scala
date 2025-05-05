package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Toggle extends StObject {
  
  var toggle: Unit
}
object Toggle {
  
  inline def apply(toggle: Unit): Toggle = {
    val __obj = js.Dynamic.literal(toggle = toggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Toggle] (val x: Self) extends AnyVal {
    
    inline def setToggle(value: Unit): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
  }
}
