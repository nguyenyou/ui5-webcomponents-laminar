package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.EventListener
import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Context
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Mincontentwidthchange
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.OverflowButton
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.`before-close`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.toolbar
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distToolbarMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toolbar` component is used to create a horizontal layout with items.
    * The items can be overflowing in a popover, when the space is not enough to show all of them.
    *
    * ### Keyboard Handling
    * The `ui5-toolbar` provides advanced keyboard handling.
    *
    * - The control is not interactive, but can contain of interactive elements
    * - [Tab] - iterates through elements
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Toolbar.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.17.0
    */
  @JSImport("@ui5/webcomponents/dist/Toolbar.js", JSImport.Default)
  @js.native
  open class default () extends Toolbar
  object default {
    
    @JSImport("@ui5/webcomponents/dist/Toolbar.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/Toolbar.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-toolbar` component is used to create a horizontal layout with items.
    * The items can be overflowing in a popover, when the space is not enough to show all of them.
    *
    * ### Keyboard Handling
    * The `ui5-toolbar` provides advanced keyboard handling.
    *
    * - The control is not interactive, but can contain of interactive elements
    * - [Tab] - iterates through elements
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents/dist/Toolbar.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.17.0
    */
  @js.native
  trait Toolbar
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var ITEMS_WIDTH_MAP: Map[String, Double] = js.native
    
    def _onCloseOverflow(evt: Event): Unit = js.native
    @JSName("_onCloseOverflow")
    var _onCloseOverflow_Original: EventListener = js.native
    
    def _onResize(): js.Promise[Unit] | Unit = js.native
    @JSName("_onResize")
    var _onResize_Original: ResizeObserverCallback = js.native
    
    def accInfo: OverflowButton = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    /**
      * Receives id(or many ids) of the elements that label the input.
      * @default undefined
      * @public
      */
    var accessibleNameRef: js.UndefOr[String] = js.native
    
    def accessibleRole: js.UndefOr[toolbar] = js.native
    
    /**
      * Indicated the direction in which the Toolbar items will be aligned.
      * @public
      * @default "End"
      */
    var alignContent: /* template literal string: ${ToolbarAlign} */ String = js.native
    
    def alwaysOverflowItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
      ] = js.native
    
    def ariaLabelText: js.UndefOr[String] = js.native
    
    /**
      * Private members
      */
    def attachListeners(): Unit = js.native
    
    def closeOverflow(): Unit = js.native
    
    /**
      * Calculated width of the toolbar content.
      * @private
      * @default undefined
      */
    var contentWidth: js.UndefOr[Double] = js.native
    
    /**
      * Defines the toolbar design.
      * @public
      * @default "Solid"
      * @since 2.0.0
      */
    var design: /* template literal string: ${ToolbarDesign} */ String = js.native
    
    def detachListeners(): Unit = js.native
    
    def distributeItems(): Unit = js.native
    def distributeItems(overflowSpace: Double): Unit = js.native
    
    def distributeItemsThatAlwaysOverflow(): Unit = js.native
    
    @JSName("eventDetails")
    var eventDetails_Toolbar: Mincontentwidthchange = js.native
    
    def getCachedItemWidth(id: String): js.UndefOr[Double] = js.native
    
    def getItemByID(id: String): js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
      ] = js.native
    
    def getItemWidth(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default): Double = js.native
    
    def getItemsInfo(
      items: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
        ]
    ): js.Array[Context] = js.native
    
    def getOverflowPopover(): io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default = js.native
    
    def getRegisteredToolbarItemByID(id: String): HTMLElement | Null = js.native
    
    /**
      * Accessibility
      */
    def hasAriaSemantics: Boolean = js.native
    
    def hasFlexibleSpacers: Boolean = js.native
    
    def hasItemWithText: Boolean = js.native
    
    def hideOverflowButton: Boolean = js.native
    
    def interactiveItemsCount: Double = js.native
    
    /**
      * Returns if the overflow popup is open.
      * @public
      */
    def isOverflowOpen(): Boolean = js.native
    
    /**
      * Defines the items of the component.
      *
      * **Note:** Currently only `ui5-toolbar-button`, `ui5-toolbar-select`, `ui5-toolbar-separator` and `ui5-toolbar-spacer` are allowed here.
      * @public
      */
    var items: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
      ] = js.native
    
    def itemsDOM: Element | Null = js.native
    
    var itemsToOverflow: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
      ] = js.native
    
    var itemsWidth: Double = js.native
    
    var itemsWidthMeasured: Boolean = js.native
    
    var minContentWidth: Double = js.native
    
    def movableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
      ] = js.native
    
    @JSName("onBeforeClose")
    def onBeforeClose_beforeclose(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distPopoverMod.default, 
          `before-close`
        ]
    ): Unit = js.native
    
    /**
      * Event Handlers
      */
    def onOverflowPopoverClosed(): Unit = js.native
    
    def onOverflowPopoverOpened(): Unit = js.native
    
    def onResize(): Unit = js.native
    
    def onToolbarItemChange(): Unit = js.native
    
    def openOverflow(): Unit = js.native
    
    /**
      * Toolbar Overflow Popover
      */
    def overflowButtonDOM: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distButtonMod.default | Null = js.native
    
    /**
      * Read-only members
      */
    def overflowButtonSize: Double = js.native
    
    def overflowItems: js.Array[Context] = js.native
    
    def padding: Double = js.native
    
    var popoverOpen: Boolean = js.native
    
    def preprocessItems(): Unit = js.native
    
    /**
      * Layout management
      */
    def processOverflowLayout(): Unit = js.native
    
    /**
      * Notifies the toolbar if it should show the items in a reverse way if Toolbar Popover needs to be placed on "Top" position.
      * @private
      */
    var reverseOverflow: Boolean = js.native
    
    def setSeperatorsVisibilityInOverflow(): Unit = js.native
    
    def shouldShowSeparatorInOverflow(
      separatorIdx: Double,
      overflowItems: js.Array[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distToolbarItemMod.default
        ]
    ): Boolean = js.native
    
    def standardItems: js.Array[Context] = js.native
    
    def storeItemsWidth(): Unit = js.native
    
    def toggleOverflow(): Unit = js.native
    
    /**
      * Calculated width of the whole toolbar.
      * @private
      * @default undefined
      */
    var width: js.UndefOr[Double] = js.native
  }
  
  trait ToolbarMinWidthChangeEventDetail extends StObject {
    
    var minWidth: Double
  }
  object ToolbarMinWidthChangeEventDetail {
    
    inline def apply(minWidth: Double): ToolbarMinWidthChangeEventDetail = {
      val __obj = js.Dynamic.literal(minWidth = minWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarMinWidthChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarMinWidthChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    }
  }
}
