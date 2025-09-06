package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTextAreaMod.TextAreaInputEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scroll extends StObject {
  
  var change: Unit
  
  var input: TextAreaInputEventDetail
  
  var scroll: Unit
  
  var select: Unit
  
  var `value-changed`: Unit
}
object Scroll {
  
  inline def apply(change: Unit, input: TextAreaInputEventDetail, scroll: Unit, select: Unit, `value-changed`: Unit): Scroll = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("value-changed")(`value-changed`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Scroll]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scroll] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setInput(value: TextAreaInputEventDetail): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setScroll(value: Unit): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Unit): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def `setValue-changed`(value: Unit): Self = StObject.set(x, "value-changed", value.asInstanceOf[js.Any])
  }
}
