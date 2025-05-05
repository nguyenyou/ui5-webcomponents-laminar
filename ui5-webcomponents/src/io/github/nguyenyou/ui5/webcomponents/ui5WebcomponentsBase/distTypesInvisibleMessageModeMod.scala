package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInvisibleMessageModeMod {
  
  object default {
    
    /**
      * Indicates that updates to the region have the highest priority and should be presented to the user immediately.
      * @public
      */
    @JSImport("@ui5/webcomponents-base/dist/types/InvisibleMessageMode", "default.Assertive")
    @js.native
    val Assertive: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Assertive = js.native
    
    /**
      * Indicates that updates to the region should be presented at the next graceful opportunity,
      * such as at the end of reading the current sentence, or when the user pauses typing.
      * @public
      */
    @JSImport("@ui5/webcomponents-base/dist/types/InvisibleMessageMode", "default.Polite")
    @js.native
    val Polite: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Polite = js.native
  }
  
  /* Inlined { readonly Polite :'Polite',  readonly Assertive :'Assertive'}[keyof { readonly Polite :'Polite',  readonly Assertive :'Assertive'}] */
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Polite
    - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Assertive
  */
  trait InvisibleMessageMode extends StObject
  object InvisibleMessageMode {
    
    inline def Assertive: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Assertive = "Assertive".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Assertive]
    
    inline def Polite: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Polite = "Polite".asInstanceOf[io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.Polite]
  }
}
