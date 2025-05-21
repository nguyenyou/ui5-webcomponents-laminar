package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopoverPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopoverPlacement & String] = js.native
    
    /* "Bottom" */ val Bottom: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverPlacementMod.PopoverPlacement.Bottom & String = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverPlacementMod.PopoverPlacement.End & String = js.native
    
    /* "Start" */ val Start: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverPlacementMod.PopoverPlacement.Start & String = js.native
    
    /* "Top" */ val Top: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverPlacementMod.PopoverPlacement.Top & String = js.native
  }
  
  @js.native
  sealed trait PopoverPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopoverPlacement", "PopoverPlacement")
  @js.native
  object PopoverPlacement extends StObject {
    
    /**
      * Popover will be placed at the bottom of the reference element.
      * @public
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with PopoverPlacement
    
    /**
      * Popover will be placed at the end of the reference element.
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with PopoverPlacement
    
    /**
      * Popover will be placed at the start of the reference element.
      * @public
      */
    @js.native
    sealed trait Start
      extends StObject
         with PopoverPlacement
    
    /**
      * Popover will be placed at the top of the reference element.
      * @public
      */
    @js.native
    sealed trait Top
      extends StObject
         with PopoverPlacement
  }
}
