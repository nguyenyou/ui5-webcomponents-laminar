package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSideContentVisibilityMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentVisibility.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SideContentVisibility & String] = js.native
    
    /* "AlwaysShow" */ val AlwaysShow: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.AlwaysShow & String = js.native
    
    /* "NeverShow" */ val NeverShow: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.NeverShow & String = js.native
    
    /* "ShowAboveL" */ val ShowAboveL: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveL & String = js.native
    
    /* "ShowAboveM" */ val ShowAboveM: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveM & String = js.native
    
    /* "ShowAboveS" */ val ShowAboveS: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideContentVisibilityMod.SideContentVisibility.ShowAboveS & String = js.native
  }
  
  @js.native
  sealed trait SideContentVisibility extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideContentVisibility.js", "SideContentVisibility")
  @js.native
  object SideContentVisibility extends StObject {
    
    /**
      * Show the side content on any breakpoint
      * @public
      */
    @js.native
    sealed trait AlwaysShow
      extends StObject
         with SideContentVisibility
    
    /**
      * Don't show the side content on any breakpoints
      * @public
      */
    @js.native
    sealed trait NeverShow
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on XL breakpoint
      * @public
      */
    @js.native
    sealed trait ShowAboveL
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on L and XL breakpoints
      * @public
      */
    @js.native
    sealed trait ShowAboveM
      extends StObject
         with SideContentVisibility
    
    /**
      * Show the side content on M, L and XL breakpoints
      * @public
      */
    @js.native
    sealed trait ShowAboveS
      extends StObject
         with SideContentVisibility
  }
}
