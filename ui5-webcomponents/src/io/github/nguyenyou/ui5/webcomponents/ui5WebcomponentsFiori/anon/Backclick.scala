package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.UserSettingsItemBackClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distUserSettingsItemMod.UserSettingsItemViewSelectEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Backclick extends StObject {
  
  var _collapse: Unit
  
  var `back-click`: UserSettingsItemBackClickEventDetail
  
  var `selection-change`: UserSettingsItemViewSelectEventDetail
}
object Backclick {
  
  inline def apply(
    _collapse: Unit,
    `back-click`: UserSettingsItemBackClickEventDetail,
    `selection-change`: UserSettingsItemViewSelectEventDetail
  ): Backclick = {
    val __obj = js.Dynamic.literal(_collapse = _collapse.asInstanceOf[js.Any])
    __obj.updateDynamic("back-click")(`back-click`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-change")(`selection-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backclick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Backclick] (val x: Self) extends AnyVal {
    
    inline def `setBack-click`(value: UserSettingsItemBackClickEventDetail): Self = StObject.set(x, "back-click", value.asInstanceOf[js.Any])
    
    inline def `setSelection-change`(value: UserSettingsItemViewSelectEventDetail): Self = StObject.set(x, "selection-change", value.asInstanceOf[js.Any])
    
    inline def set_collapse(value: Unit): Self = StObject.set(x, "_collapse", value.asInstanceOf[js.Any])
  }
}
