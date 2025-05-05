package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon.BrowserMultiFormatReader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalMod {
  
  object global {
    
    trait Window extends StObject {
      
      var ZXing: BrowserMultiFormatReader
    }
    object Window {
      
      inline def apply(ZXing: BrowserMultiFormatReader): Window = {
        val __obj = js.Dynamic.literal(ZXing = ZXing.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        inline def setZXing(value: BrowserMultiFormatReader): Self = StObject.set(x, "ZXing", value.asInstanceOf[js.Any])
      }
    }
  }
}
