package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMovePlacementMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/MovePlacement.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[MovePlacement & String] = js.native
    
    /* "After" */ val After: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement.After & String = js.native
    
    /* "Before" */ val Before: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement.Before & String = js.native
    
    /* "On" */ val On: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMovePlacementMod.MovePlacement.On & String = js.native
  }
  
  @js.native
  sealed trait MovePlacement extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/MovePlacement.js", "MovePlacement")
  @js.native
  object MovePlacement extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait After
      extends StObject
         with MovePlacement
    
    /**
      * @public
      */
    @js.native
    sealed trait Before
      extends StObject
         with MovePlacement
    
    /**
      * @public
      */
    @js.native
    sealed trait On
      extends StObject
         with MovePlacement
  }
}
