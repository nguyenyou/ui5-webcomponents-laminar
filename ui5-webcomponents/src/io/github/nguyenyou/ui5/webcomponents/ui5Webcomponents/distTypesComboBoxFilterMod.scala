package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComboBoxFilterMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ComboBoxFilter", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ComboBoxFilter & String] = js.native
    
    /* "Contains" */ val Contains: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter.Contains & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter.None & String = js.native
    
    /* "StartsWith" */ val StartsWith: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter.StartsWith & String = js.native
    
    /* "StartsWithPerTerm" */ val StartsWithPerTerm: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesComboBoxFilterMod.ComboBoxFilter.StartsWithPerTerm & String = js.native
  }
  
  @js.native
  sealed trait ComboBoxFilter extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ComboBoxFilter", "ComboBoxFilter")
  @js.native
  object ComboBoxFilter extends StObject {
    
    /**
      * Defines contains filtering.
      * @public
      */
    @js.native
    sealed trait Contains
      extends StObject
         with ComboBoxFilter
    
    /**
      * Removes any filtering applied while typing
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with ComboBoxFilter
    
    /**
      * Defines filtering by starting symbol of item's text.
      * @public
      */
    @js.native
    sealed trait StartsWith
      extends StObject
         with ComboBoxFilter
    
    /**
      * Defines filtering by first symbol of each word of item's text.
      * @public
      */
    @js.native
    sealed trait StartsWithPerTerm
      extends StObject
         with ComboBoxFilter
  }
}
