package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.Close
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.ColorPaletteItemClickEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.IColorPaletteItem
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPalettePopoverMod {
  
  /**
    * @class
    *
    * ### Overview
    * Represents a predefined range of colors for easier selection.
    *
    * Overview
    * The ColorPalettePopover provides the users with a slot to predefine colors.
    *
    * You can customize them with the use of the colors property. You can specify a defaultColor and display a "Default color" button for the user to choose directly.
    * You can display a "More colors..." button that opens an additional color picker for the user to choose specific colors that are not present in the predefined range.
    *
    * ### Usage
    *
    * The palette is intended for users, who don't want to check and remember the different values of the colors and spend large amount of time to configure the right color through the color picker.
    *
    * For the `ui5-color-palette-popover`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents/dist/ColorPalettePopover.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.16
    */
  @JSImport("@ui5/webcomponents/dist/ColorPalettePopover.js", JSImport.Default)
  @js.native
  open class default () extends ColorPalettePopover
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPalettePopover.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPalettePopover.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  /**
    * @class
    *
    * ### Overview
    * Represents a predefined range of colors for easier selection.
    *
    * Overview
    * The ColorPalettePopover provides the users with a slot to predefine colors.
    *
    * You can customize them with the use of the colors property. You can specify a defaultColor and display a "Default color" button for the user to choose directly.
    * You can display a "More colors..." button that opens an additional color picker for the user to choose specific colors that are not present in the predefined range.
    *
    * ### Usage
    *
    * The palette is intended for users, who don't want to check and remember the different values of the colors and spend large amount of time to configure the right color through the color picker.
    *
    * For the `ui5-color-palette-popover`
    * ### ES6 Module Import
    *
    * `import @ui5/webcomponents/dist/ColorPalettePopover.js";`
    * @constructor
    * @extends UI5Element
    * @public
    * @since 1.0.0-rc.16
    */
  @js.native
  trait ColorPalettePopover
    extends io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUi5elementMod.default {
    
    def _cancelButtonLabel: String = js.native
    
    def _colorPalette: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteMod.default = js.native
    
    def _colorPaletteTitle: String = js.native
    
    def _open: js.UndefOr[`true`] = js.native
    
    def closePopover(): Unit = js.native
    
    def colorPaletteColors: js.Array[
        io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorPaletteItemMod.default
      ] = js.native
    
    /**
      * Defines the content of the component.
      * @public
      */
    var colors: js.Array[IColorPaletteItem] = js.native
    
    /**
      * Defines the default color of the component.
      *
      * **Note:** The default color should be a part of the ColorPalette colors`
      * @default undefined
      * @public
      */
    var defaultColor: js.UndefOr[String] = js.native
    
    @JSName("eventDetails")
    var eventDetails_ColorPalettePopover: Close = js.native
    
    /**
      * Returns if the component is opened.
      * @protected
      * @since 1.0.0-rc.16
      */
    def isOpen(): Boolean = js.native
    
    def onAfterClose(): Unit = js.native
    
    def onAfterOpen(): Unit = js.native
    
    def onSelectedColor(e: CustomEvent): Unit = js.native
    
    /**
      * Defines the open | closed state of the popover.
      * @public
      * @default false
      * @since 1.21.0
      */
    var open: Boolean = js.native
    
    /**
      * Defines the ID or DOM Reference of the element that the popover is shown at.
      * When using this attribute in a declarative way, you must only use the `id` (as a string) of the element at which you want to show the popover.
      * You can only set the `opener` attribute to a DOM Reference when using JavaScript.
      * @public
      * @default undefined
      * @since 1.21.0
      */
    var opener: js.UndefOr[HTMLElement | String] = js.native
    
    def respPopover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    def responsivePopover: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distResponsivePopoverMod.default = js.native
    
    /**
      * Defines whether the user can choose the default color from a button.
      * @default false
      * @public
      */
    var showDefaultColor: Boolean = js.native
    
    /**
      * Defines whether the user can choose a custom color from a component.
      *
      * @default false
      * @public
      */
    var showMoreColors: Boolean = js.native
    
    /**
      * Defines whether the user can see the last used colors in the bottom of the component
      * @default false
      * @public
      */
    var showRecentColors: Boolean = js.native
  }
  
  type ColorPalettePopoverItemClickEventDetail = ColorPaletteItemClickEventDetail
}
