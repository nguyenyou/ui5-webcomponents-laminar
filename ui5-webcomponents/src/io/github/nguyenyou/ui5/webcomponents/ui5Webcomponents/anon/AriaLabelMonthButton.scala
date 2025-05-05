package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaLabelMonthButton extends StObject {
  
  var ariaLabelMonthButton: String
}
object AriaLabelMonthButton {
  
  inline def apply(ariaLabelMonthButton: String): AriaLabelMonthButton = {
    val __obj = js.Dynamic.literal(ariaLabelMonthButton = ariaLabelMonthButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaLabelMonthButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AriaLabelMonthButton] (val x: Self) extends AnyVal {
    
    inline def setAriaLabelMonthButton(value: String): Self = StObject.set(x, "ariaLabelMonthButton", value.asInstanceOf[js.Any])
  }
}
