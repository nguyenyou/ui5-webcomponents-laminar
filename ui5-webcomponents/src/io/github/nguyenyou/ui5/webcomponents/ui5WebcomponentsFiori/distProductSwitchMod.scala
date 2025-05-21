package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.std.HTMLElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateResizeHandlerMod.ResizeObserverCallback
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProductSwitchMod {
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-product-switch` is an SAP Fiori specific web component that is used in `ui5-shellbar`
    * and allows the user to easily switch between products.
    *
    * ### Keyboard Handling
    * The `ui5-product-switch` provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Tab] - Move focus to the next interactive element after the `ui5-product-switch`
    * - [Up] or [Down] - Navigates up and down the items
    * - [Left] or [Right] - Navigates left and right the items
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/ProductSwitch.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";` (for `ui5-product-switch-item`)
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.5
    */
  @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch.js", JSImport.Default)
  @js.native
  open class default () extends ProductSwitch
  object default {
    
    @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents-fiori/dist/ProductSwitch.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside `ui5-product-switch` as items
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IProductSwitchItem
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
    
    var icon: js.UndefOr[String] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var selected: Boolean = js.native
    
    var subtitleText: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var targetSrc: js.UndefOr[String] = js.native
    
    var titleText: js.UndefOr[String] = js.native
  }
  
  /**
    * @class
    * ### Overview
    *
    * The `ui5-product-switch` is an SAP Fiori specific web component that is used in `ui5-shellbar`
    * and allows the user to easily switch between products.
    *
    * ### Keyboard Handling
    * The `ui5-product-switch` provides advanced keyboard handling.
    * When focused, the user can use the following keyboard
    * shortcuts in order to perform a navigation:
    *
    * - [Tab] - Move focus to the next interactive element after the `ui5-product-switch`
    * - [Up] or [Down] - Navigates up and down the items
    * - [Left] or [Right] - Navigates left and right the items
    *
    * ### ES6 Module Import
    * `import "@ui5/webcomponents-fiori/dist/ProductSwitch.js";`
    *
    * `import "@ui5/webcomponents-fiori/dist/ProductSwitchItem.js";` (for `ui5-product-switch-item`)
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.5
    */
  @js.native
  trait ProductSwitch
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _ariaLabelText: String = js.native
    
    var _currentIndex: Double = js.native
    
    def _handleDown(e: KeyboardEvent): Unit = js.native
    
    def _handleResize(): Unit = js.native
    
    def _handleResizeBound(): js.Promise[Unit] | Unit = js.native
    @JSName("_handleResizeBound")
    var _handleResizeBound_Original: ResizeObserverCallback = js.native
    
    def _handleUp(e: KeyboardEvent): Unit = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    var _rowSize: Double = js.native
    
    def _setRowSize(size: Double): Unit = js.native
    
    /**
      * Indicates how many columns are displayed.
      * @private
      */
    var desktopColumns: js.UndefOr[Double] = js.native
    
    def handleProductSwitchItemClick(e: MouseEvent): Unit = js.native
    
    /**
      * Defines the items of the `ui5-product-switch`.
      * @public
      */
    var items: js.Array[IProductSwitchItem] = js.native
  }
}
