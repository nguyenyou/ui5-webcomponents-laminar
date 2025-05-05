package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import io.github.nguyenyou.ui5.webcomponents.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancelable[EventDetail] extends StObject {
  
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  var cancelable: js.UndefOr[Boolean] = js.undefined
  
  var detail: js.UndefOr[Record[/* keyof EventDetail */ String, Type]] = js.undefined
}
object Cancelable {
  
  inline def apply[EventDetail](): Cancelable[EventDetail] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cancelable[EventDetail]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancelable[?], EventDetail] (val x: Self & Cancelable[EventDetail]) extends AnyVal {
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
    
    inline def setDetail(value: Record[/* keyof EventDetail */ String, Type]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
  }
}
