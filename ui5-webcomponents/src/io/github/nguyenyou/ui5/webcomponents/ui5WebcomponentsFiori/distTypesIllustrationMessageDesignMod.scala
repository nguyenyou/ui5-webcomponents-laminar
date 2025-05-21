package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIllustrationMessageDesignMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/IllustrationMessageDesign", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IllustrationMessageDesign & String] = js.native
    
    /* "Auto" */ val Auto: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Auto & String = js.native
    
    /* "Base" */ val Base: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Base & String = js.native
    
    /* "Dialog" */ val Dialog: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Dialog & String = js.native
    
    /* "Dot" */ val Dot: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Dot & String = js.native
    
    /* "Scene" */ val Scene: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Scene & String = js.native
    
    /* "Spot" */ val Spot: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesIllustrationMessageDesignMod.IllustrationMessageDesign.Spot & String = js.native
  }
  
  @js.native
  sealed trait IllustrationMessageDesign extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/IllustrationMessageDesign", "IllustrationMessageDesign")
  @js.native
  object IllustrationMessageDesign extends StObject {
    
    /**
      * Automatically decides the <code>Illustration</code> size (<code>Base</code>, <code>Dot</code>, <code>Spot</code>,
      * <code>Dialog</code>, or <code>Scene</code>) depending on the <code>IllustratedMessage</code> container width.
      *
      * **Note:** `Auto` is the only option where the illustration size is changed according to
      * the available container width. If any other `IllustratedMessageSize` is chosen, it remains
      * until changed by the app developer.
      * @public
      */
    @js.native
    sealed trait Auto
      extends StObject
         with IllustrationMessageDesign
    
    /**
      * Base `Illustration` size (XS breakpoint). Suitable for cards (two columns).
      *
      * **Note:** When `Base` is in use, no illustration is displayed.
      * @public
      */
    @js.native
    sealed trait Base
      extends StObject
         with IllustrationMessageDesign
    
    /**
      * Dialog `Illustration` size (M breakpoint). Suitable for dialogs.
      * @public
      */
    @js.native
    sealed trait Dialog
      extends StObject
         with IllustrationMessageDesign
    
    /**
      * Dot <code>Illustration</code> size (XS breakpoint). Suitable for table rows.
      * @public
      */
    @js.native
    sealed trait Dot
      extends StObject
         with IllustrationMessageDesign
    
    /**
      * Scene `Illustration` size (L breakpoint). Suitable for a `Page` or a table.
      * @public
      */
    @js.native
    sealed trait Scene
      extends StObject
         with IllustrationMessageDesign
    
    /**
      * Spot <code>Illustration</code> size (S breakpoint). Suitable for cards (four columns).
      * @public
      */
    @js.native
    sealed trait Spot
      extends StObject
         with IllustrationMessageDesign
  }
}
