package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHighlightMod {
  
  @JSImport("@ui5/webcomponents/dist/types/Highlight", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Highlight & String] = js.native
    
    /* "Critical" */ val Critical: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight.Critical & String = js.native
    
    /* "Information" */ val Information: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight.Information & String = js.native
    
    /* "Negative" */ val Negative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight.Negative & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight.None & String = js.native
    
    /* "Positive" */ val Positive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesHighlightMod.Highlight.Positive & String = js.native
  }
  
  @js.native
  sealed trait Highlight extends StObject
  @JSImport("@ui5/webcomponents/dist/types/Highlight", "Highlight")
  @js.native
  object Highlight extends StObject {
    
    /**
      * @public
      */
    @js.native
    sealed trait Critical
      extends StObject
         with Highlight
    
    /**
      * @public
      */
    @js.native
    sealed trait Information
      extends StObject
         with Highlight
    
    /**
      * @public
      */
    @js.native
    sealed trait Negative
      extends StObject
         with Highlight
    
    /**
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with Highlight
    
    /**
      * @public
      */
    @js.native
    sealed trait Positive
      extends StObject
         with Highlight
  }
}
