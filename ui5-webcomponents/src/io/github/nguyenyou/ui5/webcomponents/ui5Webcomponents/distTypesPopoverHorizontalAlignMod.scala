package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverHorizontalAlignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/PopoverHorizontalAlign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PopoverHorizontalAlign & String] = js.native
    
    /* "Center" */ val Center: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Center & String = js.native
    
    /* "End" */ val End: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.End & String = js.native
    
    /* "Start" */ val Start: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Start & String = js.native
    
    /* "Stretch" */ val Stretch: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesPopoverHorizontalAlignMod.PopoverHorizontalAlign.Stretch & String = js.native
  }
  
  @js.native
  sealed trait PopoverHorizontalAlign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/PopoverHorizontalAlign.js", "PopoverHorizontalAlign")
  @js.native
  object PopoverHorizontalAlign extends StObject {
    
    /**
      * Popover is centered.
      * @public
      */
    @js.native
    sealed trait Center
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover is aligned with the end of the target.
      * @public
      */
    @js.native
    sealed trait End
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover is aligned with the start of the target.
      * @public
      */
    @js.native
    sealed trait Start
      extends StObject
         with PopoverHorizontalAlign
    
    /**
      * Popover is stretched.
      * @public
      */
    @js.native
    sealed trait Stretch
      extends StObject
         with PopoverHorizontalAlign
  }
}
