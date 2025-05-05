package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonMod.SegmentedButtonSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionchangeSegmentedButtonSelectionChangeEventDetail extends StObject {
  
  var `selection-change`: SegmentedButtonSelectionChangeEventDetail
}
object SelectionchangeSegmentedButtonSelectionChangeEventDetail {
  
  inline def apply(`selection-change`: SegmentedButtonSelectionChangeEventDetail): SelectionchangeSegmentedButtonSelectionChangeEventDetail = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionchangeSegmentedButtonSelectionChangeEventDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectionchangeSegmentedButtonSelectionChangeEventDetail] (val x: Self) extends AnyVal {
    
    inline def `setSelection-change`(value: SegmentedButtonSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
