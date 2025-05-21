package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBreadcrumbsDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BreadcrumbsDesign & String] = js.native
    
    /* "NoCurrentPage" */ val NoCurrentPage: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsDesignMod.BreadcrumbsDesign.NoCurrentPage & String = js.native
    
    /* "Standard" */ val Standard: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBreadcrumbsDesignMod.BreadcrumbsDesign.Standard & String = js.native
  }
  
  @js.native
  sealed trait BreadcrumbsDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BreadcrumbsDesign.js", "BreadcrumbsDesign")
  @js.native
  object BreadcrumbsDesign extends StObject {
    
    /**
      * All items are displayed as links.
      * @public
      */
    @js.native
    sealed trait NoCurrentPage
      extends StObject
         with BreadcrumbsDesign
    
    /**
      * Shows the current page as the last item in the trail.
      * The last item contains only plain text and is not a link.
      * @public
      */
    @js.native
    sealed trait Standard
      extends StObject
         with BreadcrumbsDesign
  }
}
