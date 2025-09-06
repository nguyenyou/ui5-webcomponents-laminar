package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Placements
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.clientX
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.clientY
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesOrientationMod.Orientation
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDelegateDragAndDropHandlerMod {
  
  @JSImport("@ui5/webcomponents/dist/delegate/DragAndDropHandler.js", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DragAndDropHandler {
    def this(
      component: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default,
      config: DragAndDropConfig
    ) = this()
    
    /* CompleteClass */
    override def _filterPlacements(placements: js.Array[MovePlacement], draggedElement: HTMLElement, targetElement: HTMLElement): js.Array[MovePlacement] = js.native
    
    /* CompleteClass */
    override def _findClosestPosition(e: DragEvent): Placements | Null = js.native
    
    /* CompleteClass */
    override def _isValidDragTarget(draggedElement: HTMLElement, targetElement: HTMLElement): Boolean = js.native
    
    /* CompleteClass */
    override def _transformTargetElement(element: HTMLElement): HTMLElement = js.native
    
    /* CompleteClass */
    override def _validateDragOver(e: DragEvent): Boolean = js.native
    
    /* CompleteClass */
    var component: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default = js.native
    
    /* CompleteClass */
    var config: DragAndDropConfig = js.native
    
    /* CompleteClass */
    override def ondragenter(e: DragEvent): Unit = js.native
    
    /* CompleteClass */
    override def ondragleave(e: DragEvent): Unit = js.native
    
    /* CompleteClass */
    override def ondragover(e: DragEvent): Unit = js.native
    
    /* CompleteClass */
    override def ondrop(e: DragEvent): Unit = js.native
  }
  
  trait DragAndDropConfig extends StObject {
    
    var clientCoordinate: js.UndefOr[clientX | clientY] = js.undefined
    
    var filterPlacements: js.UndefOr[
        js.Function3[
          /* placements */ js.Array[MovePlacement], 
          /* draggedElement */ HTMLElement, 
          /* targetElement */ HTMLElement, 
          js.Array[MovePlacement]
        ]
      ] = js.undefined
    
    def getDropIndicator(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null
    
    def getItems(): js.Array[HTMLElement]
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var transformElement: js.UndefOr[js.Function1[/* element */ HTMLElement, HTMLElement]] = js.undefined
    
    var useOriginalEvent: js.UndefOr[Boolean] = js.undefined
    
    var validateDraggedElement: js.UndefOr[
        js.Function2[/* draggedElement */ HTMLElement, /* targetElement */ HTMLElement, Boolean]
      ] = js.undefined
  }
  object DragAndDropConfig {
    
    inline def apply(
      getDropIndicator: () => io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null,
      getItems: () => js.Array[HTMLElement]
    ): DragAndDropConfig = {
      val __obj = js.Dynamic.literal(getDropIndicator = js.Any.fromFunction0(getDropIndicator), getItems = js.Any.fromFunction0(getItems))
      __obj.asInstanceOf[DragAndDropConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropConfig] (val x: Self) extends AnyVal {
      
      inline def setClientCoordinate(value: clientX | clientY): Self = StObject.set(x, "clientCoordinate", value.asInstanceOf[js.Any])
      
      inline def setClientCoordinateUndefined: Self = StObject.set(x, "clientCoordinate", js.undefined)
      
      inline def setFilterPlacements(
        value: (/* placements */ js.Array[MovePlacement], /* draggedElement */ HTMLElement, /* targetElement */ HTMLElement) => js.Array[MovePlacement]
      ): Self = StObject.set(x, "filterPlacements", js.Any.fromFunction3(value))
      
      inline def setFilterPlacementsUndefined: Self = StObject.set(x, "filterPlacements", js.undefined)
      
      inline def setGetDropIndicator(
        value: () => io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default | Null
      ): Self = StObject.set(x, "getDropIndicator", js.Any.fromFunction0(value))
      
      inline def setGetItems(value: () => js.Array[HTMLElement]): Self = StObject.set(x, "getItems", js.Any.fromFunction0(value))
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setTransformElement(value: /* element */ HTMLElement => HTMLElement): Self = StObject.set(x, "transformElement", js.Any.fromFunction1(value))
      
      inline def setTransformElementUndefined: Self = StObject.set(x, "transformElement", js.undefined)
      
      inline def setUseOriginalEvent(value: Boolean): Self = StObject.set(x, "useOriginalEvent", value.asInstanceOf[js.Any])
      
      inline def setUseOriginalEventUndefined: Self = StObject.set(x, "useOriginalEvent", js.undefined)
      
      inline def setValidateDraggedElement(value: (/* draggedElement */ HTMLElement, /* targetElement */ HTMLElement) => Boolean): Self = StObject.set(x, "validateDraggedElement", js.Any.fromFunction2(value))
      
      inline def setValidateDraggedElementUndefined: Self = StObject.set(x, "validateDraggedElement", js.undefined)
    }
  }
  
  trait DragAndDropHandler extends StObject {
    
    def _filterPlacements(placements: js.Array[MovePlacement], draggedElement: HTMLElement, targetElement: HTMLElement): js.Array[MovePlacement]
    
    def _findClosestPosition(e: DragEvent): Placements | Null
    
    def _isValidDragTarget(draggedElement: HTMLElement, targetElement: HTMLElement): Boolean
    
    def _transformTargetElement(element: HTMLElement): HTMLElement
    
    def _validateDragOver(e: DragEvent): Boolean
    
    var component: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
    
    var config: DragAndDropConfig
    
    def ondragenter(e: DragEvent): Unit
    
    def ondragleave(e: DragEvent): Unit
    
    def ondragover(e: DragEvent): Unit
    
    def ondrop(e: DragEvent): Unit
  }
  object DragAndDropHandler {
    
    inline def apply(
      _filterPlacements: (js.Array[MovePlacement], HTMLElement, HTMLElement) => js.Array[MovePlacement],
      _findClosestPosition: DragEvent => Placements | Null,
      _isValidDragTarget: (HTMLElement, HTMLElement) => Boolean,
      _transformTargetElement: HTMLElement => HTMLElement,
      _validateDragOver: DragEvent => Boolean,
      component: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default,
      config: DragAndDropConfig,
      ondragenter: DragEvent => Unit,
      ondragleave: DragEvent => Unit,
      ondragover: DragEvent => Unit,
      ondrop: DragEvent => Unit
    ): DragAndDropHandler = {
      val __obj = js.Dynamic.literal(_filterPlacements = js.Any.fromFunction3(_filterPlacements), _findClosestPosition = js.Any.fromFunction1(_findClosestPosition), _isValidDragTarget = js.Any.fromFunction2(_isValidDragTarget), _transformTargetElement = js.Any.fromFunction1(_transformTargetElement), _validateDragOver = js.Any.fromFunction1(_validateDragOver), component = component.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], ondragenter = js.Any.fromFunction1(ondragenter), ondragleave = js.Any.fromFunction1(ondragleave), ondragover = js.Any.fromFunction1(ondragover), ondrop = js.Any.fromFunction1(ondrop))
      __obj.asInstanceOf[DragAndDropHandler]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragAndDropHandler] (val x: Self) extends AnyVal {
      
      inline def setComponent(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: DragAndDropConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setOndragenter(value: DragEvent => Unit): Self = StObject.set(x, "ondragenter", js.Any.fromFunction1(value))
      
      inline def setOndragleave(value: DragEvent => Unit): Self = StObject.set(x, "ondragleave", js.Any.fromFunction1(value))
      
      inline def setOndragover(value: DragEvent => Unit): Self = StObject.set(x, "ondragover", js.Any.fromFunction1(value))
      
      inline def setOndrop(value: DragEvent => Unit): Self = StObject.set(x, "ondrop", js.Any.fromFunction1(value))
      
      inline def set_filterPlacements(value: (js.Array[MovePlacement], HTMLElement, HTMLElement) => js.Array[MovePlacement]): Self = StObject.set(x, "_filterPlacements", js.Any.fromFunction3(value))
      
      inline def set_findClosestPosition(value: DragEvent => Placements | Null): Self = StObject.set(x, "_findClosestPosition", js.Any.fromFunction1(value))
      
      inline def set_isValidDragTarget(value: (HTMLElement, HTMLElement) => Boolean): Self = StObject.set(x, "_isValidDragTarget", js.Any.fromFunction2(value))
      
      inline def set_transformTargetElement(value: HTMLElement => HTMLElement): Self = StObject.set(x, "_transformTargetElement", js.Any.fromFunction1(value))
      
      inline def set_validateDragOver(value: DragEvent => Boolean): Self = StObject.set(x, "_validateDragOver", js.Any.fromFunction1(value))
    }
  }
}
