package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Closemenu
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Detailclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distMenuMod.IMenuItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMenuItemMod {
  
  @JSImport("@ui5/webcomponents/dist/MenuItem.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-menu-item` is the item to use inside a `ui5-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Usage
    *
    * `ui5-menu-item` represents a node in a `ui5-menu`. The menu itself is rendered as a list,
    * and each `ui5-menu-item` is represented by a list item in that list. Therefore, you should only use
    * `ui5-menu-item` directly in your apps. The `ui5-li` list item is internal for the list, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MenuItem.js";`
    * @constructor
    * @extends ListItem
    * @implements {IMenuItem}
    * @since 1.3.0
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/MenuItem.js", JSImport.Default)
  @js.native
  open class default () extends MenuItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/MenuItem.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/MenuItem.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  inline def isInstanceOfMenuItem(`object`: Any): /* is @ui5/webcomponents.@ui5/webcomponents/dist/MenuItem.MenuItem */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstanceOfMenuItem")(`object`.asInstanceOf[js.Any]).asInstanceOf[/* is @ui5/webcomponents.@ui5/webcomponents/dist/MenuItem.MenuItem */ Boolean]
  
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
    
    var item: js.UndefOr[MenuItem] = js.undefined
  }
  object MenuBeforeOpenEventDetail {
    
    inline def apply(): MenuBeforeOpenEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuBeforeOpenEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuBeforeOpenEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: MenuItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * `ui5-menu-item` is the item to use inside a `ui5-menu`.
    * An arbitrary hierarchy structure can be represented by recursively nesting menu items.
    *
    * ### Usage
    *
    * `ui5-menu-item` represents a node in a `ui5-menu`. The menu itself is rendered as a list,
    * and each `ui5-menu-item` is represented by a list item in that list. Therefore, you should only use
    * `ui5-menu-item` directly in your apps. The `ui5-li` list item is internal for the list, and not intended for public use.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/MenuItem.js";`
    * @constructor
    * @extends ListItem
    * @implements {IMenuItem}
    * @since 1.3.0
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Slottable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.NonDocumentTypeChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Animatable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - scala.AnyRef because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLOrSVGElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.GlobalEventHandlers because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementContentEditable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementCSSInlineStyle because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Element because Already inherited
  - js.Object because Already inherited
  - js.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLElement because Already inherited
  - js.Object because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.UI5Element because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distUi5elementMod.default because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distMenuMod.IMenuItem because var conflicts: __id, __shouldHydrate, _changedState, _childChangeListeners, _componentStateFinalizedEventProvider, _doNotSyncAttributes, _domRefReadyPromise, _fullyConnected, _getRealDomRef, _inDOM, _individualSlot, _internals, _invalidationEventProvider, _jsxEvents, _jsxProps, _rendered, _slotChangeListeners, _slotsAssignedNodes, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, eventDetails, hidden, id, inert, initializedProperties, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined isSeparator */ @js.native
  trait MenuItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemMod.default {
    
    def _afterPopoverClose(): Unit = js.native
    
    def _afterPopoverOpen(): Unit = js.native
    
    def _beforePopoverClose(e: CustomEvent): Unit = js.native
    
    def _beforePopoverOpen(e: CustomEvent): Unit = js.native
    
    def _close(): Unit = js.native
    
    def _closeAll(): Unit = js.native
    
    def _closeOtherSubMenus(item: MenuItem): Unit = js.native
    
    def _endContentKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _itemKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _itemMouseOver(e: MouseEvent): Unit = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _menuItems: js.Array[MenuItem] = js.native
    
    def _navigableItems: js.Array[HTMLElement] = js.native
    
    def _navigateOutOfEndContent(e: CustomEvent): Unit = js.native
    
    def _navigateToEndContent(shouldNavigateToPreviousItem: Boolean): Unit = js.native
    
    def _popover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    /**
      * Indicates whether any of the element siblings have icon.
      */
    var _siblingsWithIcon: Boolean = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following fields are supported:
      *
      * - **ariaKeyShortcuts**: Indicated the availability of a keyboard shortcuts defined for the menu item.
      *
      * - **role**: Defines the role of the menu item. If not set, menu item will have default role="menuitem".
      *
      * @public
      * @since 2.1.0
      * @default {}
      */
    @JSName("accessibilityAttributes")
    var accessibilityAttributes_MenuItem: MenuItemAccessibilityAttributes = js.native
    
    def acessibleNameText: String = js.native
    
    /**
      * Defines the `additionalText`, displayed in the end of the menu item.
      *
      * **Note:** The additional text will not be displayed if there are items added in `items` slot or there are
      * components added to `endContent` slot.
      *
      * The priority of what will be displayed at the end of the menu item is as follows:
      * sub-menu arrow (if there are items added in `items` slot) -> components added in `endContent` -> text set to `additionalText`.
      * @default undefined
      * @public
      * @since 1.8.0
      */
    var additionalText: js.UndefOr[String] = js.native
    
    /**
      * Defines the components that should be displayed at the end of the menu item.
      *
      * **Note:** It is highly recommended to slot only components of type `ui5-button`,`ui5-link`
      * or `ui5-icon` in order to preserve the intended design. If there are components added to this slot,
      * and there is text set in `additionalText`, it will not be displayed. If there are items added to `items` slot,
      * nether `additionalText` nor components added to this slot would be displayed.
      *
      * The priority of what will be displayed at the end of the menu item is as follows:
      * sub-menu arrow (if there are items added in `items` slot) -> components added in `endContent` -> text set to `additionalText`.
      * @public
      * @since 2.0.0
      */
    var endContent: js.Array[HTMLElement] = js.native
    
    @JSName("eventDetails")
    var eventDetails_MenuItem: (/* import warning: importer.ImportType#apply Failed type conversion: @ui5/webcomponents.@ui5/webcomponents/dist/ListItemBase.default['eventDetails'] */ js.Any) & Detailclick & Closemenu = js.native
    
    def hasEndContent: Boolean = js.native
    
    def hasIcon: Boolean = js.native
    
    def hasSubmenu: Boolean = js.native
    
    /**
      * Defines the icon to be displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      *
      * **Example:**
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    def isMenuItem: Boolean = js.native
    
    def isPhone: Boolean = js.native
    
    def isRtl: Boolean = js.native
    
    def isSeparator: Boolean = js.native
    @JSName("isSeparator")
    var isSeparator_FMenuItem: Boolean = js.native
    
    def isSubMenuOpen: Boolean = js.native
    
    /**
      * Defines the items of this component.
      *
      * **Note:** The slot can hold `ui5-menu-item` and `ui5-menu-separator` items.
      *
      * If there are items added to this slot, an arrow will be displayed at the end
      * of the item in order to indicate that there are items added. In that case components added
      * to `endContent` slot or `additionalText` content will not be displayed.
      *
      * The priority of what will be displayed at the end of the menu item is as follows:
      * sub-menu arrow (if there are items added in `items` slot) -> components added in `endContent` -> text set to `additionalText`.
      * @public
      */
    var items: js.Array[IMenuItem] = js.native
    
    def labelBack: String = js.native
    
    def labelClose: String = js.native
    
    /**
      * Defines the delay in milliseconds, after which the loading indicator will be displayed inside the corresponding ui5-menu popover.
      *
      * **Note:** If set to `true` a `ui5-busy-indicator` component will be displayed into the related one to the current `ui5-menu-item` sub-menu popover.
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
    
    def menuHeaderTextPhone: js.UndefOr[String] = js.native
    
    def placement: /* template literal string: ${PopoverPlacement} */ String = js.native
    
    /**
      * Defines the text of the tree item.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'ariaKeyShortcuts' | 'role'> & @ui5/webcomponents.@ui5/webcomponents/dist/ListItem.ListItemAccessibilityAttributes */
  trait MenuItemAccessibilityAttributes extends StObject {
    
    var ariaKeyShortcuts: js.UndefOr[String] = js.undefined
    
    var ariaPosinset: js.UndefOr[Double] = js.undefined
    
    var ariaSetsize: js.UndefOr[Double] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
  }
  object MenuItemAccessibilityAttributes {
    
    inline def apply(): MenuItemAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
      
      inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
      
      inline def setAriaPosinset(value: Double): Self = StObject.set(x, "ariaPosinset", value.asInstanceOf[js.Any])
      
      inline def setAriaPosinsetUndefined: Self = StObject.set(x, "ariaPosinset", js.undefined)
      
      inline def setAriaSetsize(value: Double): Self = StObject.set(x, "ariaSetsize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetsizeUndefined: Self = StObject.set(x, "ariaSetsize", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
  
  trait MenuNavigateOutOfEndContentEventDetail extends StObject {
    
    var shouldNavigateToNextItem: Boolean
  }
  object MenuNavigateOutOfEndContentEventDetail {
    
    inline def apply(shouldNavigateToNextItem: Boolean): MenuNavigateOutOfEndContentEventDetail = {
      val __obj = js.Dynamic.literal(shouldNavigateToNextItem = shouldNavigateToNextItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuNavigateOutOfEndContentEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuNavigateOutOfEndContentEventDetail] (val x: Self) extends AnyVal {
      
      inline def setShouldNavigateToNextItem(value: Boolean): Self = StObject.set(x, "shouldNavigateToNextItem", value.asInstanceOf[js.Any])
    }
  }
}
