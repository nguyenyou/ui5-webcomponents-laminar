package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockquoteHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var cite: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object BlockquoteHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): BlockquoteHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockquoteHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockquoteHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & BlockquoteHTMLAttributes[T]) extends AnyVal {
    
    inline def setCite(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
    
    inline def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
  }
}
