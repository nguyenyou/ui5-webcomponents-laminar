package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.std.Map
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreBarcodeFormatMod.BarcodeFormat
import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultMetadataTypeMod.ResultMetadataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreResultMod {
  
  @JSImport("@zxing/library/esm/core/Result", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Result {
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
    
    /* CompleteClass */
    override def addResultPoints(
      newPoints: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default]
    ): Unit = js.native
    
    /* private */ /* CompleteClass */
    var format: Any = js.native
    
    /**
      * @return {@link BarcodeFormat} representing the format of the barcode that was decoded
      */
    /* CompleteClass */
    override def getBarcodeFormat(): BarcodeFormat = js.native
    
    /**
      * @return how many bits of {@link #getRawBytes()} are valid; typically 8 times its length
      * @since 3.3.0
      */
    /* CompleteClass */
    override def getNumBits(): Double = js.native
    
    /**
      * @return raw bytes encoded by the barcode, if applicable, otherwise {@code null}
      */
    /* CompleteClass */
    override def getRawBytes(): js.typedarray.Uint8Array = js.native
    
    /**
      * @return {@link Map} mapping {@link ResultMetadataType} keys to values. May be
      *   {@code null}. This contains optional metadata about what was detected about the barcode,
      *   like orientation.
      */
    /* CompleteClass */
    override def getResultMetadata(): Map[ResultMetadataType, js.Object] = js.native
    
    /**
      * @return points related to the barcode in the image. These are typically points
      *         identifying finder patterns or the corners of the barcode. The exact meaning is
      *         specific to the type of barcode that was decoded.
      */
    /* CompleteClass */
    override def getResultPoints(): js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default] = js.native
    
    /**
      * @return raw text encoded by the barcode
      */
    /* CompleteClass */
    override def getText(): String = js.native
    
    /* CompleteClass */
    override def getTimestamp(): Double = js.native
    
    /* private */ /* CompleteClass */
    var numBits: Any = js.native
    
    /* CompleteClass */
    override def putAllMetadata(metadata: Map[ResultMetadataType, js.Object]): Unit = js.native
    
    /* CompleteClass */
    override def putMetadata(`type`: ResultMetadataType, value: js.Object): Unit = js.native
    
    /* private */ /* CompleteClass */
    var rawBytes: Any = js.native
    
    /* private */ /* CompleteClass */
    var resultMetadata: Any = js.native
    
    /* private */ /* CompleteClass */
    var resultPoints: Any = js.native
    
    /* private */ /* CompleteClass */
    var text: Any = js.native
    
    /* private */ /* CompleteClass */
    var timestamp: Any = js.native
  }
  
  trait Result extends StObject {
    
    def addResultPoints(
      newPoints: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default]
    ): Unit
    
    /* private */ var format: Any
    
    /**
      * @return {@link BarcodeFormat} representing the format of the barcode that was decoded
      */
    def getBarcodeFormat(): BarcodeFormat
    
    /**
      * @return how many bits of {@link #getRawBytes()} are valid; typically 8 times its length
      * @since 3.3.0
      */
    def getNumBits(): Double
    
    /**
      * @return raw bytes encoded by the barcode, if applicable, otherwise {@code null}
      */
    def getRawBytes(): js.typedarray.Uint8Array
    
    /**
      * @return {@link Map} mapping {@link ResultMetadataType} keys to values. May be
      *   {@code null}. This contains optional metadata about what was detected about the barcode,
      *   like orientation.
      */
    def getResultMetadata(): Map[ResultMetadataType, js.Object]
    
    /**
      * @return points related to the barcode in the image. These are typically points
      *         identifying finder patterns or the corners of the barcode. The exact meaning is
      *         specific to the type of barcode that was decoded.
      */
    def getResultPoints(): js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default]
    
    /**
      * @return raw text encoded by the barcode
      */
    def getText(): String
    
    def getTimestamp(): Double
    
    /* private */ var numBits: Any
    
    def putAllMetadata(metadata: Map[ResultMetadataType, js.Object]): Unit
    
    def putMetadata(`type`: ResultMetadataType, value: js.Object): Unit
    
    /* private */ var rawBytes: Any
    
    /* private */ var resultMetadata: Any
    
    /* private */ var resultPoints: Any
    
    /* private */ var text: Any
    
    /* private */ var timestamp: Any
  }
  object Result {
    
    inline def apply(
      addResultPoints: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default] => Unit,
      format: Any,
      getBarcodeFormat: () => BarcodeFormat,
      getNumBits: () => Double,
      getRawBytes: () => js.typedarray.Uint8Array,
      getResultMetadata: () => Map[ResultMetadataType, js.Object],
      getResultPoints: () => js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default],
      getText: () => String,
      getTimestamp: () => Double,
      numBits: Any,
      putAllMetadata: Map[ResultMetadataType, js.Object] => Unit,
      putMetadata: (ResultMetadataType, js.Object) => Unit,
      rawBytes: Any,
      resultMetadata: Any,
      resultPoints: Any,
      text: Any,
      timestamp: Any
    ): Result = {
      val __obj = js.Dynamic.literal(addResultPoints = js.Any.fromFunction1(addResultPoints), format = format.asInstanceOf[js.Any], getBarcodeFormat = js.Any.fromFunction0(getBarcodeFormat), getNumBits = js.Any.fromFunction0(getNumBits), getRawBytes = js.Any.fromFunction0(getRawBytes), getResultMetadata = js.Any.fromFunction0(getResultMetadata), getResultPoints = js.Any.fromFunction0(getResultPoints), getText = js.Any.fromFunction0(getText), getTimestamp = js.Any.fromFunction0(getTimestamp), numBits = numBits.asInstanceOf[js.Any], putAllMetadata = js.Any.fromFunction1(putAllMetadata), putMetadata = js.Any.fromFunction2(putMetadata), rawBytes = rawBytes.asInstanceOf[js.Any], resultMetadata = resultMetadata.asInstanceOf[js.Any], resultPoints = resultPoints.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setAddResultPoints(
        value: js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default] => Unit
      ): Self = StObject.set(x, "addResultPoints", js.Any.fromFunction1(value))
      
      inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setGetBarcodeFormat(value: () => BarcodeFormat): Self = StObject.set(x, "getBarcodeFormat", js.Any.fromFunction0(value))
      
      inline def setGetNumBits(value: () => Double): Self = StObject.set(x, "getNumBits", js.Any.fromFunction0(value))
      
      inline def setGetRawBytes(value: () => js.typedarray.Uint8Array): Self = StObject.set(x, "getRawBytes", js.Any.fromFunction0(value))
      
      inline def setGetResultMetadata(value: () => Map[ResultMetadataType, js.Object]): Self = StObject.set(x, "getResultMetadata", js.Any.fromFunction0(value))
      
      inline def setGetResultPoints(
        value: () => js.Array[io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreResultPointMod.default]
      ): Self = StObject.set(x, "getResultPoints", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setGetTimestamp(value: () => Double): Self = StObject.set(x, "getTimestamp", js.Any.fromFunction0(value))
      
      inline def setNumBits(value: Any): Self = StObject.set(x, "numBits", value.asInstanceOf[js.Any])
      
      inline def setPutAllMetadata(value: Map[ResultMetadataType, js.Object] => Unit): Self = StObject.set(x, "putAllMetadata", js.Any.fromFunction1(value))
      
      inline def setPutMetadata(value: (ResultMetadataType, js.Object) => Unit): Self = StObject.set(x, "putMetadata", js.Any.fromFunction2(value))
      
      inline def setRawBytes(value: Any): Self = StObject.set(x, "rawBytes", value.asInstanceOf[js.Any])
      
      inline def setResultMetadata(value: Any): Self = StObject.set(x, "resultMetadata", value.asInstanceOf[js.Any])
      
      inline def setResultPoints(value: Any): Self = StObject.set(x, "resultPoints", value.asInstanceOf[js.Any])
      
      inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Any): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
