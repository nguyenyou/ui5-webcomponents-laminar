package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Beforeopen
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.Timeout
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-menu` component represents a hierarchical menu structure.
    *
    * ### Structure
    *
    * The `ui5-menu` can hold two types of entities:
    *
    * - `ui5-menu-item` components
    * - `ui5-menu-separator` - used to separate menu items with a line
    *
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Keyboard Handling
    *
    * The `ui5-menu` provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    *
    * - `Arrow Up` / `Arrow Down` - Navigates up and down the menu items that are currently visible.
    * - `Arrow Right`, `Space` or `Enter` - Opens a sub-menu if there are menu items nested
    * in the currently clicked menu item.
    * - `Arrow Left` or `Escape` - Closes the currently opened sub-menu.
    *
    * when there is `endContent` :
    * - `Arrow Left` or `ArrowRight` - Navigate between the menu item actions and the menu item itself
    * - `Arrow Up` / `Arrow Down` - Navigates up and down the currently visible menu items
    *
    * Note: if the text ditrection is set to Right-to-left (RTL), `Arrow Right` and `Arrow Left` functionality is swapped.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Menu.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.3.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Menu.js", JSImport.Default)
  @js.native
  open class default () extends Menu
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Menu.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Menu.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside a `ui5-menu`.
    *
    * **Note:** Use with `ui5-menu-item` or `ui5-menu-separator`. Implementing the interface does not guarantee that any other classes can work with the `ui5-menu`.
    * @public
    */
  @js.native
  trait IMenuItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var isSeparator: Boolean = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-menu` component represents a hierarchical menu structure.
    *
    * ### Structure
    *
    * The `ui5-menu` can hold two types of entities:
    *
    * - `ui5-menu-item` components
    * - `ui5-menu-separator` - used to separate menu items with a line
    *
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Keyboard Handling
    *
    * The `ui5-menu` provides advanced keyboard handling.
    * The user can use the following keyboard shortcuts in order to navigate trough the tree:
    *
    * - `Arrow Up` / `Arrow Down` - Navigates up and down the menu items that are currently visible.
    * - `Arrow Right`, `Space` or `Enter` - Opens a sub-menu if there are menu items nested
    * in the currently clicked menu item.
    * - `Arrow Left` or `Escape` - Closes the currently opened sub-menu.
    *
    * when there is `endContent` :
    * - `Arrow Left` or `ArrowRight` - Navigate between the menu item actions and the menu item itself
    * - `Arrow Up` / `Arrow Down` - Navigates up and down the currently visible menu items
    *
    * Note: if the text ditrection is set to Right-to-left (RTL), `Arrow Right` and `Arrow Left` functionality is swapped.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Menu.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.3.0
    * @public
    */
  @js.native
  trait Menu
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _afterPopoverClose(): Unit = js.native
    
    def _afterPopoverOpen(): Unit = js.native
    
    def _beforePopoverClose(e: CustomEvent): Unit = js.native
    
    def _beforePopoverOpen(e: CustomEvent): Unit = js.native
    
    def _close(): Unit = js.native
    
    def _closeOtherSubMenus(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Unit = js.native
    
    def _itemClick(e: CustomEvent): Unit = js.native
    
    def _itemKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _itemMouseOver(e: MouseEvent): Unit = js.native
    
    def _menuItems: js.Array[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default] = js.native
    
    def _navigateOutOfEndContent(e: CustomEvent): Unit = js.native
    
    def _openItemSubMenu(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Unit = js.native
    
    def _popover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def _startOpenTimeout(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Unit = js.native
    
    var _timeout: js.UndefOr[Timeout] = js.native
    
    def acessibleNameText: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_Menu: Beforeopen = js.native
    
    /**
      * Defines the header text of the menu (displayed on mobile).
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Determines the horizontal alignment of the menu relative to its opener control.
      * @default "Start"
      * @public
      */
    var horizontalAlign: /* template literal string: ${PopoverHorizontalAlign} */ String = js.native
    
    def isPhone: Boolean = js.native
    
    def isRtl: Boolean = js.native
    
    /**
      * Defines the items of this component.
      *
      * **Note:** Use `ui5-menu-item` and `ui5-menu-separator` for their intended design.
      * @public
      */
    var items: js.Array[IMenuItem] = js.native
    
    def labelClose: String = js.native
    
    /**
      * Defines if a loading indicator would be displayed inside the corresponding ui5-menu popover.
      * @default false
      * @public
      * @since 1.13.0
      */
    var loading: Boolean = js.native
    
    /**
      * Defines the delay in milliseconds, after which the loading indicator will be displayed inside the corresponding ui5-menu popover.
      * @default 1000
      * @public
      * @since 1.13.0
      */
    var loadingDelay: Double = js.native
    
    /**
      * Indicates if the menu is open.
      * @public
      * @default false
      * @since 1.10.0
      */
    var open: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element at which the menu is shown.
      * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
      * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
      * @public
      * @default undefined
      * @since 1.10.0
      */
    var opener: js.UndefOr[HTMLElement | String] = js.native
  }
  
  trait MenuBeforeCloseEventDetail extends StObject {
    
    var escPressed: Boolean
  }
  object MenuBeforeCloseEventDetail {
    
    inline def apply(escPressed: Boolean): MenuBeforeCloseEventDetail = {
      val __obj = js.Dynamic.literal(escPressed = escPressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuBeforeCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuBeforeCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait MenuBeforeOpenEventDetail extends StObject {
    
    var item: js.UndefOr[io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default] = js.undefined
  }
  object MenuBeforeOpenEventDetail {
    
    inline def apply(): MenuBeforeOpenEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBeforeOpenEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuBeforeOpenEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  trait MenuItemClickEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default
    
    var text: String
  }
  object MenuItemClickEventDetail {
    
    inline def apply(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default, text: String): MenuItemClickEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
