package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanHeight extends StObject {
  
  var scanHeight: Double
  
  var scanWidth: Double
  
  var xOffset: Double
  
  var yOffset: Double
}
object ScanHeight {
  
  inline def apply(scanHeight: Double, scanWidth: Double, xOffset: Double, yOffset: Double): ScanHeight = {
    val __obj = js.Dynamic.literal(scanHeight = scanHeight.asInstanceOf[js.Any], scanWidth = scanWidth.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScanHeight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScanHeight] (val x: Self) extends AnyVal {
    
    inline def setScanHeight(value: Double): Self = StObject.set(x, "scanHeight", value.asInstanceOf[js.Any])
    
    inline def setScanWidth(value: Double): Self = StObject.set(x, "scanWidth", value.asInstanceOf[js.Any])
    
    inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
    
    inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
  }
}
