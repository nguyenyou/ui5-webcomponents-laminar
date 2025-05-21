package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableSelectionModeMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionMode.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableSelectionMode & String] = js.native
    
    /* "Multiple" */ val Multiple: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionModeMod.TableSelectionMode.Multiple & String = js.native
    
    /* "None" */ val None: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionModeMod.TableSelectionMode.None & String = js.native
    
    /* "Single" */ val Single: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionModeMod.TableSelectionMode.Single & String = js.native
  }
  
  @js.native
  sealed trait TableSelectionMode extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionMode.js", "TableSelectionMode")
  @js.native
  object TableSelectionMode extends StObject {
    
    /**
      * Multi selection mode (more than one table row can be selected).
      * @public
      */
    @js.native
    sealed trait Multiple
      extends StObject
         with TableSelectionMode
    
    /**
      * Default mode (no selection).
      * @public
      */
    @js.native
    sealed trait None
      extends StObject
         with TableSelectionMode
    
    /**
      * Single selection mode (only one table row can be selected).
      * @public
      */
    @js.native
    sealed trait Single
      extends StObject
         with TableSelectionMode
  }
}
