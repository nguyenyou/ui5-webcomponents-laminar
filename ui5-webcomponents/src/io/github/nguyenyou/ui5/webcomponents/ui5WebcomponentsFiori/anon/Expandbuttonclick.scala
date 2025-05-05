package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expandbuttonclick extends StObject {
  
  var `expand-button-click`: Unit
  
  var `expand-button-hover-in`: Unit
  
  var `expand-button-hover-out`: Unit
  
  var `pin-button-click`: Unit
}
object Expandbuttonclick {
  
  inline def apply(
    `expand-button-click`: Unit,
    `expand-button-hover-in`: Unit,
    `expand-button-hover-out`: Unit,
    `pin-button-click`: Unit
  ): Expandbuttonclick = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expand-button-click")(`expand-button-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("expand-button-hover-in")(`expand-button-hover-in`.asInstanceOf[js.Any])
    __obj.updateDynamic("expand-button-hover-out")(`expand-button-hover-out`.asInstanceOf[js.Any])
    __obj.updateDynamic("pin-button-click")(`pin-button-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expandbuttonclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Expandbuttonclick] (val x: Self) extends AnyVal {
    
    inline def `setExpand-button-click`(value: Unit): Self = StObject.set(x, "expand-button-click", value.asInstanceOf[js.Any])
    
    inline def `setExpand-button-hover-in`(value: Unit): Self = StObject.set(x, "expand-button-hover-in", value.asInstanceOf[js.Any])
    
    inline def `setExpand-button-hover-out`(value: Unit): Self = StObject.set(x, "expand-button-hover-out", value.asInstanceOf[js.Any])
    
    inline def `setPin-button-click`(value: Unit): Self = StObject.set(x, "pin-button-click", value.asInstanceOf[js.Any])
  }
}
