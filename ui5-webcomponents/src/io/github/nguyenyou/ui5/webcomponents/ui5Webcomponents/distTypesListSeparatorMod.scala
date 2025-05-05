package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesListSeparatorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ListSeparator", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ListSeparator & String] = js.native
    
    /* "All" */ val All: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSeparatorMod.ListSeparator.All & String = js.native
    
    /* "Inner" */ val Inner: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSeparatorMod.ListSeparator.Inner & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesListSeparatorMod.ListSeparator.None & String = js.native
  }
  
  @js.native
  sealed trait ListSeparator extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ListSeparator", "ListSeparator")
  @js.native
  object ListSeparator extends StObject {
    
    /**
      * Separators between the items including the last and the first one.
      * @public
      */
    @js.native
    sealed trait All
      extends StObject
         with ListSeparator
    
    /**
      * Separators between the items.
      * Note: This enumeration depends on the theme.
      * @public
      */
    @js.native
    sealed trait Inner
      extends StObject
         with ListSeparator
    
    /**
      * No item separators.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with ListSeparator
  }
}
