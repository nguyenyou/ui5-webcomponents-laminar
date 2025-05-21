package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTabLayoutMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TabLayout.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TabLayout & String] = js.native
    
    /* "Inline" */ val Inline: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTabLayoutMod.TabLayout.Inline & String = js.native
    
    /* "Standard" */ val Standard: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTabLayoutMod.TabLayout.Standard & String = js.native
  }
  
  @js.native
  sealed trait TabLayout extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TabLayout.js", "TabLayout")
  @js.native
  object TabLayout extends StObject {
    
    /**
      * Inline type, the tab "main text" and "additionalText" are displayed horizotally.
      * @public
      */
    @js.native
    sealed trait Inline
      extends StObject
         with TabLayout
    
    /**
      * Standard type, the tab "main text" and "additionalText" are displayed vertically.
      * @public
      */
    @js.native
    sealed trait Standard
      extends StObject
         with TabLayout
  }
}
