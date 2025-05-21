package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesItemNavigationBehaviorMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/ItemNavigationBehavior.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ItemNavigationBehavior & String] = js.native
    
    /* "Cyclic" */ val Cyclic: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesItemNavigationBehaviorMod.ItemNavigationBehavior.Cyclic & String = js.native
    
    /* "Static" */ val Static: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesItemNavigationBehaviorMod.ItemNavigationBehavior.Static & String = js.native
  }
  
  @js.native
  sealed trait ItemNavigationBehavior extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/ItemNavigationBehavior.js", "ItemNavigationBehavior")
  @js.native
  object ItemNavigationBehavior extends StObject {
    
    /**
      * Cycling behavior: navigating past the last item continues with the first and vice versa.
      * @public
      */
    @js.native
    sealed trait Cyclic
      extends StObject
         with ItemNavigationBehavior
    
    /**
      * Static behavior: navigations stops at the first or last item.
      * @public
      */
    @js.native
    sealed trait Static
      extends StObject
         with ItemNavigationBehavior
  }
}
