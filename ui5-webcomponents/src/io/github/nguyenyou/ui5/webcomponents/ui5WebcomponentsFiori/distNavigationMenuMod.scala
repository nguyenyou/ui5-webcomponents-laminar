package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNavigationMenuMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-navigation-menu` component represents a hierarchical menu structure, inherits all the functionality of `ui5-menu`.
    *
    * ### Usage
    *
    * `ui5-navigation-menu` contains `ui5-navigation-menu-item` components.
    * An arbitrary hierarchy structure can be represented by recursively nesting navigation menu items.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationMenu.js";`
    * @constructor
    * @extends Menu
    * @since 1.22.0
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NavigationMenu", JSImport.Default)
  @js.native
  open class default () extends NavigationMenu
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-navigation-menu` component represents a hierarchical menu structure, inherits all the functionality of `ui5-menu`.
    *
    * ### Usage
    *
    * `ui5-navigation-menu` contains `ui5-navigation-menu-item` components.
    * An arbitrary hierarchy structure can be represented by recursively nesting navigation menu items.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationMenu.js";`
    * @constructor
    * @extends Menu
    * @since 1.22.0
    * @private
    */
  @js.native
  trait NavigationMenu
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.default {
    
    def accSideNavigationPopoverHiddenText: String = js.native
    
    /**
      * Defines the items of this component.
      *
      * **Note:** Use `ui5-navigation-menu-item` for the intended design.
      * @public
      */
    @JSName("items")
    var items_NavigationMenu: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distNavigationMenuItemMod.default
      ] = js.native
  }
}
