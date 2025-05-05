package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignalLike[T] extends StObject {
  
  def peek(): T
  
  def subscribe(fn: js.Function1[/* value */ T, Unit]): js.Function0[Unit]
  
  var value: T
}
object SignalLike {
  
  inline def apply[T](peek: () => T, subscribe: js.Function1[/* value */ T, Unit] => js.Function0[Unit], value: T): SignalLike[T] = {
    val __obj = js.Dynamic.literal(peek = js.Any.fromFunction0(peek), subscribe = js.Any.fromFunction1(subscribe), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignalLike[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SignalLike[?], T] (val x: Self & SignalLike[T]) extends AnyVal {
    
    inline def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
    
    inline def setSubscribe(value: js.Function1[/* value */ T, Unit] => js.Function0[Unit]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
