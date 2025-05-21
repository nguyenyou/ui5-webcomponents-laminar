package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.HTMLElement
import io.github.nguyenyou.ui5.webcomponents.std.Record
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Activestatechange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.ColorPaletteNavigationItem
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.I18nText
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaHasPopup
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.AriaRole
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distTypesMod.LowercaseString
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import org.scalajs.dom.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-button` component represents a simple push button.
    * It enables users to trigger actions by clicking or tapping the `ui5-button`, or by pressing
    * certain keyboard keys, such as Enter.
    *
    * ### Usage
    *
    * For the `ui5-button` UI, you can define text, icon, or both. You can also specify
    * whether the text or the icon is displayed first.
    *
    * You can choose from a set of predefined types that offer different
    * styling to correspond to the triggered action.
    *
    * You can set the `ui5-button` as enabled or disabled. An enabled
    * `ui5-button` can be pressed by clicking or tapping it. The button changes
    * its style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled `ui5-button` appears inactive and cannot be pressed.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Button.js";`
    * @csspart button - Used to style the native button element
    * @csspart icon - Used to style the icon in the native button element
    * @csspart endIcon - Used to style the end icon in the native button element
    * @constructor
    * @extends UI5Element
    * @implements { IButton }
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/Button", JSImport.Default)
  @js.native
  open class default ()
    extends Button
       with ColorPaletteNavigationItem {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Button", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Button", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def typeTextMappings(): Record[String, I18nText] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeTextMappings")().asInstanceOf[Record[String, I18nText]]
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-button` component represents a simple push button.
    * It enables users to trigger actions by clicking or tapping the `ui5-button`, or by pressing
    * certain keyboard keys, such as Enter.
    *
    * ### Usage
    *
    * For the `ui5-button` UI, you can define text, icon, or both. You can also specify
    * whether the text or the icon is displayed first.
    *
    * You can choose from a set of predefined types that offer different
    * styling to correspond to the triggered action.
    *
    * You can set the `ui5-button` as enabled or disabled. An enabled
    * `ui5-button` can be pressed by clicking or tapping it. The button changes
    * its style to provide visual feedback to the user that it is pressed or hovered over with
    * the mouse cursor. A disabled `ui5-button` appears inactive and cannot be pressed.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Button.js";`
    * @csspart button - Used to style the native button element
    * @csspart icon - Used to style the icon in the native button element
    * @csspart endIcon - Used to style the end icon in the native button element
    * @constructor
    * @extends UI5Element
    * @implements { IButton }
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
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distButtonMod.IButton because var conflicts: accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, hidden, id, inert, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined nonInteractive */ @js.native
  trait Button
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var _cancelAction: Boolean = js.native
    
    def _deactivate(): Unit = js.native
    
    def _hasPopup: js.UndefOr[AriaHasPopup] = js.native
    
    /**
      * @private
      */
    var _iconSettings: js.Object = js.native
    
    def _isReset: Boolean = js.native
    
    def _isSubmit: Boolean = js.native
    
    /**
      * @since 1.0.0-rc.13
      * @private
      */
    var _isTouch: Boolean = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusout(): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(): Unit = js.native
    
    def _ontouchend(e: TouchEvent): Unit = js.native
    
    def _ontouchstart(): Unit = js.native
    
    def _setActiveState(active: Boolean): Unit = js.native
    
    def _setBadgeOverlayStyle(): Unit = js.native
    
    /**
      * Defines the additional accessibility attributes that will be applied to the component.
      * The following fields are supported:
      *
      * - **expanded**: Indicates whether the button, or another grouping element it controls, is currently expanded or collapsed.
      * Accepts the following string values: `true` or `false`
      *
      * - **hasPopup**: Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by the button.
      * Accepts the following string values: `dialog`, `grid`, `listbox`, `menu` or `tree`.
      *
      * - **controls**: Identifies the element (or elements) whose contents or presence are controlled by the button element.
      * Accepts a lowercase string value.
      *
      * @public
      * @since 1.2.0
      * @default {}
      */
    var accessibilityAttributes: ButtonAccessibilityAttributes = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.5.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Describes the accessibility role of the button.
      *
      * **Note:** Use <code>ButtonAccessibleRole.Link</code> role only with a press handler, which performs a navigation. In all other scenarios the default button semantics are recommended.
      *
      * @default "Button"
      * @public
      * @since 1.23
      */
    var accessibleRole: /* template literal string: ${ButtonAccessibleRole} */ String = js.native
    
    /**
      * Used to switch the active state (pressed or not) of the component.
      * @private
      */
    var active: Boolean = js.native
    
    def ariaDescriptionText: js.UndefOr[String] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Adds a badge to the button.
      * @since 2.7.0
      * @public
      */
    var badge: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonBadgeMod.default
      ] = js.native
    
    /**
      * The current title of the button, either the tooltip property or the icons tooltip. The tooltip property with higher prio.
      * @private
      */
    var buttonTitle: js.UndefOr[String] = js.native
    
    def buttonTypeText: String = js.native
    
    /**
      * Defines the component design.
      * @default "Default"
      * @public
      */
    var design: /* template literal string: ${ButtonDesign} */ String = js.native
    
    /**
      * Defines whether the component is disabled.
      * A disabled component can't be pressed or
      * focused, and it is not in the tab chain.
      * @default false
      * @public
      */
    var disabled: Boolean = js.native
    
    def effectiveAccRole: AriaRole = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component after the button text.
      *
      * **Note:** It is highly recommended to use `endIcon` property only together with `icon` and/or `text` properties.
      * Usage of `endIcon` only should be avoided.
      *
      * The SAP-icons font provides numerous options.
      *
      * Example:
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var endIcon: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_Button: Activestatechange = js.native
    
    /**
      * Defines the tabIndex of the component.
      * @private
      */
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    def getDefaultTooltip(): js.UndefOr[js.Promise[js.UndefOr[String]]] = js.native
    
    def hasButtonType: Boolean = js.native
    
    /**
      * Indicates if the elements has a slotted end icon
      * @private
      */
    var hasEndIcon: Boolean = js.native
    
    /**
      * Indicates if the elements has a slotted icon
      * @private
      */
    var hasIcon: Boolean = js.native
    
    /**
      * Defines the icon, displayed as graphical element within the component.
      * The SAP-icons font provides numerous options.
      *
      * Example:
      * See all the available icons within the [Icon Explorer](https://sdk.openui5.org/test-resources/sap/m/demokit/iconExplorer/webapp/index.html).
      * @default undefined
      * @public
      */
    var icon: js.UndefOr[String] = js.native
    
    /**
      * Defines if a content has been added to the default slot
      * @private
      */
    var iconOnly: Boolean = js.native
    
    def isIconOnly: Boolean = js.native
    
    /**
      * Indicates if the element is focusable
      * @private
      */
    var nonInteractive: Boolean = js.native
    
    def shouldRenderBadge: Boolean = js.native
    
    /**
      * When set to `true`, the component will
      * automatically submit the nearest HTML form element on `press`.
      *
      * **Note:** This property is only applicable within the context of an HTML Form element.`
      * @default false
      * @public
      * @deprecated Set the "type" property to "Submit" to achieve the same result. The "submits" property is ignored if "type" is set to any value other than "Button".
      */
    var submits: Boolean = js.native
    
    def tabIndexValue: js.UndefOr[Double] = js.native
    
    /**
      * Defines the text of the component.
      *
      * **Note:** Although this slot accepts HTML Elements, it is strongly recommended that you only use text in order to preserve the intended design.
      * @public
      */
    var text: js.Array[Node] = js.native
    
    /**
      * Defines the tooltip of the component.
      *
      * **Note:** A tooltip attribute should be provided for icon-only buttons, in order to represent their exact meaning/function.
      * @default undefined
      * @public
      * @since 1.2.0
      */
    var tooltip: js.UndefOr[String] = js.native
    
    /**
      * Defines whether the button has special form-related functionality.
      *
      * **Note:** This property is only applicable within the context of an HTML Form element.
      * @default "Button"
      * @public
      * @since 1.15.0
      */
    var `type`: /* template literal string: ${ButtonType} */ String = js.native
  }
  
  /* Inlined std.Pick<@ui5/webcomponents-base.@ui5/webcomponents-base.AccessibilityAttributes, 'expanded' | 'hasPopup' | 'controls'> */
  trait ButtonAccessibilityAttributes extends StObject {
    
    var controls: js.UndefOr[LowercaseString[String]] = js.undefined
    
    var expanded: js.UndefOr[Boolean] = js.undefined
    
    var hasPopup: js.UndefOr[AriaHasPopup] = js.undefined
  }
  object ButtonAccessibilityAttributes {
    
    inline def apply(): ButtonAccessibilityAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonAccessibilityAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonAccessibilityAttributes] (val x: Self) extends AnyVal {
      
      inline def setControls(value: LowercaseString[String]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      inline def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      inline def setExpanded(value: Boolean): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
      
      inline def setExpandedUndefined: Self = StObject.set(x, "expanded", js.undefined)
      
      inline def setHasPopup(value: AriaHasPopup): Self = StObject.set(x, "hasPopup", value.asInstanceOf[js.Any])
      
      inline def setHasPopupUndefined: Self = StObject.set(x, "hasPopup", js.undefined)
    }
  }
  
  trait ButtonClickEventDetail extends StObject {
    
    var altKey: Boolean
    
    var ctrlKey: Boolean
    
    var metaKey: Boolean
    
    var originalEvent: MouseEvent
    
    var shiftKey: Boolean
  }
  object ButtonClickEventDetail {
    
    inline def apply(altKey: Boolean, ctrlKey: Boolean, metaKey: Boolean, originalEvent: MouseEvent, shiftKey: Boolean): ButtonClickEventDetail = {
      val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], originalEvent = originalEvent.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
      
      inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
      
      inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
      
      inline def setOriginalEvent(value: MouseEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Interface for components that may be used as a button inside numerous higher-order components
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IButton
    extends StObject
       with HTMLElement {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var nonInteractive: Boolean = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  }
}
