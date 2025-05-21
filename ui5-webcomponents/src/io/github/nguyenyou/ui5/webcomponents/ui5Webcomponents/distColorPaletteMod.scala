package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.std.AddEventListenerOptions
import io.github.nguyenyou.ui5.webcomponents.std.EventListenerOrEventListenerObject
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ItemclickColorPaletteItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`false`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.JsxTemplate
import org.scalajs.dom.Event
import org.scalajs.dom.EventListenerOptions
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPaletteMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-color-palette` provides the users with a range of predefined colors. The colors are fixed and do not change with the theme.
    *
    * ### Usage
    *
    * The `ui5-color-palette` is meant for users that need to select a color from a predefined set.
    * To define the colors, use the `ui5-color-palette-item` component inside the default slot of the `ui5-color-palette`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ColorPalette.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPalette.js", JSImport.Default)
  @js.native
  open class default () extends ColorPalette
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPalette.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPalette.js", "default.ColorPaletteMoreColorsTemplate")
    @js.native
    def ColorPaletteMoreColorsTemplate: js.UndefOr[JsxTemplate] = js.native
    inline def ColorPaletteMoreColorsTemplate_=(x: js.UndefOr[JsxTemplate]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ColorPaletteMoreColorsTemplate")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPalette.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-color-palette` provides the users with a range of predefined colors. The colors are fixed and do not change with the theme.
    *
    * ### Usage
    *
    * The `ui5-color-palette` is meant for users that need to select a color from a predefined set.
    * To define the colors, use the `ui5-color-palette-item` component inside the default slot of the `ui5-color-palette`.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ColorPalette.js";`
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @public
    */
  @js.native
  trait ColorPalette
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _addRecentColor(color: String): Unit = js.native
    
    def _chooseCustomColor(): Unit = js.native
    
    def _closeDialog(): Unit = js.native
    
    var _currentlySelected: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default
      ] = js.native
    
    /**
      * Ensures that only one item is selected or only the last selected item remains active if more than one are explicitly set as 'selected'.
      * @private
      */
    def _ensureSingleSelectionOrDeselectAll(): Unit = js.native
    
    def _handleDefaultColorClick(e: KeyboardEvent): Unit = js.native
    
    def _isUpOrDownNavigatableColorPaletteItem(e: KeyboardEvent): js.UndefOr[Boolean] = js.native
    
    var _itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    var _itemNavigationRecentColors: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default = js.native
    
    def _onColorContainerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onDefaultColorClick(): Unit = js.native
    
    def _onDefaultColorKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onDefaultColorKeyUp(e: KeyboardEvent): Unit = js.native
    
    def _onMoreColorsKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onRecentColorsContainerKeyDown(e: KeyboardEvent): Unit = js.native
    
    def _onclick(e: MouseEvent): Unit = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    def _onkeyup(e: KeyboardEvent): Unit = js.native
    
    def _openMoreColorsDialog(): Unit = js.native
    
    var _recentColors: js.Array[String] = js.native
    
    /**
      * Defines the selected color, only valid CSS color values accepted
      * @private
      */
    var _selectedColor: js.UndefOr[String] = js.native
    
    def _setColor(color: String): Unit = js.native
    
    var _shouldFocusRecentColors: Boolean = js.native
    
    def allColorsInPalette: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default | IColorPaletteItem
      ] = js.native
    
    def colorContainerLabel: String = js.native
    
    def colorPaletteCancelButton: String = js.native
    
    def colorPaletteDefaultColorText: String = js.native
    
    def colorPaletteDialogOKButton: String = js.native
    
    def colorPaletteDialogTitle: String = js.native
    
    def colorPaletteMoreColorsText: String = js.native
    
    def colorPaletteNavigationElements: js.Array[ColorPaletteNavigationItem] = js.native
    
    /**
      * @private
      */
    var colorPickerValue: String = js.native
    
    /**
      * Defines the `ui5-color-palette-item` elements.
      * @public
      */
    var colors: js.Array[IColorPaletteItem] = js.native
    
    /**
      * Defines the default color of the color palette, only valid CSS color values accepted
      *
      * **Note:** The default color should be a part of the ColorPalette colors`
      * @private
      * @since 1.0.0-rc.16
      */
    var defaultColor: js.UndefOr[String] = js.native
    
    /**
      * @private
      */
    var dialogOpen: Boolean = js.native
    
    def displayedColors: js.Array[IColorPaletteItem] = js.native
    
    def effectiveColorItems: js.Array[IColorPaletteItem] = js.native
    
    @JSName("eventDetails")
    var eventDetails_ColorPalette: ItemclickColorPaletteItemClickEventDetail = js.native
    
    def firstFocusableElement: ColorPaletteNavigationItem = js.native
    
    def focusColorElement(
      element: ColorPaletteNavigationItem,
      itemNavigation: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distDelegateItemNavigationMod.default
    ): Unit = js.native
    
    def handleSelection(target: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default): Unit = js.native
    
    def hasRecentColors: String | `false` = js.native
    
    def onColorPickerChange(e: Event): Unit = js.native
    
    /**
      * Defines if the palette is rendered on phone.
      * @private
      */
    var onPhone: Boolean = js.native
    
    /**
      * Defines if the palette is in Popup or Embeded mode.
      * @private
      */
    var popupMode: Boolean = js.native
    
    def recentColors: js.Array[String] = js.native
    
    def recentColorsElements: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default
      ] = js.native
    
    def rowSize: Double = js.native
    
    def selectColor(item: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default): Unit = js.native
    
    /**
      * Returns the selected color.
      */
    def selectedColor: js.UndefOr[String] = js.native
    
    /**
      * Returns the selected item.
      */
    def selectedItem: js.UndefOr[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default | IColorPaletteItem
      ] = js.native
    
    /**
      * Defines whether the user can choose the default color from a button.
      * @default false
      * @private
      * @since 1.0.0-rc.16
      */
    var showDefaultColor: Boolean = js.native
    
    /**
      * Defines whether the user can choose a custom color from a color picker
      *
      * @private
      * @since 1.0.0-rc.15
      */
    var showMoreColors: Boolean = js.native
    
    /**
      * The showMoreColors template.
      * @private
      */
    var showMoreColorsTemplate: js.UndefOr[JsxTemplate] = js.native
    
    /**
      * Defines whether the user can see the last used colors in the bottom of the component
      * @private
      * @since 1.0.0-rc.15
      */
    var showRecentColors: Boolean = js.native
  }
  
  trait ColorPaletteItemClickEventDetail extends StObject {
    
    var color: String
  }
  object ColorPaletteItemClickEventDetail {
    
    inline def apply(color: String): ColorPaletteItemClickEventDetail = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorPaletteItemClickEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorPaletteItemClickEventDetail] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distColorPaletteMod.IColorPaletteItem
    - `io.github.nguyenyou.ui5.webcomponents`.ui5Webcomponents.distButtonMod.default
  */
  trait ColorPaletteNavigationItem extends StObject
  
  /**
    * Interface for components that may be used inside a `ui5-color-palette` or `ui5-color-palette-popover`
    * @public
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - `io.github.nguyenyou.ui5.webcomponents`.ui5WebcomponentsBase.distDelegateItemNavigationMod.ITabbable because var conflicts: id. Inlined forcedTabIndex */ @js.native
  trait IColorPaletteItem
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default
       with ColorPaletteNavigationItem {
    
    /* standard dom */
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var forcedTabIndex: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    /* standard dom */
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
}
