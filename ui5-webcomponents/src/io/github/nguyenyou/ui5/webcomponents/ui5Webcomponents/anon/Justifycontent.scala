package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Justifycontent extends StObject {
  
  var display: String
  
  var `justify-content`: String
}
object Justifycontent {
  
  inline def apply(display: String, `justify-content`: String): Justifycontent = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    __obj.updateDynamic("justify-content")(`justify-content`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Justifycontent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Justifycontent] (val x: Self) extends AnyVal {
    
    inline def setDisplay(value: String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def `setJustify-content`(value: String): Self = StObject.set(x, "justify-content", value.asInstanceOf[js.Any])
  }
}
