package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeInput extends StObject {
  
  var change: Unit
  
  var input: Unit
}
object ChangeInput {
  
  inline def apply(change: Unit, input: Unit): ChangeInput = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChangeInput] (val x: Self) extends AnyVal {
    
    inline def setChange(value: Unit): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setInput(value: Unit): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
