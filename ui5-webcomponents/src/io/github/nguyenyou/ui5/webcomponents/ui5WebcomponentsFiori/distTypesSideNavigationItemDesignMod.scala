package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSideNavigationItemDesignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideNavigationItemDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SideNavigationItemDesign & String] = js.native
    
    /* "Action" */ val Action: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideNavigationItemDesignMod.SideNavigationItemDesign.Action & String = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSideNavigationItemDesignMod.SideNavigationItemDesign.Default & String = js.native
  }
  
  @js.native
  sealed trait SideNavigationItemDesign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SideNavigationItemDesign", "SideNavigationItemDesign")
  @js.native
  object SideNavigationItemDesign extends StObject {
    
    /**
      * Design for items that trigger an action, such as opening a dialog.
      *
      * **Note:** Items with this design must not have sub-items.
      *
      * **Note:** Items that open a dialog must set `hasPopup="dialog"` via `accessibilityAttributes` property.
      *
      * @public
      */
    @js.native
    sealed trait Action
      extends StObject
         with SideNavigationItemDesign
    
    /**
      * Design for items that perform navigation, contain navigation child items, or both.
      *
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with SideNavigationItemDesign
  }
}
