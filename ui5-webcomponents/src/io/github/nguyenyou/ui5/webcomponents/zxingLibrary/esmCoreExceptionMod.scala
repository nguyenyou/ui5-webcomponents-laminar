package io.github.nguyenyou.ui5.webcomponents.zxingLibrary

import io.github.nguyenyou.ui5.webcomponents.tsCustomError.mod.CustomError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmCoreExceptionMod {
  
  @JSImport("@zxing/library/esm/core/Exception", JSImport.Default)
  @js.native
  /**
    * Allows Exception to be constructed directly
    * with some message and prototype definition.
    */
  open class default () extends Exception {
    def this(message: String) = this()
  }
  /* static members */
  object default
  
  @js.native
  trait Exception extends CustomError {
    
    def getKind(): String = js.native
  }
}
