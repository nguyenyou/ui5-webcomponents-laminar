package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5dscroot extends StObject {
  
  var `ui5-dsc-root`: Boolean
  
  var `ui5-dsc-toggled`: Boolean
}
object Ui5dscroot {
  
  inline def apply(`ui5-dsc-root`: Boolean, `ui5-dsc-toggled`: Boolean): Ui5dscroot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-dsc-root")(`ui5-dsc-root`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-dsc-toggled")(`ui5-dsc-toggled`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5dscroot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5dscroot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-dsc-root`(value: Boolean): Self = StObject.set(x, "ui5-dsc-root", value.asInstanceOf[js.Any])
    
    inline def `setUi5-dsc-toggled`(value: Boolean): Self = StObject.set(x, "ui5-dsc-toggled", value.asInstanceOf[js.Any])
  }
}
