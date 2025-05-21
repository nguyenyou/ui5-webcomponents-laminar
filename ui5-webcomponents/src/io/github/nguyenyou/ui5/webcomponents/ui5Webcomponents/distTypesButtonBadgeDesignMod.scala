package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesButtonBadgeDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/ButtonBadgeDesign.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ButtonBadgeDesign & String] = js.native
    
    /* "AttentionDot" */ val AttentionDot: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonBadgeDesignMod.ButtonBadgeDesign.AttentionDot & String = js.native
    
    /* "InlineText" */ val InlineText: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonBadgeDesignMod.ButtonBadgeDesign.InlineText & String = js.native
    
    /* "OverlayText" */ val OverlayText: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesButtonBadgeDesignMod.ButtonBadgeDesign.OverlayText & String = js.native
  }
  
  @js.native
  sealed trait ButtonBadgeDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/ButtonBadgeDesign.js", "ButtonBadgeDesign")
  @js.native
  object ButtonBadgeDesign extends StObject {
    
    /**
      * The badge is displayed as an attention dot.
      * @public
      */
    @js.native
    sealed trait AttentionDot
      extends StObject
         with ButtonBadgeDesign
    
    /**
      * The badge is displayed after the text, inside the button.
      * @public
      */
    @js.native
    sealed trait InlineText
      extends StObject
         with ButtonBadgeDesign
    
    /**
      * The badge is displayed at the top-end corner of the button.
      *
      * **Note:** According to design guidance, the OverlayText design mode is best used in cozy density to avoid potential visual issues in compact.
      * @public
      */
    @js.native
    sealed trait OverlayText
      extends StObject
         with ButtonBadgeDesign
  }
}
