package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSliderTooltipMod.SliderTooltipChangeEventDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forwardfocus extends StObject {
  
  var change: SliderTooltipChangeEventDetails
  
  var `forward-focus`: Unit
}
object Forwardfocus {
  
  inline def apply(change: SliderTooltipChangeEventDetails, `forward-focus`: Unit): Forwardfocus = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.updateDynamic("forward-focus")(`forward-focus`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forwardfocus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Forwardfocus] (val x: Self) extends AnyVal {
    
    inline def setChange(value: SliderTooltipChangeEventDetails): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def `setForward-focus`(value: Unit): Self = StObject.set(x, "forward-focus", value.asInstanceOf[js.Any])
  }
}
