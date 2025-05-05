package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerMod.TimePickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerMod.TimePickerInputEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valuechanged extends StObject {
  
  var change: TimePickerChangeEventDetail
  
  var close: Unit
  
  var input: TimePickerInputEventDetail
  
  var open: Unit
  
  var `value-changed`: TimePickerChangeEventDetail
}
object Valuechanged {
  
  inline def apply(
    change: TimePickerChangeEventDetail,
    close: Unit,
    input: TimePickerInputEventDetail,
    open: Unit,
    `value-changed`: TimePickerChangeEventDetail
  ): Valuechanged = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("value-changed")(`value-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Valuechanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Valuechanged] (val x: Self) extends AnyVal {
    
    inline def setChange(value: TimePickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setInput(value: TimePickerInputEventDetail): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setValue-changed`(value: TimePickerChangeEventDetail): Self = StObject.set(x, "value-changed", value.asInstanceOf[js.Any])
  }
}
