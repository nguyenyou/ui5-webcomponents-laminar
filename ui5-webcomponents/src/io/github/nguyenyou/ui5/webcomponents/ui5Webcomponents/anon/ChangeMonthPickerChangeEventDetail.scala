package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMonthPickerMod.MonthPickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMonthPickerMod.MonthPickerNavigateEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMonthPickerChangeEventDetail extends StObject {
  
  var change: MonthPickerChangeEventDetail
  
  var navigate: MonthPickerNavigateEventDetail
}
object ChangeMonthPickerChangeEventDetail {
  
  inline def apply(change: MonthPickerChangeEventDetail, navigate: MonthPickerNavigateEventDetail): ChangeMonthPickerChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMonthPickerChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeMonthPickerChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: MonthPickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: MonthPickerNavigateEventDetail): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
