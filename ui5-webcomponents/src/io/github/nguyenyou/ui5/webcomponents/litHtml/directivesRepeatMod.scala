package io.github.nguyenyou.ui5.webcomponents.litHtml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesRepeatMod {
  
  type ItemTemplate[T] = js.Function2[/* item */ T, /* index */ Double, Any]
  
  type KeyFn[T] = js.Function2[/* item */ T, /* index */ Double, Any]
  
  @js.native
  trait RepeatDirectiveFn extends StObject {
    
    def apply[T](items: js.Iterable[T], keyFnOrTemplate: ItemTemplate[T] | KeyFn[T]): Any = js.native
    def apply[T](items: js.Iterable[T], keyFnOrTemplate: ItemTemplate[T] | KeyFn[T], template: ItemTemplate[T]): Any = js.native
  }
}
