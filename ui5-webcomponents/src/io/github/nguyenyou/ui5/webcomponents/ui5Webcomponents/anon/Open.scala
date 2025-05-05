package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.DatePickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.DatePickerInputEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDatePickerMod.DatePickerValueStateChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  var change: DatePickerChangeEventDetail
  
  var close: Unit
  
  var input: DatePickerInputEventDetail
  
  var open: Unit
  
  var `value-changed`: DatePickerChangeEventDetail
  
  var `value-state-change`: DatePickerValueStateChangeEventDetail
}
object Open {
  
  inline def apply(
    change: DatePickerChangeEventDetail,
    close: Unit,
    input: DatePickerInputEventDetail,
    open: Unit,
    `value-changed`: DatePickerChangeEventDetail,
    `value-state-change`: DatePickerValueStateChangeEventDetail
  ): Open = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("value-changed")(`value-changed`.asInstanceOf[js.Any])
    __obj.updateDynamic("value-state-change")(`value-state-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
    
    inline def setChange(value: DatePickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setInput(value: DatePickerInputEventDetail): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setValue-changed`(value: DatePickerChangeEventDetail): Self = StObject.set(x, "value-changed", value.asInstanceOf[js.Any])
    
    inline def `setValue-state-change`(value: DatePickerValueStateChangeEventDetail): Self = StObject.set(x, "value-state-change", value.asInstanceOf[js.Any])
  }
}
