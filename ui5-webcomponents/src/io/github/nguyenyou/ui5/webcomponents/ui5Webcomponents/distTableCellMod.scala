package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableCellMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-cell` represents a cell inside of a `ui5-table`.
    * It is tightly coupled to the `ui5-table` and thus should only be used in the table component.
    *
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents/dist/TableCell.js;`
    *
    * @constructor
    * @extends TableCellBase
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @JSImport("@ui5/webcomponents/dist/TableCell.js", JSImport.Default)
  @js.native
  open class default () extends TableCell
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-cell` represents a cell inside of a `ui5-table`.
    * It is tightly coupled to the `ui5-table` and thus should only be used in the table component.
    *
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents/dist/TableCell.js;`
    *
    * @constructor
    * @extends TableCellBase
    * @since 2.0.0
    * @public
    * @experimental This web component is available since 2.0 with an experimental flag and its API and behavior are subject to change.
    */
  @js.native
  trait TableCell
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableCellBaseMod.default {
    
    def _headerCell: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableHeaderCellMod.default = js.native
    
    def _i18nPopinColon: String = js.native
    
    def _popinHeaderNodes: js.Array[String | Node] = js.native
    
    def injectHeaderNodes(): Unit = js.native
    def injectHeaderNodes(ref: HTMLElement): Unit = js.native
  }
}
