package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selectionchangerequested extends StObject {
  
  var focused: Unit
  
  var `selection-change-requested`: Unit
}
object Selectionchangerequested {
  
  inline def apply(focused: Unit, `selection-change-requested`: Unit): Selectionchangerequested = {
    val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change-requested")(`selection-change-requested`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionchangerequested]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selectionchangerequested] (val x: Self) extends AnyVal {
    
    inline def setFocused(value: Unit): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change-requested`(value: Unit): Self = StObject.set(x, "selection-change-requested", value.asInstanceOf[js.Any])
  }
}
