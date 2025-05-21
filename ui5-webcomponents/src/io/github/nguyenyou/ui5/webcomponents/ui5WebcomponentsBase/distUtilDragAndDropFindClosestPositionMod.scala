package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.ElementPlacement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon.Placements
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesOrientationMod.Orientation
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDragAndDropFindClosestPositionMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/dragAndDrop/findClosestPosition.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findClosestPosition(elements: js.Array[HTMLElement], point: Double, layoutOrientation: Orientation): Placements | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestPosition")(elements.asInstanceOf[js.Any], point.asInstanceOf[js.Any], layoutOrientation.asInstanceOf[js.Any])).asInstanceOf[Placements | Null]
  
  inline def findClosestPositionsByKey(elements: js.Array[HTMLElement], element: HTMLElement, e: KeyboardEvent): js.Array[ElementPlacement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestPositionsByKey")(elements.asInstanceOf[js.Any], element.asInstanceOf[js.Any], e.asInstanceOf[js.Any])).asInstanceOf[js.Array[ElementPlacement]]
  
  inline def isMovingKey(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMovingKey")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
