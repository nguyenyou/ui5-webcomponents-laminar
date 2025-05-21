package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import io.github.nguyenyou.ui5.webcomponents.std.Awaited
import io.github.nguyenyou.ui5.webcomponents.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventProviderMod {
  
  @JSImport("@ui5/webcomponents-base/dist/EventProvider.js", JSImport.Default)
  @js.native
  open class default[EventListenerParam, EventListenerReturn] ()
    extends StObject
       with EventProvider[EventListenerParam, EventListenerReturn] {
    
    /* CompleteClass */
    var _eventRegistry: Map[String, js.Array[js.Function1[EventListenerParam, EventListenerReturn]]] = js.native
    
    /* CompleteClass */
    override def attachEvent(eventName: String, fnFunction: js.Function1[EventListenerParam, EventListenerReturn]): Unit = js.native
    
    /* CompleteClass */
    override def detachEvent(eventName: String, fnFunction: js.Function1[EventListenerParam, EventListenerReturn]): Unit = js.native
    
    /**
      * Fires an event and returns the results of all event listeners as an array.
      *
      * @param eventName the event to fire
      * @param data optional data to pass to each event listener
      * @returns {Array} an array with the results of all event listeners
      */
    /* CompleteClass */
    override def fireEvent(eventName: String, data: EventListenerParam): js.Array[EventListenerReturn] = js.native
    
    /**
      * Fires an event and returns a promise that will resolve once all listeners have resolved.
      *
      * @param eventName the event to fire
      * @param data optional data to pass to each event listener
      * @returns {Promise} a promise that will resolve when all listeners have resolved
      */
    /* CompleteClass */
    override def fireEventAsync(eventName: String, data: EventListenerParam): js.Promise[js.Array[Awaited[EventListenerReturn]]] = js.native
    
    /* CompleteClass */
    override def hasListeners(eventName: String): Boolean = js.native
    
    /* CompleteClass */
    override def isHandlerAttached(eventName: String, fnFunction: js.Function1[EventListenerParam, EventListenerReturn]): Boolean = js.native
  }
  
  trait EventProvider[EventListenerParam, EventListenerReturn] extends StObject {
    
    var _eventRegistry: Map[
        String, 
        js.Array[js.Function1[/* param */ EventListenerParam, EventListenerReturn]]
      ]
    
    def attachEvent(eventName: String, fnFunction: js.Function1[/* param */ EventListenerParam, EventListenerReturn]): Unit
    
    def detachEvent(eventName: String, fnFunction: js.Function1[/* param */ EventListenerParam, EventListenerReturn]): Unit
    
    /**
      * Fires an event and returns the results of all event listeners as an array.
      *
      * @param eventName the event to fire
      * @param data optional data to pass to each event listener
      * @returns {Array} an array with the results of all event listeners
      */
    def fireEvent(eventName: String, data: EventListenerParam): js.Array[EventListenerReturn]
    
    /**
      * Fires an event and returns a promise that will resolve once all listeners have resolved.
      *
      * @param eventName the event to fire
      * @param data optional data to pass to each event listener
      * @returns {Promise} a promise that will resolve when all listeners have resolved
      */
    def fireEventAsync(eventName: String, data: EventListenerParam): js.Promise[js.Array[Awaited[EventListenerReturn]]]
    
    def hasListeners(eventName: String): Boolean
    
    def isHandlerAttached(eventName: String, fnFunction: js.Function1[/* param */ EventListenerParam, EventListenerReturn]): Boolean
  }
  object EventProvider {
    
    inline def apply[EventListenerParam, EventListenerReturn](
      _eventRegistry: Map[
          String, 
          js.Array[js.Function1[/* param */ EventListenerParam, EventListenerReturn]]
        ],
      attachEvent: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Unit,
      detachEvent: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Unit,
      fireEvent: (String, EventListenerParam) => js.Array[EventListenerReturn],
      fireEventAsync: (String, EventListenerParam) => js.Promise[js.Array[Awaited[EventListenerReturn]]],
      hasListeners: String => Boolean,
      isHandlerAttached: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Boolean
    ): EventProvider[EventListenerParam, EventListenerReturn] = {
      val __obj = js.Dynamic.literal(_eventRegistry = _eventRegistry.asInstanceOf[js.Any], attachEvent = js.Any.fromFunction2(attachEvent), detachEvent = js.Any.fromFunction2(detachEvent), fireEvent = js.Any.fromFunction2(fireEvent), fireEventAsync = js.Any.fromFunction2(fireEventAsync), hasListeners = js.Any.fromFunction1(hasListeners), isHandlerAttached = js.Any.fromFunction2(isHandlerAttached))
      __obj.asInstanceOf[EventProvider[EventListenerParam, EventListenerReturn]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventProvider[?, ?], EventListenerParam, EventListenerReturn] (val x: Self & (EventProvider[EventListenerParam, EventListenerReturn])) extends AnyVal {
      
      inline def setAttachEvent(value: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Unit): Self = StObject.set(x, "attachEvent", js.Any.fromFunction2(value))
      
      inline def setDetachEvent(value: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Unit): Self = StObject.set(x, "detachEvent", js.Any.fromFunction2(value))
      
      inline def setFireEvent(value: (String, EventListenerParam) => js.Array[EventListenerReturn]): Self = StObject.set(x, "fireEvent", js.Any.fromFunction2(value))
      
      inline def setFireEventAsync(value: (String, EventListenerParam) => js.Promise[js.Array[Awaited[EventListenerReturn]]]): Self = StObject.set(x, "fireEventAsync", js.Any.fromFunction2(value))
      
      inline def setHasListeners(value: String => Boolean): Self = StObject.set(x, "hasListeners", js.Any.fromFunction1(value))
      
      inline def setIsHandlerAttached(value: (String, js.Function1[/* param */ EventListenerParam, EventListenerReturn]) => Boolean): Self = StObject.set(x, "isHandlerAttached", js.Any.fromFunction2(value))
      
      inline def set_eventRegistry(
        value: Map[
              String, 
              js.Array[js.Function1[/* param */ EventListenerParam, EventListenerReturn]]
            ]
      ): Self = StObject.set(x, "_eventRegistry", value.asInstanceOf[js.Any])
    }
  }
}
