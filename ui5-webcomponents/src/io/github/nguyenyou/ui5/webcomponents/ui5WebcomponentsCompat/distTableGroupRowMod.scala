package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat.distTableMod.ITableRow
import org.scalajs.dom.FocusEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableGroupRowMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-group-row` component represents a group row in the `ui5-table`.
    * @constructor
    * @since 2.0.0
    * @implements {ITableRow}
    * @extends UI5Element
    * @public
    * @slot {Node[]} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @csspart group-row - Used to style the native `tr` element
    */
  @JSImport("@ui5/webcomponents-compat/dist/TableGroupRow.js", JSImport.Default)
  @js.native
  open class default () extends TableGroupRow
  object default {
    
    @JSImport("@ui5/webcomponents-compat/dist/TableGroupRow.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-compat/dist/TableGroupRow.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-group-row` component represents a group row in the `ui5-table`.
    * @constructor
    * @since 2.0.0
    * @implements {ITableRow}
    * @extends UI5Element
    * @public
    * @slot {Node[]} default - Defines the text of the component.
    *
    * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
    * @csspart group-row - Used to style the native `tr` element
    */
  @js.native
  trait TableGroupRow extends ITableRow {
    
    var _colSpan: js.UndefOr[Double] = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def ariaLabelText: String = js.native
    
    def colSpan: js.UndefOr[Double] = js.native
    
    @JSName("eventDetails")
    var eventDetails_TableGroupRow: Focused = js.native
    
    def visibleColCount(): Double = js.native
  }
}
