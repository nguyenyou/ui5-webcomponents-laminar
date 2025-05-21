package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
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
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRow.js";`
    *
    * @constructor
    * @extends TableRowBase
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @JSImport("@ui5/webcomponents/dist/TableRow.js", JSImport.Default)
  @js.native
  open class default () extends TableRow
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row` component represents a row in the `ui5-table`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRow.js";`
    *
    * @constructor
    * @extends TableRowBase
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @js.native
  trait TableRow
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowBaseMod.default {
    
    def _fixedActions: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default
      ] = js.native
    
    def _flexibleActions: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default
      ] = js.native
    
    def _hasOverflowActions: Boolean = js.native
    
    def _isInteractive: Boolean = js.native
    
    @JSName("_onOverflowButtonClick")
    def _onOverflowButtonClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    def _onclick(): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeyup(): Unit = js.native
    
    def _overflowActions: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default
      ] = js.native
    
    /**
      * Defines the actions of the component.
      *
      * **Note:** Use `ui5-table-row-action` or `ui5-table-row-action-navigation` for the intended design.
      *
      * @since 2.7.0
      * @public
      */
    var actions: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default
      ] = js.native
    
    /**
      * Defines the cells of the component.
      *
      * **Note:** Use `ui5-table-cell` for the intended design.
      *
      * @public
      */
    @JSName("cells")
    var cells_TableRow: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellMod.default] = js.native
    
    /**
      * Defines the interactive state of the row.
      *
      * @default false
      * @public
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines whether the row is movable.
      *
      * @default false
      * @since 2.6.0
      * @public
      */
    var movable: Boolean = js.native
    
    /**
      * Defines the navigated state of the row.
      *
      * @default false
      * @public
      */
    var navigated: Boolean = js.native
    
    /**
      * Defines the position of the row related to the total number of rows within the table when the `ui5-table-virtualizer` feature is used.
      *
      * @default undefined
      * @since 2.5.0
      * @public
      */
    var position: js.UndefOr[Double] = js.native
    
    /**
      * Unique identifier of the row.
      *
      * **Note:** For selection features to work properly, this property is mandatory, and its value must not contain spaces.
      *
      * @default undefined
      * @public
      */
    var rowKey: js.UndefOr[String] = js.native
  }
}
