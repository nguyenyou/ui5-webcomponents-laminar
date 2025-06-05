package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5tbitem extends StObject {
  
  var `ui5-tb-item`: Boolean
  
  var `ui5-tb-popover-item`: Boolean
}
object Ui5tbitem {
  
  inline def apply(`ui5-tb-item`: Boolean, `ui5-tb-popover-item`: Boolean): Ui5tbitem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-tb-item")(`ui5-tb-item`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-tb-popover-item")(`ui5-tb-popover-item`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5tbitem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5tbitem] (val x: Self) extends AnyVal {
    
    inline def `setUi5-tb-item`(value: Boolean): Self = StObject.set(x, "ui5-tb-item", value.asInstanceOf[js.Any])
    
    inline def `setUi5-tb-popover-item`(value: Boolean): Self = StObject.set(x, "ui5-tb-popover-item", value.asInstanceOf[js.Any])
  }
}
