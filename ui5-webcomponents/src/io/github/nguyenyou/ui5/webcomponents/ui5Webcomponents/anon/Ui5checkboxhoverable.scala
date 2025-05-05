package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5checkboxhoverable extends StObject {
  
  var `ui5-checkbox--hoverable`: Boolean
}
object Ui5checkboxhoverable {
  
  inline def apply(`ui5-checkbox--hoverable`: Boolean): Ui5checkboxhoverable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-checkbox--hoverable")(`ui5-checkbox--hoverable`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5checkboxhoverable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5checkboxhoverable] (val x: Self) extends AnyVal {
    
    inline def `setUi5-checkbox--hoverable`(value: Boolean): Self = StObject.set(x, "ui5-checkbox--hoverable", value.asInstanceOf[js.Any])
  }
}
