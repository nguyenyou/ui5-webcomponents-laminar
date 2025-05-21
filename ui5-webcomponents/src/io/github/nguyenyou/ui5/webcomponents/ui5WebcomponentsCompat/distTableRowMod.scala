package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.anon.F7pressed
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.ITableRow
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.TableColumnInfo
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.ui5WebcomponentsCompatBooleans.`true`
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row` component represents a row in the `ui5-table`.
    * @constructor
    * @extends UI5Element
    * @implements {ITableRow}
    * @public
    * @csspart row - Used to style the native `tr` element
    * @csspart popin-row - Used to style the `tr` element when a row pops in
    */
  @JSImport("@ui5/webcomponents-compat/dist/TableRow.js", JSImport.Default)
  @js.native
  open class default () extends TableRow
  object default {
    
    @JSImport("@ui5/webcomponents-compat/dist/TableRow.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-compat/dist/TableRow.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row` component represents a row in the `ui5-table`.
    * @constructor
    * @extends UI5Element
    * @implements {ITableRow}
    * @public
    * @csspart row - Used to style the native `tr` element
    * @csspart popin-row - Used to style the `tr` element when a row pops in
    */
  @js.native
  trait TableRow extends ITableRow {
    
    def _activeElementHasAttribute(attr: String): Boolean = js.native
    
    def _ariaCurrent: js.UndefOr[`true`] = js.native
    
    def _handleSelection(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    def _onfocusin(e: FocusEvent, forceSelfFocus: Boolean): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    def _onrowclick(e: MouseEvent): Unit = js.native
    
    def _ontouchend(): Unit = js.native
    
    def _ontouchstart(): Unit = js.native
    
    def activate(): Unit = js.native
    
    /**
      * Indicates if the table row is active.
      * @default false
      * @since 2.0.0
      * @private
      */
    var active: Boolean = js.native
    
    def allColumnsPoppedIn: js.UndefOr[Boolean] = js.native
    
    def ariaLabelRowSelection: String = js.native
    
    def ariaLabelText: String = js.native
    
    /**
      * Defines the cells of the component.
      *
      * **Note:** Use `ui5-table-cell` for the intended design.
      * @public
      */
    var cells: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.default
      ] = js.native
    
    def deactivate(): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableRow: F7pressed = js.native
    
    def getCellText(cell: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.default): String = js.native
    
    def getColumnTextByIdx(index: Double): String = js.native
    
    def getNormilzedTextContent(textContent: String): String = js.native
    
    def isMultiSelect: Boolean = js.native
    
    def isSingleSelect: Boolean = js.native
    
    /**
      * Indicates if the table row is navigated.
      * @default false
      * @since 2.0.0
      * @public
      */
    var navigated: Boolean = js.native
    
    var popinCells: js.Array[TableColumnInfo] = js.native
    
    def root: HTMLElement = js.native
    
    def shouldPopin: Boolean = js.native
    
    /**
      * Defines the visual indication and behavior of the component.
      *
      * **Note:** When set to `Active`, the item will provide visual response upon press,
      * while with type `Inactive`-will not.
      * @default "Inactive"
      * @since 2.0.0
      * @public
      */
    var `type`: /* template literal string: ${TableRowType} */ String = js.native
    
    var visibleCells: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableCellMod.default
      ] = js.native
    
    def visibleCellsCount: Double = js.native
  }
  
  trait TableRowClickEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowClickEventDetail {
    
    inline def apply(row: TableRow): TableRowClickEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowF7PressEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowF7PressEventDetail {
    
    inline def apply(row: TableRow): TableRowF7PressEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowF7PressEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowF7PressEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowForwardAfterEventDetail extends StObject {
    
    var target: HTMLElement
  }
  object TableRowForwardAfterEventDetail {
    
    inline def apply(target: HTMLElement): TableRowForwardAfterEventDetail = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowForwardAfterEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowForwardAfterEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowForwardBeforeEventDetail extends StObject {
    
    var target: HTMLElement
  }
  object TableRowForwardBeforeEventDetail {
    
    inline def apply(target: HTMLElement): TableRowForwardBeforeEventDetail = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowForwardBeforeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowForwardBeforeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableRowSelectionRequestedEventDetail extends StObject {
    
    var row: TableRow
  }
  object TableRowSelectionRequestedEventDetail {
    
    inline def apply(row: TableRow): TableRowSelectionRequestedEventDetail = {
      val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowSelectionRequestedEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableRowSelectionRequestedEventDetail] (val x: Self) extends AnyVal {
      
      inline def setRow(value: TableRow): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
}
