package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMultiComboBoxMod.MultiComboBoxSelectionChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeClose extends StObject {
  
  var change: Unit
  
  var close: Unit
  
  var input: Unit
  
  var open: Unit
  
  var `selection-change`: MultiComboBoxSelectionChangeEventDetail
}
object ChangeClose {
  
  inline def apply(
    change: Unit,
    close: Unit,
    input: Unit,
    open: Unit,
    `selection-change`: MultiComboBoxSelectionChangeEventDetail
  ): ChangeClose = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeClose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeClose] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: MultiComboBoxSelectionChangeEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
