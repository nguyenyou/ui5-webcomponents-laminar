package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowBaseMod {
  
  /**
    * @class
    * A class to serve as a foundation for the `TableRow` and `TableHeaderRow` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/TableRowBase.js", JSImport.Default)
  @js.native
  open class default () extends TableRowBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableRowBase.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableRowBase.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * A class to serve as a foundation for the `TableRow` and `TableHeaderRow` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @js.native
  trait TableRowBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _hasRowSelector: Boolean = js.native
    
    def _i18nRowSelector: String = js.native
    
    var _invalidate: Double = js.native
    
    def _isMultiSelect: Boolean = js.native
    
    def _isSelectable: js.UndefOr[Boolean] = js.native
    
    def _isSelected: js.UndefOr[Boolean] = js.native
    
    var _navigatedCell: js.UndefOr[HTMLElement] = js.native
    
    def _onSelectionChange(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent, eventOrigin: HTMLElement): Unit = js.native
    
    def _popinCells: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellBaseMod.default
      ] = js.native
    
    var _renderNavigated: Boolean = js.native
    
    var _rowActionCount: Double = js.native
    
    var _selectionCell: js.UndefOr[HTMLElement] = js.native
    
    def _stickyCells: js.Array[js.UndefOr[HTMLElement]] = js.native
    
    def _table: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableMod.default] = js.native
    
    def _tableId: js.UndefOr[String] = js.native
    
    def _tableSelection: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionBaseMod.default | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableSelectionMod.default
      ] = js.native
    
    def _visibleCells: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellBaseMod.default
      ] = js.native
    
    var cells: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellBaseMod.default
      ] = js.native
    
    def isHeaderRow(): Boolean = js.native
  }
}
