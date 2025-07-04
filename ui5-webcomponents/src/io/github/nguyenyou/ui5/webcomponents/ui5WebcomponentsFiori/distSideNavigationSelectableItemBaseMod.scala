package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.menuitem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.menuitemradio
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.page
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.ui5WebcomponentsFioriStrings.treeitem
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSideNavigationSelectableItemBaseMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationSelectableItemBase.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fired when the component is activated either with a click/tap or by using the [Enter] or [Space] keys.
    *
    * @public
    * @param {boolean} altKey Returns whether the "ALT" key was pressed when the event was triggered.
    * @param {boolean} ctrlKey Returns whether the "CTRL" key was pressed when the event was triggered.
    * @param {boolean} metaKey Returns whether the "META" key was pressed when the event was triggered.
    * @param {boolean} shiftKey Returns whether the "SHIFT" key was pressed when the event was triggered.
    */
  @JSImport("@ui5/webcomponents-fiori/dist/SideNavigationSelectableItemBase.js", JSImport.Default)
  @js.native
  open class default () extends SideNavigationSelectableItemBase
  
  inline def isInstanceOfSideNavigationSelectableItemBase(`object`: Any): /* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationSelectableItemBase.SideNavigationSelectableItemBase */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfSideNavigationSelectableItemBase")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents-fiori.@ui5/webcomponents-fiori/dist/SideNavigationSelectableItemBase.SideNavigationSelectableItemBase */ Boolean]
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'hasPopup'> */
  trait SideNavigationItemAccessibilityAttributes extends StObject {
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object SideNavigationItemAccessibilityAttributes {
    
    inline def apply(): SideNavigationItemAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SideNavigationItemAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SideNavigationItemAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  /**
    * Fired when the component is activated either with a click/tap or by using the [Enter] or [Space] keys.
    *
    * @public
    * @param {boolean} altKey Returns whether the "ALT" key was pressed when the event was triggered.
    * @param {boolean} ctrlKey Returns whether the "CTRL" key was pressed when the event was triggered.
    * @param {boolean} metaKey Returns whether the "META" key was pressed when the event was triggered.
    * @param {boolean} shiftKey Returns whether the "SHIFT" key was pressed when the event was triggered.
    */
  @js.native
  trait SideNavigationSelectableItemBase
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default {
    
    def _activate(e: KeyboardEvent): Unit = js.native
    def _activate(e: MouseEvent): Unit = js.native
    
    def _ariaCurrent: js.UndefOr[page] = js.native
    
    def _href: js.UndefOr[String] = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _selected: Boolean = js.native
    
    def _target: js.UndefOr[String] = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following fields are supported:
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button.
      * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
      *
      * **Note:** Do not use it on parent items, as it will be overridden if the item is in the overflow menu.
      *
      * @public
      * @default {}
      * @since 2.7.0
      */
    var accessibilityAttributes: SideNavigationItemAccessibilityAttributes = js.native
    
    def ariaRole: menuitem | menuitemradio | treeitem = js.native
    
    /**
      * Reference to the original side navigation item that opened the popover.
      *
      * @private
      */
    var associatedItem: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distSideNavigationItemBaseMod.default
      ] = js.native
    
    /**
      * Item design.
      *
      * **Note:** Items with "Action" design must not have sub-items.
      *
      * @public
      * @default "Default"
      * @since 2.7.0
      */
    var design: /* template literal string: ${SideNavigationItemDesign} */ String = js.native
    
    /**
      * Defines the link target URI. Supports standard hyperlink behavior.
      * If a JavaScript action should be triggered,
      * this should not be set, but instead an event handler
      * for the `click` event should be registered.
      *
      * @public
      * @default undefined
      * @since 1.19.0
      */
    var href: js.UndefOr[String] = js.native
    
    /**
      * Defines the icon of the item.
      *
      * The SAP-icons font provides numerous options.
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @public
      * @default undefined
      */
    var icon: js.UndefOr[String] = js.native
    
    def isExternalLink: js.UndefOr[Boolean | _empty] = js.native
    
    /**
      * @private
      * @default false
      */
    var isOverflow: Boolean = js.native
    
    def isSelectable: Boolean = js.native
    
    def isSideNavigationSelectableItemBase: Boolean = js.native
    
    /**
      * Defines whether the item is selected.
      *
      * **Note:** Items that have a set `href` and `target` set to `_blank` should not be selectable.
      *
      * @public
      * @default false
      */
    var selected: Boolean = js.native
    
    /**
      * Defines the component target.
      *
      * Possible values:
      *
      * - `_self`
      * - `_top`
      * - `_blank`
      * - `_parent`
      * - `framename`
      *
      * **Note:** Items that have a defined `href` and `target`
      * attribute set to `_blank` should not be selectable.
      *
      * @public
      * @default undefined
      * @since 1.19.0
      */
    var target: js.UndefOr[String] = js.native
    
    /**
      * Indicates whether the navigation item is selectable. By default, all items are selectable unless specifically marked as unselectable.
      *
      * When a parent item is marked as unselectable, selecting it will only expand or collapse its sub-items.
      * To improve user experience do not mix unselectable parent items with selectable parent items in a single side navigation.
      *
      *
      * **Guidelines**:
      * - Items with an assigned `href` and a target of `_blank` should be marked as unselectable.
      * - Items that trigger actions (with design "Action") should be marked as unselectable.
      *
      * @public
      * @default false
      * @since 2.7.0
      */
    var unselectable: Boolean = js.native
  }
}
