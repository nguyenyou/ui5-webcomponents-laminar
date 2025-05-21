package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSearchModeMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/types/SearchMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SearchMode & String] = js.native
    
    /* "Default" */ val Default: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSearchModeMod.SearchMode.Default & String = js.native
    
    /* "Scoped" */ val Scoped: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distTypesSearchModeMod.SearchMode.Scoped & String = js.native
  }
  
  @js.native
  sealed trait SearchMode extends StObject
  @JSImport("@ui5/webcomponents-fiori/dist/types/SearchMode.js", "SearchMode")
  @js.native
  object SearchMode extends StObject {
    
    /**
      * Search field with default appearance.
      * @public
      */
    @js.native
    sealed trait Default
      extends StObject
         with SearchMode
    
    /**
      * Search field with additional scope select.
      * @public
      */
    @js.native
    sealed trait Scoped
      extends StObject
         with SearchMode
  }
}
