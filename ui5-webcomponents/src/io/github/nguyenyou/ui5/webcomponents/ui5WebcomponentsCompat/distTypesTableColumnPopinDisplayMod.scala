package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableColumnPopinDisplayMod {
  
  @JSImport("@ui5/webcomponents-compat/dist/types/TableColumnPopinDisplay.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableColumnPopinDisplay & String] = js.native
    
    /* "Block" */ val Block: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay.Block & String = js.native
    
    /* "Inline" */ val Inline: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTypesTableColumnPopinDisplayMod.TableColumnPopinDisplay.Inline & String = js.native
  }
  
  @js.native
  sealed trait TableColumnPopinDisplay extends StObject
  @JSImport("@ui5/webcomponents-compat/dist/types/TableColumnPopinDisplay.js", "TableColumnPopinDisplay")
  @js.native
  object TableColumnPopinDisplay extends StObject {
    
    /**
      * default type
      * @public
      */
    @js.native
    sealed trait Block
      extends StObject
         with TableColumnPopinDisplay
    
    /**
      * inline type (the title and value are displayed on the same line)
      * @public
      */
    @js.native
    sealed trait Inline
      extends StObject
         with TableColumnPopinDisplay
  }
}
