package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Beforeclose
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ContentRoot
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings._empty
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.accessibleDescription
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.alertdialog
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.dialog
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.Event
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPopupMod {
  
  /**
    * @class
    * ### Overview
    * Base class for all popup Web Components.
    *
    * If you need to create your own popup-like custom UI5 Web Components.
    *
    * 1. The Popup class handles modality:
    *  - The "isModal" getter can be overridden by derivatives to provide their own conditions when they are modal or not
    *  - Derivatives may call the "blockPageScrolling" and "unblockPageScrolling" static methods to temporarily remove scrollbars on the html element
    *  - Derivatives may call the "openPopup" and "closePopup" methods which handle focus, manage the popup registry and for modal popups, manage the blocking layer
    *
    *  2. Provides blocking layer (relevant for modal popups only):
    *   - Controlled by the "open" and "close" methods
    *
    * 3. The Popup class "traps" focus:
    *  - Derivatives may call the "applyInitialFocus" method (usually when opening, to transfer focus inside the popup)
    *
    * 4. The template of this component exposes two inline partials you can override in derivatives:
    *  - beforeContent (upper part of the box, useful for header/title/close button)
    *  - afterContent (lower part, useful for footer/action buttons)
    * @constructor
    * @extends UI5Element
    * @public
    */
  /* note: abstract class */ @JSImport("@ui5/webcomponents/dist/Popup.js", JSImport.Default)
  @js.native
  open class default () extends Popup
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Popup.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Temporarily removes scrollbars from the html element
      * @protected
      */
    /* static member */
    inline def blockPageScrolling(popup: Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("blockPageScrolling")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Restores scrollbars on the html element, if needed
      * @protected
      */
    /* static member */
    inline def unblockPageScrolling(popup: Popup): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unblockPageScrolling")(popup.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  /**
    * @class
    * ### Overview
    * Base class for all popup Web Components.
    *
    * If you need to create your own popup-like custom UI5 Web Components.
    *
    * 1. The Popup class handles modality:
    *  - The "isModal" getter can be overridden by derivatives to provide their own conditions when they are modal or not
    *  - Derivatives may call the "blockPageScrolling" and "unblockPageScrolling" static methods to temporarily remove scrollbars on the html element
    *  - Derivatives may call the "openPopup" and "closePopup" methods which handle focus, manage the popup registry and for modal popups, manage the blocking layer
    *
    *  2. Provides blocking layer (relevant for modal popups only):
    *   - Controlled by the "open" and "close" methods
    *
    * 3. The Popup class "traps" focus:
    *  - Derivatives may call the "applyInitialFocus" method (usually when opening, to transfer focus inside the popup)
    *
    * 4. The template of this component exposes two inline partials you can override in derivatives:
    *  - beforeContent (upper part of the box, useful for header/title/close button)
    *  - afterContent (lower part, useful for footer/action buttons)
    * @constructor
    * @extends UI5Element
    * @public
    */
  @js.native
  trait Popup
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _accInfoAriaDescription: String = js.native
    
    /**
      * Adds the popup to the "opened popups registry"
      * @protected
      */
    def _addOpenedPopup(): Unit = js.native
    
    /**
      * Ensures ariaLabel is never null or empty string
      * @protected
      */
    def _ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Return the ID of an element in the shadow DOM that is going to label this popup
      * @protected
      */
    def _ariaLabelledBy: js.UndefOr[String] = js.native
    
    def _ariaModal: js.UndefOr[`true`] = js.native
    
    /**
      * Constantly updated value of texts collected from the associated labels.
      * @private
      */
    var _associatedDescriptionRefTexts: js.UndefOr[String] = js.native
    
    def _deregisterResizeHandler(): Unit = js.native
    
    var _focusedElementBeforeOpen: js.UndefOr[HTMLElement | Null] = js.native
    
    def _onfocusout(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _onmouseup(): Unit = js.native
    
    var _open: Boolean = js.native
    
    var _opened: Boolean = js.native
    
    /**
      * Prevents the user from interacting with the content under the block layer
      */
    def _preventBlockLayerFocus(e: KeyboardEvent): Unit = js.native
    def _preventBlockLayerFocus(e: MouseEvent): Unit = js.native
    
    def _registerResizeHandler(): Unit = js.native
    
    /**
      * Removes the popup from the "opened popups registry"
      * @protected
      */
    def _removeOpenedPopup(): Unit = js.native
    
    def _resize(): Unit = js.native
    
    def _resizeHandler(): js.Promise[Unit] | Unit = js.native
    
    var _resizeHandlerRegistered: Boolean = js.native
    
    @JSName("_resizeHandler")
    var _resizeHandler_Original: ResizeObserverCallback = js.native
    
    def _role: js.UndefOr[dialog | alertdialog] = js.native
    
    def _root: HTMLElement = js.native
    
    def _scroll(e: Event): Unit = js.native
    
    var _shouldFocusRoot: js.UndefOr[Boolean] = js.native
    
    /**
      * Sets "block" display to the popup. The property can be overriden by derivatives of Popup.
      * @protected
      */
    def _show(): Unit = js.native
    
    def _updateAssociatedLabelsTexts(): Unit = js.native
    
    def _updateMediaRange(): Unit = js.native
    
    /**
      * Defines the accessible description of the component.
      * @default undefined
      * @public
      * @since 2.11.0
      */
    var accessibleDescription: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that describe the component.
      * @default undefined
      * @public
      * @since 2.11.0
      */
    var accessibleDescriptionRef: js.UndefOr[String] = js.native
    
    /**
      * Defines the accessible name of the component.
      * @default undefined
      * @public
      * @since 1.0.0-rc.15
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Defines the IDs of the elements that label the component.
      * @default undefined
      * @public
      * @since 1.1.0
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    /**
      * Allows setting a custom role.
      * @default "Dialog"
      * @public
      * @since 1.10.0
      */
    var accessibleRole: /* template literal string: ${PopupAccessibleRole} */ String = js.native
    
    /**
      * Focuses the element denoted by `initialFocus`, if provided,
      * or the first focusable element otherwise.
      * @public
      * @returns Promise that resolves when the focus is applied
      */
    def applyFocus(): js.Promise[Unit] = js.native
    
    /**
      * Use this method to focus the element denoted by "initialFocus", if provided,
      * or the first focusable element otherwise.
      * @protected
      */
    def applyInitialFocus(): js.Promise[Unit] = js.native
    
    def ariaDescribedByIds: String = js.native
    
    def ariaDescriptionText: js.UndefOr[String] = js.native
    
    def ariaDescriptionTextId: _empty | accessibleDescription = js.native
    
    /**
      * Closes the popup.
      */
    def closePopup(): Unit = js.native
    def closePopup(escPressed: Boolean): Unit = js.native
    def closePopup(escPressed: Boolean, preventRegistryUpdate: Boolean): Unit = js.native
    def closePopup(escPressed: Boolean, preventRegistryUpdate: Boolean, preventFocusRestore: Boolean): Unit = js.native
    def closePopup(escPressed: Boolean, preventRegistryUpdate: Unit, preventFocusRestore: Boolean): Unit = js.native
    def closePopup(escPressed: Unit, preventRegistryUpdate: Boolean): Unit = js.native
    def closePopup(escPressed: Unit, preventRegistryUpdate: Boolean, preventFocusRestore: Boolean): Unit = js.native
    def closePopup(escPressed: Unit, preventRegistryUpdate: Unit, preventFocusRestore: Boolean): Unit = js.native
    
    /**
      * Defines the content of the Popup.
      * @public
      */
    var content: js.Array[HTMLElement] = js.native
    
    def contentDOM: HTMLElement = js.native
    
    @JSName("eventDetails")
    var eventDetails_Popup: Beforeclose = js.native
    
    /**
      * Focus trapping
      * @private
      */
    def forwardToFirst(): js.Promise[Unit] = js.native
    
    /**
      * Focus trapping
      * @private
      */
    def forwardToLast(): js.Promise[Unit] = js.native
    
    def handleOpenOnEnterDOM(): Unit = js.native
    
    /**
      * Sets "none" display to the popup
      * @protected
      */
    def hide(): Unit = js.native
    
    /**
      * Defines the ID of the HTML Element, which will get the initial focus.
      *
      * **Note:** If an element with `autofocus` attribute is added inside the component,
      * `initialFocus` won't take effect.
      * @default undefined
      * @public
      */
    var initialFocus: js.UndefOr[String] = js.native
    
    def isFocusWithin(): Boolean = js.native
    
    /**
      * Implement this getter with relevant logic regarding the modality of the popup (e.g. based on a public property)
      * @protected
      */
    def isModal: Boolean = js.native
    
    /**
      * Indicates if the element is the top modal popup
      *
      * This property is calculated automatically
      * @private
      * @default false
      */
    var isTopModalPopup: Boolean = js.native
    
    /**
      * Defines the current media query size.
      * @private
      */
    var mediaRange: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var onDesktop: Boolean = js.native
    
    /**
      * @private
      */
    var onPhone: Boolean = js.native
    
    def open: Boolean = js.native
    
    def openPopup(): js.Promise[Unit] = js.native
    
    /**
      * Indicates if the element is open
      * @public
      * @default false
      * @since 1.2.0
      */
    def open_=(value: Boolean): Unit = js.native
    
    /**
      * Defines if the focus should be returned to the previously focused element,
      * when the popup closes.
      * @default false
      * @public
      * @since 1.0.0-rc.8
      */
    var preventFocusRestore: Boolean = js.native
    
    /**
      * Indicates whether initial focus should be prevented.
      * @public
      * @default false
      * @since 2.0.0
      */
    var preventInitialFocus: Boolean = js.native
    
    /**
      * Returns the focus to the previously focused element
      * @protected
      */
    def resetFocus(): Unit = js.native
    
    def styles: ContentRoot = js.native
  }
  
  trait PopupBeforeCloseEventDetail extends StObject {
    
    var escPressed: Boolean
  }
  object PopupBeforeCloseEventDetail {
    
    inline def apply(escPressed: Boolean): PopupBeforeCloseEventDetail = {
      val __obj = js.Dynamic.literal(escPressed = escPressed.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupBeforeCloseEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupBeforeCloseEventDetail] (val x: Self) extends AnyVal {
      
      inline def setEscPressed(value: Boolean): Self = StObject.set(x, "escPressed", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupScrollEventDetail extends StObject {
    
    var scrollTop: Double
    
    var targetRef: HTMLElement
  }
  object PopupScrollEventDetail {
    
    inline def apply(scrollTop: Double, targetRef: HTMLElement): PopupScrollEventDetail = {
      val __obj = js.Dynamic.literal(scrollTop = scrollTop.asInstanceOf[js.Any], targetRef = targetRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupScrollEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupScrollEventDetail] (val x: Self) extends AnyVal {
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setTargetRef(value: HTMLElement): Self = StObject.set(x, "targetRef", value.asInstanceOf[js.Any])
    }
  }
}
