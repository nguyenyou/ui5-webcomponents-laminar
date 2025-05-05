package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreCommonBitArrayMod {
  
  @JSImport("@zxing/library/esm/core/common/BitArray", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with BitArray {
    def this(size: Double) = this()
    def this(size: Double, bits: js.typedarray.Int32Array) = this()
    def this(size: Unit, bits: js.typedarray.Int32Array) = this()
    
    /* CompleteClass */
    override def appendBit(bit: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def appendBitArray(other: BitArray): Unit = js.native
    
    /**
      * Appends the least-significant bits, from value, in order from most-significant to
      * least-significant. For example, appending 6 bits from 0x000001E will append the bits
      * 0, 1, 1, 1, 1, 0 in that order.
      *
      * @param value {@code int} containing bits to append
      * @param numBits bits from value to append
      */
    /* CompleteClass */
    override def appendBits(value: Double, numBits: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var bits: Any = js.native
    
    /**
      * Clears all bits (sets to false).
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var ensureCapacity: Any = js.native
    
    /**
      * Flips bit i.
      *
      * @param i bit to set
      */
    /* CompleteClass */
    override def flip(i: Double): Unit = js.native
    
    /**
      * @param i bit to get
      * @return true iff bit i is set
      */
    /* CompleteClass */
    override def get(i: Double): Boolean = js.native
    
    /**
      * @return underlying array of ints. The first element holds the first 32 bits, and the least
      *         significant bit is bit 0.
      */
    /* CompleteClass */
    override def getBitArray(): js.typedarray.Int32Array = js.native
    
    /**
      * @param from first bit to check
      * @return index of first bit that is set, starting from the given index, or size if none are set
      *  at or beyond this given index
      * @see #getNextUnset(int)
      */
    /* CompleteClass */
    override def getNextSet(from: Double): Double = js.native
    
    /**
      * @param from index to start looking for unset bit
      * @return index of next unset bit, or {@code size} if none are unset until the end
      * @see #getNextSet(int)
      */
    /* CompleteClass */
    override def getNextUnset(from: Double): Double = js.native
    
    /* CompleteClass */
    override def getSize(): Double = js.native
    
    /* CompleteClass */
    override def getSizeInBytes(): Double = js.native
    
    /**
      * Efficient method to check if a range of bits is set, or not set.
      *
      * @param start start of range, inclusive.
      * @param end end of range, exclusive
      * @param value if true, checks that bits in range are set, otherwise checks that they are not set
      * @return true iff all bits are set or not set in range, according to value argument
      * @throws IllegalArgumentException if end is less than start or the range is not contained in the array
      */
    /* CompleteClass */
    override def isRange(start: Double, end: Double, value: Boolean): Boolean = js.native
    
    /**
      * Reverses all bits in the array.
      */
    /* CompleteClass */
    override def reverse(): Unit = js.native
    
    /**
      * Sets bit i.
      *
      * @param i bit to set
      */
    /* CompleteClass */
    override def set(i: Double): Unit = js.native
    
    /**
      * Sets a block of 32 bits, starting at bit i.
      *
      * @param i first bit to set
      * @param newBits the new value of the next 32 bits. Note again that the least-significant bit
      * corresponds to bit i, the next-least-significant to i+1, and so on.
      */
    /* CompleteClass */
    override def setBulk(i: Double, newBits: Double): Unit = js.native
    
    /**
      * Sets a range of bits.
      *
      * @param start start of range, inclusive.
      * @param end end of range, exclusive
      */
    /* CompleteClass */
    override def setRange(start: Double, end: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var size: Any = js.native
    
    /**
      * converts to boolean array.
      */
    /* CompleteClass */
    override def toArray(): js.Array[Boolean] = js.native
    
    /**
      *
      * @param bitOffset first bit to start writing
      * @param array array to write into. Bytes are written most-significant byte first. This is the opposite
      *  of the internal representation, which is exposed by {@link #getBitArray()}
      * @param offset position in array to start writing
      * @param numBytes how many bytes to write
      */
    /* CompleteClass */
    override def toBytes(bitOffset: Double, array: js.typedarray.Uint8Array, offset: Double, numBytes: Double): Unit = js.native
    
    /* CompleteClass */
    override def xor(other: BitArray): Unit = js.native
  }
  /* static members */
  object default
  
  trait BitArray extends StObject {
    
    def appendBit(bit: Boolean): Unit
    
    def appendBitArray(other: BitArray): Unit
    
    /**
      * Appends the least-significant bits, from value, in order from most-significant to
      * least-significant. For example, appending 6 bits from 0x000001E will append the bits
      * 0, 1, 1, 1, 1, 0 in that order.
      *
      * @param value {@code int} containing bits to append
      * @param numBits bits from value to append
      */
    def appendBits(value: Double, numBits: Double): Unit
    
    /* private */ var bits: Any
    
    /**
      * Clears all bits (sets to false).
      */
    def clear(): Unit
    
    /* private */ var ensureCapacity: Any
    
    /**
      * Flips bit i.
      *
      * @param i bit to set
      */
    def flip(i: Double): Unit
    
    /**
      * @param i bit to get
      * @return true iff bit i is set
      */
    def get(i: Double): Boolean
    
    /**
      * @return underlying array of ints. The first element holds the first 32 bits, and the least
      *         significant bit is bit 0.
      */
    def getBitArray(): js.typedarray.Int32Array
    
    /**
      * @param from first bit to check
      * @return index of first bit that is set, starting from the given index, or size if none are set
      *  at or beyond this given index
      * @see #getNextUnset(int)
      */
    def getNextSet(from: Double): Double
    
    /**
      * @param from index to start looking for unset bit
      * @return index of next unset bit, or {@code size} if none are unset until the end
      * @see #getNextSet(int)
      */
    def getNextUnset(from: Double): Double
    
    def getSize(): Double
    
    def getSizeInBytes(): Double
    
    /**
      * Efficient method to check if a range of bits is set, or not set.
      *
      * @param start start of range, inclusive.
      * @param end end of range, exclusive
      * @param value if true, checks that bits in range are set, otherwise checks that they are not set
      * @return true iff all bits are set or not set in range, according to value argument
      * @throws IllegalArgumentException if end is less than start or the range is not contained in the array
      */
    def isRange(start: Double, end: Double, value: Boolean): Boolean
    
    /**
      * Reverses all bits in the array.
      */
    def reverse(): Unit
    
    /**
      * Sets bit i.
      *
      * @param i bit to set
      */
    def set(i: Double): Unit
    
    /**
      * Sets a block of 32 bits, starting at bit i.
      *
      * @param i first bit to set
      * @param newBits the new value of the next 32 bits. Note again that the least-significant bit
      * corresponds to bit i, the next-least-significant to i+1, and so on.
      */
    def setBulk(i: Double, newBits: Double): Unit
    
    /**
      * Sets a range of bits.
      *
      * @param start start of range, inclusive.
      * @param end end of range, exclusive
      */
    def setRange(start: Double, end: Double): Unit
    
    /* private */ var size: Any
    
    /**
      * converts to boolean array.
      */
    def toArray(): js.Array[Boolean]
    
    /**
      *
      * @param bitOffset first bit to start writing
      * @param array array to write into. Bytes are written most-significant byte first. This is the opposite
      *  of the internal representation, which is exposed by {@link #getBitArray()}
      * @param offset position in array to start writing
      * @param numBytes how many bytes to write
      */
    def toBytes(bitOffset: Double, array: js.typedarray.Uint8Array, offset: Double, numBytes: Double): Unit
    
    def xor(other: BitArray): Unit
  }
  object BitArray {
    
    inline def apply(
      appendBit: Boolean => Unit,
      appendBitArray: BitArray => Unit,
      appendBits: (Double, Double) => Unit,
      bits: Any,
      clear: () => Unit,
      ensureCapacity: Any,
      flip: Double => Unit,
      get: Double => Boolean,
      getBitArray: () => js.typedarray.Int32Array,
      getNextSet: Double => Double,
      getNextUnset: Double => Double,
      getSize: () => Double,
      getSizeInBytes: () => Double,
      isRange: (Double, Double, Boolean) => Boolean,
      reverse: () => Unit,
      set: Double => Unit,
      setBulk: (Double, Double) => Unit,
      setRange: (Double, Double) => Unit,
      size: Any,
      toArray: () => js.Array[Boolean],
      toBytes: (Double, js.typedarray.Uint8Array, Double, Double) => Unit,
      xor: BitArray => Unit
    ): BitArray = {
      val __obj = js.Dynamic.literal(appendBit = js.Any.fromFunction1(appendBit), appendBitArray = js.Any.fromFunction1(appendBitArray), appendBits = js.Any.fromFunction2(appendBits), bits = bits.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), ensureCapacity = ensureCapacity.asInstanceOf[js.Any], flip = js.Any.fromFunction1(flip), get = js.Any.fromFunction1(get), getBitArray = js.Any.fromFunction0(getBitArray), getNextSet = js.Any.fromFunction1(getNextSet), getNextUnset = js.Any.fromFunction1(getNextUnset), getSize = js.Any.fromFunction0(getSize), getSizeInBytes = js.Any.fromFunction0(getSizeInBytes), isRange = js.Any.fromFunction3(isRange), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), setBulk = js.Any.fromFunction2(setBulk), setRange = js.Any.fromFunction2(setRange), size = size.asInstanceOf[js.Any], toArray = js.Any.fromFunction0(toArray), toBytes = js.Any.fromFunction4(toBytes), xor = js.Any.fromFunction1(xor))
      __obj.asInstanceOf[BitArray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitArray] (val x: Self) extends AnyVal {
      
      inline def setAppendBit(value: Boolean => Unit): Self = StObject.set(x, "appendBit", js.Any.fromFunction1(value))
      
      inline def setAppendBitArray(value: BitArray => Unit): Self = StObject.set(x, "appendBitArray", js.Any.fromFunction1(value))
      
      inline def setAppendBits(value: (Double, Double) => Unit): Self = StObject.set(x, "appendBits", js.Any.fromFunction2(value))
      
      inline def setBits(value: Any): Self = StObject.set(x, "bits", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setEnsureCapacity(value: Any): Self = StObject.set(x, "ensureCapacity", value.asInstanceOf[js.Any])
      
      inline def setFlip(value: Double => Unit): Self = StObject.set(x, "flip", js.Any.fromFunction1(value))
      
      inline def setGet(value: Double => Boolean): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetBitArray(value: () => js.typedarray.Int32Array): Self = StObject.set(x, "getBitArray", js.Any.fromFunction0(value))
      
      inline def setGetNextSet(value: Double => Double): Self = StObject.set(x, "getNextSet", js.Any.fromFunction1(value))
      
      inline def setGetNextUnset(value: Double => Double): Self = StObject.set(x, "getNextUnset", js.Any.fromFunction1(value))
      
      inline def setGetSize(value: () => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
      
      inline def setGetSizeInBytes(value: () => Double): Self = StObject.set(x, "getSizeInBytes", js.Any.fromFunction0(value))
      
      inline def setIsRange(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "isRange", js.Any.fromFunction3(value))
      
      inline def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setSet(value: Double => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetBulk(value: (Double, Double) => Unit): Self = StObject.set(x, "setBulk", js.Any.fromFunction2(value))
      
      inline def setSetRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setRange", js.Any.fromFunction2(value))
      
      inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setToArray(value: () => js.Array[Boolean]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
      
      inline def setToBytes(value: (Double, js.typedarray.Uint8Array, Double, Double) => Unit): Self = StObject.set(x, "toBytes", js.Any.fromFunction4(value))
      
      inline def setXor(value: BitArray => Unit): Self = StObject.set(x, "xor", js.Any.fromFunction1(value))
    }
  }
}
