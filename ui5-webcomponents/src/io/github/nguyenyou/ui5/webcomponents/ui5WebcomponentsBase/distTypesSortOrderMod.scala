package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSortOrderMod {
  
  @JSImport("@ui5/webcomponents-base/dist/types/SortOrder.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrder & String] = js.native
    
    /* "Ascending" */ val Ascending: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesSortOrderMod.SortOrder.Ascending & String = js.native
    
    /* "Descending" */ val Descending: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesSortOrderMod.SortOrder.Descending & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesSortOrderMod.SortOrder.None & String = js.native
  }
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSImport("@ui5/webcomponents-base/dist/types/SortOrder.js", "SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    /**
      * Sorting is applied in ascending order.
      * @public
      */
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    
    /**
      * Sorting is applied in descending order.
      * @public
      */
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
    
    /**
      * Sorting is not applied.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with SortOrder
  }
}
