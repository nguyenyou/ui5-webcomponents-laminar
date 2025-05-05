package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.zxingLibrary.esmCustomTypingsMod.float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreResultPointMod {
  
  @JSImport("@zxing/library/esm/core/ResultPoint", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ResultPoint {
    def this(x: float, y: float) = this()
    
    /* CompleteClass */
    override def equals(other: js.Object): Boolean = js.native
    
    /* CompleteClass */
    override def getX(): float = js.native
    
    /* CompleteClass */
    override def getY(): float = js.native
    
    /* private */ /* CompleteClass */
    var x: Any = js.native
    
    /* private */ /* CompleteClass */
    var y: Any = js.native
  }
  /* static members */
  object default
  
  trait ResultPoint extends StObject {
    
    def equals(other: js.Object): Boolean
    
    def getX(): float
    
    def getY(): float
    
    /* private */ var x: Any
    
    /* private */ var y: Any
  }
  object ResultPoint {
    
    inline def apply(equals_ : js.Object => Boolean, getX: () => float, getY: () => float, x: Any, y: Any): ResultPoint = {
      val __obj = js.Dynamic.literal(getX = js.Any.fromFunction0(getX), getY = js.Any.fromFunction0(getY), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[ResultPoint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResultPoint] (val x: Self) extends AnyVal {
      
      inline def setEquals_(value: js.Object => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setGetX(value: () => float): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
      
      inline def setGetY(value: () => float): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
      
      inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
