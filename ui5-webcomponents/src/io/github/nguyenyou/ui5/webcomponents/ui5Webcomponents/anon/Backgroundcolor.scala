package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backgroundcolor extends StObject {
  
  var `background-color`: String
}
object Backgroundcolor {
  
  inline def apply(`background-color`: String): Backgroundcolor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backgroundcolor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backgroundcolor] (val x: Self) extends AnyVal {
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
  }
}
