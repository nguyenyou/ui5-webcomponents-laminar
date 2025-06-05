package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings._empty
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNavigationMenuItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-navigation-menu-item` is the item to use inside a `ui5-navigation-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting navigation menu items.
    *
    * ### Usage
    *
    * `ui5-navigation-menu-item` represents a node in a `ui5-navigation-menu`. The navigation menu itself is rendered as a list,
    * and each `ui5-navigation-menu-item` is represented by a list item in that list. Therefore, you should only use
    * `ui5-navigation-menu-item` directly in your apps. The `ui5-li` list item is internal for the list, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationMenuItem.js";`
    * @constructor
    * @extends MenuItem
    * @since 1.22.0
    * @private
    */
  @JSImport("@ui5/webcomponents-fiori/dist/NavigationMenuItem.js", JSImport.Default)
  @js.native
  open class default () extends NavigationMenuItem
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-navigation-menu-item` is the item to use inside a `ui5-navigation-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting navigation menu items.
    *
    * ### Usage
    *
    * `ui5-navigation-menu-item` represents a node in a `ui5-navigation-menu`. The navigation menu itself is rendered as a list,
    * and each `ui5-navigation-menu-item` is represented by a list item in that list. Therefore, you should only use
    * `ui5-navigation-menu-item` directly in your apps. The `ui5-li` list item is internal for the list, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/NavigationMenuItem.js";`
    * @constructor
    * @extends MenuItem
    * @since 1.22.0
    * @private
    */
  @js.native
  trait NavigationMenuItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default {
    
    def _activate(e: KeyboardEvent): Unit = js.native
    def _activate(e: MouseEvent): Unit = js.native
    
    def _handleFocus(
      associatedItem: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
    ): Unit = js.native
    
    def _href: js.UndefOr[String] = js.native
    
    var associatedItem: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
    
    var design: /* template literal string: ${SideNavigationItemDesign} */ String = js.native
    
    /**
      * Defines the link target URI. Supports standard hyperlink behavior.
      * If a JavaScript action should be triggered,
      * this should not be set, but instead an event handler
      * for the `click` event should be registered.
      * @public
      * @default undefined
      * @since 1.22.0
      */
    var href: js.UndefOr[String] = js.native
    
    def isExternalLink: js.UndefOr[Boolean | _empty] = js.native
    
    /**
      * Defines the component target.
      *
      * **Notes:**
      *
      * - `_self`
      * - `_top`
      * - `_blank`
      * - `_parent`
      * - `_search`
      *
      * **This property must only be used when the `href` property is set.**
      * @public
      * @default undefined
      * @since 1.22.0
      */
    var target: js.UndefOr[String] = js.native
  }
}
