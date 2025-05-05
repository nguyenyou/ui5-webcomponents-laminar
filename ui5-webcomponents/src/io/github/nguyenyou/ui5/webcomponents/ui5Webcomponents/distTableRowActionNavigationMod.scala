package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTableRowActionNavigationMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row-action-navigation` component defines a navigation action for table rows.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRowActionNavigation.js";`
    *
    * @constructor
    * @extends TableRowActionBase
    * @since 2.7.0
    * @public
    * @experimental
    */
  @JSImport("@ui5/webcomponents/dist/TableRowActionNavigation", JSImport.Default)
  @js.native
  open class default () extends TableRowActionNavigation
  object default {
    
    @JSImport("@ui5/webcomponents/dist/TableRowActionNavigation", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/TableRowActionNavigation", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-table-row-action-navigation` component defines a navigation action for table rows.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/TableRowActionNavigation.js";`
    *
    * @constructor
    * @extends TableRowActionBase
    * @since 2.7.0
    * @public
    * @experimental
    */
  @js.native
  trait TableRowActionNavigation
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTableRowActionBaseMod.default {
    
    def _i18nNavigation: String = js.native
    
    /**
      * Defines the interactive state of the navigation action.
      *
      * @default false
      * @public
      */
    var interactive: Boolean = js.native
  }
}
