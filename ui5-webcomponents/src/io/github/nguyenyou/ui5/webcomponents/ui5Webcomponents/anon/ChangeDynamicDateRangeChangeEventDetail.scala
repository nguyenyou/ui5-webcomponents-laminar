package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDynamicDateRangeMod.DynamicDateRangeChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeDynamicDateRangeChangeEventDetail extends StObject {
  
  var change: DynamicDateRangeChangeEventDetail
}
object ChangeDynamicDateRangeChangeEventDetail {
  
  inline def apply(change: DynamicDateRangeChangeEventDetail): ChangeDynamicDateRangeChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDynamicDateRangeChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeDynamicDateRangeChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: DynamicDateRangeChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
