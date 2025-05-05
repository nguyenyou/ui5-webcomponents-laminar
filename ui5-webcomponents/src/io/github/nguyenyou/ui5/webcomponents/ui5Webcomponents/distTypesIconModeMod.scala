package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesIconModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/IconMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[IconMode & String] = js.native
    
    /* "Decorative" */ val Decorative: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Decorative & String = js.native
    
    /* "Image" */ val Image: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Image & String = js.native
    
    /* "Interactive" */ val Interactive: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesIconModeMod.IconMode.Interactive & String = js.native
  }
  
  @js.native
  sealed trait IconMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/IconMode", "IconMode")
  @js.native
  object IconMode extends StObject {
    
    /**
      * Decorative mode.
      * Configures the component to internally render role="presentation" and aria-hidden="true",
      * making it purely decorative without semantic content or interactivity.
      * @public
      */
    @js.native
    sealed trait Decorative
      extends StObject
         with IconMode
    
    /**
      * Image mode (by default).
      * Configures the component to internally render role="img".
      * @public
      */
    @js.native
    sealed trait Image
      extends StObject
         with IconMode
    
    /**
      * Interactive mode.
      * Configures the component to internally render role="button".
      * This mode also supports focus and press handling to enhance interactivity.
      * @public
      */
    @js.native
    sealed trait Interactive
      extends StObject
         with IconMode
  }
}
