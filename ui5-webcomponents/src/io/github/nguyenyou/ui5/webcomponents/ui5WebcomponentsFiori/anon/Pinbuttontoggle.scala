package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pinbuttontoggle extends StObject {
  
  var `pin-button-toggle`: Unit
  
  var `title-toggle`: Unit
}
object Pinbuttontoggle {
  
  inline def apply(`pin-button-toggle`: Unit, `title-toggle`: Unit): Pinbuttontoggle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pin-button-toggle")(`pin-button-toggle`.asInstanceOf[js.Any])
    __obj.updateDynamic("title-toggle")(`title-toggle`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pinbuttontoggle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pinbuttontoggle] (val x: Self) extends AnyVal {
    
    inline def `setPin-button-toggle`(value: Unit): Self = StObject.set(x, "pin-button-toggle", value.asInstanceOf[js.Any])
    
    inline def `setTitle-toggle`(value: Unit): Self = StObject.set(x, "title-toggle", value.asInstanceOf[js.Any])
  }
}
