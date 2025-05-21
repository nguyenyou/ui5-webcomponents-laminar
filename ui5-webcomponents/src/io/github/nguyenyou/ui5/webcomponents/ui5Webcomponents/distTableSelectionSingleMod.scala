package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableSelectionSingleMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection-single` component is used inside the `ui5-table` to add single selection capabilities to the `ui5-table`.
    * Since selection is key-based, each `ui5-table-row` must define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection-single` component is a feature designed exclusively for use within the `ui5-table` component.
    * It must be placed inside the `features` slot of `ui5-table`.
    * This component is not intended for standalone use.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection-single slot="features" selected="Row1"></ui5-table-selection-single>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelectionSingle.js";`
    *
    * @constructor
    * @extends TableSelectionBase
    * @since 2.8.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableSelectionSingle.js", JSImport.Default)
  @js.native
  open class default () extends TableSelectionSingle
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection-single` component is used inside the `ui5-table` to add single selection capabilities to the `ui5-table`.
    * Since selection is key-based, each `ui5-table-row` must define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection-single` component is a feature designed exclusively for use within the `ui5-table` component.
    * It must be placed inside the `features` slot of `ui5-table`.
    * This component is not intended for standalone use.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection-single slot="features" selected="Row1"></ui5-table-selection-single>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelectionSingle.js";`
    *
    * @constructor
    * @extends TableSelectionBase
    * @since 2.8.0
    * @public
    */
  @js.native
  trait TableSelectionSingle
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionBaseMod.default {
    
    /**
      * Returns the selected row.
      *
      * @public
      */
    def getSelectedRow(): js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default] = js.native
    
    def isSelected(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): Boolean = js.native
    
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      selected: Boolean
    ): Unit = js.native
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      selected: Boolean,
      fireEvent: Boolean
    ): Unit = js.native
  }
}
