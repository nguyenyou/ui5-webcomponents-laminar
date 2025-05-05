package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSwitchDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/SwitchDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SwitchDesign & String] = js.native
    
    /* "Graphical" */ val Graphical: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSwitchDesignMod.SwitchDesign.Graphical & String = js.native
    
    /* "Textual" */ val Textual: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSwitchDesignMod.SwitchDesign.Textual & String = js.native
  }
  
  @js.native
  sealed trait SwitchDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/SwitchDesign", "SwitchDesign")
  @js.native
  object SwitchDesign extends StObject {
    
    /**
      * Defines the Switch as Graphical
      * @public
      */
    @js.native
    sealed trait Graphical
      extends StObject
         with SwitchDesign
    
    /**
      * Defines the Switch as Textual
      * @public
      */
    @js.native
    sealed trait Textual
      extends StObject
         with SwitchDesign
  }
}
