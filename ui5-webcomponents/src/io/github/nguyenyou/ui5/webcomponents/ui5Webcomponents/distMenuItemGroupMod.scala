package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.IMenuItem
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuItemGroupMod {
  
  @JSImport("@ui5/webcomponents/dist/MenuItemGroup.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-menu-item-group` component represents a group of items designed for use inside a `ui5-menu`.
    * Items belonging to the same group should be wrapped by a `ui5-menu-item-group`.
    * Each group can have an `checkMode` property, which defines the check mode for the items within the group.
    * The possible values for `checkMode` are:
    * - 'None' (default) - no items can be checked
    * - 'Single' - Only one item can be checked at a time
    * - 'Multiple' - Multiple items can be checked simultaneously
    *
    * **Note:** If the `checkMode` property is set to 'Single', only one item can remain checked at any given time.
    * If multiple items are marked as checked, the last checked item will take precedence.
    *
    * ### Usage
    *
    * `ui5-menu-item-group` represents a collection of `ui5-menu-item` components that can have the same check mode.
    * The items are addeed to the group's `items` slot.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MenuItemGroup.js";`
    * @constructor
    * @extends UI5Element
    * @implements {IMenuItem}
    * @since 2.12.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/MenuItemGroup.js", JSImport.Default)
  @js.native
  open class default () extends MenuItemGroup
  
  inline def isInstanceOfMenuItemGroup(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/MenuItemGroup.MenuItemGroup */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfMenuItemGroup")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/MenuItemGroup.MenuItemGroup */ Boolean]
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-menu-item-group` component represents a group of items designed for use inside a `ui5-menu`.
    * Items belonging to the same group should be wrapped by a `ui5-menu-item-group`.
    * Each group can have an `checkMode` property, which defines the check mode for the items within the group.
    * The possible values for `checkMode` are:
    * - 'None' (default) - no items can be checked
    * - 'Single' - Only one item can be checked at a time
    * - 'Multiple' - Multiple items can be checked simultaneously
    *
    * **Note:** If the `checkMode` property is set to 'Single', only one item can remain checked at any given time.
    * If multiple items are marked as checked, the last checked item will take precedence.
    *
    * ### Usage
    *
    * `ui5-menu-item-group` represents a collection of `ui5-menu-item` components that can have the same check mode.
    * The items are addeed to the group's `items` slot.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MenuItemGroup.js";`
    * @constructor
    * @extends UI5Element
    * @implements {IMenuItem}
    * @since 2.12.0
    * @public
    */
  @js.native
  trait MenuItemGroup extends IMenuItem {
    
    /**
      * Sets <code>checked</code> property of all items in the group to <code>false</code>.
      * @private
      */
    def _clearCheckedItems(): Unit = js.native
    
    /**
      * Ensures that only one item can remain checked at any given time. If multiple items are marked as checked,
      * the last checked item will take precedence.
      * @private
      */
    def _ensureSingleItemIsChecked(): Unit = js.native
    
    /**
      * Handles the checking of an item in the group and unchecks other items if the item check mode is Single.
      * @private
      */
    def _handleItemCheck(e: CustomEvent): Unit = js.native
    
    def _menuItems: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    /**
      * Sets <code>_checkMode</code> property of all menu items in the group.
      * @private
      */
    def _updateItemsCheckMode(): Unit = js.native
    
    /**
      * Defines the component's check mode.
      * @default "None"
      * @public
      */
    var checkMode: /* template literal string: ${MenuItemGroupCheckMode} */ String = js.native
    
    @JSName("isGroup")
    def isGroup_MMenuItemGroup: Boolean = js.native
    
    /**
      * Defines the items of this component.
      * **Note:** The slot can hold any combination of components of type `ui5-menu-item` or `ui5-menu-separator` or both.
      * @public
      */
    var items: js.Array[IMenuItem] = js.native
  }
}
