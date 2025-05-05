package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - `io.github.nguyenyou.ui5.webcomponents`.std.IteratorYieldResult[T]
  - `io.github.nguyenyou.ui5.webcomponents`.std.IteratorReturnResult[TReturn]
*/
trait IteratorResult[T, TReturn] extends StObject
object IteratorResult {
  
  inline def IteratorReturnResult[TReturn](value: TReturn): io.github.nguyenyou.ui5.webcomponents.std.IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.std.IteratorReturnResult[TReturn]]
  }
  
  inline def IteratorYieldResult[T](value: T): io.github.nguyenyou.ui5.webcomponents.std.IteratorYieldResult[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[io.github.nguyenyou.ui5.webcomponents.std.IteratorYieldResult[T]]
  }
}
