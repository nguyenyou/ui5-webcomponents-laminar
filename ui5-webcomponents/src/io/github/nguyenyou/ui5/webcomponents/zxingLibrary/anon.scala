package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DHeight extends StObject {
    
    var dHeight: Double
    
    var dWidth: Double
    
    var dx: Double
    
    var dy: Double
    
    var sHeight: Double
    
    var sWidth: Double
    
    var sx: Double
    
    var sy: Double
  }
  object DHeight {
    
    inline def apply(
      dHeight: Double,
      dWidth: Double,
      dx: Double,
      dy: Double,
      sHeight: Double,
      sWidth: Double,
      sx: Double,
      sy: Double
    ): DHeight = {
      val __obj = js.Dynamic.literal(dHeight = dHeight.asInstanceOf[js.Any], dWidth = dWidth.asInstanceOf[js.Any], dx = dx.asInstanceOf[js.Any], dy = dy.asInstanceOf[js.Any], sHeight = sHeight.asInstanceOf[js.Any], sWidth = sWidth.asInstanceOf[js.Any], sx = sx.asInstanceOf[js.Any], sy = sy.asInstanceOf[js.Any])
      __obj.asInstanceOf[DHeight]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DHeight] (val x: Self) extends AnyVal {
      
      inline def setDHeight(value: Double): Self = StObject.set(x, "dHeight", value.asInstanceOf[js.Any])
      
      inline def setDWidth(value: Double): Self = StObject.set(x, "dWidth", value.asInstanceOf[js.Any])
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setSHeight(value: Double): Self = StObject.set(x, "sHeight", value.asInstanceOf[js.Any])
      
      inline def setSWidth(value: Double): Self = StObject.set(x, "sWidth", value.asInstanceOf[js.Any])
      
      inline def setSx(value: Double): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSy(value: Double): Self = StObject.set(x, "sy", value.asInstanceOf[js.Any])
    }
  }
}
