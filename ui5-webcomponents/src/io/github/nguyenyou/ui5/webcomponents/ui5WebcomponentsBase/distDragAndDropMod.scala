package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.DragEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDragAndDropMod {
  
  @JSImport("@ui5/webcomponents-base/dist/DragAndDrop.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Starts a multiple drag operation by creating a drag ghost element.
    * The drag ghost will be displayed when dragging multiple items.
    *
    * @param {number} count - The number of items being dragged.
    * @param {DragEvent} e - The drag event that triggered the operation.
    * @public
    */
  inline def startMultipleDrag(count: Double, e: DragEvent): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("startMultipleDrag")(count.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
