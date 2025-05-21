package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUserMenuItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-user-menu-item` is the item to use inside a `ui5-user-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Usage
    *
    * `ui5-user-menu-item` represents a node in a `ui5-user-menu`. The user menu itself is rendered as a list,
    * and each `ui5-menu-item` is represented by a menu item in that menu. Therefore, you should only use
    * `ui5-user-menu-item` directly in your apps. The `ui5-menu` menu item is internal for the menu, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/UserMenuItem.js";`
    * @constructor
    * @extends MenuItem
    * @experimental
    * @public
    * @since 2.5.0
    */
  @JSImport("@ui5/webcomponents-fiori/dist/UserMenuItem", JSImport.Default)
  @js.native
  open class default () extends UserMenuItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-user-menu-item` is the item to use inside a `ui5-user-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Usage
    *
    * `ui5-user-menu-item` represents a node in a `ui5-user-menu`. The user menu itself is rendered as a list,
    * and each `ui5-menu-item` is represented by a menu item in that menu. Therefore, you should only use
    * `ui5-user-menu-item` directly in your apps. The `ui5-menu` menu item is internal for the menu, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/UserMenuItem.js";`
    * @constructor
    * @extends MenuItem
    * @experimental
    * @public
    * @since 2.5.0
    */
  @js.native
  trait UserMenuItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default {
    
    /**
      * Defines the items of this component.
      *
      * **Note:** Use `ui5-user-menu-item` for the intended design.
      * @public
      */
    @JSName("items")
    var items_UserMenuItem: js.Array[UserMenuItem] = js.native
  }
}
