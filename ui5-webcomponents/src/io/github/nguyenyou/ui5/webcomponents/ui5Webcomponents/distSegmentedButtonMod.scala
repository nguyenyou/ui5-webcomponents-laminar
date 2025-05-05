package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.SelectionchangeSegmentedButtonSelectionChangeEventDetail
import org.scalajs.dom.FocusEvent
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSegmentedButtonMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-segmented-button` shows a group of items. When the user clicks or taps
    * one of the items, it stays in a pressed state. It automatically resizes the items
    * to fit proportionally within the component. When no width is set, the component uses the available width.
    *
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SegmentedButton.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/SegmentedButton", JSImport.Default)
  @js.native
  open class default () extends SegmentedButton
  object default {
    
    @JSImport("@ui5/webcomponents/dist/SegmentedButton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/SegmentedButton", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Interface for components that may be slotted inside `ui5-segmented-button` as items
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait ISegmentedButtonItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    var disabled: Boolean = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var selected: Boolean = js.native
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-segmented-button` shows a group of items. When the user clicks or taps
    * one of the items, it stays in a pressed state. It automatically resizes the items
    * to fit proportionally within the component. When no width is set, the component uses the available width.
    *
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/SegmentedButton.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.6
    * @public
    */
  @js.native
  trait SegmentedButton
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _applySingleSelection(item: ISegmentedButtonItem): Unit = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onfocusin(e: FocusEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _onmousedown(e: MouseEvent): Unit = js.native
    
    def _selectItem(e: KeyboardEvent): js.UndefOr[this.type] = js.native
    def _selectItem(e: MouseEvent): js.UndefOr[this.type] = js.native
    
    var _selectedItem: js.UndefOr[ISegmentedButtonItem] = js.native
    
    /**
      * Defines the accessible ARIA name of the component.
      * @default undefined
      * @public
      * @since 1.0.3
      */
    var accessibleName: js.UndefOr[String] = js.native
    
    def ariaDescribedBy: String = js.native
    
    @JSName("ariaDescription")
    def ariaDescription_MSegmentedButton: String = js.native
    
    @JSName("eventDetails")
    var eventDetails_SegmentedButton: SelectionchangeSegmentedButtonSelectionChangeEventDetail = js.native
    
    var hasPreviouslyFocusedItem: Boolean = js.native
    
    /**
      * Defines the items of `ui5-segmented-button`.
      *
      * **Note:** Multiple items are allowed.
      *
      * **Note:** Use the `ui5-segmented-button-item` for the intended design.
      * @public
      */
    var items: js.Array[ISegmentedButtonItem] = js.native
    
    def navigatableItems: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSegmentedButtonItemMod.default
      ] = js.native
    
    def normalizeSelection(): Unit = js.native
    
    /**
      * Returns an array of the currently selected items.
      * @since 1.14.0
      * @public
      * @default []
      */
    def selectedItems: js.Array[ISegmentedButtonItem] = js.native
    
    /**
      * Defines the component selection mode.
      * @default "Single"
      * @public
      * @since 1.14.0
      */
    var selectionMode: /* template literal string: ${SegmentedButtonSelectionMode} */ String = js.native
  }
  
  trait SegmentedButtonSelectionChangeEventDetail extends StObject {
    
    var selectedItems: js.Array[ISegmentedButtonItem]
  }
  object SegmentedButtonSelectionChangeEventDetail {
    
    inline def apply(selectedItems: js.Array[ISegmentedButtonItem]): SegmentedButtonSelectionChangeEventDetail = {
      val __obj = js.Dynamic.literal(selectedItems = selectedItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[SegmentedButtonSelectionChangeEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentedButtonSelectionChangeEventDetail] (val x: Self) extends AnyVal {
      
      inline def setSelectedItems(value: js.Array[ISegmentedButtonItem]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemsVarargs(value: ISegmentedButtonItem*): Self = StObject.set(x, "selectedItems", js.Array(value*))
    }
  }
}
