package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTimePickerInternalsMod.TimeSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeTimeSelectionChangeEventDetail extends StObject {
  
  var change: TimeSelectionChangeEventDetail
}
object ChangeTimeSelectionChangeEventDetail {
  
  inline def apply(change: TimeSelectionChangeEventDetail): ChangeTimeSelectionChangeEventDetail = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeTimeSelectionChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeTimeSelectionChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def setChange(value: TimeSelectionChangeEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
  }
}
