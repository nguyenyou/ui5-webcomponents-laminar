package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Set
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableSelectionMultiMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection-multi` component is used inside the `ui5-table` to add multi-selection capabilities to the `ui5-table`.
    * Since selection is key-based, each `ui5-table-row` must define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection-multi` component is a feature designed exclusively for use within the `ui5-table` component.
    * It must be placed inside the `features` slot of `ui5-table`.
    * This component is not intended for standalone use.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection-multi slot="features" selected="Row1 Row3"></ui5-table-selection-multi>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelectionMulti.js";`
    *
    * @constructor
    * @extends TableSelectionBase
    * @since 2.8.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableSelectionMulti", JSImport.Default)
  @js.native
  open class default () extends TableSelectionMulti
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection-multi` component is used inside the `ui5-table` to add multi-selection capabilities to the `ui5-table`.
    * Since selection is key-based, each `ui5-table-row` must define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection-multi` component is a feature designed exclusively for use within the `ui5-table` component.
    * It must be placed inside the `features` slot of `ui5-table`.
    * This component is not intended for standalone use.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection-multi slot="features" selected="Row1 Row3"></ui5-table-selection-multi>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelectionMulti.js";`
    *
    * @constructor
    * @extends TableSelectionBase
    * @since 2.8.0
    * @public
    */
  @js.native
  trait TableSelectionMulti
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionBaseMod.default {
    
    /**
      * Handles the range selection
      * @param targetRow Row that is currently focused
      * @param change indicates direction
      * @private
      */
    def _handleRangeSelection(
      targetRow: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      change: Double
    ): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    /* private */ var _rangeSelection: Any = js.native
    
    def _reverseRangeSelection(): Unit = js.native
    
    /* private */ var _rowsLength: Any = js.native
    
    /**
      * Start the range selection and initialises the range selection state
      * @param row starting row
      * @private
      */
    def _startRangeSelection(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): Unit = js.native
    def _startRangeSelection(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      isMouse: Boolean
    ): Unit = js.native
    
    def _stopRangeSelection(): Unit = js.native
    
    /**
      * Determines whether all rows are selected.
      */
    def areAllRowsSelected(): Boolean = js.native
    
    /**
      * Returns the `selected` property as a set of unique `row-key` values.
      *
      * @public
      */
    def getSelectedAsSet(): Set[String] = js.native
    
    /**
      * Returns an array of the selected rows.
      *
      * @public
      */
    def getSelectedRows(): js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default] = js.native
    
    @JSName("onTableBeforeRendering")
    def onTableBeforeRendering_MTableSelectionMulti(): Unit = js.native
    
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default,
      selected: Boolean
    ): Unit = js.native
    
    /**
      * Sets the `selected` property using the provided set of unique `row-key` values.
      *
      * @param selectedSet A set of `row-key` values
      * @public
      */
    def setSelectedAsSet(selectedSet: Set[String]): Unit = js.native
  }
}
