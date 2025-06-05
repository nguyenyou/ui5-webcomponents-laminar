package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableSelectionBehaviorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionBehavior.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableSelectionBehavior & String] = js.native
    
    /* "RowOnly" */ val RowOnly: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionBehaviorMod.TableSelectionBehavior.RowOnly & String = js.native
    
    /* "RowSelector" */ val RowSelector: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionBehaviorMod.TableSelectionBehavior.RowSelector & String = js.native
  }
  
  @js.native
  sealed trait TableSelectionBehavior extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionBehavior.js", "TableSelectionBehavior")
  @js.native
  object TableSelectionBehavior extends StObject {
    
    /**
      * Rows can only be selected by clicking directly on the row, as the row selector column is hidden.
      *
      * **Note:** In this mode, the `row-click` event of the `ui5-table` component is not fired.
      *
      * @public
      */
    @js.native
    sealed trait RowOnly
      extends StObject
         with TableSelectionBehavior
    
    /**
      * Rows can only be selected by using the row selector column.
      * @public
      */
    @js.native
    sealed trait RowSelector
      extends StObject
         with TableSelectionBehavior
  }
}
