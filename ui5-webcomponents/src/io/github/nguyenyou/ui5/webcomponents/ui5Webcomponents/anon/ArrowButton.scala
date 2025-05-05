package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrowButton extends StObject {
  
  var arrowButton: Title
  
  var root: Description
}
object ArrowButton {
  
  inline def apply(arrowButton: Title, root: Description): ArrowButton = {
    val __obj = js.Dynamic.literal(arrowButton = arrowButton.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrowButton] (val x: Self) extends AnyVal {
    
    inline def setArrowButton(value: Title): Self = StObject.set(x, "arrowButton", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Description): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
