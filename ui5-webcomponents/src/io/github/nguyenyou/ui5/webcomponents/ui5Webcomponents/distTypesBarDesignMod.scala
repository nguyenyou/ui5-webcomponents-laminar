package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BarDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BarDesign & String] = js.native
    
    /* "FloatingFooter" */ val FloatingFooter: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarDesignMod.BarDesign.FloatingFooter & String = js.native
    
    /* "Footer" */ val Footer: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarDesignMod.BarDesign.Footer & String = js.native
    
    /* "Header" */ val Header: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarDesignMod.BarDesign.Header & String = js.native
    
    /* "Subheader" */ val Subheader: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBarDesignMod.BarDesign.Subheader & String = js.native
  }
  
  @js.native
  sealed trait BarDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BarDesign.js", "BarDesign")
  @js.native
  object BarDesign extends StObject {
    
    /**
      * Floating Footer type - there is visible border on all sides
      * @public
      */
    @js.native
    sealed trait FloatingFooter
      extends StObject
         with BarDesign
    
    /**
      * Footer type
      * @public
      */
    @js.native
    sealed trait Footer
      extends StObject
         with BarDesign
    
    /**
      * Default type
      * @public
      */
    @js.native
    sealed trait Header
      extends StObject
         with BarDesign
    
    /**
      * Subheader type
      * @public
      */
    @js.native
    sealed trait Subheader
      extends StObject
         with BarDesign
  }
}
