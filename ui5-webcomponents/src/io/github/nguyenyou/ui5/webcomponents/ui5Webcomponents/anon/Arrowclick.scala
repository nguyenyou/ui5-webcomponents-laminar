package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arrowclick extends StObject {
  
  var `arrow-click`: Unit
  
  var click: Unit
}
object Arrowclick {
  
  inline def apply(`arrow-click`: Unit, click: Unit): Arrowclick = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any])
    __obj.updateDynamic("arrow-click")(`arrow-click`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrowclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Arrowclick] (val x: Self) extends AnyVal {
    
    inline def `setArrow-click`(value: Unit): Self = StObject.set(x, "arrow-click", value.asInstanceOf[js.Any])
    
    inline def setClick(value: Unit): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
  }
}
