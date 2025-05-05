package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsDialogMod.UserSettingsBeforeCloseEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsDialogMod.UserSettingsItemSelectEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Beforeclose extends StObject {
  
  var `before-close`: UserSettingsBeforeCloseEventDetail
  
  var close: Unit
  
  var open: Unit
  
  var `selection-change`: UserSettingsItemSelectEventDetail
}
object Beforeclose {
  
  inline def apply(
    `before-close`: UserSettingsBeforeCloseEventDetail,
    close: Unit,
    open: Unit,
    `selection-change`: UserSettingsItemSelectEventDetail
  ): Beforeclose = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.updateDynamic("before-close")(`before-close`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beforeclose]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Beforeclose] (val x: Self) extends AnyVal {
    
    inline def `setBefore-close`(value: UserSettingsBeforeCloseEventDetail): Self = StObject.set(x, "before-close", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Unit): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: UserSettingsItemSelectEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
  }
}
