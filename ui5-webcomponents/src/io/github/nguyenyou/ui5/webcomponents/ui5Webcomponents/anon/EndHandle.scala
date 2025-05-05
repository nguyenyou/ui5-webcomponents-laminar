package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndHandle extends StObject {
  
  var endHandle: StringDictionary[String]
  
  var label: Width
  
  var labelContainer: DictxWidth
  
  var progress: Transformorigin
  
  var startHandle: StringDictionary[String]
  
  var tooltip: Visibility
}
object EndHandle {
  
  inline def apply(
    endHandle: StringDictionary[String],
    label: Width,
    labelContainer: DictxWidth,
    progress: Transformorigin,
    startHandle: StringDictionary[String],
    tooltip: Visibility
  ): EndHandle = {
    val __obj = js.Dynamic.literal(endHandle = endHandle.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelContainer = labelContainer.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], startHandle = startHandle.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndHandle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndHandle] (val x: Self) extends AnyVal {
    
    inline def setEndHandle(value: StringDictionary[String]): Self = StObject.set(x, "endHandle", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Width): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelContainer(value: DictxWidth): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Transformorigin): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setStartHandle(value: StringDictionary[String]): Self = StObject.set(x, "startHandle", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Visibility): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
