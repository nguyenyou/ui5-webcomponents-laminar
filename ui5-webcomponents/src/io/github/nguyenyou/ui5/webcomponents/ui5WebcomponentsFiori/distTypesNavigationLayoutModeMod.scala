package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNavigationLayoutModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/NavigationLayoutMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NavigationLayoutMode & String] = js.native
    
    /* "Auto" */ val Auto: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNavigationLayoutModeMod.NavigationLayoutMode.Auto & String = js.native
    
    /* "Collapsed" */ val Collapsed: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNavigationLayoutModeMod.NavigationLayoutMode.Collapsed & String = js.native
    
    /* "Expanded" */ val Expanded: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesNavigationLayoutModeMod.NavigationLayoutMode.Expanded & String = js.native
  }
  
  @js.native
  sealed trait NavigationLayoutMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/NavigationLayoutMode", "NavigationLayoutMode")
  @js.native
  object NavigationLayoutMode extends StObject {
    
    /**
      * Automatically calculates the navigation layout mode based on the screen device type.
      * `Expanded` on desktop and `Collapsed` on tablet and phone.
      * @public
      */
    @js.native
    sealed trait Auto
      extends StObject
         with NavigationLayoutMode
    
    /**
      * Collapsed side navigation.
      * @public
      */
    @js.native
    sealed trait Collapsed
      extends StObject
         with NavigationLayoutMode
    
    /**
      * Expanded side navigation.
      * @public
      */
    @js.native
    sealed trait Expanded
      extends StObject
         with NavigationLayoutMode
  }
}
