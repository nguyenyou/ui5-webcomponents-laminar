package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.auto
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.high
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.low
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinkHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var as: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var charSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var charset: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var crossOrigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var crossorigin: js.UndefOr[Signalish[HTMLAttributeCrossOrigin]] = js.undefined
  
  var fetchPriority: js.UndefOr[Signalish[high | low | auto]] = js.undefined
  
  var href: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var hrefLang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var hreflang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var imageSrcSet: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var integrity: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var media: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var referrerPolicy: js.UndefOr[HTMLAttributeReferrerPolicy] = js.undefined
  
  var referrerpolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var rel: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var sizes: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object LinkHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): LinkHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinkHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LinkHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & LinkHTMLAttributes[T]) extends AnyVal {
    
    inline def setAs(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setCharSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setCrossOrigin(value: Signalish[HTMLAttributeCrossOrigin]): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setFetchPriority(value: Signalish[high | low | auto]): Self = StObject.set(x, "fetchPriority", value.asInstanceOf[js.Any])
    
    inline def setFetchPriorityUndefined: Self = StObject.set(x, "fetchPriority", js.undefined)
    
    inline def setHref(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setImageSrcSet(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "imageSrcSet", value.asInstanceOf[js.Any])
    
    inline def setImageSrcSetUndefined: Self = StObject.set(x, "imageSrcSet", js.undefined)
    
    inline def setIntegrity(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setMedia(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setReferrerPolicy(value: HTMLAttributeReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setRel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setSizes(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
