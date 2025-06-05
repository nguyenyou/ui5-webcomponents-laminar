package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distComboBoxMod.IComboBoxItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComboBoxItemMod {
  
  /**
    * @class
    * The `ui5-cb-item` represents the item for a `ui5-combobox`.
    * @constructor
    * @extends ListItemBase
    * @implements {IComboBoxItem}
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ComboBoxItem.js", JSImport.Default)
  @js.native
  open class default () extends ComboBoxItem
  
  /**
    * @class
    * The `ui5-cb-item` represents the item for a `ui5-combobox`.
    * @constructor
    * @extends ListItemBase
    * @implements {IComboBoxItem}
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
  - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distComboBoxMod.IComboBoxItem because var conflicts: __id, __shouldHydrate, _changedState, _childChangeListeners, _componentStateFinalizedEventProvider, _doNotSyncAttributes, _domRefReadyPromise, _fullyConnected, _getRealDomRef, _inDOM, _individualSlot, _internals, _invalidationEventProvider, _jsxEvents, _jsxProps, _rendered, _slotChangeListeners, _slotsAssignedNodes, _state, _suppressInvalidation, accessKey, ariaAtomic, ariaAutoComplete, ariaBrailleLabel, ariaBrailleRoleDescription, ariaBusy, ariaChecked, ariaColCount, ariaColIndex, ariaColIndexText, ariaColSpan, ariaCurrent, ariaDescription, ariaDisabled, ariaExpanded, ariaHasPopup, ariaHidden, ariaInvalid, ariaKeyShortcuts, ariaLabel, ariaLevel, ariaLive, ariaModal, ariaMultiLine, ariaMultiSelectable, ariaOrientation, ariaPlaceholder, ariaPosInSet, ariaPressed, ariaReadOnly, ariaRelevant, ariaRequired, ariaRoleDescription, ariaRowCount, ariaRowIndex, ariaRowIndexText, ariaRowSpan, ariaSelected, ariaSetSize, ariaSort, ariaValueMax, ariaValueMin, ariaValueNow, ariaValueText, autocapitalize, autofocus, className, contentEditable, dir, draggable, enterKeyHint, eventDetails, focused, hidden, id, inert, initializedProperties, innerHTML, innerText, inputMode, lang, nodeValue, nonce, onabort, onanimationcancel, onanimationend, onanimationiteration, onanimationstart, onauxclick, onbeforeinput, onbeforetoggle, onblur, oncancel, oncanplay, oncanplaythrough, onchange, onclick, onclose, oncontextlost, oncontextmenu, oncontextrestored, oncopy, oncuechange, oncut, ondblclick, ondrag, ondragend, ondragenter, ondragleave, ondragover, ondragstart, ondrop, ondurationchange, onemptied, onended, onerror, onfocus, onformdata, onfullscreenchange, onfullscreenerror, ongotpointercapture, oninput, oninvalid, onkeydown, onkeypress, onkeyup, onload, onloadeddata, onloadedmetadata, onloadstart, onlostpointercapture, onmousedown, onmouseenter, onmouseleave, onmousemove, onmouseout, onmouseover, onmouseup, onpaste, onpause, onplay, onplaying, onpointercancel, onpointerdown, onpointerenter, onpointerleave, onpointermove, onpointerout, onpointerover, onpointerup, onprogress, onratechange, onreset, onresize, onscroll, onscrollend, onsecuritypolicyviolation, onseeked, onseeking, onselect, onselectionchange, onselectstart, onslotchange, onstalled, onsubmit, onsuspend, ontimeupdate, ontoggle, ontouchcancel, ontouchend, ontouchmove, ontouchstart, ontransitioncancel, ontransitionend, ontransitionrun, ontransitionstart, onvolumechange, onwaiting, onwebkitanimationend, onwebkitanimationiteration, onwebkitanimationstart, onwebkittransitionend, onwheel, outerHTML, outerText, popover, role, scrollLeft, scrollTop, selected, slot, spellcheck, tabIndex, textContent, title, translate, writingSuggestions. Inlined text, headerText, isGroupItem, additionalText, _isVisible, items */ @js.native
  trait ComboBoxItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distListItemBaseMod.default {
    
    /**
      * Indicates whether the item is filtered
      * @private
      */
    var _isVisible: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the additional text of the component.
      * @default undefined
      * @since 1.0.0-rc.11
      * @public
      */
    var additionalText: js.UndefOr[String] = js.native
    
    var headerText: js.UndefOr[String] = js.native
    
    var isGroupItem: js.UndefOr[Boolean] = js.native
    
    var items: js.UndefOr[js.Array[IComboBoxItem]] = js.native
    
    /**
      * Defines the markup text that will be displayed as suggestion.
      * Used for highlighting the matching parts of the text.
      *
      * @since 2.4.0
      * @private
      */
    var markupText: String = js.native
    
    /**
      * Defines the text of the component.
      * @default undefined
      * @public
      */
    var text: js.UndefOr[String] = js.native
  }
}
