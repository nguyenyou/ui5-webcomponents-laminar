package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreCommonBitMatrixMod {
  
  @JSImport("@zxing/library/esm/core/common/BitMatrix", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BitMatrix {
    /**
      * Creates an empty square {@link BitMatrix}.
      *
      * @param dimension height and width
      */
    /**
      * Creates an empty {@link BitMatrix}.
      *
      * @param width bit matrix width
      * @param height bit matrix height
      */
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Double, height: Double, rowSize: Double) = this()
    def this(width: Double, height: Unit, rowSize: Double) = this()
    def this(width: Double, height: Double, rowSize: Double, bits: js.typedarray.Int32Array) = this()
    def this(width: Double, height: Double, rowSize: Unit, bits: js.typedarray.Int32Array) = this()
    def this(width: Double, height: Unit, rowSize: Double, bits: js.typedarray.Int32Array) = this()
    def this(width: Double, height: Unit, rowSize: Unit, bits: js.typedarray.Int32Array) = this()
  }
  /* static members */
  object default
  
  @js.native
  trait BitMatrix extends StObject {
    
    /* private */ var bits: Any = js.native
    
    /* private */ var buildToString: Any = js.native
    
    /**
      * Clears all bits (sets to false).
      */
    def clear(): Unit = js.native
    
    def equals(o: js.Object): Boolean = js.native
    
    /**
      * <p>Flips the given bit.</p>
      *
      * @param x The horizontal component (i.e. which column)
      * @param y The vertical component (i.e. which row)
      */
    def flip(x: Double, y: Double): Unit = js.native
    
    /**
      * <p>Gets the requested bit, where true means black.</p>
      *
      * @param x The horizontal component (i.e. which column)
      * @param y The vertical component (i.e. which row)
      * @return value of given bit in matrix
      */
    def get(x: Double, y: Double): Boolean = js.native
    
    def getBottomRightOnBit(): js.typedarray.Int32Array = js.native
    
    /**
      * This is useful in detecting the enclosing rectangle of a 'pure' barcode.
      *
      * @return {@code left,top,width,height} enclosing rectangle of all 1 bits, or null if it is all white
      */
    def getEnclosingRectangle(): js.typedarray.Int32Array = js.native
    
    /**
      * @return The height of the matrix
      */
    def getHeight(): Double = js.native
    
    /**
      * A fast method to retrieve one row of data from the matrix as a BitArray.
      *
      * @param y The row to retrieve
      * @param row An optional caller-allocated BitArray, will be allocated if null or too small
      * @return The resulting BitArray - this reference should always be used even when passing
      *         your own row
      */
    def getRow(y: Double): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default = js.native
    def getRow(
      y: Double,
      row: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
    ): io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default = js.native
    
    /**
      * @return The row size of the matrix
      */
    def getRowSize(): Double = js.native
    
    /**
      * This is useful in detecting a corner of a 'pure' barcode.
      *
      * @return {@code x,y} coordinate of top-left-most 1 bit, or null if it is all white
      */
    def getTopLeftOnBit(): js.typedarray.Int32Array = js.native
    
    /**
      * @return The width of the matrix
      */
    def getWidth(): Double = js.native
    
    /* private */ var height: Any = js.native
    
    /**
      * Modifies this {@code BitMatrix} to represent the same but rotated 180 degrees
      */
    def rotate180(): Unit = js.native
    
    /* private */ var rowSize: Any = js.native
    
    /**
      * <p>Sets the given bit to true.</p>
      *
      * @param x The horizontal component (i.e. which column)
      * @param y The vertical component (i.e. which row)
      */
    def set(x: Double, y: Double): Unit = js.native
    
    /**
      * <p>Sets a square region of the bit matrix to true.</p>
      *
      * @param left The horizontal position to begin at (inclusive)
      * @param top The vertical position to begin at (inclusive)
      * @param width The width of the region
      * @param height The height of the region
      */
    def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
    
    /**
      * @param y row to set
      * @param row {@link BitArray} to copy from
      */
    def setRow(
      y: Double,
      row: io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCoreCommonBitArrayMod.default
    ): Unit = js.native
    
    def toString(setString: String): String = js.native
    def toString(setString: String, unsetString: String): String = js.native
    def toString(setString: String, unsetString: String, lineSeparator: String): String = js.native
    def toString(setString: String, unsetString: Unit, lineSeparator: String): String = js.native
    def toString(setString: Unit, unsetString: String): String = js.native
    def toString(setString: Unit, unsetString: String, lineSeparator: String): String = js.native
    def toString(setString: Unit, unsetString: Unit, lineSeparator: String): String = js.native
    
    def unset(x: Double, y: Double): Unit = js.native
    
    /* private */ var width: Any = js.native
    
    /**
      * Exclusive-or (XOR): Flip the bit in this {@code BitMatrix} if the corresponding
      * mask bit is set.
      *
      * @param mask XOR mask
      */
    def xor(mask: BitMatrix): Unit = js.native
  }
}
