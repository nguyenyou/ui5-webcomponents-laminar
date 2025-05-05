package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreBinarizerMod {
  
  /**
    * This class hierarchy provides a set of methods to convert luminance data to 1 bit data.
    * It allows the algorithm to vary polymorphically, for example allowing a very expensive
    * thresholding technique for servers and a fast one for mobile. It also permits the implementation
    * to vary, e.g. a JNI version for Android and a Java fallback version for other platforms.
    *
    * @author dswitkin@google.com (Daniel Switkin)
    */
  /* note: abstract class */ @JSImport("@zxing/library/esm/core/Binarizer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Binarizer {
    /* protected */ def this(source: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default) = this()
    
    /**
      * Creates a new object with the same type as this Binarizer implementation, but with pristine
      * state. This is needed because Binarizer implementations may be stateful, e.g. keeping a cache
      * of 1 bit data. See Effective Java for why we can't use Java's clone() method.
      *
      * @param source The LuminanceSource this Binarizer will operate on.
      * @return A new concrete Binarizer implementation object.
      */
    /* CompleteClass */
    override def createBinarizer(source: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default): Binarizer = js.native
    
    /**
      * Converts a 2D array of luminance data to 1 bit data. As above, assume this method is expensive
      * and do not call it repeatedly. This method is intended for decoding 2D barcodes and may or
      * may not apply sharpening. Therefore, a row from this matrix may not be identical to one
      * fetched using getBlackRow(), so don't mix and match between them.
      *
      * @return The 2D array of bits for the image (true means black).
      * @throws NotFoundException if image can't be binarized to make a matrix
      */
    /* CompleteClass */
    override def getBlackMatrix(): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default = js.native
    
    /**
      * Converts one row of luminance data to 1 bit data. May actually do the conversion, or return
      * cached data. Callers should assume this method is expensive and call it as seldom as possible.
      * This method is intended for decoding 1D barcodes and may choose to apply sharpening.
      * For callers which only examine one row of pixels at a time, the same BitArray should be reused
      * and passed in with each call for performance. However it is legal to keep more than one row
      * at a time if needed.
      *
      * @param y The row to fetch, which must be in [0, bitmap height)
      * @param row An optional preallocated array. If null or too small, it will be ignored.
      *            If used, the Binarizer will call BitArray.clear(). Always use the returned object.
      * @return The array of bits for this row (true means black).
      * @throws NotFoundException if row can't be binarized
      */
    /* CompleteClass */
    override def getBlackRow(
      y: Double,
      row: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
    ): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default = js.native
    
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /* CompleteClass */
    override def getLuminanceSource(): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default = js.native
    
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /* private */ /* CompleteClass */
    var source: Any = js.native
  }
  
  /**
    * This class hierarchy provides a set of methods to convert luminance data to 1 bit data.
    * It allows the algorithm to vary polymorphically, for example allowing a very expensive
    * thresholding technique for servers and a fast one for mobile. It also permits the implementation
    * to vary, e.g. a JNI version for Android and a Java fallback version for other platforms.
    *
    * @author dswitkin@google.com (Daniel Switkin)
    */
  trait Binarizer extends StObject {
    
    /**
      * Creates a new object with the same type as this Binarizer implementation, but with pristine
      * state. This is needed because Binarizer implementations may be stateful, e.g. keeping a cache
      * of 1 bit data. See Effective Java for why we can't use Java's clone() method.
      *
      * @param source The LuminanceSource this Binarizer will operate on.
      * @return A new concrete Binarizer implementation object.
      */
    def createBinarizer(source: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default): Binarizer
    
    /**
      * Converts a 2D array of luminance data to 1 bit data. As above, assume this method is expensive
      * and do not call it repeatedly. This method is intended for decoding 2D barcodes and may or
      * may not apply sharpening. Therefore, a row from this matrix may not be identical to one
      * fetched using getBlackRow(), so don't mix and match between them.
      *
      * @return The 2D array of bits for the image (true means black).
      * @throws NotFoundException if image can't be binarized to make a matrix
      */
    def getBlackMatrix(): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default
    
    /**
      * Converts one row of luminance data to 1 bit data. May actually do the conversion, or return
      * cached data. Callers should assume this method is expensive and call it as seldom as possible.
      * This method is intended for decoding 1D barcodes and may choose to apply sharpening.
      * For callers which only examine one row of pixels at a time, the same BitArray should be reused
      * and passed in with each call for performance. However it is legal to keep more than one row
      * at a time if needed.
      *
      * @param y The row to fetch, which must be in [0, bitmap height)
      * @param row An optional preallocated array. If null or too small, it will be ignored.
      *            If used, the Binarizer will call BitArray.clear(). Always use the returned object.
      * @return The array of bits for this row (true means black).
      * @throws NotFoundException if row can't be binarized
      */
    def getBlackRow(
      y: Double,
      row: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
    ): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
    
    def getHeight(): Double
    
    def getLuminanceSource(): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default
    
    def getWidth(): Double
    
    /* private */ var source: Any
  }
  object Binarizer {
    
    inline def apply(
      createBinarizer: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default => Binarizer,
      getBlackMatrix: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default,
      getBlackRow: (Double, io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default) => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default,
      getHeight: () => Double,
      getLuminanceSource: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default,
      getWidth: () => Double,
      source: Any
    ): Binarizer = {
      val __obj = js.Dynamic.literal(createBinarizer = js.Any.fromFunction1(createBinarizer), getBlackMatrix = js.Any.fromFunction0(getBlackMatrix), getBlackRow = js.Any.fromFunction2(getBlackRow), getHeight = js.Any.fromFunction0(getHeight), getLuminanceSource = js.Any.fromFunction0(getLuminanceSource), getWidth = js.Any.fromFunction0(getWidth), source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binarizer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Binarizer] (val x: Self) extends AnyVal {
      
      inline def setCreateBinarizer(
        value: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default => Binarizer
      ): Self = StObject.set(x, "createBinarizer", js.Any.fromFunction1(value))
      
      inline def setGetBlackMatrix(value: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default): Self = StObject.set(x, "getBlackMatrix", js.Any.fromFunction0(value))
      
      inline def setGetBlackRow(
        value: (Double, io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default) => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
      ): Self = StObject.set(x, "getBlackRow", js.Any.fromFunction2(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetLuminanceSource(value: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreLuminanceSourceMod.default): Self = StObject.set(x, "getLuminanceSource", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setSource(value: Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
