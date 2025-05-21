package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonMod.ISegmentedButtonItem
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSegmentedButtonItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * Users can use the `ui5-segmented-button-item` as part of a `ui5-segmented-button`.
    *
    * Clicking or tapping on a `ui5-segmented-button-item` changes its state to `selected`.
    * The item returns to its initial state when the user clicks or taps on it again.
    * By applying additional custom CSS-styling classes, apps can give a different style to any
    * `ui5-segmented-button-item`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SegmentedButtonItem.js";`
    * @constructor
    * @extends UI5Element
    * @implements { ISegmentedButtonItem }
    * @implements { IButton }
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/SegmentedButtonItem", JSImport.Default)
  @js.native
  open class default () extends SegmentedButtonItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SegmentedButtonItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/SegmentedButtonItem", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * Users can use the `ui5-segmented-button-item` as part of a `ui5-segmented-button`.
    *
    * Clicking or tapping on a `ui5-segmented-button-item` changes its state to `selected`.
    * The item returns to its initial state when the user clicks or taps on it again.
    * By applying additional custom CSS-styling classes, apps can give a different style to any
    * `ui5-segmented-button-item`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SegmentedButtonItem.js";`
    * @constructor
    * @extends UI5Element
    * @implements { ISegmentedButtonItem }
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
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.std.HTMLElement because Already inherited
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distButtonMod.IButton because var conflicts: accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, forcedTabIndex, hidden, id, inert, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined nonInteractive */ @js.native
  trait SegmentedButtonItem extends ISegmentedButtonItem {
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
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
    
    @JSName("ariaDescription")
    def ariaDescription_MSegmentedButtonItem: String = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
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
      * Defines if the button has icon and no text.
      * @private
      */
    var iconOnly: Boolean = js.native
    
    /**
      * Indicates if the element is focusable
      * @private
      */
    var nonInteractive: Boolean = js.native
    
    /**
      * Defines the index of the item inside of the SegmentedButton.
      * @default 0
      * @private
      */
    var posInSet: Double = js.native
    
    def showIconTooltip: Boolean = js.native
    
    /**
      * Defines how many items are inside of the SegmentedButton.
      * @default 0
      * @private
      */
    var sizeOfSet: Double = js.native
    
    def tabIndexValue: js.UndefOr[String] = js.native
    
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
  }
}
