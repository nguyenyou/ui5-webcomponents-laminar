package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableCellBaseMod {
  
  /**
    * @class
    * A class to serve as a foundation for the `TableCell` and `TableHeaderCell` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/TableCellBase", JSImport.Default)
  @js.native
  open class default () extends TableCellBase
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableCellBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableCellBase", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * A class to serve as a foundation for the `TableCell` and `TableHeaderCell` classes.
    * @constructor
    * @abstract
    * @extends UI5Element
    * @since 2.0.0
    * @public
    */
  @js.native
  trait TableCellBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _popin: Boolean = js.native
    
    var _popinHidden: Boolean = js.native
    
    /* protected */ var ariaRole: String = js.native
    
    /**
      * Defines the content of the component.
      *
      * @public
      */
    var content: js.Array[Node] = js.native
    
    /**
      * Determines the horizontal alignment of table cells.
      *
      * @default undefined
      * @public
      */
    var horizontalAlign: js.UndefOr[/* template literal string: ${TableCellHorizontalAlign} */ String] = js.native
    
    def isTableCellBase(): Boolean = js.native
  }
}
