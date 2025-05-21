package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonTypeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ButtonType.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonType & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonTypeMod.ButtonType.Button & String = js.native
    
    /* "Reset" */ val Reset: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonTypeMod.ButtonType.Reset & String = js.native
    
    /* "Submit" */ val Submit: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonTypeMod.ButtonType.Submit & String = js.native
  }
  
  @js.native
  sealed trait ButtonType extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ButtonType.js", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    /**
      * The button does not do anything special when inside a form
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with ButtonType
    
    /**
      * The button acts as a reset button (resets a form)
      * @public
      */
    @js.native
    sealed trait Reset
      extends StObject
         with ButtonType
    
    /**
      * The button acts as a submit button (submits a form)
      * @public
      */
    @js.native
    sealed trait Submit
      extends StObject
         with ButtonType
  }
}
