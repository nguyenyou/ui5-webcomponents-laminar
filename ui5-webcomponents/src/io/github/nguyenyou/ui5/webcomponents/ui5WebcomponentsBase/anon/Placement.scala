package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placement extends StObject {
  
  var element: HTMLElement
  
  var placement: /* template literal string: ${MovePlacement} */ String
}
object Placement {
  
  inline def apply(element: HTMLElement, placement: /* template literal string: ${MovePlacement} */ String): Placement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: /* template literal string: ${MovePlacement} */ String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
