package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilColorConversionMod.ColorHSL
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distUtilColorConversionMod.ColorRGB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distColorpickerUtilsColorValueMod {
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ColorValue` class represents the `value` used in `ui5-color-picker`
    *
    * A color can be represented using RGB, HSL or HEX values. A color also has an alpha value.
    * @private
    */
  @JSImport("@ui5/webcomponents/dist/colorpicker-utils/ColorValue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ColorValue
  
  /**
    * @class
    *
    * ### Overview
    *
    * The `ColorValue` class represents the `value` used in `ui5-color-picker`
    *
    * A color can be represented using RGB, HSL or HEX values. A color also has an alpha value.
    * @private
    */
  @js.native
  trait ColorValue extends StObject {
    
    def Alpha: Double = js.native
    def Alpha_=(value: Double): Unit = js.native
    
    def B: Double = js.native
    def B_=(value: Double): Unit = js.native
    
    def G: Double = js.native
    def G_=(value: Double): Unit = js.native
    
    def H: Double = js.native
    
    def HEX: String = js.native
    def HEX_=(value: String): Unit = js.native
    
    def HSL: ColorHSL = js.native
    def HSL_=(color: ColorHSL): Unit = js.native
    
    def H_=(value: Double): Unit = js.native
    
    def L: Double = js.native
    def L_=(value: Double): Unit = js.native
    
    def R: Double = js.native
    
    def RGB: ColorRGB = js.native
    def RGB_=(color: ColorRGB): Unit = js.native
    
    def R_=(value: Double): Unit = js.native
    
    def S: Double = js.native
    def S_=(value: Double): Unit = js.native
    
    var _alpha: Double = js.native
    
    var _hex: String = js.native
    
    var _hsl: ColorHSL = js.native
    
    def _isValidHValue(value: Double): Boolean = js.native
    
    def _isValidRGBValue(value: Double): Boolean = js.native
    
    def _isValidSLValue(value: Double): Boolean = js.native
    
    var _rgb: ColorRGB = js.native
    
    def _updateHSL(value: ColorHSL): Unit = js.native
    
    def _updateRGB(value: ColorRGB): Unit = js.native
    
    var _valid: Boolean = js.native
    
    def isColorValueValid(): Boolean = js.native
    
    def toRGBString(): String = js.native
    
    def validateHEX(value: String): Unit = js.native
    
    def validateHSLColor(color: ColorHSL): Unit = js.native
    
    def validateHValue(value: Double): Unit = js.native
    
    def validateRGBColor(color: ColorRGB): Unit = js.native
    
    def validateRGBValue(value: Double): Unit = js.native
    
    def validateSLValue(value: Double): Unit = js.native
  }
}
