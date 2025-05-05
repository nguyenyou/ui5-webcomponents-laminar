package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5contentcustomscrollbars extends StObject {
  
  var `ui5-content-custom-scrollbars`: Boolean
  
  var `ui5-textarea-root`: Boolean
}
object Ui5contentcustomscrollbars {
  
  inline def apply(`ui5-content-custom-scrollbars`: Boolean, `ui5-textarea-root`: Boolean): Ui5contentcustomscrollbars = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-content-custom-scrollbars")(`ui5-content-custom-scrollbars`.asInstanceOf[js.Any])
    __obj.updateDynamic("ui5-textarea-root")(`ui5-textarea-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5contentcustomscrollbars]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5contentcustomscrollbars] (val x: Self) extends AnyVal {
    
    inline def `setUi5-content-custom-scrollbars`(value: Boolean): Self = StObject.set(x, "ui5-content-custom-scrollbars", value.asInstanceOf[js.Any])
    
    inline def `setUi5-textarea-root`(value: Boolean): Self = StObject.set(x, "ui5-textarea-root", value.asInstanceOf[js.Any])
  }
}
