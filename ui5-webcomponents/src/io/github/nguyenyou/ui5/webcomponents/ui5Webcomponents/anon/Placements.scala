package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Placements extends StObject {
  
  var element: HTMLElement
  
  var placements: js.Array[MovePlacement]
}
object Placements {
  
  inline def apply(element: HTMLElement, placements: js.Array[MovePlacement]): Placements = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Placements] (val x: Self) extends AnyVal {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPlacements(value: js.Array[MovePlacement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
    
    inline def setPlacementsVarargs(value: MovePlacement*): Self = StObject.set(x, "placements", js.Array(value*))
  }
}
