package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPageBackgroundDesignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/PageBackgroundDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[PageBackgroundDesign & String] = js.native
    
    /* "List" */ val List: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.List & String = js.native
    
    /* "Solid" */ val Solid: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.Solid & String = js.native
    
    /* "Transparent" */ val Transparent: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesPageBackgroundDesignMod.PageBackgroundDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait PageBackgroundDesign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/PageBackgroundDesign.js", "PageBackgroundDesign")
  @js.native
  object PageBackgroundDesign extends StObject {
    
    /**
      * Page background color when a List is set as the Page content.
      * @public
      */
    @js.native
    sealed trait List
      extends StObject
         with PageBackgroundDesign
    
    /**
      * A solid background color dependent on the theme.
      * @public
      */
    @js.native
    sealed trait Solid
      extends StObject
         with PageBackgroundDesign
    
    /**
      * Transparent background for the page.
      * @public
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with PageBackgroundDesign
  }
}
