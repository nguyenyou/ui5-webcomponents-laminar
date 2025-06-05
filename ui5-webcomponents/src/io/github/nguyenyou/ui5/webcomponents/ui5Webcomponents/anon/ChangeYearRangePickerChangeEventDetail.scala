package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distYearRangePickerMod.YearRangePickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distYearRangePickerMod.YearRangePickerNavigateEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeYearRangePickerChangeEventDetail extends StObject {
  
  var change: YearRangePickerChangeEventDetail
  
  var navigate: YearRangePickerNavigateEventDetail
}
object ChangeYearRangePickerChangeEventDetail {
  
  inline def apply(change: YearRangePickerChangeEventDetail, navigate: YearRangePickerNavigateEventDetail): ChangeYearRangePickerChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeYearRangePickerChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeYearRangePickerChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: YearRangePickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: YearRangePickerNavigateEventDetail): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
