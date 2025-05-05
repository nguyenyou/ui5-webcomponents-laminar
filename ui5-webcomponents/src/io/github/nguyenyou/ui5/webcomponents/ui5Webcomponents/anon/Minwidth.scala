package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minwidth extends StObject {
  
  var `min-width`: String
}
object Minwidth {
  
  inline def apply(`min-width`: String): Minwidth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("min-width")(`min-width`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minwidth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Minwidth] (val x: Self) extends AnyVal {
    
    inline def `setMin-width`(value: String): Self = StObject.set(x, "min-width", value.asInstanceOf[js.Any])
  }
}
