package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Col
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Rowactionclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Spacer
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilDragAndDropDragRegistryMod.MoveEventDetail
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table` component provides a set of sophisticated features for displaying and dealing with vast amounts of data in a responsive manner.
    * To render the `ui5-table`, you need to define the columns and rows. You can use the provided `ui5-table-header-row` and `ui5-table-row` components for this purpose.
    *
    * ### Features
    *
    * The `ui5-table` can be enhanced in its functionalities by applying different features.
    * Features can be slotted into the `features` slot, to enable them in the component.
    * Features need to be imported separately, as they are not enabled by default.
    *
    * The following features are currently available:
    *
    * * [TableSelection](../TableSelection) - adds selection capabilities to the table
    * * [TableGrowing](../TableGrowing) - provides growing capabilities to load more data
    *
    * ### Keyboard Handling
    *
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * Furthermore, you can interact with `ui5-table` via the following keys:
    *
    * If the focus is on a row, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Navigates down
    * * <kbd>Up</kbd> - Navigates up
    * * <kbd>Right</kbd> - Selects the first cell of the row
    * * <kbd>Space</kbd> - Toggles the selection of the row
    * * <kbd>Ctrl/Cmd + A</kbd> - In multi selection mode, toggles the selection of all rows
    * * <kbd>Home</kbd> - Navigates to the first row, if the focus is on the first row, navigates to the header row
    * * <kbd>End</kbd> - Navigates to the last row, if the focus is on the last row, navigates to the growing button
    * * <kbd>Page Up</kbd> - Navigates one page up, if the focus is on the first row, navigates to the header row
    * * <kbd>Page Down</kbd> - Navigates one page down, if the focus is on the last row, navigates to the growing button
    * * <kbd>F2</kbd> - Focuses the first tabbable element in the row
    * * <kbd>F7</kbd> - If focus position is remembered, moves focus to the corresponding focus position row, otherwise to the first tabbable element within the row
    * * <kbd>[Shift]Tab</kbd> - Move focus to the element in the tab chain outside the table
    *
    * If the focus is on a cell, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Navigates down
    * * <kbd>Up</kbd> - Navigates up
    * * <kbd>Right</kbd> - Navigates right
    * * <kbd>Left</kbd> - Navigates left, if the focus is on the first cell of the row, the focus is moved to the row.
    * * <kbd>Home</kbd> - Navigates to the first cell of the current row, if the focus is on the first cell, navigates to the corresponding row
    * * <kbd>End</kbd> - Navigates to the last cell of the current row, if the focus is on the last cell, navigates to the corresponding row
    * * <kbd>Page Up</kbd> - Navigates one page up while keeping the focus in same column
    * * <kbd>Page Down</kbd> - Navigates one page down while keeping the focus in same column
    * * <kbd>F2</kbd> - Toggles the focus between the first tabbable cell content and the cell
    * * <kbd>Enter</kbd> - Focuses the first tabbable cell content
    * * <kbd>F7</kbd> - If the focus is on an interactive element inside a row, moves focus to the corresponding row and remembers the focus position of the element within the row
    * * <kbd>[Shift]Tab</kbd> - Move focus to the element in the tab chain outside the table
    *
    * If the focus is on an interactive cell content, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Move the focus to the interactive element in the same column of the previous row, unless the focused element prevents the default
    * * <kbd>Up</kbd> - Move the focus to the interactive element in the same column of the next row, unless the focused element prevents the default
    * * <kbd>[Shift]Tab</kbd> - Move the focus to the element in the tab chain
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Table.js";`\
    * `import "@ui5/webcomponents/dist/TableRow.js";` (`ui5-table-row`)\
    * `import "@ui5/webcomponents/dist/TableCell.js";` (`ui5-table-cell`)\
    * `import "@ui5/webcomponents/dist/TableHeaderRow.js";` (`ui5-table-header-row`)\
    * `import "@ui5/webcomponents/dist/TableHeaderCell.js";` (`ui5-table-header-cell`)
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Table.js", JSImport.Default)
  @js.native
  open class default () extends Table
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Table.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Table.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that can be slotted inside the `features` slot of the `ui5-table`.
    *
    * @public
    * @experimental
    */
  @js.native
  trait ITableFeature
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    val identifier: String = js.native
    
    /**
      * Called when the table is activated.
      * @param table Table instance
      */
    var onTableActivate: js.UndefOr[js.Function1[/* table */ Table, Unit]] = js.native
    
    /**
      * Called every time after the table renders.
      * @param table Table instance
      */
    var onTableAfterRendering: js.UndefOr[js.Function1[/* table */ js.UndefOr[Table], Unit]] = js.native
    
    /**
      * Called every time before the table renders.
      * @param table Table instance
      */
    var onTableBeforeRendering: js.UndefOr[js.Function1[/* table */ js.UndefOr[Table], Unit]] = js.native
  }
  
  /**
    * Interface for components that can be slotted inside the `features` slot of the `ui5-table`
    * and provide growing/data loading functionality.
    * @public
    * @experimental
    */
  @js.native
  trait ITableGrowing extends ITableFeature {
    
    /**
      * Determines whether the table has a growing control, that should be rendered in the table.
      */
    def hasGrowingComponent(): Boolean = js.native
    
    /**
      * Called when the table needs to load more data.
      */
    def loadMore(): Unit = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table` component provides a set of sophisticated features for displaying and dealing with vast amounts of data in a responsive manner.
    * To render the `ui5-table`, you need to define the columns and rows. You can use the provided `ui5-table-header-row` and `ui5-table-row` components for this purpose.
    *
    * ### Features
    *
    * The `ui5-table` can be enhanced in its functionalities by applying different features.
    * Features can be slotted into the `features` slot, to enable them in the component.
    * Features need to be imported separately, as they are not enabled by default.
    *
    * The following features are currently available:
    *
    * * [TableSelection](../TableSelection) - adds selection capabilities to the table
    * * [TableGrowing](../TableGrowing) - provides growing capabilities to load more data
    *
    * ### Keyboard Handling
    *
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * Furthermore, you can interact with `ui5-table` via the following keys:
    *
    * If the focus is on a row, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Navigates down
    * * <kbd>Up</kbd> - Navigates up
    * * <kbd>Right</kbd> - Selects the first cell of the row
    * * <kbd>Space</kbd> - Toggles the selection of the row
    * * <kbd>Ctrl/Cmd + A</kbd> - In multi selection mode, toggles the selection of all rows
    * * <kbd>Home</kbd> - Navigates to the first row, if the focus is on the first row, navigates to the header row
    * * <kbd>End</kbd> - Navigates to the last row, if the focus is on the last row, navigates to the growing button
    * * <kbd>Page Up</kbd> - Navigates one page up, if the focus is on the first row, navigates to the header row
    * * <kbd>Page Down</kbd> - Navigates one page down, if the focus is on the last row, navigates to the growing button
    * * <kbd>F2</kbd> - Focuses the first tabbable element in the row
    * * <kbd>F7</kbd> - If focus position is remembered, moves focus to the corresponding focus position row, otherwise to the first tabbable element within the row
    * * <kbd>[Shift]Tab</kbd> - Move focus to the element in the tab chain outside the table
    *
    * If the focus is on a cell, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Navigates down
    * * <kbd>Up</kbd> - Navigates up
    * * <kbd>Right</kbd> - Navigates right
    * * <kbd>Left</kbd> - Navigates left, if the focus is on the first cell of the row, the focus is moved to the row.
    * * <kbd>Home</kbd> - Navigates to the first cell of the current row, if the focus is on the first cell, navigates to the corresponding row
    * * <kbd>End</kbd> - Navigates to the last cell of the current row, if the focus is on the last cell, navigates to the corresponding row
    * * <kbd>Page Up</kbd> - Navigates one page up while keeping the focus in same column
    * * <kbd>Page Down</kbd> - Navigates one page down while keeping the focus in same column
    * * <kbd>F2</kbd> - Toggles the focus between the first tabbable cell content and the cell
    * * <kbd>Enter</kbd> - Focuses the first tabbable cell content
    * * <kbd>F7</kbd> - If the focus is on an interactive element inside a row, moves focus to the corresponding row and remembers the focus position of the element within the row
    * * <kbd>[Shift]Tab</kbd> - Move focus to the element in the tab chain outside the table
    *
    * If the focus is on an interactive cell content, the following keyboard shortcuts are available:
    * * <kbd>Down</kbd> - Move the focus to the interactive element in the same column of the previous row, unless the focused element prevents the default
    * * <kbd>Up</kbd> - Move the focus to the interactive element in the same column of the next row, unless the focused element prevents the default
    * * <kbd>[Shift]Tab</kbd> - Move the focus to the element in the tab chain
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Table.js";`\
    * `import "@ui5/webcomponents/dist/TableRow.js";` (`ui5-table-row`)\
    * `import "@ui5/webcomponents/dist/TableCell.js";` (`ui5-table-cell`)\
    * `import "@ui5/webcomponents/dist/TableHeaderRow.js";` (`ui5-table-header-row`)\
    * `import "@ui5/webcomponents/dist/TableHeaderCell.js";` (`ui5-table-header-cell`)
    *
    * @constructor
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @js.native
  trait Table
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _afterElement: HTMLElement = js.native
    
    def _ariaColCount: Double = js.native
    
    def _ariaDescription: js.UndefOr[String] = js.native
    
    def _ariaLabel: js.UndefOr[String] = js.native
    
    def _ariaMultiSelectable: js.UndefOr[Boolean] = js.native
    
    def _ariaRowCount: Double = js.native
    
    var _beforeElement: HTMLElement = js.native
    
    var _containerWidth: Double = js.native
    
    def _effectiveNoDataText: String = js.native
    
    var _endRow: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default = js.native
    
    var _events: js.Array[String] = js.native
    
    def _findFeature[T](featureName: String): T = js.native
    
    def _getGrowing(): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableGrowingMod.default
      ] = js.native
    
    def _getPopinOrderedColumns(reverse: Boolean): js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default
      ] = js.native
    
    def _getSelection(): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionBaseMod.default | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionMod.default
      ] = js.native
    
    def _getVirtualizer(): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableVirtualizerMod.default
      ] = js.native
    
    def _gridTemplateColumns: js.UndefOr[String] = js.native
    
    var _invalidate: Double = js.native
    
    def _isGrowingFeature(feature: Any): Boolean = js.native
    
    def _isRowSelectorRequired: js.UndefOr[Boolean] = js.native
    
    var _loadingElement: HTMLElement = js.native
    
    var _noDataRow: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default] = js.native
    
    def _onEvent(e: Event): Unit = js.native
    
    def _onEventBound(e: Event): Unit = js.native
    
    def _onGrow(): Unit = js.native
    
    def _onResize(): Unit = js.native
    
    def _onResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_onResizeBound")
    var _onResizeBound_Original: ResizeObserverCallback = js.native
    
    def _onRowActionClick(action: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default): Unit = js.native
    
    def _onRowClick(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    var _poppedIn: js.Array[Col] = js.native
    
    /**
      * Refreshes the popin state of the columns.
      * Syncs the popin state of the columns with the popin state of the header cells.
      * This is needed when additional rows are manually added and no resize happens.
      * @private
      */
    def _refreshPopinState(): Unit = js.native
    
    var _renderNavigated: Boolean = js.native
    
    def _scrollContainer: HTMLElement = js.native
    
    def _setHeaderPopinState(
      headerCell: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default,
      inPopin: Boolean,
      popinWidth: Double
    ): Unit = js.native
    
    def _stickyElements: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderRowMod.default | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default
      ] = js.native
    
    var _tableDragAndDrop: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableDragAndDropMod.default
      ] = js.native
    
    var _tableElement: HTMLElement = js.native
    
    var _tableNavigation: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableNavigationMod.default
      ] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      *
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element (or elements) that labels the component.
      *
      * @default undefined
      * @public
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    var dropIndicatorDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distDropIndicatorMod.default = js.native
    
    @JSName("eventDetails")
    var eventDetails_Table: Rowactionclick = js.native
    
    /**
      * Defines the features of the component.
      *
      * @public
      */
    var features: js.Array[ITableFeature] = js.native
    
    /**
      * Defines the header row of the component.
      *
      * **Note:** Use `ui5-table-header-row` for the intended design.
      *
      * @public
      */
    var headerRow: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderRowMod.default
      ] = js.native
    
    def isTable: Boolean = js.native
    
    /**
      * Defines if the loading indicator should be shown.
      *
      * **Note:** When the component is loading, it is not interactive.
      *
      * @default false
      * @public
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the loading indicator will show up for this component.
      *
      * @default 1000
      * @public
      */
    var loadingDelay: Double = js.native
    
    /**
      * Defines the custom visualization if there is no data available.
      *
      * @public
      */
    var noData: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the text to be displayed when there are no rows in the component.
      *
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
    
    /**
      * Defines the mode of the <code>ui5-table</code> overflow behavior.
      *
      * Available options are:
      *
      * <code>Scroll</code> - Columns are shown as regular columns and horizontal scrolling is enabled.
      * <code>Popin</code> - Columns are shown as pop-ins instead of regular columns.
      *
      * @default "Scroll"
      * @public
      */
    var overflowMode: /* template literal string: ${TableOverflowMode} */ String = js.native
    
    /**
      * Defines the maximum number of row actions that is displayed, which determines the width of the row action column.
      *
      * **Note:** It is recommended to use a maximum of 3 row actions, as exceeding this limit may take up too much space on smaller screens.
      *
      * @default 0
      * @since 2.7.0
      * @public
      */
    var rowActionCount: Double = js.native
    
    /**
      * Defines the rows of the component.
      *
      * **Note:** Use `ui5-table-row` for the intended design.
      *
      * @public
      */
    var rows: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default] = js.native
    
    /**
      * Defines the sticky top offset of the table, if other sticky elements outside of the table exist.
      */
    var stickyTop: String = js.native
    
    def styles: Spacer = js.native
  }
  
  type TableMoveEventDetail = MoveEventDetail
  
  /**
    * Fired when a row action is clicked.
    *
    * @param {TableRowActionBase} action The row action instance
    * @param {TableRow} row The row instance
    * @public
    */
  trait TableRowActionClickEventDetail extends StObject {
    
    var action: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default
    
    var row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default
  }
  object TableRowActionClickEventDetail {
    
    inline def apply(
      action: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default,
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default
    ): TableRowActionClickEventDetail = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowActionClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowActionClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAction(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setRow(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Fired when an interactive row is clicked.
    *
    * @param {TableRow} row The clicked row instance
    * @public
    */
  trait TableRowClickEventDetail extends StObject {
    
    var row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default
  }
  object TableRowClickEventDetail {
    
    inline def apply(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): TableRowClickEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
