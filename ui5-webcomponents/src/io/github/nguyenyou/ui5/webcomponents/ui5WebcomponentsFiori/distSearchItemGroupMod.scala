package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchItemGroupMod {
  
  /**
    * @class
    * The `ui5-search-item-group` is type of suggestion item,
    * that can be used to split the `ui5-search-item` suggestions into groups.
    * @constructor
    * @extends ListItemGroup
    * @public
    * @since 2.9.0
    * @experimental
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SearchItemGroup.js", JSImport.Default)
  @js.native
  open class default () extends SearchItemGroup
  
  /**
    * @class
    * The `ui5-search-item-group` is type of suggestion item,
    * that can be used to split the `ui5-search-item` suggestions into groups.
    * @constructor
    * @extends ListItemGroup
    * @public
    * @since 2.9.0
    * @experimental
    */
  @js.native
  trait SearchItemGroup
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemGroupMod.default {
    
    def isGroupItem: Boolean = js.native
  }
}
