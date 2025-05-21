package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWizardContentLayoutMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/WizardContentLayout", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[WizardContentLayout & String] = js.native
    
    /* "MultipleSteps" */ val MultipleSteps: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesWizardContentLayoutMod.WizardContentLayout.MultipleSteps & String = js.native
    
    /* "SingleStep" */ val SingleStep: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesWizardContentLayoutMod.WizardContentLayout.SingleStep & String = js.native
  }
  
  @js.native
  sealed trait WizardContentLayout extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/WizardContentLayout", "WizardContentLayout")
  @js.native
  object WizardContentLayout extends StObject {
    
    /**
      * Display the content of the `ui5-wizard` as multiple steps in a scroll section.
      * @public
      */
    @js.native
    sealed trait MultipleSteps
      extends StObject
         with WizardContentLayout
    
    /**
      * Display the content of the `ui5-wizard` as single step.
      * @public
      */
    @js.native
    sealed trait SingleStep
      extends StObject
         with WizardContentLayout
  }
}
