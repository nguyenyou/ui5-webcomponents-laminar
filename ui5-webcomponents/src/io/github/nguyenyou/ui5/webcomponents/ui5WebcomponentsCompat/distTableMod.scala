package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserver
import io.github.nguyenyou.ui5.webcomponents.std.IntersectionObserverEntry
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.anon.Loadmore
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.ui5WebcomponentsCompatBooleans.`false`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table` component provides a set of sophisticated and convenient functions for responsive table design.
    * It provides a comprehensive set of features for displaying and dealing with vast amounts of data.
    *
    * To render the `Table` properly, the order of the `columns` should match with the
    * order of the item `cells` in the `rows`.
    *
    * Desktop and tablet devices are supported.
    * On tablets, special consideration should be given to the number of visible columns
    * and rows due to the limited performance of some devices.
    *
    * ### Selection
    * To benefit from the selection mechanism of `ui5-table` component, you can use the available selection modes:
    * `SingleSelect` and `MultiSelect`.
    *
    * In additition to the used mode, you can also specify the `ui5-table-row` type choosing between
    * `Active` or `Inactive`.
    *
    * In `SingleSelect` mode, you can select both an `Active` and `Inactive` row via mouse or
    * by pressing the `Space` or `Enter` keys.
    *
    * In `MultiSelect` mode, you can select both an `Active` and `Inactive` row by pressing the
    * `Space` key when a row is on focus or via mouse click over the selection checkbox of the row.
    * In order to select all the available rows at once, you can use the selection checkbox presented in the table's header.
    *
    * **Note:** Currently, when a column is shown as a pop-in, the visual indication for selection is not presented over it.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * Furthermore, you can interact with `ui5-table` via the following keys.
    *
    * - [F7] - If focus is on an interactive control inside an item, moves focus to the corresponding item.
    * - [Ctrl]+[A] - Selects all items, if MultiSelect mode is enabled.
    * - [Home]/[End] - Focuses the first/last item.
    * - [Page Up]/[Page Down] - Moves focus up/down by page size (20 items by default).
    * - [Alt]+[Down]/[Up] - Switches focus between header, last focused item, and More button (if applies) in either direction.
    * - [Shift]+[Down]/[Up] - Selects the next/previous item in a MultiSelect table, if the current item is selected (Range selection). Otherwise, deselects them (Range deselection).
    * - [Shift]+[Home]/[End] - Range selection to the first/last item of the List.
    * - [Ctrl]+[Home]/[End] - Same behavior as HOME & END.
    *
    * ### ES6 Module Import
    *
    * - `import "@ui5/webcomponents-compat/dist/Table.js";`
    * - `import "@ui5/webcomponents-compat/dist/TableColumn.js";` (`ui5-table-column`)
    * - `import "@ui5/webcomponents-compat/dist/TableRow.js";` (`ui5-table-row`)
    * - `import "@ui5/webcomponents-compat/dist/TableGroupRow.js";` (`ui5-table-group-row`)
    * - `import "@ui5/webcomponents-compat/dist/TableCell.js";` (`ui5-table-cell`)
    * @constructor
    * @extends UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents-compat/dist/Table.js", JSImport.Default)
  @js.native
  open class default () extends Table
  object default {
    
    @JSImport("@ui5/webcomponents-compat/dist/Table.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-compat/dist/Table.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait TableFocusTargetElement extends StObject
  @JSImport("@ui5/webcomponents-compat/dist/Table.js", "TableFocusTargetElement")
  @js.native
  object TableFocusTargetElement extends StObject {
    
    @js.native
    sealed trait ColumnHeader
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait GroupRow
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait MoreButton
      extends StObject
         with TableFocusTargetElement
    
    @js.native
    sealed trait Row
      extends StObject
         with TableFocusTargetElement
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-table` as rows
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait ITableRow
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _columnsInfo: js.UndefOr[js.Array[TableColumnInfo]] = js.native
    
    var _columnsInfoString: String = js.native
    
    var forcedAriaPosition: js.UndefOr[String] = js.native
    
    var forcedBusy: Boolean = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var mode: /* template literal string: ${TableMode} */ String = js.native
    
    var selected: Boolean = js.native
    
    var tabbableElements: js.Array[HTMLElement] = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table` component provides a set of sophisticated and convenient functions for responsive table design.
    * It provides a comprehensive set of features for displaying and dealing with vast amounts of data.
    *
    * To render the `Table` properly, the order of the `columns` should match with the
    * order of the item `cells` in the `rows`.
    *
    * Desktop and tablet devices are supported.
    * On tablets, special consideration should be given to the number of visible columns
    * and rows due to the limited performance of some devices.
    *
    * ### Selection
    * To benefit from the selection mechanism of `ui5-table` component, you can use the available selection modes:
    * `SingleSelect` and `MultiSelect`.
    *
    * In additition to the used mode, you can also specify the `ui5-table-row` type choosing between
    * `Active` or `Inactive`.
    *
    * In `SingleSelect` mode, you can select both an `Active` and `Inactive` row via mouse or
    * by pressing the `Space` or `Enter` keys.
    *
    * In `MultiSelect` mode, you can select both an `Active` and `Inactive` row by pressing the
    * `Space` key when a row is on focus or via mouse click over the selection checkbox of the row.
    * In order to select all the available rows at once, you can use the selection checkbox presented in the table's header.
    *
    * **Note:** Currently, when a column is shown as a pop-in, the visual indication for selection is not presented over it.
    *
    * ### Keyboard Handling
    *
    * #### Fast Navigation
    * This component provides a build in fast navigation group which can be used via [F6] / [Shift] + [F6] / [Ctrl] + [Alt/Option] / [Down] or [Ctrl] + [Alt/Option] + [Up].
    * In order to use this functionality, you need to import the following module:
    * `import "@ui5/webcomponents-base/dist/features/F6Navigation.js"`
    *
    * Furthermore, you can interact with `ui5-table` via the following keys.
    *
    * - [F7] - If focus is on an interactive control inside an item, moves focus to the corresponding item.
    * - [Ctrl]+[A] - Selects all items, if MultiSelect mode is enabled.
    * - [Home]/[End] - Focuses the first/last item.
    * - [Page Up]/[Page Down] - Moves focus up/down by page size (20 items by default).
    * - [Alt]+[Down]/[Up] - Switches focus between header, last focused item, and More button (if applies) in either direction.
    * - [Shift]+[Down]/[Up] - Selects the next/previous item in a MultiSelect table, if the current item is selected (Range selection). Otherwise, deselects them (Range deselection).
    * - [Shift]+[Home]/[End] - Range selection to the first/last item of the List.
    * - [Ctrl]+[Home]/[End] - Same behavior as HOME & END.
    *
    * ### ES6 Module Import
    *
    * - `import "@ui5/webcomponents-compat/dist/Table.js";`
    * - `import "@ui5/webcomponents-compat/dist/TableColumn.js";` (`ui5-table-column`)
    * - `import "@ui5/webcomponents-compat/dist/TableRow.js";` (`ui5-table-row`)
    * - `import "@ui5/webcomponents-compat/dist/TableGroupRow.js";` (`ui5-table-group-row`)
    * - `import "@ui5/webcomponents-compat/dist/TableCell.js";` (`ui5-table-cell`)
    * @constructor
    * @extends UI5Element
    * @public
    */
  @js.native
  trait Table
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _afterElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Defines whether all rows are selected or not when table is in MultiSelect mode.
      * @default false
      * @since 2.0.0
      * @private
      */
    var _allRowsSelected: Boolean = js.native
    
    var _beforeElement: js.UndefOr[HTMLElement] = js.native
    
    /**
      * Used to represent the table column header for the purpose of the item navigation as it does not work with DOM objects directly
      * @private
      */
    var _columnHeader: TableColumnHeaderInfo = js.native
    
    def _focusForwardElement(isAfter: Boolean): Unit = js.native
    
    def _focusNextElement(): Unit = js.native
    
    var _forwardingFocus: Boolean = js.native
    
    def _getAfterForwardElement(): HTMLElement = js.native
    
    def _getBeforeForwardElement(): HTMLElement = js.native
    
    def _getForwardElement(isAfter: Boolean): HTMLElement | Null = js.native
    
    def _growingButtonText: String = js.native
    
    /**
      * Handles Alt + Up/Down.
      * Switches focus between column header, last focused item, and "More" button (if applicable).
      * @private
      */
    def _handleArrowAlt(e: KeyboardEvent): Unit | js.Promise[Unit] = js.native
    
    def _handleArrowNav(e: KeyboardEvent): Unit = js.native
    
    /**
      * Toggles focus between the table row's root and the last focused nested element.
      * @private
      */
    def _handleF7(e: CustomEvent): Unit = js.native
    
    def _handleHomeEndSelection(e: KeyboardEvent): Unit = js.native
    
    def _handleMultiSelect(e: CustomEvent): Unit = js.native
    
    def _handleResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResize")
    var _handleResize_Original: ResizeObserverCallback = js.native
    
    def _handleSelect(e: CustomEvent): Unit = js.native
    
    def _handleSingleSelect(e: CustomEvent): Unit = js.native
    
    def _handleTab(e: KeyboardEvent): `false` | Unit = js.native
    
    var _hiddenColumns: js.UndefOr[js.Array[TableColumnInfo]] = js.native
    
    def _isForwardElement(element: HTMLElement): Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    /**
      * Defines the active state of the `More` button.
      * @private
      */
    var _loadMoreActive: Boolean = js.native
    
    var _noDataDisplayed: Boolean = js.native
    
    def _onColumnHeaderClick(e: KeyboardEvent): Unit = js.native
    def _onColumnHeaderClick(e: MouseEvent): Unit = js.native
    
    def _onColumnHeaderFocused(): Unit = js.native
    
    def _onColumnHeaderKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onForwardAfter(e: CustomEvent): Unit = js.native
    
    def _onForwardBefore(e: CustomEvent): Unit = js.native
    
    def _onLoadMoreClick(): Unit = js.native
    
    def _onLoadMoreKeydown(e: KeyboardEvent): Unit = js.native
    
    def _onLoadMoreKeyup(e: KeyboardEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _prevFocusedRow: js.UndefOr[ITableRow] = js.native
    
    var _prevNestedElementIndex: Double = js.native
    
    def _selectAll(): Unit = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 2.0.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 2.0.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def ariaLabelSelectAllText: String = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines if the table is in busy state.
      *
      * In this state the component's opacity is reduced
      * and busy indicator is displayed at the bottom of the table.
      * @default false
      * @since 2.0.0
      * @public
      */
    var busy: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the busy indicator will show up for this component.
      * @default 1000
      * @public
      */
    var busyDelay: Double = js.native
    
    def columnHeader: HTMLElement | Null = js.native
    
    def columnHeaderLastElement: HTMLElement | Null = js.native
    
    def columnHeaderTabbables: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the configuration for the columns of the component.
      *
      * **Note:** Use `ui5-table-column` for the intended design.
      * @public
      */
    var columns: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableColumnMod.default
      ] = js.native
    
    def currentElement: js.UndefOr[HTMLElement] = js.native
    
    def currentItem: ITableRow = js.native
    
    def currentItemIdx: Double = js.native
    
    @JSName("eventDetails")
    var eventDetails_Table: Loadmore = js.native
    
    def fnHandleF7(e: CustomEvent): Unit = js.native
    
    def fnOnRowFocused(e: CustomEvent): Unit = js.native
    
    /**
      * Gets settings to be propagated from columns to rows.
      */
    def getColumnPropagationSettings(): js.Array[TableColumnInfo] = js.native
    
    /**
      * Determines the type of the currently focused element.
      * @private
      */
    def getFocusedElementType(element: HTMLElement): js.UndefOr[TableFocusTargetElement] = js.native
    
    def getIntersectionObserver(): IntersectionObserver = js.native
    
    def getRowParent(child: HTMLElement): js.UndefOr[ITableRow] = js.native
    
    /**
      * Defines whether the table will have growing capability either by pressing a `More` button,
      * or via user scroll. In both cases `load-more` event is fired.
      *
      * Available options:
      *
      * `Button` - Shows a `More` button at the bottom of the table, pressing of which triggers the `load-more` event.
      *
      * `Scroll` - The `load-more` event is triggered when the user scrolls to the bottom of the table;
      *
      * `None` (default) - The growing is off.
      *
      * **Restrictions:** `growing="Scroll"` is not supported for Internet Explorer,
      * and the component will fallback to `growing="Button"`.
      * @default "None"
      * @since 2.0.0
      * @public
      */
    var growing: /* template literal string: ${TableGrowingMode} */ String = js.native
    
    /**
      * Defines the subtext that will be displayed under the `growingButtonText`.
      *
      * **Note:** This property takes effect if `growing` is set to `Button`.
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var growingButtonSubtext: js.UndefOr[String] = js.native
    
    /**
      * Defines the text that will be displayed inside the growing button at the bottom of the table,
      * meant for loading more rows upon press.
      *
      * **Note:** If not specified a built-in text will be displayed.
      *
      * **Note:** This property takes effect if `growing` is set to `Button`.
      * @default undefined
      * @since 2.0.0
      * @public
      */
    var growingButtonText: js.UndefOr[String] = js.native
    
    var growingIntersectionObserver: js.UndefOr[IntersectionObserver | Null] = js.native
    
    def growsOnScroll: Boolean = js.native
    
    def growsWithButton: Boolean = js.native
    
    def handleResize(): Unit = js.native
    
    /**
      * Defines if the value of `noDataText` will be diplayed when there is no rows present in the table.
      * @default false
      * @public
      * @since 2.0.0
      */
    var hideNoData: Boolean = js.native
    
    var initialIntersection: Boolean = js.native
    
    def isMultiSelect: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    var lastFocusedElement: HTMLElement | Null = js.native
    
    def loadMore(): Unit = js.native
    
    def loadMoreAriaLabelledBy: String = js.native
    
    /**
      * Defines the mode of the component.
      * @default "None"
      * @since 2.0.0
      * @public
      */
    var mode: /* template literal string: ${TableMode} */ String = js.native
    
    def morеBtn: HTMLElement | Null = js.native
    
    /**
      * Defines the text that will be displayed when there is no data and `hideNoData` is not present.
      * @default undefined
      * @public
      */
    var noDataText: js.UndefOr[String] = js.native
    
    def observeTableEnd(): Unit = js.native
    
    def onInteresection(entries: js.Array[IntersectionObserverEntry]): Unit = js.native
    
    def onRowFocused(e: CustomEvent): Unit = js.native
    
    def onRowKeyDown(e: KeyboardEvent): Unit = js.native
    
    def popinContent(): Unit = js.native
    
    /**
      * Defines the component rows.
      *
      * **Note:** Use `ui5-table-row` for the intended design.
      * @public
      */
    var rows: js.Array[ITableRow] = js.native
    
    def selectedRows: js.Array[ITableRow] = js.native
    
    /**
      * Determines whether the column headers remain fixed at the top of the page during
      * vertical scrolling as long as the Web Component is in the viewport.
      *
      * **Restrictions:**
      *
      * - Browsers that do not support this feature:
      *
      * - Internet Explorer
      * - Microsoft Edge lower than version 41 (EdgeHTML 16)
      * - Mozilla Firefox lower than version 59
      *
      * - Scrolling behavior:
      *
      * - If the Web Component is placed in layout containers that have the `overflow: hidden`
      * or `overflow: auto` style definition, this can
      * prevent the sticky elements of the Web Component from becoming fixed at the top of the viewport.
      * @default false
      * @public
      */
    var stickyColumnHeader: Boolean = js.native
    
    def tableAriaLabelText: js.UndefOr[String] = js.native
    
    def tableEndDOM: Element = js.native
    
    var tableEndObserved: Boolean = js.native
    
    var visibleColumns: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableColumnMod.default
      ] = js.native
    
    var visibleColumnsCount: js.UndefOr[Double] = js.native
  }
  
  type TableColumnHeaderInfo = ITabbable
  
  trait TableColumnInfo extends StObject {
    
    var cell: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.default
      ] = js.undefined
    
    var classes: js.UndefOr[String] = js.undefined
    
    var demandPopin: js.UndefOr[Boolean] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var popinDisplay: js.UndefOr[/* template literal string: ${TableColumnPopinDisplay} */ String] = js.undefined
    
    var popinDisplayInline: js.UndefOr[Boolean] = js.undefined
    
    var popinText: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String | Null] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TableColumnInfo {
    
    inline def apply(): TableColumnInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableColumnInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableColumnInfo] (val x: Self) extends AnyVal {
      
      inline def setCell(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.default): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setDemandPopin(value: Boolean): Self = StObject.set(x, "demandPopin", value.asInstanceOf[js.Any])
      
      inline def setDemandPopinUndefined: Self = StObject.set(x, "demandPopin", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPopinDisplay(value: /* template literal string: ${TableColumnPopinDisplay} */ String): Self = StObject.set(x, "popinDisplay", value.asInstanceOf[js.Any])
      
      inline def setPopinDisplayInline(value: Boolean): Self = StObject.set(x, "popinDisplayInline", value.asInstanceOf[js.Any])
      
      inline def setPopinDisplayInlineUndefined: Self = StObject.set(x, "popinDisplayInline", js.undefined)
      
      inline def setPopinDisplayUndefined: Self = StObject.set(x, "popinDisplay", js.undefined)
      
      inline def setPopinText(value: String): Self = StObject.set(x, "popinText", value.asInstanceOf[js.Any])
      
      inline def setPopinTextUndefined: Self = StObject.set(x, "popinText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TablePopinChangeEventDetail extends StObject {
    
    var poppedColumns: js.Array[TableColumnInfo]
  }
  object TablePopinChangeEventDetail {
    
    inline def apply(poppedColumns: js.Array[TableColumnInfo]): TablePopinChangeEventDetail = {
      val __obj = js.Dynamic.literal(poppedColumns = poppedColumns.asInstanceOf[js.Any])
      __obj.asInstanceOf[TablePopinChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TablePopinChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setPoppedColumns(value: js.Array[TableColumnInfo]): Self = StObject.set(x, "poppedColumns", value.asInstanceOf[js.Any])
      
      inline def setPoppedColumnsVarargs(value: TableColumnInfo*): Self = StObject.set(x, "poppedColumns", js.Array(value*))
    }
  }
  
  trait TableSelectionChangeEventDetail extends StObject {
    
    var previouslySelectedRows: js.Array[ITableRow]
    
    var selectedRows: js.Array[ITableRow]
  }
  object TableSelectionChangeEventDetail {
    
    inline def apply(previouslySelectedRows: js.Array[ITableRow], selectedRows: js.Array[ITableRow]): TableSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(previouslySelectedRows = previouslySelectedRows.asInstanceOf[js.Any], selectedRows = selectedRows.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setPreviouslySelectedRows(value: js.Array[ITableRow]): Self = StObject.set(x, "previouslySelectedRows", value.asInstanceOf[js.Any])
      
      inline def setPreviouslySelectedRowsVarargs(value: ITableRow*): Self = StObject.set(x, "previouslySelectedRows", js.Array(value*))
      
      inline def setSelectedRows(value: js.Array[ITableRow]): Self = StObject.set(x, "selectedRows", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsVarargs(value: ITableRow*): Self = StObject.set(x, "selectedRows", js.Array(value*))
    }
  }
}
