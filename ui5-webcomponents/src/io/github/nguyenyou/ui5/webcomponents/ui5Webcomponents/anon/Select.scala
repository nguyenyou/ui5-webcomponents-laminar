package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputSelectionChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.InputSuggestionScrollEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select extends StObject {
  
  var change: InputEventDetail
  
  var close: Unit
  
  var input: InputEventDetail
  
  var open: Unit
  
  var select: Unit
  
  var `selection-change`: InputSelectionChangeEventDetail
  
  var `suggestion-scroll`: InputSuggestionScrollEventDetail
  
  var `type-ahead`: Unit
}
object Select {
  
  inline def apply(
    change: InputEventDetail,
    close: Unit,
    input: InputEventDetail,
    open: Unit,
    select: Unit,
    `selection-change`: InputSelectionChangeEventDetail,
    `suggestion-scroll`: InputSuggestionScrollEventDetail,
    `type-ahead`: Unit
  ): Select = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("suggestion-scroll")(`suggestion-scroll`.asInstanceOf[js.Any])
    __obj.updateDynamic("type-ahead")(`type-ahead`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Select]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Select] (val x: Self) extends AnyVal {
    
    inline def setChange(value: InputEventDetail): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setInput(value: InputEventDetail): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Unit): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: InputSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
    
    inline def `setSuggestion-scroll`(value: InputSuggestionScrollEventDetail): Self = StObject.set(x, "suggestion-scroll", value.asInstanceOf[js.Any])
    
    inline def `setType-ahead`(value: Unit): Self = StObject.set(x, "type-ahead", value.asInstanceOf[js.Any])
  }
}
