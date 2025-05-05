package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: AriaHidden
  
  var middle: AriaHidden
  
  var start: AriaHidden
}
object End {
  
  inline def apply(end: AriaHidden, middle: AriaHidden, start: AriaHidden): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], middle = middle.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: AriaHidden): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setMiddle(value: AriaHidden): Self = StObject.set(x, "middle", value.asInstanceOf[js.Any])
    
    inline def setStart(value: AriaHidden): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
