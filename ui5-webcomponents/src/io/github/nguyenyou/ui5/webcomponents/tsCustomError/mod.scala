package io.github.nguyenyou.ui5.webcomponents.tsCustomError

import io.github.nguyenyou.ui5.webcomponents.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-custom-error", "CustomError")
  @js.native
  open class CustomError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, options: ErrorOptions) = this()
    def this(message: Unit, options: ErrorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  trait ErrorOptions extends StObject {
    
    var cause: js.UndefOr[Any] = js.undefined
  }
  object ErrorOptions {
    
    inline def apply(): ErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorOptions] (val x: Self) extends AnyVal {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    }
  }
}
