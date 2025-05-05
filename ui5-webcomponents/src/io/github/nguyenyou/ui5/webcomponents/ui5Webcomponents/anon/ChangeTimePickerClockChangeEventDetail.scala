package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerClockMod.TimePickerClockChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeTimePickerClockChangeEventDetail extends StObject {
  
  var change: TimePickerClockChangeEventDetail
}
object ChangeTimePickerClockChangeEventDetail {
  
  inline def apply(change: TimePickerClockChangeEventDetail): ChangeTimePickerClockChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTimePickerClockChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeTimePickerClockChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: TimePickerClockChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
