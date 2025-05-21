package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsCompat

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableCellMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-cell` component defines the structure of the data in a single `ui5-table` cell.
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart cell - Used to style the native `td` element
    */
  @JSImport("@ui5/webcomponents-compat/dist/TableCell.js", JSImport.Default)
  @js.native
  open class default () extends TableCell
  object default {
    
    @JSImport("@ui5/webcomponents-compat/dist/TableCell.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-compat/dist/TableCell.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-cell` component defines the structure of the data in a single `ui5-table` cell.
    * @constructor
    * @extends UI5Element
    * @public
    * @csspart cell - Used to style the native `td` element
    */
  @js.native
  trait TableCell
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    /**
      * @private
      */
    var _popinedInline: Boolean = js.native
    
    def ariaLabelEmptyCellText: String = js.native
    
    def cellContent: js.Array[HTMLElement] = js.native
    
    /**
      * Specifies the content of the component.
      * @public
      */
    var content: js.UndefOr[js.Array[HTMLElement]] = js.native
    
    /**
      * @private
      */
    var lastInRow: Boolean = js.native
    
    /**
      * @private
      */
    var popined: Boolean = js.native
  }
}
