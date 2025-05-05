package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeTableSelectionBaseChangeEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.ITableFeature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableSelectionBaseMod {
  
  /**
    * Fired when the selection is changed by user interaction.
    *
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/TableSelectionBase", JSImport.Default)
  @js.native
  open class default () extends TableSelectionBase
  
  /**
    * Fired when the selection is changed by user interaction.
    *
    * @public
    */
  @js.native
  trait TableSelectionBase extends ITableFeature {
    
    /**
      * Invalidates the table and its rows to re-evaluate the selection.
      *
      * @protected
      */
    /* protected */ def _invalidateTableAndRows(): Unit = js.native
    
    /* protected */ var _table: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default] = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableSelectionBase: ChangeTableSelectionBaseChangeEventDetail = js.native
    
    /**
      * Returns the table row instance for the given row key.
      *
      * @param rowKey The row key
      * @public
      */
    def getRowByKey(rowKey: String): js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default] = js.native
    
    /**
      * Returns the unique key associated with the table row.
      *
      * @param row The row instance
      */
    def getRowKey(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowMod.default): String = js.native
    
    /**
      * Determines if the component allows multiple selection.
      */
    def isMultiSelectable(): Boolean = js.native
    
    /**
      * Determines whether a row selector (for example, `radiobutton` or `checkbox`) is rendered.
      */
    def isRowSelectorRequired(): Boolean = js.native
    
    def isSelectable(): Boolean = js.native
    
    /**
      * Determines whether the specified table row is currently selected.
      *
      * @param row The row instance
      */
    def isSelected(row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default): Boolean = js.native
    
    @JSName("onTableActivate")
    def onTableActivate_MTableSelectionBase(table: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default): Unit = js.native
    
    /**
      * Defines the selected elements of the component.
      *
      * @default undefined
      * @public
      */
    var selected: js.UndefOr[String] = js.native
    
    /**
      * Sets the selected state of the specified table row.
      *
      * @param row The row instance
      * @param selected Whether the row is selected
      * @param fireEvent Whether the change event should be fired
      */
    def setSelected(
      row: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default,
      selected: Boolean,
      fireEvent: Boolean
    ): Unit = js.native
  }
  
  /**
    * Fired when selection is changed by user interaction.
    *
    * @public
    */
  type TableSelectionBaseChangeEventDetail = Unit
}
