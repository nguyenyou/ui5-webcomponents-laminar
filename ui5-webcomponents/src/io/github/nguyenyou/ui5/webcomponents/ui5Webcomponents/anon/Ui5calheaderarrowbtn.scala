package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5calheaderarrowbtn extends StObject {
  
  var `ui5-calheader-arrowbtn`: Boolean
  
  var `ui5-calheader-arrowbtn-disabled`: Boolean
}
object Ui5calheaderarrowbtn {
  
  inline def apply(`ui5-calheader-arrowbtn`: Boolean, `ui5-calheader-arrowbtn-disabled`: Boolean): Ui5calheaderarrowbtn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-calheader-arrowbtn")(`ui5-calheader-arrowbtn`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-calheader-arrowbtn-disabled")(`ui5-calheader-arrowbtn-disabled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5calheaderarrowbtn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5calheaderarrowbtn] (val x: Self) extends AnyVal {
    
    inline def `setUi5-calheader-arrowbtn`(value: Boolean): Self = StObject.set(x, "ui5-calheader-arrowbtn", value.asInstanceOf[js.Any])
    
    inline def `setUi5-calheader-arrowbtn-disabled`(value: Boolean): Self = StObject.set(x, "ui5-calheader-arrowbtn-disabled", value.asInstanceOf[js.Any])
  }
}
