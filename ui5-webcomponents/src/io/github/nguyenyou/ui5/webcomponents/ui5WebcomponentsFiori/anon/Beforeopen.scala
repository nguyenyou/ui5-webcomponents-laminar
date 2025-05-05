package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.ViewSettingsDialogCancelEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distViewSettingsDialogMod.ViewSettingsDialogConfirmEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beforeopen extends StObject {
  
  var `before-open`: Unit
  
  var cancel: ViewSettingsDialogCancelEventDetail
  
  var close: Unit
  
  var confirm: ViewSettingsDialogConfirmEventDetail
  
  var open: Unit
}
object Beforeopen {
  
  inline def apply(
    `before-open`: Unit,
    cancel: ViewSettingsDialogCancelEventDetail,
    close: Unit,
    confirm: ViewSettingsDialogConfirmEventDetail,
    open: Unit
  ): Beforeopen = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("before-open")(`before-open`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beforeopen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beforeopen] (val x: Self) extends AnyVal {
    
    inline def `setBefore-open`(value: Unit): Self = StObject.set(x, "before-open", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: ViewSettingsDialogCancelEventDetail): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setConfirm(value: ViewSettingsDialogConfirmEventDetail): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
