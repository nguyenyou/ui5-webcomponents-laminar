package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreLuminanceSourceMod {
  
  /* note: abstract class */ @JSImport("@zxing/library/esm/core/LuminanceSource", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with LuminanceSource {
    /* protected */ def this(width: Double, height: Double) = this()
  }
  
  @js.native
  trait LuminanceSource extends StObject {
    
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
    def crop(left: Double, top: Double, width: Double, height: Double): LuminanceSource = js.native
    
    /**
      * @return The height of the bitmap.
      */
    def getHeight(): Double = js.native
    
    /**
      * Fetches luminance data for the underlying bitmap. Values should be fetched using:
      * {@code int luminance = array[y * width + x] & 0xff}
      *
      * @return A row-major 2D array of luminance values. Do not use result.length as it may be
      *         larger than width * height bytes on some platforms. Do not modify the contents
      *         of the result.
      */
    def getMatrix(): js.typedarray.Uint8ClampedArray = js.native
    
    /**
      * Fetches one row of luminance data from the underlying platform's bitmap. Values range from
      * 0 (black) to 255 (white). Because Java does not have an unsigned byte type, callers will have
      * to bitwise and with 0xff for each value. It is preferable for implementations of this method
      * to only fetch this row rather than the whole image, since no 2D Readers may be installed and
      * getMatrix() may never be called.
      *
      * @param y The row to fetch, which must be in [0,getHeight())
      * @param row An optional preallocated array. If null or too small, it will be ignored.
      *            Always use the returned object, and ignore the .length of the array.
      * @return An array containing the luminance data.
      */
    def getRow(y: Double): js.typedarray.Uint8ClampedArray = js.native
    def getRow(y: Double, row: js.typedarray.Uint8ClampedArray): js.typedarray.Uint8ClampedArray = js.native
    
    /**
      * @return The width of the bitmap.
      */
    def getWidth(): Double = js.native
    
    /* private */ var height: Any = js.native
    
    /**
      * @return a wrapper of this {@code LuminanceSource} which inverts the luminances it returns -- black becomes
      *  white and vice versa, and each value becomes (255-value).
      */
    def invert(): LuminanceSource = js.native
    
    /**
      * @return Whether this subclass supports cropping.
      */
    def isCropSupported(): Boolean = js.native
    
    /**
      * @return Whether this subclass supports counter-clockwise rotation.
      */
    def isRotateSupported(): Boolean = js.native
    
    /**
      * Returns a new object with rotated image data by 90 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    def rotateCounterClockwise(): LuminanceSource = js.native
    
    /**
      * Returns a new object with rotated image data by 45 degrees counterclockwise.
      * Only callable if {@link #isRotateSupported()} is true.
      *
      * @return A rotated version of this object.
      */
    def rotateCounterClockwise45(): LuminanceSource = js.native
    
    /* private */ var width: Any = js.native
  }
}
