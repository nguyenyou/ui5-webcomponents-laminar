package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseVoid extends StObject {
  
  var close: Unit
}
object CloseVoid {
  
  inline def apply(close: Unit): CloseVoid = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseVoid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseVoid] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
  }
}
