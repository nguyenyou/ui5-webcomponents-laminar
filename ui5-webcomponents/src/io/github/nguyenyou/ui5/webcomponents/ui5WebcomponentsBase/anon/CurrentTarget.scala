package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTarget[Target /* <: EventTarget */] extends StObject {
  
  val currentTarget: Target
}
object CurrentTarget {
  
  inline def apply[Target /* <: EventTarget */](currentTarget: Target): CurrentTarget[Target] = {
    val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTarget[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentTarget[?], Target /* <: EventTarget */] (val x: Self & CurrentTarget[Target]) extends AnyVal {
    
    inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
  }
}
