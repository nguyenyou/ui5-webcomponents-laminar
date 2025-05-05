package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuoteHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object QuoteHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): QuoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuoteHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuoteHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & QuoteHTMLAttributes[T]) extends AnyVal {
    
    inline def setCite(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
