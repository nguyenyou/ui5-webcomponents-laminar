package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsInts.`0`
import org.scalajs.dom.DragEvent
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDialogMod {
  
  /**
    * @class
    * ### Overview
    * The `ui5-dialog` component is used to temporarily display some information in a
    * size-limited window in front of the regular app screen.
    * It is used to prompt the user for an action or a confirmation.
    * The `ui5-dialog` interrupts the current app processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The dialog combines concepts known from other technologies where the windows have
    * names such as dialog box, dialog window, pop-up, pop-up window, alert box, or message box.
    *
    * The `ui5-dialog` is modal, which means that a user action is required before it is possible to return to the parent window.
    * To open multiple dialogs, each dialog element should be separate in the markup. This will ensure the correct modal behavior. Avoid nesting dialogs within each other.
    * The content of the `ui5-dialog` is fully customizable.
    *
    * ### Structure
    * A `ui5-dialog` consists of a header, content, and a footer for action buttons.
    * The `ui5-dialog` is usually displayed at the center of the screen.
    * Its position can be changed by the user. To enable this, you need to set the property `draggable` accordingly.
    *
    * ### Responsive Behavior
    * The `stretch` property can be used to stretch the `ui5-dialog` to full screen. For better usability, it's recommended to stretch the dialog to full screen on phone devices.
    *
    * **Note:** When a `ui5-bar` is used in the header or in the footer, you should remove the default dialog's paddings.
    *
    * For more information see the sample "Bar in Header/Footer".
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * When the `ui5-dialog` has the `draggable` property set to `true` and the header is focused, the user can move the dialog
    * with the following keyboard shortcuts:
    *
    * - [Up] or [Down] arrow keys - Move the dialog up/down.
    * - [Left] or [Right] arrow keys - Move the dialog left/right.
    *
    * #### Resizing
    * When the `ui5-dialog` has the `resizable` property set to `true` and the header is focused, the user can change the size of the dialog
    * with the following keyboard shortcuts:
    *
    * - [Shift] + [Up] or [Down] - Decrease/Increase the height of the dialog.
    * - [Shift] + [Left] or [Right] - Decrease/Increase the width of the dialog.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Dialog";`
    *
    * @constructor
    * @extends Popup
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @JSImport("@ui5/webcomponents/dist/Dialog", JSImport.Default)
  @js.native
  open class default () extends Dialog
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Dialog", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def isHeader(element: HTMLElement): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_isHeader")(element.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * @class
    * ### Overview
    * The `ui5-dialog` component is used to temporarily display some information in a
    * size-limited window in front of the regular app screen.
    * It is used to prompt the user for an action or a confirmation.
    * The `ui5-dialog` interrupts the current app processing as it is the only focused UI element and
    * the main screen is dimmed/blocked.
    * The dialog combines concepts known from other technologies where the windows have
    * names such as dialog box, dialog window, pop-up, pop-up window, alert box, or message box.
    *
    * The `ui5-dialog` is modal, which means that a user action is required before it is possible to return to the parent window.
    * To open multiple dialogs, each dialog element should be separate in the markup. This will ensure the correct modal behavior. Avoid nesting dialogs within each other.
    * The content of the `ui5-dialog` is fully customizable.
    *
    * ### Structure
    * A `ui5-dialog` consists of a header, content, and a footer for action buttons.
    * The `ui5-dialog` is usually displayed at the center of the screen.
    * Its position can be changed by the user. To enable this, you need to set the property `draggable` accordingly.
    *
    * ### Responsive Behavior
    * The `stretch` property can be used to stretch the `ui5-dialog` to full screen. For better usability, it's recommended to stretch the dialog to full screen on phone devices.
    *
    * **Note:** When a `ui5-bar` is used in the header or in the footer, you should remove the default dialog's paddings.
    *
    * For more information see the sample "Bar in Header/Footer".
    * ### Keyboard Handling
    *
    * #### Basic Navigation
    * When the `ui5-dialog` has the `draggable` property set to `true` and the header is focused, the user can move the dialog
    * with the following keyboard shortcuts:
    *
    * - [Up] or [Down] arrow keys - Move the dialog up/down.
    * - [Left] or [Right] arrow keys - Move the dialog left/right.
    *
    * #### Resizing
    * When the `ui5-dialog` has the `resizable` property set to `true` and the header is focused, the user can change the size of the dialog
    * with the following keyboard shortcuts:
    *
    * - [Shift] + [Up] or [Down] - Decrease/Increase the height of the dialog.
    * - [Shift] + [Left] or [Right] - Decrease/Increase the width of the dialog.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/Dialog";`
    *
    * @constructor
    * @extends Popup
    * @public
    * @csspart header - Used to style the header of the component
    * @csspart content - Used to style the content of the component
    * @csspart footer - Used to style the footer of the component
    */
  @js.native
  trait Dialog
    extends io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopupMod.default {
    
    def _attachMouseDragHandlers(): Unit = js.native
    
    def _attachMouseResizeHandlers(): Unit = js.native
    
    def _attachScreenResizeHandler(): Unit = js.native
    
    var _cachedMinHeight: js.UndefOr[Double] = js.native
    
    def _center(): Unit = js.native
    
    def _detachMouseDragHandlers(): Unit = js.native
    
    def _detachMouseResizeHandlers(): Unit = js.native
    
    def _detachScreenResizeHandler(): Unit = js.native
    
    def _dialogStateIcon: String = js.native
    
    /**
      * Determines if the header should be shown.
      */
    def _displayHeader: String | Double | Boolean = js.native
    
    def _dragMouseMoveHandler(e: MouseEvent): Unit = js.native
    
    def _dragMouseUpHandler(e: MouseEvent): Unit = js.native
    
    def _dragStartHandler(e: DragEvent): Unit = js.native
    
    def _dragWithEvent(e: KeyboardEvent): Unit = js.native
    
    var _draggedOrResized: Boolean = js.native
    
    def _handleDragStart(e: DragEvent): Unit = js.native
    
    def _headerTabIndex: js.UndefOr[`0`] = js.native
    
    var _initialHeight: js.UndefOr[Double] = js.native
    
    var _initialLeft: js.UndefOr[Double] = js.native
    
    var _initialTop: js.UndefOr[Double] = js.native
    
    var _initialWidth: js.UndefOr[Double] = js.native
    
    var _initialX: js.UndefOr[Double] = js.native
    
    var _initialY: js.UndefOr[Double] = js.native
    
    var _isRTL: js.UndefOr[Boolean] = js.native
    
    def _minHeight: Double = js.native
    
    var _minWidth: js.UndefOr[Double] = js.native
    
    def _movable: Boolean = js.native
    
    /**
      * Event handlers
      */
    def _onDragMouseDown(e: MouseEvent): Unit = js.native
    
    def _onDragMouseMove(e: MouseEvent): Unit = js.native
    
    def _onDragMouseUp(): Unit = js.native
    
    def _onDragOrResizeKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onResizeMouseDown(e: MouseEvent): Unit = js.native
    
    def _onResizeMouseMove(e: MouseEvent): Unit = js.native
    
    def _onResizeMouseUp(): Unit = js.native
    
    def _resizeMouseMoveHandler(e: MouseEvent): Unit = js.native
    
    def _resizeMouseUpHandler(e: MouseEvent): Unit = js.native
    
    def _resizeWithEvent(e: KeyboardEvent): Unit = js.native
    
    def _revertSize(): Unit = js.native
    
    def _screenResize(): Unit = js.native
    
    def _screenResizeHandler(): Unit = js.native
    
    var _screenResizeHandlerAttached: js.UndefOr[Boolean] = js.native
    
    def _showResizeHandle: Boolean = js.native
    
    var _x: js.UndefOr[Double] = js.native
    
    var _y: js.UndefOr[Double] = js.native
    
    def ariaDescribedByHeaderTextDraggable: String = js.native
    
    def ariaDescribedByHeaderTextDraggableAndResizable: String = js.native
    
    def ariaDescribedByHeaderTextResizable: String = js.native
    
    def ariaRoleDescriptionHeaderText: js.UndefOr[String] = js.native
    
    def effectiveAriaDescribedBy: js.UndefOr[String] = js.native
    
    /**
      * Defines the footer HTML Element.
      *
      * **Note:** When a `ui5-bar` is used in the footer, you should remove the default dialog's paddings.
      * @public
      */
    var footer: js.Array[HTMLElement] = js.native
    
    def hasValueState: Boolean = js.native
    
    /**
      * Defines the header HTML Element.
      *
      * **Note:** When a `ui5-bar` is used in the header, you should remove the default dialog's paddings.
      *
      * **Note:** If `header` slot is provided, the labelling of the dialog is a responsibility of the application developer.
      * `accessibleName` should be used.
      * @public
      */
    var header: js.Array[HTMLElement] = js.native
    
    /**
      * Defines the header text.
      *
      * **Note:** If `header` slot is provided, the `headerText` is ignored.
      * @default undefined
      * @public
      */
    var headerText: js.UndefOr[String] = js.native
    
    /**
      * Configures the component to be resizable.
      * If this property is set to true, the Dialog will have a resize handle in its bottom right corner in LTR languages.
      * In RTL languages, the resize handle will be placed in the bottom left corner.
      *
      * **Note:** The component can be resizable only in desktop mode.
      *
      * **Note:** Upon resizing, externally defined height and width styling will be ignored.
      * @default false
      * @since 1.0.0-rc.10
      * @public
      */
    var resizable: Boolean = js.native
    
    /**
      * Defines the state of the `Dialog`.
      *
      * **Note:** If `"Negative"` and `"Critical"` states is set, it will change the
      * accessibility role to "alertdialog", if the accessibleRole property is set to `"Dialog"`.
      * @default "None"
      * @public
      * @since 1.0.0-rc.15
      */
    var state: /* template literal string: ${ValueState} */ String = js.native
    
    /**
      * Determines if the dialog will be stretched to full screen on mobile. On desktop,
      * the dialog will be stretched to approximately 90% of the viewport.
      *
      * **Note:** For better usability of the component it is recommended to set this property to "true" when the dialog is opened on phone.
      * @default false
      * @public
      */
    var stretch: Boolean = js.native
  }
}
