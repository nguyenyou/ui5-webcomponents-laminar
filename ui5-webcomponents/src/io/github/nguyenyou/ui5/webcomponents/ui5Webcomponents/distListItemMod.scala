package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Detailclick
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Focused
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.IButton
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.DragEvent
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLLIElement
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distListItemMod {
  
  /**
    * @class
    * A class to serve as a base
    * for the `ListItemStandard` and `ListItemCustom` classes.
    * @constructor
    * @abstract
    * @extends ListItemBase
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/ListItem", JSImport.Default)
  @js.native
  open class default () extends ListItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ListItem", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait AccInfo extends StObject {
    
    var ariaChecked: js.UndefOr[Boolean] = js.undefined
    
    var ariaExpanded: js.UndefOr[Boolean] = js.undefined
    
    var ariaHaspopup: js.UndefOr[/* template literal string: ${AriaHasPopup} */ String] = js.undefined
    
    var ariaKeyShortcuts: js.UndefOr[String] = js.undefined
    
    var ariaLabel: String
    
    var ariaLabelRadioButton: String
    
    var ariaLevel: js.UndefOr[Double] = js.undefined
    
    var ariaOwns: js.UndefOr[String] = js.undefined
    
    var ariaSelected: js.UndefOr[Boolean] = js.undefined
    
    var ariaSelectedText: js.UndefOr[String] = js.undefined
    
    var listItemAriaLabel: js.UndefOr[String] = js.undefined
    
    var posinset: js.UndefOr[Double] = js.undefined
    
    var role: js.UndefOr[AriaRole] = js.undefined
    
    var setsize: js.UndefOr[Double] = js.undefined
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object AccInfo {
    
    inline def apply(ariaLabel: String, ariaLabelRadioButton: String): AccInfo = {
      val __obj = js.Dynamic.literal(ariaLabel = ariaLabel.asInstanceOf[js.Any], ariaLabelRadioButton = ariaLabelRadioButton.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccInfo] (val x: Self) extends AnyVal {
      
      inline def setAriaChecked(value: Boolean): Self = StObject.set(x, "ariaChecked", value.asInstanceOf[js.Any])
      
      inline def setAriaCheckedUndefined: Self = StObject.set(x, "ariaChecked", js.undefined)
      
      inline def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
      
      inline def setAriaExpandedUndefined: Self = StObject.set(x, "ariaExpanded", js.undefined)
      
      inline def setAriaHaspopup(value: /* template literal string: ${AriaHasPopup} */ String): Self = StObject.set(x, "ariaHaspopup", value.asInstanceOf[js.Any])
      
      inline def setAriaHaspopupUndefined: Self = StObject.set(x, "ariaHaspopup", js.undefined)
      
      inline def setAriaKeyShortcuts(value: String): Self = StObject.set(x, "ariaKeyShortcuts", value.asInstanceOf[js.Any])
      
      inline def setAriaKeyShortcutsUndefined: Self = StObject.set(x, "ariaKeyShortcuts", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelRadioButton(value: String): Self = StObject.set(x, "ariaLabelRadioButton", value.asInstanceOf[js.Any])
      
      inline def setAriaLevel(value: Double): Self = StObject.set(x, "ariaLevel", value.asInstanceOf[js.Any])
      
      inline def setAriaLevelUndefined: Self = StObject.set(x, "ariaLevel", js.undefined)
      
      inline def setAriaOwns(value: String): Self = StObject.set(x, "ariaOwns", value.asInstanceOf[js.Any])
      
      inline def setAriaOwnsUndefined: Self = StObject.set(x, "ariaOwns", js.undefined)
      
      inline def setAriaSelected(value: Boolean): Self = StObject.set(x, "ariaSelected", value.asInstanceOf[js.Any])
      
      inline def setAriaSelectedText(value: String): Self = StObject.set(x, "ariaSelectedText", value.asInstanceOf[js.Any])
      
      inline def setAriaSelectedTextUndefined: Self = StObject.set(x, "ariaSelectedText", js.undefined)
      
      inline def setAriaSelectedUndefined: Self = StObject.set(x, "ariaSelected", js.undefined)
      
      inline def setListItemAriaLabel(value: String): Self = StObject.set(x, "listItemAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setListItemAriaLabelUndefined: Self = StObject.set(x, "listItemAriaLabel", js.undefined)
      
      inline def setPosinset(value: Double): Self = StObject.set(x, "posinset", value.asInstanceOf[js.Any])
      
      inline def setPosinsetUndefined: Self = StObject.set(x, "posinset", js.undefined)
      
      inline def setRole(value: AriaRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setSetsize(value: Double): Self = StObject.set(x, "setsize", value.asInstanceOf[js.Any])
      
      inline def setSetsizeUndefined: Self = StObject.set(x, "setsize", js.undefined)
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait IAccessibleListItem extends StObject {
    
    var accessibleName: js.UndefOr[String] = js.undefined
    
    var accessibleNameRef: js.UndefOr[String] = js.undefined
  }
  object IAccessibleListItem {
    
    inline def apply(): IAccessibleListItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAccessibleListItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IAccessibleListItem] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameRef(value: String): Self = StObject.set(x, "accessibleNameRef", value.asInstanceOf[js.Any])
      
      inline def setAccessibleNameRefUndefined: Self = StObject.set(x, "accessibleNameRef", js.undefined)
      
      inline def setAccessibleNameUndefined: Self = StObject.set(x, "accessibleName", js.undefined)
    }
  }
  
  /**
    * @class
    * A class to serve as a base
    * for the `ListItemStandard` and `ListItemCustom` classes.
    * @constructor
    * @abstract
    * @extends ListItemBase
    * @public
    */
  @js.native
  trait ListItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    def _accInfo: AccInfo = js.native
    
    def _accessibleNameRef: String = js.native
    
    def _ariaSelected: js.UndefOr[Boolean] = js.native
    
    var _forcedAccessibleRole: js.UndefOr[String] = js.native
    
    def _hasHighlightColor: Boolean = js.native
    
    def _isTargetSelfFocusDomRef(e: KeyboardEvent): Boolean = js.native
    
    def _listItem: HTMLLIElement | Null = js.native
    
    def _ondragend(e: DragEvent): Unit = js.native
    
    def _ondragstart(e: DragEvent): Unit = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    def _ontouchend(): Unit = js.native
    
    var _selectionMode: /* template literal string: ${ListSelectionMode} */ String = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following fields are supported:
      *
      * - **ariaSetsize**: Defines the number of items in the current set  when not all items in the set are present in the DOM.
      * **Note:** The value is an integer reflecting the number of items in the complete set. If the size of the entire set is unknown, set `-1`.
      *
      * 	- **ariaPosinset**: Defines an element's number or position in the current set when not all items are present in the DOM.
      * 	**Note:** The value is an integer greater than or equal to 1, and less than or equal to the size of the set when that size is known.
      *
      * @default {}
      * @public
      * @since 1.15.0
      */
    var accessibilityAttributes: ListItemAccessibilityAttributes = js.native
    
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Used to define the role of the list item.
      * @private
      * @default "ListItem"
      * @since 1.3.0
      *
      */
    var accessibleRole: /* template literal string: ${ListItemAccessibleRole} */ String = js.native
    
    def activate(): Unit = js.native
    
    /**
      * Indicates if the list item is active, e.g pressed down with the mouse or the keyboard keys.
      * @private
      */
    var active: Boolean = js.native
    
    def ariaLabelledByText: String = js.native
    
    def ariaSelectedText: js.UndefOr[String] = js.native
    
    def deactivate(): Unit = js.native
    
    def deactivateByKey(e: KeyboardEvent): Unit = js.native
    
    /**
      * Defines the delete button, displayed in "Delete" mode.
      * **Note:** While the slot allows custom buttons, to match
      * design guidelines, please use the `ui5-button` component.
      * **Note:** When the slot is not present, a built-in delete button will be displayed.
      * @since 1.9.0
      * @public
      */
    var deleteButton: js.Array[IButton] = js.native
    
    def deleteText: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_ListItem: Focused & Detailclick = js.native
    
    def hasDeleteButtonSlot: Boolean = js.native
    
    /**
      * Defines the highlight state of the list items.
      * Available options are: `"None"` (by default), `"Positive"`, `"Critical"`, `"Information"` and `"Negative"`.
      * @default "None"
      * @public
      * @since 1.24
      */
    var highlight: /* template literal string: ${Highlight} */ String = js.native
    
    var indeterminate: js.UndefOr[Boolean] = js.native
    
    def isInactive: Boolean = js.native
    
    def listItemAccessibleRole: js.UndefOr[AriaRole] = js.native
    
    /**
      * Defines the current media query size.
      * @default "S"
      * @private
      */
    var mediaRange: String = js.native
    
    def modeDelete: Boolean = js.native
    
    def modeMultiple: Boolean = js.native
    
    def modeSingleSelect: Boolean = js.native
    
    /**
      * The navigated state of the list item.
      * If set to `true`, a navigation indicator is displayed at the end of the list item.
      * @default false
      * @public
      * @since 1.10.0
      */
    var navigated: Boolean = js.native
    
    def onDelete(): Unit = js.native
    
    def onDetailClick(): Unit = js.native
    
    /**
      * Called when selection components in Single (ui5-radio-button)
      * and Multi (ui5-checkbox) selection modes are used.
      */
    def onMultiSelectionComponentPress(e: CustomEvent): Unit = js.native
    
    def onSingleSelectionComponentPress(e: CustomEvent): Unit = js.native
    
    def placeSelectionElementAfter: Boolean = js.native
    
    def placeSelectionElementBefore: Boolean = js.native
    
    /**
      * Defines the text of the tooltip that would be displayed for the list item.
      * @default undefined
      * @public
      * @since 1.23.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines the visual indication and behavior of the list items.
      * Available options are `Active` (by default), `Inactive`, `Detail` and `Navigation`.
      *
      * **Note:** When set to `Active` or `Navigation`, the item will provide visual response upon press and hover,
      * while with type `Inactive` and `Detail` - will not.
      * @default "Active"
      * @public
      */
    var `type`: /* template literal string: ${ListItemType} */ String = js.native
    
    def typeActive: Boolean = js.native
    
    def typeDetail: Boolean = js.native
    
    def typeNavigation: Boolean = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'hasPopup' | 'ariaSetsize' | 'ariaPosinset'> */
  trait ListItemAccessibilityAttributes extends StObject {
    
    var ariaPosinset: js.UndefOr[Double] = js.undefined
    
    var ariaSetsize: js.UndefOr[Double] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object ListItemAccessibilityAttributes {
    
    inline def apply(): ListItemAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setAriaPosinset(value: Double): Self = StObject.set(x, "ariaPosinset", value.asInstanceOf[js.Any])
      
      inline def setAriaPosinsetUndefined: Self = StObject.set(x, "ariaPosinset", js.undefined)
      
      inline def setAriaSetsize(value: Double): Self = StObject.set(x, "ariaSetsize", value.asInstanceOf[js.Any])
      
      inline def setAriaSetsizeUndefined: Self = StObject.set(x, "ariaSetsize", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  trait SelectionRequestEventDetail extends StObject {
    
    var item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default
    
    var key: js.UndefOr[String] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var selectionComponentPressed: Boolean
  }
  object SelectionRequestEventDetail {
    
    inline def apply(
      item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default,
      selectionComponentPressed: Boolean
    ): SelectionRequestEventDetail = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], selectionComponentPressed = selectionComponentPressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionRequestEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionRequestEventDetail] (val x: Self) extends AnyVal {
      
      inline def setItem(value: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectionComponentPressed(value: Boolean): Self = StObject.set(x, "selectionComponentPressed", value.asInstanceOf[js.Any])
    }
  }
}
