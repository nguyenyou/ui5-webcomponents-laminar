package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.TreeItemBaseStepInEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.TreeItemBaseStepOutEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTreeItemBaseMod.TreeItemBaseToggleEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stepin extends StObject {
  
  var `step-in`: TreeItemBaseStepInEventDetail
  
  var `step-out`: TreeItemBaseStepOutEventDetail
  
  var toggle: TreeItemBaseToggleEventDetail
}
object Stepin {
  
  inline def apply(
    `step-in`: TreeItemBaseStepInEventDetail,
    `step-out`: TreeItemBaseStepOutEventDetail,
    toggle: TreeItemBaseToggleEventDetail
  ): Stepin = {
    val __obj = js.Dynamic.literal(toggle = toggle.asInstanceOf[js.Any])
    __obj.updateDynamic("step-in")(`step-in`.asInstanceOf[js.Any])
    __obj.updateDynamic("step-out")(`step-out`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stepin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stepin] (val x: Self) extends AnyVal {
    
    inline def `setStep-in`(value: TreeItemBaseStepInEventDetail): Self = StObject.set(x, "step-in", value.asInstanceOf[js.Any])
    
    inline def `setStep-out`(value: TreeItemBaseStepOutEventDetail): Self = StObject.set(x, "step-out", value.asInstanceOf[js.Any])
    
    inline def setToggle(value: TreeItemBaseToggleEventDetail): Self = StObject.set(x, "toggle", value.asInstanceOf[js.Any])
  }
}
