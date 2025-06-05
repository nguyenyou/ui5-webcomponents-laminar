package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowActionMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row-action` component defines an action for table rows.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRowAction.js";`
    *
    * @constructor
    * @extends TableRowActionBase
    * @since 2.7.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/TableRowAction.js", JSImport.Default)
  @js.native
  open class default () extends TableRowAction
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row-action` component defines an action for table rows.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRowAction.js";`
    *
    * @constructor
    * @extends TableRowActionBase
    * @since 2.7.0
    * @public
    */
  @js.native
  trait TableRowAction
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default {
    
    /**
      * Defines the icon of the row action.
      *
      * **Note:** For row actions to work properly, this property is mandatory.
      *
      * **Note:** SAP-icons font provides numerous built-in icons. To find all the available icons, see the
      * [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      *
      * @default ""
      * @public
      */
    var icon: String = js.native
    
    /**
      * Defines the text of the row action.
      *
      * **Note:** For row actions to work properly, this property is mandatory.
      *
      * @default ""
      * @public
      */
    var text: String = js.native
  }
}
