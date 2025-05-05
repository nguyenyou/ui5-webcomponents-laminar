package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnchorHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var download: js.UndefOr[Signalish[Any]] = js.undefined
  
  var href: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var hrefLang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var hreflang: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var media: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var ping: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var referrerPolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var referrerpolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var rel: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var target: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeAnchorTarget]]] = js.undefined
  
  var `type`: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object AnchorHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): AnchorHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnchorHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & AnchorHTMLAttributes[T]) extends AnyVal {
    
    inline def setDownload(value: Signalish[Any]): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
    
    inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
    
    inline def setHref(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefLang(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
    
    inline def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMedia(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setPing(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPingUndefined: Self = StObject.set(x, "ping", js.undefined)
    
    inline def setReferrerPolicy(value: Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setRel(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
    
    inline def setTarget(value: Signalish[js.UndefOr[HTMLAttributeAnchorTarget]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
