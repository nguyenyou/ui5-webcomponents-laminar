package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBorderDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BorderDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BorderDesign & String] = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBorderDesignMod.BorderDesign.None & String = js.native
    
    /* "Solid" */ val Solid: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBorderDesignMod.BorderDesign.Solid & String = js.native
  }
  
  @js.native
  sealed trait BorderDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BorderDesign.js", "BorderDesign")
  @js.native
  object BorderDesign extends StObject {
    
    /**
      * Specifies no border.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with BorderDesign
    
    /**
      * A solid border color dependent on the theme.
      * @public
      */
    @js.native
    sealed trait Solid
      extends StObject
         with BorderDesign
  }
}
