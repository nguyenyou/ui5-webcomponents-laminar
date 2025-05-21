package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilDragAndDropDragRegistryMod.DragAndDropSettings
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDragAndDropHandleDragOverMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/dragAndDrop/handleDragOver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Handles the dragover event.
    */
  inline def default[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */](e: DragEvent, component: T, position: DragPosition, target: HTMLElement): DragOverResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(e.asInstanceOf[js.Any], component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[DragOverResult]
  inline def default[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */](
    e: DragEvent,
    component: T,
    position: DragPosition,
    target: HTMLElement,
    settings: DragAndDropSettings
  ): DragOverResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(e.asInstanceOf[js.Any], component.asInstanceOf[js.Any], position.asInstanceOf[js.Any], target.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[DragOverResult]
  
  trait DragOverResult extends StObject {
    
    var placement: Any
    
    var targetReference: HTMLElement | Null
  }
  object DragOverResult {
    
    inline def apply(placement: Any): DragOverResult = {
      val __obj = js.Dynamic.literal(placement = placement.asInstanceOf[js.Any], targetReference = null)
      __obj.asInstanceOf[DragOverResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragOverResult] (val x: Self) extends AnyVal {
      
      inline def setPlacement(value: Any): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setTargetReference(value: HTMLElement): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
      
      inline def setTargetReferenceNull: Self = StObject.set(x, "targetReference", null)
    }
  }
  
  trait DragPosition extends StObject {
    
    var element: HTMLElement
    
    var placements: js.Array[MovePlacement]
  }
  object DragPosition {
    
    inline def apply(element: HTMLElement, placements: js.Array[MovePlacement]): DragPosition = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], placements = placements.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragPosition] (val x: Self) extends AnyVal {
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setPlacements(value: js.Array[MovePlacement]): Self = StObject.set(x, "placements", value.asInstanceOf[js.Any])
      
      inline def setPlacementsVarargs(value: MovePlacement*): Self = StObject.set(x, "placements", js.Array(value*))
    }
  }
}
