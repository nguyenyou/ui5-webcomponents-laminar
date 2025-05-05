package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promise extends StObject {
  
  def promise(): js.Promise[Unit | js.Error]
  
  def stop(): js.Function0[Unit]
}
object Promise {
  
  inline def apply(promise: () => js.Promise[Unit | js.Error], stop: () => js.Function0[Unit]): Promise = {
    val __obj = js.Dynamic.literal(promise = js.Any.fromFunction0(promise), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Promise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
    
    inline def setPromise(value: () => js.Promise[Unit | js.Error]): Self = StObject.set(x, "promise", js.Any.fromFunction0(value))
    
    inline def setStop(value: () => js.Function0[Unit]): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
