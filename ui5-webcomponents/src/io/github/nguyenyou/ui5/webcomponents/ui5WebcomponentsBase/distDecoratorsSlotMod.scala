package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.PropertyDecorator
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementmetadataMod.Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDecoratorsSlotMod {
  
  @JSImport("@ui5/webcomponents-base/dist/decorators/slot.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns a slot decorator.
    *
    * @param { Slot } slotData
    * @returns { PropertyDecorator }
    */
  inline def default(): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropertyDecorator]
  inline def default(slotData: Slot): PropertyDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(slotData.asInstanceOf[js.Any]).asInstanceOf[PropertyDecorator]
}
