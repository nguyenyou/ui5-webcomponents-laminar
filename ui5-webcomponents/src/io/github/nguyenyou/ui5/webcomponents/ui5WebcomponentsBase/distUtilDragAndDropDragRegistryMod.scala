package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Element
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Placement
import org.scalajs.dom.DragEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDragAndDropDragRegistryMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/dragAndDrop/DragRegistry.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/util/dragAndDrop/DragRegistry.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearDraggedElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearDraggedElement")().asInstanceOf[Unit]
    
    inline def getDraggedElement(): HTMLElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDraggedElement")().asInstanceOf[HTMLElement | Null]
    
    inline def setDraggedElement(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDraggedElement")().asInstanceOf[Unit]
    inline def setDraggedElement(element: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDraggedElement")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def startMultipleDrag(count: Double, e: DragEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startMultipleDrag")(count.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
  
  /**
    * Starts a multiple drag operation by creating a drag ghost element.
    * The drag ghost will be displayed when dragging multiple items.
    *
    * @param {number} count - The number of items being dragged.
    * @param {DragEvent} e - The drag event that triggered the operation.
    * @public
    */
  inline def startMultipleDrag(count: Double, e: DragEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startMultipleDrag")(count.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait DragAndDropSettings extends StObject {
    
    /**
      * Allow cross-browser and file drag and drop.
      */
    var crossDnD: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Pass the original event in the event parameters.
      */
    var originalEvent: js.UndefOr[Boolean] = js.undefined
  }
  object DragAndDropSettings {
    
    inline def apply(): DragAndDropSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragAndDropSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropSettings] (val x: Self) extends AnyVal {
      
      inline def setCrossDnD(value: Boolean): Self = StObject.set(x, "crossDnD", value.asInstanceOf[js.Any])
      
      inline def setCrossDnDUndefined: Self = StObject.set(x, "crossDnD", js.undefined)
      
      inline def setOriginalEvent(value: Boolean): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait MoveEventDetail extends StObject {
    
    var destination: Placement
    
    var originalEvent: Event
    
    var source: Element
  }
  object MoveEventDetail {
    
    inline def apply(destination: Placement, originalEvent: Event, source: Element): MoveEventDetail = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[MoveEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MoveEventDetail] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: Placement): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: Event): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Element): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
