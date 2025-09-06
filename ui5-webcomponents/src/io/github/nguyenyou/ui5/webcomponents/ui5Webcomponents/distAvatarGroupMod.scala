package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.HasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Overflow
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.IButton
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarColorSchemeMod.AvatarColorScheme
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`-1`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.L
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.M
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.S
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.XL
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.XS
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.group
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAvatarGroupMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Displays a group of avatars arranged horizontally. It is useful to visually
    * showcase a group of related avatars, such as, project team members or employees.
    *
    * The component allows you to display the avatars in different sizes,
    * depending on your use case.
    *
    * The `AvatarGroup` component has two group types:
    *
    * - `Group` type: The avatars are displayed as partially overlapped on
    * top of each other and the entire group has one click/tap area.
    * - `Individual` type: The avatars are displayed side-by-side and each
    * avatar has its own click/tap area.
    *
    * ### Usage
    *
    * Use the `AvatarGroup` if:
    *
    * - You want to display a group of avatars.
    * - You want to display several avatars which have something in common.
    *
    * Do not use the `AvatarGroup` if:
    *
    * - You want to display a single avatar.
    * - You want to display a gallery for simple images.
    * - You want to use it for other visual content than avatars.
    *
    * ### Responsive Behavior
    *
    * When the available space is less than the width required to display all avatars,
    * an overflow visualization appears as a button placed at the end with the same shape
    * and size as the avatars. The visualization displays the number of avatars that have overflowed
    * and are not currently visible.
    *
    * ### Keyboard Handling
    * The component provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * `type` Individual:
    *
    * - [Tab] - Move focus to the overflow button
    * - [Left] - Navigate one avatar to the left
    * - [Right] - Navigate one avatar to the right
    * - [Home] - Navigate to the first avatar
    * - [End] - Navigate to the last avatar
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    *
    * `type` Group:
    *
    * - [Tab] - Move focus to the next interactive element after the component
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.11
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/AvatarGroup.js", JSImport.Default)
  @js.native
  open class default () extends AvatarGroup
  object default {
    
    @JSImport("@ui5/webcomponents/dist/AvatarGroup.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/AvatarGroup.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Displays a group of avatars arranged horizontally. It is useful to visually
    * showcase a group of related avatars, such as, project team members or employees.
    *
    * The component allows you to display the avatars in different sizes,
    * depending on your use case.
    *
    * The `AvatarGroup` component has two group types:
    *
    * - `Group` type: The avatars are displayed as partially overlapped on
    * top of each other and the entire group has one click/tap area.
    * - `Individual` type: The avatars are displayed side-by-side and each
    * avatar has its own click/tap area.
    *
    * ### Usage
    *
    * Use the `AvatarGroup` if:
    *
    * - You want to display a group of avatars.
    * - You want to display several avatars which have something in common.
    *
    * Do not use the `AvatarGroup` if:
    *
    * - You want to display a single avatar.
    * - You want to display a gallery for simple images.
    * - You want to use it for other visual content than avatars.
    *
    * ### Responsive Behavior
    *
    * When the available space is less than the width required to display all avatars,
    * an overflow visualization appears as a button placed at the end with the same shape
    * and size as the avatars. The visualization displays the number of avatars that have overflowed
    * and are not currently visible.
    *
    * ### Keyboard Handling
    * The component provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * `type` Individual:
    *
    * - [Tab] - Move focus to the overflow button
    * - [Left] - Navigate one avatar to the left
    * - [Right] - Navigate one avatar to the right
    * - [Home] - Navigate to the first avatar
    * - [End] - Navigate to the last avatar
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    *
    * `type` Group:
    *
    * - [Tab] - Move focus to the next interactive element after the component
    * - [Space] / [Enter] or [Return] - Trigger `ui5-click` event
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.11
    * @public
    */
  @js.native
  trait AvatarGroup
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelText: js.UndefOr[String] = js.native
    
    var _colorIndex: Double = js.native
    
    def _containerAriaHasPopup: js.UndefOr[AriaHasPopup] = js.native
    
    def _customOverflowButton: js.UndefOr[IButton] = js.native
    
    def _fireGroupEvent(targetRef: HTMLElement): Unit = js.native
    
    def _getAriaHasPopup(): js.UndefOr[AriaHasPopup] = js.native
    
    def _getNextBackgroundColor(): Double = js.native
    
    /**
      * Returns the total width to item excluding the item width
      * RTL/LTR aware
      * @private
      * @param item
      */
    def _getWidthToItem(item: HTMLElement): Double = js.native
    
    def _groupTabIndex: `0` | `-1` = js.native
    
    var _hiddenItems: Double = js.native
    
    def _hiddenStartIndex: Double = js.native
    
    def _isGroup: Boolean = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _itemsCount: Double = js.native
    
    def _onClick(e: MouseEvent): Unit = js.native
    
    def _onResize(): Unit = js.native
    
    def _onResizeHandler(): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _overflowBtnHidden: Boolean = js.native
    
    def _overflowButton: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    def _overflowButtonAccAttributes: HasPopup = js.native
    
    def _overflowButtonAriaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Return the effective overflow button width
      * Differences are that when in "Group" type the button is offset and overlaps the avatars
      *
      * 1) In case of "Group", (LTR/RTL aware) button width is qual to second item offset left/right
      * 2) In case of "Individual" group type width is directly taken from button element
      * @private
      */
    def _overflowButtonEffectiveWidth: Double = js.native
    
    /**
      * @private
      */
    var _overflowButtonText: js.UndefOr[String] = js.native
    
    /**
      * Overflows items that were not able to fit the container
      * @private
      */
    def _overflowItems(): Unit = js.native
    
    /**
      * Modifies avatars to the needs of avatar group properties. Respects already set size and background color.
      * Set the margins (offsets) based on RTL/LTR.
      * @private
      */
    def _prepareAvatars(): Unit = js.native
    
    def _role: button | group = js.native
    
    def _setHiddenItems(hiddenItems: Double): Unit = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following field is supported:
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button.
      * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
      *
      * @public
      * @since 2.0.0
      * @default {}
      */
    var accessibilityAttributes: AvatarGroupAccessibilityAttributes = js.native
    
    /**
      * Defines the accessible name of the AvatarGroup.
      * When provided, this will override the default aria-label text.
      * @default undefined
      * @public
      * @since 2.12.0
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(s) of the elements that describe the AvatarGroup.
      * When provided, this will be used as aria-labelledby instead of aria-label.
      * @default undefined
      * @public
      * @since 2.12.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Returns an array containing the `AvatarColorScheme` values that correspond to the avatars in the component.
      * @default []
      * @public
      */
    def colorScheme: js.Array[AvatarColorScheme] = js.native
    
    @JSName("eventDetails")
    var eventDetails_AvatarGroup: Overflow = js.native
    
    def firstAvatarSize: S | L | M | XS | XL = js.native
    
    /**
      * Returns an array containing the `ui5-avatar` instances that are currently not displayed due to lack of space.
      * @default []
      * @public
      */
    def hiddenItems: js.Array[IAvatarGroupItem] = js.native
    
    /**
      * Defines the items of the component. Use the `ui5-avatar` component as an item.
      *
      * **Note:** The UX guidelines recommends using avatars with "Circle" shape.
      *
      * Moreover, if you use avatars with "Square" shape, there will be visual inconsistency
      * as the built-in overflow action has "Circle" shape.
      * @public
      */
    var items: js.Array[IAvatarGroupItem] = js.native
    
    def onAvatarClick(e: MouseEvent): Unit = js.native
    
    def onAvatarUI5Click(e: MouseEvent): Unit = js.native
    
    @JSName("onOverflowButtonClick")
    def onOverflowButtonClick_click(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default, 
          click
        ]
    ): Unit = js.native
    
    /**
      * Defines the overflow button of the component.
      *
      * **Note:** We recommend using the `ui5-button` component.
      *
      * **Note:** If this slot is not used, the component will display the built-in overflow button.
      * @public
      * @since 1.0.0-rc.13
      */
    var overflowButton: js.Array[IButton] = js.native
    
    /**
      * Defines the mode of the `AvatarGroup`.
      * @default "Group"
      * @public
      */
    var `type`: /* template literal string: ${AvatarGroupType} */ String = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'hasPopup'> */
  trait AvatarGroupAccessibilityAttributes extends StObject {
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object AvatarGroupAccessibilityAttributes {
    
    inline def apply(): AvatarGroupAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarGroupAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  trait AvatarGroupClickEventDetail extends StObject {
    
    var overflowButtonClicked: Boolean
    
    var targetRef: HTMLElement
  }
  object AvatarGroupClickEventDetail {
    
    inline def apply(overflowButtonClicked: Boolean, targetRef: HTMLElement): AvatarGroupClickEventDetail = {
      val __obj = js.Dynamic.literal(overflowButtonClicked = overflowButtonClicked.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarGroupClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setOverflowButtonClicked(value: Boolean): Self = StObject.set(x, "overflowButtonClicked", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for components that represent an avatar and may be slotted in numerous higher-order components such as `ui5-avatar-group`
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IAvatarGroupItem
    extends StObject
       with io.github.nguyenyou.ui5.webcomponents.std.HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var effectiveBackgroundColor: AvatarColorScheme = js.native
    
    var effectiveSize: AvatarSize = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var interactive: Boolean = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var size: /* template literal string: ${AvatarSize} */ String = js.native
  }
}
