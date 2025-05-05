package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distWizardMod.WizardStepChangeEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stepchange extends StObject {
  
  var `step-change`: WizardStepChangeEventDetail
}
object Stepchange {
  
  inline def apply(`step-change`: WizardStepChangeEventDetail): Stepchange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("step-change")(`step-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stepchange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stepchange] (val x: Self) extends AnyVal {
    
    inline def `setStep-change`(value: WizardStepChangeEventDetail): Self = StObject.set(x, "step-change", value.asInstanceOf[js.Any])
  }
}
