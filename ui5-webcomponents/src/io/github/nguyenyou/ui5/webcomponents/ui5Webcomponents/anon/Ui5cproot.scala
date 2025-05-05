package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5cproot extends StObject {
  
  var `ui5-cp-root`: Boolean
  
  var `ui5-cp-root-phone`: Boolean
}
object Ui5cproot {
  
  inline def apply(`ui5-cp-root`: Boolean, `ui5-cp-root-phone`: Boolean): Ui5cproot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-cp-root")(`ui5-cp-root`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-cp-root-phone")(`ui5-cp-root-phone`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5cproot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5cproot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-cp-root`(value: Boolean): Self = StObject.set(x, "ui5-cp-root", value.asInstanceOf[js.Any])
    
    inline def `setUi5-cp-root-phone`(value: Boolean): Self = StObject.set(x, "ui5-cp-root-phone", value.asInstanceOf[js.Any])
  }
}
