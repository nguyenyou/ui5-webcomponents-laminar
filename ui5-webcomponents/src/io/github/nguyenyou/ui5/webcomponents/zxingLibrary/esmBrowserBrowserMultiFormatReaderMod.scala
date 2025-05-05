package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmBrowserBrowserCodeReaderMod.BrowserCodeReader
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreDecodeHintTypeMod.DecodeHintType
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreMultiFormatReaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmBrowserBrowserMultiFormatReaderMod {
  
  @JSImport("@zxing/library/esm/browser/BrowserMultiFormatReader", "BrowserMultiFormatReader")
  @js.native
  open class BrowserMultiFormatReader () extends BrowserCodeReader {
    def this(hints: Map[DecodeHintType, Any]) = this()
    def this(hints: Map[DecodeHintType, Any], timeBetweenScansMillis: Double) = this()
    def this(hints: Unit, timeBetweenScansMillis: Double) = this()
    
    /* protected */ @JSName("reader")
    val reader_BrowserMultiFormatReader: default = js.native
  }
}
