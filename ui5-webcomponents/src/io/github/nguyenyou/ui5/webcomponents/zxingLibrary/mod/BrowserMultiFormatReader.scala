package io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod

import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreDecodeHintTypeMod.DecodeHintType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zxing/library", "BrowserMultiFormatReader")
@js.native
open class BrowserMultiFormatReader ()
  extends io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmBrowserMod.BrowserMultiFormatReader {
  def this(hints: Map[DecodeHintType, Any]) = this()
  def this(hints: Map[DecodeHintType, Any], timeBetweenScansMillis: Double) = this()
  def this(hints: Unit, timeBetweenScansMillis: Double) = this()
}
