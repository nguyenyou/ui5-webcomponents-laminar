package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDayPickerMod.DayPickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDayPickerMod.DayPickerNavigateEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeNavigate extends StObject {
  
  var change: DayPickerChangeEventDetail
  
  var navigate: DayPickerNavigateEventDetail
}
object ChangeNavigate {
  
  inline def apply(change: DayPickerChangeEventDetail, navigate: DayPickerNavigateEventDetail): ChangeNavigate = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeNavigate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeNavigate] (val x: Self) extends AnyVal {
    
    inline def setChange(value: DayPickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: DayPickerNavigateEventDetail): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
