package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.ChangeVoid
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon.H
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsBooleans.`true`
import io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.ui5WebcomponentsStrings.input
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distFeaturesInputElementsFormSupportMod.IFormInputElement
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilColorConversionMod.ColorRGB
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.mod.UI5CustomEvent
import org.scalajs.dom.CustomEvent
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.KeyboardEvent
import org.scalajs.dom.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorPickerMod {
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-color-picker` allows users to choose any color and provides different input options for selecting colors.
    *
    * ### Usage
    *
    * #### When to use
    * Use the color picker if:
    *
    * -  users need to select any color freely.
    *
    * #### When not to use
    *
    * -  Users need to select one color from a predefined set of colors. Use the ColorPalette component instead.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ColorPicker.js";`
    * @constructor
    * @since 1.0.0-rc.12
    * @extends UI5Element
    * @public
    */
  @JSImport("@ui5/webcomponents/dist/ColorPicker.js", JSImport.Default)
  @js.native
  open class default () extends ColorPicker
  object default {
    
    @JSImport("@ui5/webcomponents/dist/ColorPicker.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ui5/webcomponents/dist/ColorPicker.js", "default.i18nBundle")
    @js.native
    def i18nBundle: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default = js.native
    inline def i18nBundle_=(x: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("i18nBundle")(x.asInstanceOf[js.Any])
  }
  
  trait ColorChannelInput extends StObject {
    
    var accessibleName: String
    
    var id: String
    
    var label: String
    
    var showPercentSymbol: js.UndefOr[Boolean] = js.undefined
    
    var value: Double
  }
  object ColorChannelInput {
    
    inline def apply(accessibleName: String, id: String, label: String, value: Double): ColorChannelInput = {
      val __obj = js.Dynamic.literal(accessibleName = accessibleName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorChannelInput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorChannelInput] (val x: Self) extends AnyVal {
      
      inline def setAccessibleName(value: String): Self = StObject.set(x, "accessibleName", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setShowPercentSymbol(value: Boolean): Self = StObject.set(x, "showPercentSymbol", value.asInstanceOf[js.Any])
      
      inline def setShowPercentSymbolUndefined: Self = StObject.set(x, "showPercentSymbol", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorCoordinates extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object ColorCoordinates {
    
    inline def apply(x: Double, y: Double): ColorCoordinates = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorCoordinates] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @class
    *
    * ### Overview
    * The `ui5-color-picker` allows users to choose any color and provides different input options for selecting colors.
    *
    * ### Usage
    *
    * #### When to use
    * Use the color picker if:
    *
    * -  users need to select any color freely.
    *
    * #### When not to use
    *
    * -  Users need to select one color from a predefined set of colors. Use the ColorPalette component instead.
    *
    * ### ES6 Module Import
    *
    * `import "@ui5/webcomponents/dist/ColorPicker.js";`
    * @constructor
    * @since 1.0.0-rc.12
    * @extends UI5Element
    * @public
    */
  @js.native
  trait ColorPicker extends IFormInputElement {
    
    def HEX: String = js.native
    
    /**
      * @private
      */
    var _alpha: Double = js.native
    
    def _calculateColorFromCoordinates(x: Double, y: Double): js.UndefOr[H] = js.native
    
    def _changeSelectedColor(x: Double, y: Double): Unit = js.native
    
    /**
      * Defines the currenty selected color.
      * @private
      */
    var _colorValue: io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distColorpickerUtilsColorValueMod.default = js.native
    
    /**
      * @private
      */
    var _displayHSL: Boolean = js.native
    
    def _handleAlphaChange(): Unit = js.native
    
    @JSName("_handleAlphaInput")
    def _handleAlphaInput_input(
      e: UI5CustomEvent[
          io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distInputMod.default | io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.distSliderMod.default, 
          input
        ]
    ): Unit = js.native
    
    def _handleColorInputChange(e: Event): Unit = js.native
    
    def _handleHEXChange(e: CustomEvent): Unit = js.native
    def _handleHEXChange(e: KeyboardEvent): Unit = js.native
    
    def _handleHueInput(e: CustomEvent): Unit = js.native
    
    def _handleMouseDown(e: MouseEvent): Unit = js.native
    
    def _handleMouseMove(e: MouseEvent): Unit = js.native
    
    def _handleMouseOut(e: MouseEvent): Unit = js.native
    
    def _handleMouseUp(): Unit = js.native
    
    /**
      * @private
      */
    var _hue: Double = js.native
    
    def _isColorValueEqual(value: ColorRGB): Boolean = js.native
    
    def _isDefaultPickerMode: Boolean = js.native
    
    /**
      * @private
      */
    var _isHueValueChanged: Boolean = js.native
    
    /**
      * @private
      */
    var _isSelectedColorChanged: Boolean = js.native
    
    /**
      * Defines the current main color which is selected via the hue slider and is shown in the main color square.
      * @private
      */
    var _mainValue: ColorRGB = js.native
    
    def _onkeydown(e: KeyboardEvent): Unit = js.native
    
    /**
      * @private
      */
    var _selectedCoordinates: ColorCoordinates = js.native
    
    def _setMainColor(hueValue: Double): Unit = js.native
    
    def _setValue(color: String): Unit = js.native
    
    def _togglePickerMode(): Unit = js.native
    
    def _updateColorGrid(): Unit = js.native
    
    /**
      * @private
      */
    var _wrongHEX: Boolean = js.native
    
    def alphaInputLabel: String = js.native
    
    def alphaSliderLabel: String = js.native
    
    def blueInputLabel: String = js.native
    
    def colorChannelInputs: js.Array[ColorChannelInput] = js.native
    
    @JSName("eventDetails")
    var eventDetails_ColorPicker: ChangeVoid = js.native
    
    @JSName("formElementAnchor")
    def formElementAnchor_MColorPicker(): js.Promise[js.UndefOr[HTMLElement]] = js.native
    
    @JSName("formFormattedValue")
    def formFormattedValue_MColorPicker: String = js.native
    
    def greenInputLabel: String = js.native
    
    def hexInputErrorState: /* template literal string: ${ValueState} */ String = js.native
    
    def hexInputLabel: String = js.native
    
    def hslInputs: js.Array[ColorChannelInput] = js.native
    
    def hueInputLabel: String = js.native
    
    def hueSliderLabel: String = js.native
    
    def inputsDisabled: js.UndefOr[`true`] = js.native
    
    def lightInputLabel: String = js.native
    
    var mouseDown: Boolean = js.native
    
    var mouseIn: Boolean = js.native
    
    def redInputLabel: String = js.native
    
    def rgbInputs: js.Array[ColorChannelInput] = js.native
    
    def saturationInputLabel: String = js.native
    
    var selectedHue: Double = js.native
    
    /**
      * When set to `true`, the alpha slider and inputs for RGB values will not be displayed.
      * @default false
      * @public
      * @since 2.5.0
      */
    var simplified: Boolean = js.native
    
    def toggleModeTooltip: String = js.native
    
    /**
      * Defines the currently selected color of the component.
      *
      * **Note**: use HEX, RGB, RGBA, HSV formats or a CSS color name when modifying this property.
      * @default "rgba(255,255,255,1)"
      * @public
      */
    var value: String = js.native
  }
}
