package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Click
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarColorSchemeMod.AvatarColorScheme
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distTypesAvatarSizeMod.AvatarSize
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.button
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.img
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLObjectElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAvatarMod {
  
  /**
    * @class
    * ### Overview
    *
    * An image-like component that has different display options for representing images and icons
    * in different shapes and sizes, depending on the use case.
    *
    * The shape can be circular or square. There are several predefined sizes, as well as an option to
    * set a custom size.
    *
    * ### Keyboard Handling
    *
    * - [Space] / [Enter] or [Return] - Fires the `click` event if the `interactive` property is set to true.
    * - [Shift] - If [Space] is pressed, pressing [Shift] releases the component without triggering the click event.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Avatar.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @implements {IAvatarGroupItem}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Avatar.js", JSImport.Default)
  @js.native
  open class default () extends Avatar
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Avatar.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Avatar.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    * ### Overview
    *
    * An image-like component that has different display options for representing images and icons
    * in different shapes and sizes, depending on the use case.
    *
    * The shape can be circular or square. There are several predefined sizes, as well as an option to
    * set a custom size.
    *
    * ### Keyboard Handling
    *
    * - [Space] / [Enter] or [Return] - Fires the `click` event if the `interactive` property is set to true.
    * - [Shift] - If [Space] is pressed, pressing [Shift] releases the component without triggering the click event.
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Avatar.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @implements {IAvatarGroupItem}
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.std.EventTarget because Already inherited
  - scala.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Node because Already inherited
  - scala.AnyRef because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Slottable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.NonDocumentTypeChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ChildNode because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Animatable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ARIAMixin because Already inherited
  - js.Any because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLOrSVGElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.GlobalEventHandlers because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementContentEditable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.ElementCSSInlineStyle because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.Element because Already inherited
  - js.Object because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distAvatarGroupMod.IAvatarGroupItem because var conflicts: accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, hidden, id, inert, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined effectiveBackgroundColor, size, effectiveSize, interactive */ @js.native
  trait Avatar
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaHasPopup: js.UndefOr[AriaHasPopup] = js.native
    
    def _checkInitials(): Unit = js.native
    
    /**
      * @private
      */
    var _colorScheme: /* template literal string: ${AvatarColorScheme} */ String = js.native
    
    def _fireClick(): Unit = js.native
    
    def _getAriaHasPopup(): js.UndefOr[AriaHasPopup] = js.native
    
    def _handleResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeBound")
    var _handleResizeBound_Original: ResizeObserverCallback = js.native
    
    /**
      * @private
      */
    var _hasImage: Boolean = js.native
    
    def _interactive: Boolean = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _role: button | img = js.native
    
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
    var accessibilityAttributes: AvatarAccessibilityAttributes = js.native
    
    /**
      * Defines the text alternative of the component.
      * If not provided a default text alternative will be set, if present.
      * @default undefined
      * @public
      * @since 1.0.0-rc.7
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def accessibleNameText: String = js.native
    
    /**
      * Defines the optional badge that will be used for visual affordance.
      *
      * **Note:** While the slot allows for custom badges, to achieve
      * the Fiori design, you can use the `ui5-tag` with `ui5-icon`
      * in the corresponding `icon` slot, without text nodes.
      * @public
      * @since 1.7.0
      */
    var badge: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the background color of the desired image.
      * If `colorScheme` is set to `Auto`, the avatar will be displayed with the `Accent6` color.
      *
      * @default "Auto"
      * @public
      */
    var colorScheme: /* template literal string: ${AvatarColorScheme} */ String = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    /**
      * Returns the effective background color.
      * @default "Auto"
      * @private
      */
    def effectiveBackgroundColor: AvatarColorScheme = js.native
    @JSName("effectiveBackgroundColor")
    var effectiveBackgroundColor_FAvatar: AvatarColorScheme = js.native
    
    /**
      * Returns the effective avatar size.
      * @default "S"
      * @private
      */
    def effectiveSize: AvatarSize = js.native
    @JSName("effectiveSize")
    var effectiveSize_FAvatar: AvatarSize = js.native
    
    @JSName("eventDetails")
    var eventDetails_Avatar: Click = js.native
    
    def fallBackIconDomRef: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distIconMod.default | Null = js.native
    
    /**
      * Defines the name of the fallback icon, which should be displayed in the following cases:
      *
      * 	- If the initials are not valid (more than 3 letters, unsupported languages or empty initials).
      * 	- If there are three initials and they do not fit in the shape (e.g. WWW for some of the sizes).
      * 	- If the image src is wrong.
      *
      * **Note:** If not set, a default fallback icon "employee" is displayed.
      *
      * **Note:** You should import the desired icon first, then use its name as "fallback-icon".
      *
      * `import "@ui5/webcomponents-icons/dist/{icon_name}.js"`
      *
      * `<ui5-avatar fallback-icon="alert">`
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default "employee"
      * @public
      */
    var fallbackIcon: String = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    def handleResize(): Unit = js.native
    
    def hasImage: Boolean = js.native
    
    /**
      * Defines the name of the UI5 Icon, that will be displayed.
      *
      * **Note:** If `image` slot is provided, the property will be ignored.
      *
      * **Note:** You should import the desired icon first, then use its name as "icon".
      *
      * `import "@ui5/webcomponents-icons/dist/{icon_name}.js"`
      *
      * `<ui5-avatar icon="employee">`
      *
      * **Note:** If no icon or an empty one is provided, by default the "employee" icon should be displayed.
      *
      * See all the available icons in the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Receives the desired `<img>` tag
      *
      * **Note:** If you experience flickering of the provided image, you can hide the component until it is defined with the following CSS:<br/>
      * `ui5-avatar:not(:defined) {`<br/>
      * &nbsp;&nbsp;&nbsp;&nbsp;`visibility: hidden;`<br/>
      * `}`
      * @public
      * @since 1.0.0-rc.15
      */
    var image: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the displayed initials.
      *
      * Up to three Latin letters can be displayed as initials.
      * @default undefined
      * @public
      */
    var initials: js.UndefOr[String] = js.native
    
    def initialsContainer: HTMLObjectElement | Null = js.native
    
    /**
      * Defines if the avatar is interactive (focusable and pressable).
      *
      * **Note:** This property won't have effect if the `disabled`
      * property is set to `true`.
      * @default false
      * @public
      */
    var interactive: Boolean = js.native
    
    /**
      * Defines the shape of the component.
      * @default "Circle"
      * @public
      */
    var shape: /* template literal string: ${AvatarShape} */ String = js.native
    
    def showFallbackIcon(): Unit = js.native
    
    def showInitials(): Unit = js.native
    
    /**
      * Defines predefined size of the component.
      * @default "S"
      * @public
      */
    var size: /* template literal string: ${AvatarSize} */ String = js.native
    
    def tabindex: js.UndefOr[Double] = js.native
    
    def validInitials: js.UndefOr[String | Null] = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base/dist/types.AccessibilityAttributes, 'hasPopup'> */
  trait AvatarAccessibilityAttributes extends StObject {
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object AvatarAccessibilityAttributes {
    
    inline def apply(): AvatarAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
}
