package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flexwrap extends StObject {
  
  var `flex-wrap`: String
}
object Flexwrap {
  
  inline def apply(`flex-wrap`: String): Flexwrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flex-wrap")(`flex-wrap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flexwrap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flexwrap] (val x: Self) extends AnyVal {
    
    inline def `setFlex-wrap`(value: String): Self = StObject.set(x, "flex-wrap", value.asInstanceOf[js.Any])
  }
}
