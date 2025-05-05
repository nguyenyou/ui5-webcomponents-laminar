package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5dscside
  extends StObject
     with /* x */ StringDictionary[Boolean] {
  
  var `ui5-dsc-side`: Boolean
}
object Ui5dscside {
  
  inline def apply(`ui5-dsc-side`: Boolean): Ui5dscside = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-dsc-side")(`ui5-dsc-side`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5dscside]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5dscside] (val x: Self) extends AnyVal {
    
    inline def `setUi5-dsc-side`(value: Boolean): Self = StObject.set(x, "ui5-dsc-side", value.asInstanceOf[js.Any])
  }
}
