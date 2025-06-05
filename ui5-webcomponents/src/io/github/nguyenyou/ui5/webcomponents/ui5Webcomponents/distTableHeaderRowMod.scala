package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableHeaderRowMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-header-row` component represents the table headers of a `ui5-table`.
    *
    * It is tightly coupled to the `ui5-table` and should therefore be used in the `ui5-table` only.
    * The header row is placed in the `headerRow` slot of the table.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableHeaderRow.js";`
    *
    * @constructor
    * @extends TableRowBase
    * @since 2.0.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableHeaderRow.js", JSImport.Default)
  @js.native
  open class default () extends TableHeaderRow
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-header-row` component represents the table headers of a `ui5-table`.
    *
    * It is tightly coupled to the `ui5-table` and should therefore be used in the `ui5-table` only.
    * The header row is placed in the `headerRow` slot of the table.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableHeaderRow.js";`
    *
    * @constructor
    * @extends TableRowBase
    * @since 2.0.0
    * @public
    */
  @js.native
  trait TableHeaderRow
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default {
    
    def _i18nRowActions: String = js.native
    
    def _i18nRowPopin: String = js.native
    
    def _i18nSelection: String = js.native
    
    /**
      * Defines the cells of the component.
      *
      * **Note:** Use `ui5-table-header-cell` for the intended design.
      *
      * @public
      */
    @JSName("cells")
    var cells_TableHeaderRow: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default
      ] = js.native
    
    /**
      * Sticks the `ui5-table-header-row` to the top of a table.
      *
      * Note: If used in combination with overflowMode "Scroll", the table needs a defined height for the sticky header to work as expected.
      *
      * @default false
      * @public
      */
    var sticky: Boolean = js.native
  }
}
