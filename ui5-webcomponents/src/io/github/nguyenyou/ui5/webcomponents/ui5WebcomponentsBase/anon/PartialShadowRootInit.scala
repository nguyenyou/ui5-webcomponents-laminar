package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.ShadowRootMode
import io.github.nguyenyou.ui5.webcomponents.std.SlotAssignmentMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.ShadowRootInit> */
trait PartialShadowRootInit extends StObject {
  
  var delegatesFocus: js.UndefOr[Boolean] = js.undefined
  
  var mode: js.UndefOr[ShadowRootMode] = js.undefined
  
  var serializable: js.UndefOr[Boolean] = js.undefined
  
  var slotAssignment: js.UndefOr[SlotAssignmentMode] = js.undefined
}
object PartialShadowRootInit {
  
  inline def apply(): PartialShadowRootInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialShadowRootInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialShadowRootInit] (val x: Self) extends AnyVal {
    
    inline def setDelegatesFocus(value: Boolean): Self = StObject.set(x, "delegatesFocus", value.asInstanceOf[js.Any])
    
    inline def setDelegatesFocusUndefined: Self = StObject.set(x, "delegatesFocus", js.undefined)
    
    inline def setMode(value: ShadowRootMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSerializable(value: Boolean): Self = StObject.set(x, "serializable", value.asInstanceOf[js.Any])
    
    inline def setSerializableUndefined: Self = StObject.set(x, "serializable", js.undefined)
    
    inline def setSlotAssignment(value: SlotAssignmentMode): Self = StObject.set(x, "slotAssignment", value.asInstanceOf[js.Any])
    
    inline def setSlotAssignmentUndefined: Self = StObject.set(x, "slotAssignment", js.undefined)
  }
}
