package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Root
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.IColorPaletteItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPaletteItemMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-color-palette-item` component represents a color in the the `ui5-color-palette`.
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @implements { IColorPaletteItem }
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPaletteItem.js", JSImport.Default)
  @js.native
  open class default () extends ColorPaletteItem
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPaletteItem.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPaletteItem.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ui5-color-palette-item` component represents a color in the the `ui5-color-palette`.
    * @constructor
    * @extends UI5Element
    * @since 1.0.0-rc.12
    * @implements { IColorPaletteItem }
    * @public
    */
  @js.native
  trait ColorPaletteItem extends IColorPaletteItem {
    
    /**
      * @private
      * @since 1.0.0-rc.15
      */
    var _disabled: Boolean = js.native
    
    def colorLabel: String = js.native
    
    /**
      * Defines the tab-index of the element, helper information for the ItemNavigation.
      * @private
      */
    @JSName("forcedTabIndex")
    var forcedTabIndex_ColorPaletteItem: String = js.native
    
    /**
      * Defines if the ColorPalette is on phone mode.
      * @private
      */
    var onPhone: Boolean = js.native
    
    /**
      * Defines if the component is selected.
      *
      * **Note:** Only one item must be selected per <code>ui5-color-palette</code>.
      * If more than one item is defined as selected, the last one would be considered as the selected one.
      *
      * @public
      * @default false
      * @since 2.0.0
      */
    @JSName("selected")
    var selected_ColorPaletteItem: Boolean = js.native
    
    def styles: Root = js.native
    
    /**
      * Defines the colour of the component.
      *
      * **Note:** The value should be a valid CSS color.
      * @default ""
      * @public
      */
    @JSName("value")
    var value_ColorPaletteItem: String = js.native
  }
}
