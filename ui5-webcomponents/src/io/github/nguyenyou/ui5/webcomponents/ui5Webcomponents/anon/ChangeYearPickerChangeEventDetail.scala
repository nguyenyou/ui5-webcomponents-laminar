package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distYearPickerMod.YearPickerChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distYearPickerMod.YearPickerNavigateEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeYearPickerChangeEventDetail extends StObject {
  
  var change: YearPickerChangeEventDetail
  
  var navigate: YearPickerNavigateEventDetail
}
object ChangeYearPickerChangeEventDetail {
  
  inline def apply(change: YearPickerChangeEventDetail, navigate: YearPickerNavigateEventDetail): ChangeYearPickerChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeYearPickerChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeYearPickerChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: YearPickerChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNavigate(value: YearPickerNavigateEventDetail): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
  }
}
