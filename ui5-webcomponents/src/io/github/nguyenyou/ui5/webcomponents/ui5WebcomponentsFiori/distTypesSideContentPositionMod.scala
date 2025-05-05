package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSideContentPositionMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentPosition", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SideContentPosition & String] = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentPositionMod.SideContentPosition.End & String = js.native
    
    /* "Start" */ val Start: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentPositionMod.SideContentPosition.Start & String = js.native
  }
  
  @js.native
  sealed trait SideContentPosition extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentPosition", "SideContentPosition")
  @js.native
  object SideContentPosition extends StObject {
    
    /**
      * The side content is on the right side of the main container
      * in left-to-right mode and on the left side in right-to-left mode.
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with SideContentPosition
    
    /**
      * The side content is on the left side of the main container
      * in left-to-right mode and on the right side in right-to-left mode.
      * @public
      */
    @js.native
    sealed trait Start
      extends StObject
         with SideContentPosition
  }
}
