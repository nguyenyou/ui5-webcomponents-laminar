package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.DOMHighResTimeStamp
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsx.JSXInternal.TargetedEvent<std.EventTarget, std.Event> */
trait TargetedEventEventTargetE extends StObject {
  
  var AT_TARGET: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
  
  var BUBBLING_PHASE: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`
  
  var CAPTURING_PHASE: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
  
  var NONE: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`
  
  var bubbles: Boolean
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var composed: Boolean
  
  def composedPath(): js.Array[EventTarget]
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]]
  
  val currentTarget: EventTarget
  
  var defaultPrevented: Boolean
  
  var eventPhase: Double
  
  def initEvent(`type`: String): Unit
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit]
  
  var isTrusted: Boolean
  
  def preventDefault(): Unit
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit]
  
  var returnValue: Boolean
  
  var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
  
  def stopImmediatePropagation(): Unit
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit]
  
  def stopPropagation(): Unit
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit]
  
  var target: js.UndefOr[EventTarget | Null] = js.undefined
  
  var timeStamp: DOMHighResTimeStamp
  
  var `type`: String
}
object TargetedEventEventTargetE {
  
  inline def apply(
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    composed: Boolean,
    composedPath: () => js.Array[EventTarget],
    currentTarget: EventTarget,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: /* type */ String => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    returnValue: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: DOMHighResTimeStamp,
    `type`: String
  ): TargetedEventEventTargetE = {
    val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedEventEventTargetE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetedEventEventTargetE] (val x: Self) extends AnyVal {
    
    inline def setAT_TARGET(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
