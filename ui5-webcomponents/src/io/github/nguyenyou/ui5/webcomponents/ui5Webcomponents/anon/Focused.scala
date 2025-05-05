package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.ListItemBasePressEventDetail
import org.scalajs.dom.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Focused extends StObject {
  
  var _focused: FocusEvent
  
  var _press: ListItemBasePressEventDetail
  
  var `forward-after`: Unit
  
  var `forward-before`: Unit
  
  var `request-tabindex-change`: FocusEvent
}
object Focused {
  
  inline def apply(
    _focused: FocusEvent,
    _press: ListItemBasePressEventDetail,
    `forward-after`: Unit,
    `forward-before`: Unit,
    `request-tabindex-change`: FocusEvent
  ): Focused = {
    val __obj = js.Dynamic.literal(_focused = _focused.asInstanceOf[js.Any], _press = _press.asInstanceOf[js.Any])
    __obj.updateDynamic("forward-after")(`forward-after`.asInstanceOf[js.Any])
    __obj.updateDynamic("forward-before")(`forward-before`.asInstanceOf[js.Any])
    __obj.updateDynamic("request-tabindex-change")(`request-tabindex-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focused]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Focused] (val x: Self) extends AnyVal {
    
    inline def `setForward-after`(value: Unit): Self = StObject.set(x, "forward-after", value.asInstanceOf[js.Any])
    
    inline def `setForward-before`(value: Unit): Self = StObject.set(x, "forward-before", value.asInstanceOf[js.Any])
    
    inline def `setRequest-tabindex-change`(value: FocusEvent): Self = StObject.set(x, "request-tabindex-change", value.asInstanceOf[js.Any])
    
    inline def set_focused(value: FocusEvent): Self = StObject.set(x, "_focused", value.asInstanceOf[js.Any])
    
    inline def set_press(value: ListItemBasePressEventDetail): Self = StObject.set(x, "_press", value.asInstanceOf[js.Any])
  }
}
