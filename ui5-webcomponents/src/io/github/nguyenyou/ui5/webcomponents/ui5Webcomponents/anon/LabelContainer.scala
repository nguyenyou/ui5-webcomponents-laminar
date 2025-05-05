package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelContainer extends StObject {
  
  var label: Record[String, String]
  
  var labelContainer: Record[String, String]
}
object LabelContainer {
  
  inline def apply(label: Record[String, String], labelContainer: Record[String, String]): LabelContainer = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], labelContainer = labelContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelContainer] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: Record[String, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelContainer(value: Record[String, String]): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
  }
}
