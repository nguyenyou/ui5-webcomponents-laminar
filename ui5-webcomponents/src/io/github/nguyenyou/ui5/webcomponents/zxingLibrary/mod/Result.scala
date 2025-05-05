package io.github.nguyenyou.ui5.webcomponents.zxingLibrary.mod

import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreBarcodeFormatMod.BarcodeFormat
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zxing/library", "Result")
@js.native
open class Result protected () extends default {
  def this(
    text: String,
    rawBytes: js.typedarray.Uint8Array,
    numBits: Double,
    resultPoints: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default],
    format: BarcodeFormat
  ) = this()
  def this(
    text: String,
    rawBytes: js.typedarray.Uint8Array,
    numBits: Double,
    resultPoints: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default],
    format: BarcodeFormat,
    timestamp: Double
  ) = this()
}
