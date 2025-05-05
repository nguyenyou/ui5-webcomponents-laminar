package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handle extends StObject {
  
  var handle: StringDictionary[String]
  
  var label: Width
  
  var labelContainer: DictxWidth
  
  var progress: TransformTransformorigin
  
  var tooltip: Visibility
}
object Handle {
  
  inline def apply(
    handle: StringDictionary[String],
    label: Width,
    labelContainer: DictxWidth,
    progress: TransformTransformorigin,
    tooltip: Visibility
  ): Handle = {
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelContainer = labelContainer.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Handle] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: StringDictionary[String]): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Width): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelContainer(value: DictxWidth): Self = StObject.set(x, "labelContainer", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: TransformTransformorigin): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: Visibility): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
