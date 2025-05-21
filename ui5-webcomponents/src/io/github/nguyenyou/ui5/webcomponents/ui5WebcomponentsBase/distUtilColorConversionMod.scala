package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilColorConversionMod {
  
  @JSImport("@ui5/webcomponents-base/dist/util/ColorConversion.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def HEXToRGB(hex: String): ColorRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("HEXToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[ColorRGB]
  
  inline def HSLToRGB(color: ColorHSL): ColorRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("HSLToRGB")(color.asInstanceOf[js.Any]).asInstanceOf[ColorRGB]
  
  /**
    * Return an object with the properties for each of the main colors(red, green, blue)
    * @param {String} color Receives a color in the following format: "rgb(0, 0, 0)
    */
  inline def RGBStringToRGBObject(color: String): ColorRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBStringToRGBObject")(color.asInstanceOf[js.Any]).asInstanceOf[ColorRGB]
  
  inline def RGBToHSL(color: ColorRGB): ColorHSL = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBToHSL")(color.asInstanceOf[js.Any]).asInstanceOf[ColorHSL]
  
  /**
    * Returns the hex value of the color as string
    * @param {Object} color Receives an object with the properties for each of the main colors(r, g, b)
    */
  inline def RGBtoHEX(color: ColorRGB): String = ^.asInstanceOf[js.Dynamic].applyDynamic("RGBtoHEX")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getAlpha(color: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlpha")(color.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getRGBColor(color: String): ColorRGB = ^.asInstanceOf[js.Dynamic].applyDynamic("getRGBColor")(color.asInstanceOf[js.Any]).asInstanceOf[ColorRGB]
  
  trait ColorHSL extends StObject {
    
    var h: Double
    
    var l: Double
    
    var s: Double
  }
  object ColorHSL {
    
    inline def apply(h: Double, l: Double, s: Double): ColorHSL = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], l = l.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorHSL]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorHSL] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setL(value: Double): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorRGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object ColorRGB {
    
    inline def apply(b: Double, g: Double, r: Double): ColorRGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorRGB]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorRGB] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
}
