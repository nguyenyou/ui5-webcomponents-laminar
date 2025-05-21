package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSideContentFallDownMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentFallDown", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SideContentFallDown & String] = js.native
    
    /* "BelowL" */ val BelowL: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentFallDownMod.SideContentFallDown.BelowL & String = js.native
    
    /* "BelowM" */ val BelowM: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentFallDownMod.SideContentFallDown.BelowM & String = js.native
    
    /* "BelowXL" */ val BelowXL: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentFallDownMod.SideContentFallDown.BelowXL & String = js.native
    
    /* "OnMinimumWidth" */ val OnMinimumWidth: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentFallDownMod.SideContentFallDown.OnMinimumWidth & String = js.native
  }
  
  @js.native
  sealed trait SideContentFallDown extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentFallDown", "SideContentFallDown")
  @js.native
  object SideContentFallDown extends StObject {
    
    /**
      * Side content falls down on breakpoints below L
      * @public
      */
    @js.native
    sealed trait BelowL
      extends StObject
         with SideContentFallDown
    
    /**
      * Side content falls down on breakpoints below M
      * @public
      */
    @js.native
    sealed trait BelowM
      extends StObject
         with SideContentFallDown
    
    /**
      * Side content falls down on breakpoints below XL
      * @public
      */
    @js.native
    sealed trait BelowXL
      extends StObject
         with SideContentFallDown
    
    /**
      * Side content falls down on breakpoint M and the minimum width for the side content
      * @public
      */
    @js.native
    sealed trait OnMinimumWidth
      extends StObject
         with SideContentFallDown
  }
}
