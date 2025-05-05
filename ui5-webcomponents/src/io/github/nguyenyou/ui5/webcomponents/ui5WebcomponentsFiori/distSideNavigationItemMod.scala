package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalajs.dom.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationItemMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * Represents a navigation action. It can provide sub items.
    * The `ui5-side-navigation-item` is used within `ui5-side-navigation` or `ui5-side-navigation-group` only.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationItem.js";`
    *
    * @constructor
    * @extends SideNavigationSelectableItemBase
    * @abstract
    * @public
    * @since 1.0.0-rc.8
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationItem", JSImport.Default)
  @js.native
  open class default () extends SideNavigationItem
  
  inline def isInstanceOfSideNavigationItem(`object`: Any): /* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationItem.SideNavigationItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfSideNavigationItem")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationItem.SideNavigationItem */ Boolean]
  
  /**
    * @class
    *
    * ### Overview
    *
    * Represents a navigation action. It can provide sub items.
    * The `ui5-side-navigation-item` is used within `ui5-side-navigation` or `ui5-side-navigation-group` only.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents-fiori/dist/SideNavigationItem.js";`
    *
    * @constructor
    * @extends SideNavigationSelectableItemBase
    * @abstract
    * @public
    * @since 1.0.0-rc.8
    */
  @js.native
  trait SideNavigationItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default {
    
    def _ariaChecked: js.UndefOr[Boolean] = js.native
    
    def _ariaHasPopup: js.UndefOr[AriaHasPopup] = js.native
    
    def _expanded: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines if the item should be collapsible or not.
      * It is true, for example, for the items inside the Popover of the Side Navigation
      * @private
      * @default false
      * @since 1.10.0
      */
    var _fixed: Boolean = js.native
    
    def _groupId: js.UndefOr[String] = js.native
    
    def _onToggleClick(e: CustomEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onmouseenter(): Unit = js.native
    
    def _onmouseleave(): Unit = js.native
    
    def _toggle(): Unit = js.native
    
    def allItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    /**
      * Defines if the item is expanded
      *
      * @public
      * @default false
      */
    var expanded: Boolean = js.native
    
    def focusableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    def isSideNavigationItem: Boolean = js.native
    
    /**
      * Defines nested items by passing `ui5-side-navigation-sub-item` to the default slot.
      *
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSubItemMod.default
      ] = js.native
    
    def overflowItems: js.Array[SideNavigationItem] = js.native
    
    def selectableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationSelectableItemBaseMod.default
      ] = js.native
  }
}
