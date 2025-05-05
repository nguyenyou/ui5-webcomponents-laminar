package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserMultiFormatReader extends StObject {
  
  var BrowserMultiFormatReader: Instantiable0[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.BrowserMultiFormatReader]
  
  var NotFoundException: TypeofNotFoundException
}
object BrowserMultiFormatReader {
  
  inline def apply(
    BrowserMultiFormatReader: Instantiable0[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.BrowserMultiFormatReader],
    NotFoundException: TypeofNotFoundException
  ): BrowserMultiFormatReader = {
    val __obj = js.Dynamic.literal(BrowserMultiFormatReader = BrowserMultiFormatReader.asInstanceOf[js.Any], NotFoundException = NotFoundException.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserMultiFormatReader]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserMultiFormatReader] (val x: Self) extends AnyVal {
    
    inline def setBrowserMultiFormatReader(
      value: Instantiable0[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod.BrowserMultiFormatReader]
    ): Self = StObject.set(x, "BrowserMultiFormatReader", value.asInstanceOf[js.Any])
    
    inline def setNotFoundException(value: TypeofNotFoundException): Self = StObject.set(x, "NotFoundException", value.asInstanceOf[js.Any])
  }
}
