package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesToolbarDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ToolbarDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ToolbarDesign & String] = js.native
    
    /* "Solid" */ val Solid: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarDesignMod.ToolbarDesign.Solid & String = js.native
    
    /* "Transparent" */ val Transparent: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesToolbarDesignMod.ToolbarDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait ToolbarDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ToolbarDesign", "ToolbarDesign")
  @js.native
  object ToolbarDesign extends StObject {
    
    /**
      * The toolbar and its content will be displayed with solid background.
      * @public
      */
    @js.native
    sealed trait Solid
      extends StObject
         with ToolbarDesign
    
    /**
      * The toolbar and its content will be displayed with transparent background.
      * @public
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with ToolbarDesign
  }
}
