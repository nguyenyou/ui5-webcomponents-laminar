package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainWidth extends StObject {
  
  var main: Width
}
object MainWidth {
  
  inline def apply(main: Width): MainWidth = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any])
    __obj.asInstanceOf[MainWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MainWidth] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Width): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
  }
}
