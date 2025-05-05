package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transformorigin
  extends StObject
     with /* x */ StringDictionary[String] {
  
  var `transform-origin`: String
  
  var width: String
}
object Transformorigin {
  
  inline def apply(`transform-origin`: String, width: String): Transformorigin = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("transform-origin")(`transform-origin`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transformorigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transformorigin] (val x: Self) extends AnyVal {
    
    inline def `setTransform-origin`(value: String): Self = StObject.set(x, "transform-origin", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
