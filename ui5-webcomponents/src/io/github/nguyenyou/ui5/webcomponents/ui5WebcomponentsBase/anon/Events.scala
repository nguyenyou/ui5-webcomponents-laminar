package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: js.Array[String]
}
object Events {
  
  inline def apply(events: js.Array[String]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: js.Array[String]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: String*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
