package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.std.DOMHighResTimeStamp
import io.github.nguyenyou.ui5.webcomponents.std.StaticRange
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`0`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`1`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`2`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseInts.`3`
import org.scalajs.dom.DataTransfer
import org.scalajs.dom.EventTarget
import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @ui5/webcomponents-base.@ui5/webcomponents-base/dist/thirdparty/preact/jsx.JSXInternal.TargetedEvent<Target, std.InputEvent> */
trait TargetedInputEvent[Target /* <: EventTarget */] extends StObject {
  
  var AT_TARGET: `2`
  
  var BUBBLING_PHASE: `3`
  
  var CAPTURING_PHASE: `1`
  
  var NONE: `0`
  
  var bubbles: Boolean
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var composed: Boolean
  
  def composedPath(): js.Array[EventTarget]
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]]
  
  val currentTarget: Target
  
  var data: js.UndefOr[String | Null] = js.undefined
  
  var dataTransfer: js.UndefOr[DataTransfer | Null] = js.undefined
  
  var defaultPrevented: Boolean
  
  var detail: Double
  
  var eventPhase: Double
  
  def getTargetRanges(): js.Array[StaticRange]
  @JSName("getTargetRanges")
  var getTargetRanges_Original: js.Function0[js.Array[StaticRange]]
  
  def initEvent(`type`: String): Unit
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit]
  
  def initUIEvent(typeArg: String): Unit
  @JSName("initUIEvent")
  var initUIEvent_Original: js.Function1[/* typeArg */ String, Unit]
  
  var inputType: String
  
  var isComposing: Boolean
  
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
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  var which: Double
}
object TargetedInputEvent {
  
  inline def apply[Target /* <: EventTarget */](
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    composed: Boolean,
    composedPath: () => js.Array[EventTarget],
    currentTarget: Target,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getTargetRanges: () => js.Array[StaticRange],
    initEvent: /* type */ String => Unit,
    initUIEvent: /* typeArg */ String => Unit,
    inputType: String,
    isComposing: Boolean,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    returnValue: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: DOMHighResTimeStamp,
    `type`: String,
    which: Double
  ): TargetedInputEvent[Target] = {
    val __obj = js.Dynamic.literal(AT_TARGET = 2, BUBBLING_PHASE = 3, CAPTURING_PHASE = 1, NONE = 0, bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getTargetRanges = js.Any.fromFunction0(getTargetRanges), initEvent = js.Any.fromFunction1(initEvent), initUIEvent = js.Any.fromFunction1(initUIEvent), inputType = inputType.asInstanceOf[js.Any], isComposing = isComposing.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedInputEvent[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetedInputEvent[?], Target /* <: EventTarget */] (val x: Self & TargetedInputEvent[Target]) extends AnyVal {
    
    inline def setAT_TARGET(value: `2`): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: `3`): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: `1`): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataNull: Self = StObject.set(x, "data", null)
    
    inline def setDataTransfer(value: DataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    inline def setDataTransferNull: Self = StObject.set(x, "dataTransfer", null)
    
    inline def setDataTransferUndefined: Self = StObject.set(x, "dataTransfer", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setGetTargetRanges(value: () => js.Array[StaticRange]): Self = StObject.set(x, "getTargetRanges", js.Any.fromFunction0(value))
    
    inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    inline def setInitUIEvent(value: /* typeArg */ String => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1(value))
    
    inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
    
    inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: `0`): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
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
    
    inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
  }
}
