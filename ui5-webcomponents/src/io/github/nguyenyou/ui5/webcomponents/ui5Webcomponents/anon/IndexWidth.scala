package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexWidth extends StObject {
  
  var index: Double
  
  var width: Double
}
object IndexWidth {
  
  inline def apply(index: Double, width: Double): IndexWidth = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndexWidth] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
