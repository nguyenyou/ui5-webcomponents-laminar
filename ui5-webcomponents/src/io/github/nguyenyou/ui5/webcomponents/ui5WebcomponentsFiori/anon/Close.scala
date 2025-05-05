package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distBarcodeScannerDialogMod.BarcodeScannerDialogScanErrorEventDetail
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori.distBarcodeScannerDialogMod.BarcodeScannerDialogScanSuccessEventDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close extends StObject {
  
  var close: Unit
  
  var `scan-error`: BarcodeScannerDialogScanErrorEventDetail
  
  var `scan-success`: BarcodeScannerDialogScanSuccessEventDetail
}
object Close {
  
  inline def apply(
    close: Unit,
    `scan-error`: BarcodeScannerDialogScanErrorEventDetail,
    `scan-success`: BarcodeScannerDialogScanSuccessEventDetail
  ): Close = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
    __obj.updateDynamic("scan-error")(`scan-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("scan-success")(`scan-success`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Close]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Close] (val x: Self) extends AnyVal {
    
    inline def setClose(value: Unit): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def `setScan-error`(value: BarcodeScannerDialogScanErrorEventDetail): Self = StObject.set(x, "scan-error", value.asInstanceOf[js.Any])
    
    inline def `setScan-success`(value: BarcodeScannerDialogScanSuccessEventDetail): Self = StObject.set(x, "scan-success", value.asInstanceOf[js.Any])
  }
}
