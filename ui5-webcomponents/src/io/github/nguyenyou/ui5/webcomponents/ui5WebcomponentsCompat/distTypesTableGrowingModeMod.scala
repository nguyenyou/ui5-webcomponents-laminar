package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableGrowingModeMod {
  
  @JSImport("@ui5/webcomponents-compat/dist/types/TableGrowingMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableGrowingMode & String] = js.native
    
    /* "Button" */ val Button: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableGrowingModeMod.TableGrowingMode.Button & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableGrowingModeMod.TableGrowingMode.None & String = js.native
    
    /* "Scroll" */ val Scroll: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableGrowingModeMod.TableGrowingMode.Scroll & String = js.native
  }
  
  @js.native
  sealed trait TableGrowingMode extends StObject
  @JSImport("@ui5/webcomponents-compat/dist/types/TableGrowingMode.js", "TableGrowingMode")
  @js.native
  object TableGrowingMode extends StObject {
    
    /**
      * Component `load-more` is fired
      * upon pressing a "More" button at the bottom.
      * @public
      */
    @js.native
    sealed trait Button
      extends StObject
         with TableGrowingMode
    
    /**
      * Component growing is not enabled.
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with TableGrowingMode
    
    /**
      * Component `load-more` is fired upon scroll.
      * @public
      */
    @js.native
    sealed trait Scroll
      extends StObject
         with TableGrowingMode
  }
}
