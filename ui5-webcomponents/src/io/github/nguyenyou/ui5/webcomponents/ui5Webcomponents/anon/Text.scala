package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var text: Any
  
  var textInfo: Any
}
object Text {
  
  inline def apply(text: Any, textInfo: Any): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], textInfo = textInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextInfo(value: Any): Self = StObject.set(x, "textInfo", value.asInstanceOf[js.Any])
  }
}
