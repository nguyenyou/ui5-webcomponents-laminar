package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBackgroundDesignMod {
  
  @JSImport("@ui5/webcomponents/dist/types/BackgroundDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[BackgroundDesign & String] = js.native
    
    /* "Solid" */ val Solid: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBackgroundDesignMod.BackgroundDesign.Solid & String = js.native
    
    /* "Translucent" */ val Translucent: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBackgroundDesignMod.BackgroundDesign.Translucent & String = js.native
    
    /* "Transparent" */ val Transparent: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesBackgroundDesignMod.BackgroundDesign.Transparent & String = js.native
  }
  
  @js.native
  sealed trait BackgroundDesign extends StObject
  @JSImport("@ui5/webcomponents/dist/types/BackgroundDesign", "BackgroundDesign")
  @js.native
  object BackgroundDesign extends StObject {
    
    /**
      * A solid background color dependent on the theme.
      * @public
      */
    @js.native
    sealed trait Solid
      extends StObject
         with BackgroundDesign
    
    /**
      * A translucent background depending on the opacity value of the theme.
      * @public
      */
    @js.native
    sealed trait Translucent
      extends StObject
         with BackgroundDesign
    
    /**
      * Transparent background.
      * @public
      */
    @js.native
    sealed trait Transparent
      extends StObject
         with BackgroundDesign
  }
}
