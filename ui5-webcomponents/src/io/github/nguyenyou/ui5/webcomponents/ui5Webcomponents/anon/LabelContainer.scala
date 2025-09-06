package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelContainer extends StObject {
  
  var labelContainer: Ui5sliderhiddenlabels
  
  var root: Ui5sliderrootphone
}
object LabelContainer {
  
  inline def apply(labelContainer: Ui5sliderhiddenlabels, root: Ui5sliderrootphone): LabelContainer = {
    val __obj = js.Dynamic.literal(labelContainer = labelContainer.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelContainer] (val x: Self) extends AnyVal {
    
    inline def setLabelContainer(value: Ui5sliderhiddenlabels): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Ui5sliderrootphone): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
