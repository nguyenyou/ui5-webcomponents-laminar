package io.github.nguyenyou.ui5.webcomponents.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventTarget is a DOM interface implemented by objects that can receive events and may have listeners for them.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget)
  */
@js.native
trait EventTarget extends StObject {
  
  /**
    * Appends an event listener for events whose type attribute value is type. The callback argument sets the callback that will be invoked when the event is dispatched.
    *
    * The options argument sets listener-specific options. For compatibility this can be a boolean, in which case the method behaves exactly as if the value was specified as options's capture.
    *
    * When set to true, options's capture prevents callback from being invoked when the event's eventPhase attribute value is BUBBLING_PHASE. When false (or not present), callback will not be invoked when event's eventPhase attribute value is CAPTURING_PHASE. Either way, callback will be invoked if event's eventPhase attribute value is AT_TARGET.
    *
    * When set to true, options's passive indicates that the callback will not cancel the event by invoking preventDefault(). This is used to enable performance optimizations described in § 2.8 Observing event listeners.
    *
    * When set to true, options's once indicates that the callback will only be invoked once after which the event listener will be removed.
    *
    * If an AbortSignal is passed for options's signal, then the event listener will be removed when signal is aborted.
    *
    * The event listener is appended to target's event listener list and is not appended if it has the same type, callback, and capture.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/addEventListener)
    */
  /* standard dom */
  def addEventListener(`type`: String): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: AddEventListenerOptions): Unit = js.native
  def addEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
  
  /**
    * Dispatches a synthetic event event to target and returns true if either event's cancelable attribute value is false or its preventDefault() method was not invoked, and false otherwise.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/dispatchEvent)
    */
  /* standard dom */
  def dispatchEvent(event: org.scalajs.dom.Event): Boolean = js.native
  
  /**
    * Removes the event listener in target's event listener list with the same type, callback, and options.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/EventTarget/removeEventListener)
    */
  /* standard dom */
  def removeEventListener(`type`: String): Unit = js.native
  def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
  def removeEventListener(
    `type`: String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: org.scalajs.dom.EventListenerOptions): Unit = js.native
  def removeEventListener(`type`: String, callback: Null, options: Boolean): Unit = js.native
}
