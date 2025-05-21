package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilDragAndDropDragRegistryMod.DragAndDropSettings
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilDragAndDropHandleDropMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/dragAndDrop/handleDrop", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */](
    e: DragEvent,
    component: T,
    target: HTMLElement,
    placement: /* template literal string: ${MovePlacement} */ String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(e.asInstanceOf[js.Any], component.asInstanceOf[js.Any], target.asInstanceOf[js.Any], placement.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def default[T /* <: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default */](
    e: DragEvent,
    component: T,
    target: HTMLElement,
    placement: /* template literal string: ${MovePlacement} */ String,
    settings: DragAndDropSettings
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(e.asInstanceOf[js.Any], component.asInstanceOf[js.Any], target.asInstanceOf[js.Any], placement.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
