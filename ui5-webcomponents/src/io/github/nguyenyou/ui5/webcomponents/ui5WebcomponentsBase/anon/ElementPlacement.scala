package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementPlacement extends StObject {
  
  var element: HTMLElement
  
  var placement: MovePlacement
}
object ElementPlacement {
  
  inline def apply(element: HTMLElement, placement: MovePlacement): ElementPlacement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementPlacement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementPlacement] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPlacement(value: MovePlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
  }
}
