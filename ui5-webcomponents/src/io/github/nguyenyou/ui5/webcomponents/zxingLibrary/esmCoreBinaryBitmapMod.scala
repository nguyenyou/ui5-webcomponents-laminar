package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreBinaryBitmapMod {
  
  @JSImport("@zxing/library/esm/core/BinaryBitmap", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BinaryBitmap {
    def this(binarizer: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreBinarizerMod.default) = this()
    
    /* private */ /* CompleteClass */
    var binarizer: Any = js.native
    
    /**
      * Returns a new object with cropped image data. Implementations may keep a reference to the
      * original data rather than a copy. Only callable if isCropSupported() is true.
      *
      * @param left The left coordinate, which must be in [0,getWidth())
      * @param top The top coordinate, which must be in [0,getHeight())
      * @param width The width of the rectangle to crop.
      * @param height The height of the rectangle to crop.
      * @return A cropped version of this object.
      */
    /* CompleteClass */
    override def crop(left: Double, top: Double, width: Double, height: Double): BinaryBitmap = js.native
    
    /**
      * Converts a 2D array of luminance data to 1 bit. As above, assume this method is expensive
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
    
    /**
      * @return The height of the bitmap.
      */
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /**
      * @return The width of the bitmap.
      */
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /**
      * @return Whether this bitmap can be cropped.
      */
    /* CompleteClass */
    override def isCropSupported(): Boolean = js.native
    
    /**
      * @return Whether this bitmap supports counter-clockwise rotation.
      */
    /* CompleteClass */
    override def isRotateSupported(): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var matrix: Any = js.native
    
    /**
      * Returns a new object with rotated image data by 90 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    /* CompleteClass */
    override def rotateCounterClockwise(): BinaryBitmap = js.native
    
    /**
      * Returns a new object with rotated image data by 45 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    /* CompleteClass */
    override def rotateCounterClockwise45(): BinaryBitmap = js.native
  }
  
  trait BinaryBitmap extends StObject {
    
    /* private */ var binarizer: Any
    
    /**
      * Returns a new object with cropped image data. Implementations may keep a reference to the
      * original data rather than a copy. Only callable if isCropSupported() is true.
      *
      * @param left The left coordinate, which must be in [0,getWidth())
      * @param top The top coordinate, which must be in [0,getHeight())
      * @param width The width of the rectangle to crop.
      * @param height The height of the rectangle to crop.
      * @return A cropped version of this object.
      */
    def crop(left: Double, top: Double, width: Double, height: Double): BinaryBitmap
    
    /**
      * Converts a 2D array of luminance data to 1 bit. As above, assume this method is expensive
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
    
    /**
      * @return The height of the bitmap.
      */
    def getHeight(): Double
    
    /**
      * @return The width of the bitmap.
      */
    def getWidth(): Double
    
    /**
      * @return Whether this bitmap can be cropped.
      */
    def isCropSupported(): Boolean
    
    /**
      * @return Whether this bitmap supports counter-clockwise rotation.
      */
    def isRotateSupported(): Boolean
    
    /* private */ var matrix: Any
    
    /**
      * Returns a new object with rotated image data by 90 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    def rotateCounterClockwise(): BinaryBitmap
    
    /**
      * Returns a new object with rotated image data by 45 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    def rotateCounterClockwise45(): BinaryBitmap
  }
  object BinaryBitmap {
    
    inline def apply(
      binarizer: Any,
      crop: (Double, Double, Double, Double) => BinaryBitmap,
      getBlackMatrix: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default,
      getBlackRow: (Double, io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default) => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default,
      getHeight: () => Double,
      getWidth: () => Double,
      isCropSupported: () => Boolean,
      isRotateSupported: () => Boolean,
      matrix: Any,
      rotateCounterClockwise: () => BinaryBitmap,
      rotateCounterClockwise45: () => BinaryBitmap
    ): BinaryBitmap = {
      val __obj = js.Dynamic.literal(binarizer = binarizer.asInstanceOf[js.Any], crop = js.Any.fromFunction4(crop), getBlackMatrix = js.Any.fromFunction0(getBlackMatrix), getBlackRow = js.Any.fromFunction2(getBlackRow), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth), isCropSupported = js.Any.fromFunction0(isCropSupported), isRotateSupported = js.Any.fromFunction0(isRotateSupported), matrix = matrix.asInstanceOf[js.Any], rotateCounterClockwise = js.Any.fromFunction0(rotateCounterClockwise), rotateCounterClockwise45 = js.Any.fromFunction0(rotateCounterClockwise45))
      __obj.asInstanceOf[BinaryBitmap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BinaryBitmap] (val x: Self) extends AnyVal {
      
      inline def setBinarizer(value: Any): Self = StObject.set(x, "binarizer", value.asInstanceOf[js.Any])
      
      inline def setCrop(value: (Double, Double, Double, Double) => BinaryBitmap): Self = StObject.set(x, "crop", js.Any.fromFunction4(value))
      
      inline def setGetBlackMatrix(value: () => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitMatrixMod.default): Self = StObject.set(x, "getBlackMatrix", js.Any.fromFunction0(value))
      
      inline def setGetBlackRow(
        value: (Double, io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default) => io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
      ): Self = StObject.set(x, "getBlackRow", js.Any.fromFunction2(value))
      
      inline def setGetHeight(value: () => Double): Self = StObject.set(x, "getHeight", js.Any.fromFunction0(value))
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setIsCropSupported(value: () => Boolean): Self = StObject.set(x, "isCropSupported", js.Any.fromFunction0(value))
      
      inline def setIsRotateSupported(value: () => Boolean): Self = StObject.set(x, "isRotateSupported", js.Any.fromFunction0(value))
      
      inline def setMatrix(value: Any): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
      
      inline def setRotateCounterClockwise(value: () => BinaryBitmap): Self = StObject.set(x, "rotateCounterClockwise", js.Any.fromFunction0(value))
      
      inline def setRotateCounterClockwise45(value: () => BinaryBitmap): Self = StObject.set(x, "rotateCounterClockwise45", js.Any.fromFunction0(value))
    }
  }
}
