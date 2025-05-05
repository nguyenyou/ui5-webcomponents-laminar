package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5cpitem extends StObject {
  
  var `ui5-cp-item`: Boolean
}
object Ui5cpitem {
  
  inline def apply(`ui5-cp-item`: Boolean): Ui5cpitem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-cp-item")(`ui5-cp-item`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5cpitem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5cpitem] (val x: Self) extends AnyVal {
    
    inline def `setUi5-cp-item`(value: Boolean): Self = StObject.set(x, "ui5-cp-item", value.asInstanceOf[js.Any])
  }
}
