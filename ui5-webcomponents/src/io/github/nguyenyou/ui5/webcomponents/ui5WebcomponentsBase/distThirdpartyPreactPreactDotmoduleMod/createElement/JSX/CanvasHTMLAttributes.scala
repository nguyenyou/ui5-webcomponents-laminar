package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.HTMLAttributes[T] {
  
  var height: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Double | String]]
  ] = js.undefined
  
  var width: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Double | String]]
  ] = js.undefined
}
object CanvasHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): CanvasHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & CanvasHTMLAttributes[T]) extends AnyVal {
    
    inline def setHeight(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Double | String]]
    ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Double | String]]
    ): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
