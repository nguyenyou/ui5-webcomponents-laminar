package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ui5textarearoot extends StObject {
  
  var `ui5-textarea-root`: Boolean
}
object Ui5textarearoot {
  
  inline def apply(`ui5-textarea-root`: Boolean): Ui5textarearoot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ui5-textarea-root")(`ui5-textarea-root`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ui5textarearoot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ui5textarearoot] (val x: Self) extends AnyVal {
    
    inline def `setUi5-textarea-root`(value: Boolean): Self = StObject.set(x, "ui5-textarea-root", value.asInstanceOf[js.Any])
  }
}
