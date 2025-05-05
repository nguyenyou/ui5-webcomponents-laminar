package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbedHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var height: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var width: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
}
object EmbedHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): EmbedHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmbedHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbedHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & EmbedHTMLAttributes[T]) extends AnyVal {
    
    inline def setHeight(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
