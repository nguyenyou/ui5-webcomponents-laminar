package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableSelectionMultiHeaderSelectorMod {
  
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionMultiHeaderSelector.js", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TableSelectionMultiHeaderSelector & String] = js.native
    
    /* "ClearAll" */ val ClearAll: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionMultiHeaderSelectorMod.TableSelectionMultiHeaderSelector.ClearAll & String = js.native
    
    /* "SelectAll" */ val SelectAll: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesTableSelectionMultiHeaderSelectorMod.TableSelectionMultiHeaderSelector.SelectAll & String = js.native
  }
  
  @js.native
  sealed trait TableSelectionMultiHeaderSelector extends StObject
  @JSImport("@ui5/webcomponents/dist/types/TableSelectionMultiHeaderSelector.js", "TableSelectionMultiHeaderSelector")
  @js.native
  object TableSelectionMultiHeaderSelector extends StObject {
    
    /**
      * Renders an icon in the table header row that removes the selection of all rows.
      * @public
      */
    @js.native
    sealed trait ClearAll
      extends StObject
         with TableSelectionMultiHeaderSelector
    
    /**
      * Renders a checkbox in the table header row that toggles the selection of all rows.
      * @public
      */
    @js.native
    sealed trait SelectAll
      extends StObject
         with TableSelectionMultiHeaderSelector
  }
}
