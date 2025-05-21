package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSemanticColorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/SemanticColor", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SemanticColor & String] = js.native
    
    /* "Critical" */ val Critical: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSemanticColorMod.SemanticColor.Critical & String = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSemanticColorMod.SemanticColor.Default & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSemanticColorMod.SemanticColor.Negative & String = js.native
    
    /* "Neutral" */ val Neutral: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSemanticColorMod.SemanticColor.Neutral & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesSemanticColorMod.SemanticColor.Positive & String = js.native
  }
  
  @js.native
  sealed trait SemanticColor extends StObject
  @JSImport("@ui5/webcomponents/dist/types/SemanticColor", "SemanticColor")
  @js.native
  object SemanticColor extends StObject {
    
    /**
      * Critical color
      * @public
      */
    @js.native
    sealed trait Critical
      extends StObject
         with SemanticColor
    
    /**
      * Default color (brand color)
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with SemanticColor
    
    /**
      * Negative color
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with SemanticColor
    
    /**
      * Neutral color.
      * @public
      */
    @js.native
    sealed trait Neutral
      extends StObject
         with SemanticColor
    
    /**
      * Positive color
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with SemanticColor
  }
}
