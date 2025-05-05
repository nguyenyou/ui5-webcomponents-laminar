package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3`[T] extends StObject {
  
  def children(value: T): ComponentChildren
}
object `3` {
  
  inline def apply[T](children: T => ComponentChildren): `3`[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[`3`[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`[?], T] (val x: Self & `3`[T]) extends AnyVal {
    
    inline def setChildren(value: T => ComponentChildren): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
  }
}
