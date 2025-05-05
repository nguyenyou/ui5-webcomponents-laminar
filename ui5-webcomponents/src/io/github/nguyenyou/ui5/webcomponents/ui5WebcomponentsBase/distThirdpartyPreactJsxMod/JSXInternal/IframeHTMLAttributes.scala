package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.`lazy`
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.eager
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IframeHTMLAttributes[T /* <: EventTarget */]
  extends StObject
     with HTMLAttributes[T] {
  
  var allow: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var allowFullScreen: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var allowTransparency: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  /** @deprecated */
  var frameBorder: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  /** @deprecated */
  var frameborder: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var height: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
  
  var loading: js.UndefOr[eager | `lazy`] = js.undefined
  
  /** @deprecated */
  var marginHeight: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  /** @deprecated */
  var marginWidth: js.UndefOr[Signalish[js.UndefOr[Double]]] = js.undefined
  
  var name: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var referrerPolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var referrerpolicy: js.UndefOr[Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]] = js.undefined
  
  var sandbox: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated */
  var scrolling: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var seamless: js.UndefOr[Signalish[js.UndefOr[Boolean]]] = js.undefined
  
  var src: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srcDoc: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var srcdoc: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  var width: js.UndefOr[Signalish[js.UndefOr[Double | String]]] = js.undefined
}
object IframeHTMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): IframeHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IframeHTMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IframeHTMLAttributes[?], T /* <: EventTarget */] (val x: Self & IframeHTMLAttributes[T]) extends AnyVal {
    
    inline def setAllow(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreen(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
    
    inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
    
    inline def setAllowTransparency(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
    
    inline def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
    
    inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
    
    inline def setFrameBorder(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
    
    inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
    
    inline def setHeight(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLoading(value: eager | `lazy`): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
    
    inline def setMarginHeight(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
    
    inline def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
    
    inline def setMarginWidth(value: Signalish[js.UndefOr[Double]]): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
    
    inline def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
    
    inline def setName(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferrerPolicy(value: Signalish[js.UndefOr[HTMLAttributeReferrerPolicy]]): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSandbox(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setScrolling(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSeamless(value: Signalish[js.UndefOr[Boolean]]): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
    
    inline def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
    
    inline def setSrc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcDoc(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
    
    inline def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setWidth(value: Signalish[js.UndefOr[Double | String]]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
