package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DictxWidth
  extends StObject
     with /* x */ StringDictionary[String] {
  
  var width: String
}
object DictxWidth {
  
  inline def apply(width: String): DictxWidth = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictxWidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DictxWidth] (val x: Self) extends AnyVal {
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
