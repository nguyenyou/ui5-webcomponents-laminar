package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`lazy`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.async
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.auto
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.eager
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.sync
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImgHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var alt: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var crossOrigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var crossorigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var decoding: js.UndefOr[Signalish[js.UndefOr[async | auto | sync]]] = js.undefined
  
  var height: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var loading: js.UndefOr[Signalish[js.UndefOr[eager | `lazy`]]] = js.undefined
  
  var referrerPolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var referrerpolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var sizes: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srcSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srcset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var useMap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var usemap: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var width: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
}
object ImgHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): ImgHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImgHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImgHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & ImgHTMLAttributes[T]) extends AnyVal {
    
    inline def setAlt(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setCrossOrigin(value: Signalish[HTMLAttributeCrossOrigin]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setDecoding(value: Signalish[js.UndefOr[async | auto | sync]]): Self = StObject.set(x, "decoding", value.asInstanceOf[js.Any])
    
    inline def setDecodingUndefined: Self = StObject.set(x, "decoding", js.undefined)
    
    inline def setHeight(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoading(value: Signalish[js.UndefOr[eager | `lazy`]]): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setReferrerPolicy(value: Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSizes(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
    
    inline def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setUseMap(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
    
    inline def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
