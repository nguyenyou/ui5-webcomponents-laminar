package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOrientationMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/Orientation.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Orientation & String] = js.native
    
    /* "Horizontal" */ val Horizontal: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesOrientationMod.Orientation.Horizontal & String = js.native
    
    /* "Vertical" */ val Vertical: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesOrientationMod.Orientation.Vertical & String = js.native
  }
  
  @js.native
  sealed trait Orientation extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/Orientation.js", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    /**
      * @private
      */
    @js.native
    sealed trait Horizontal
      extends StObject
         with Orientation
    
    /**
      * @private
      */
    @js.native
    sealed trait Vertical
      extends StObject
         with Orientation
  }
}
