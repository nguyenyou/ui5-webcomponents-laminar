package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.Set
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.IsMouse
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.ITableFeature
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableSelectionMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection` component is used inside the `ui5-table` to add key-based selection capabilities to the `ui5-table`.
    *
    * The component offers three selection modes:
    * * Single - select a single row.
    * * Multiple - select multiple rows.
    * * None - no selection active.
    *
    * As the selection is key-based, `ui5-table-row` components need to define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection` component is only used inside the `ui5-table` component as a feature.
    * It has to be slotted inside the `ui5-table` in the `features` slot.
    * The component is not intended to be used as a standalone component.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection mode="Multiple" slot="features"></ui5-table-selection>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelection.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    * @deprecated This component is deprecated and will be removed in future releases. Use the `ui5-table-selection-single` or `ui5-table-selection-multi` components instead.
    */
  @JSImport("@ui5/webcomponents/dist/TableSelection", JSImport.Default)
  @js.native
  open class default () extends TableSelection
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-selection` component is used inside the `ui5-table` to add key-based selection capabilities to the `ui5-table`.
    *
    * The component offers three selection modes:
    * * Single - select a single row.
    * * Multiple - select multiple rows.
    * * None - no selection active.
    *
    * As the selection is key-based, `ui5-table-row` components need to define a unique `row-key` property.
    *
    * ### Usage
    *
    * The `ui5-table-selection` component is only used inside the `ui5-table` component as a feature.
    * It has to be slotted inside the `ui5-table` in the `features` slot.
    * The component is not intended to be used as a standalone component.
    *
    * ```html
    * <ui5-table>
    * 	<ui5-table-selection mode="Multiple" slot="features"></ui5-table-selection>
    * </ui5-table>
    * ```
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableSelection.js";`
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    * @deprecated This component is deprecated and will be removed in future releases. Use the `ui5-table-selection-single` or `ui5-table-selection-multi` components instead.
    */
  @js.native
  trait TableSelection extends ITableFeature {
    
    /**
      * Handles the range selection
      * @param targetRow row that is currently focused
      * @param change indicates direction
      * @private
      */
    def _handleRangeSelection(
      targetRow: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      change: Double
    ): Unit = js.native
    
    def _invalidateTableAndRows(): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    var _rangeSelection: js.UndefOr[IsMouse | Null] = js.native
    
    def _reverseRangeSelection(): Unit = js.native
    
    var _rowsLength: Double = js.native
    
    def _selectHeaderRow(selected: Boolean): Unit = js.native
    
    def _selectRow(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default,
      selected: Boolean
    ): Unit = js.native
    
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
    
    var _table: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default] = js.native
    
    def areAllRowsSelected(): Boolean = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableSelection: ChangeVoid = js.native
    
    def getRowKey(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): String = js.native
    
    def hasSelectedRow(): Boolean = js.native
    
    def isMultiSelectable(): Boolean = js.native
    
    def isRowSelectorRequired(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    def isSelected(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default): Boolean = js.native
    
    /**
      * Defines the selection mode.
      *
      * @default "Multiple"
      * @public
      */
    var mode: /* template literal string: ${TableSelectionMode} */ String = js.native
    
    @JSName("onTableActivate")
    def onTableActivate_MTableSelection(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default): Unit = js.native
    
    @JSName("onTableBeforeRendering")
    def onTableBeforeRendering_MTableSelection(): Unit = js.native
    
    /**
      * Defines the selected rows separated by a space.
      *
      * @default ""
      * @public
      */
    var selected: String = js.native
    
    def selectedAsArray: js.Array[String] = js.native
    def selectedAsArray_=(selectedArray: js.Array[String]): Unit = js.native
    
    def selectedAsSet: Set[String] = js.native
    def selectedAsSet_=(selectedSet: Set[String]): Unit = js.native
    
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default,
      selected: Boolean
    ): Unit = js.native
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default,
      selected: Boolean,
      fireEvent: Boolean
    ): Unit = js.native
  }
}
