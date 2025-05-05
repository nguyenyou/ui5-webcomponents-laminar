package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextButton extends StObject {
  
  var nextButton: Ui5calheaderarrowbtn
  
  var prevButton: Ui5calheaderarrowbtn
}
object NextButton {
  
  inline def apply(nextButton: Ui5calheaderarrowbtn, prevButton: Ui5calheaderarrowbtn): NextButton = {
    val __obj = js.Dynamic.literal(nextButton = nextButton.asInstanceOf[js.Any], prevButton = prevButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NextButton] (val x: Self) extends AnyVal {
    
    inline def setNextButton(value: Ui5calheaderarrowbtn): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
    
    inline def setPrevButton(value: Ui5calheaderarrowbtn): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
  }
}
