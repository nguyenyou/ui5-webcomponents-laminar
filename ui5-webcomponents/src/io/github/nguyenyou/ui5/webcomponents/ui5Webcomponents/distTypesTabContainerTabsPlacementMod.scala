package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabContainerTabsPlacementMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TabContainerTabsPlacement", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TabContainerTabsPlacement & String] = js.native
    
    /* "Bottom" */ val Bottom: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTabContainerTabsPlacementMod.TabContainerTabsPlacement.Bottom & String = js.native
    
    /* "Top" */ val Top: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTabContainerTabsPlacementMod.TabContainerTabsPlacement.Top & String = js.native
  }
  
  @js.native
  sealed trait TabContainerTabsPlacement extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TabContainerTabsPlacement", "TabContainerTabsPlacement")
  @js.native
  object TabContainerTabsPlacement extends StObject {
    
    /**
      * The tab strip is displayed below the tab content
      * @private
      */
    @js.native
    sealed trait Bottom
      extends StObject
         with TabContainerTabsPlacement
    
    /**
      * The tab strip is displayed above the tab content (Default)
      * @private
      */
    @js.native
    sealed trait Top
      extends StObject
         with TabContainerTabsPlacement
  }
}
