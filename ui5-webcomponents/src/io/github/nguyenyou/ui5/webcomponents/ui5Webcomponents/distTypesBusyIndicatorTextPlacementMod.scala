package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBusyIndicatorTextPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorTextPlacement.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BusyIndicatorTextPlacement & String] = js.native
    
    /* "Bottom" */ val Bottom: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorTextPlacementMod.BusyIndicatorTextPlacement.Bottom & String = js.native
    
    /* "Top" */ val Top: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBusyIndicatorTextPlacementMod.BusyIndicatorTextPlacement.Top & String = js.native
  }
  
  @js.native
  sealed trait BusyIndicatorTextPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BusyIndicatorTextPlacement.js", "BusyIndicatorTextPlacement")
  @js.native
  object BusyIndicatorTextPlacement extends StObject {
    
    /**
      * The text will be displayed at the bottom of the busy indicator.
      * @public
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with BusyIndicatorTextPlacement
    
    /**
      * The text will be displayed on top of the busy indicator.
      * @public
      */
    @js.native
    sealed trait Top
      extends StObject
         with BusyIndicatorTextPlacement
  }
}
