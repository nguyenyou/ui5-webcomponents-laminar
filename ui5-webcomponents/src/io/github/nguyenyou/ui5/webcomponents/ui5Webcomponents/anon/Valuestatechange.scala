package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distStepInputMod.StepInputValueStateChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valuestatechange extends StObject {
  
  var change: Unit
  
  var input: InputEventDetail
  
  var `value-state-change`: StepInputValueStateChangeEventDetail
}
object Valuestatechange {
  
  inline def apply(change: Unit, input: InputEventDetail, `value-state-change`: StepInputValueStateChangeEventDetail): Valuestatechange = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.updateDynamic("value-state-change")(`value-state-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valuestatechange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Valuestatechange] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputEventDetail): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def `setValue-state-change`(value: StepInputValueStateChangeEventDetail): Self = StObject.set(x, "value-state-change", value.asInstanceOf[js.Any])
  }
}
