package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal

import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MStyleMathMLAttributes[T /* <: EventTarget */]
  extends StObject
     with MathMLAttributes[T] {
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#background */
  var background: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#color */
  var color: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#fontsize */
  var fontsize: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#fontstyle */
  var fontstyle: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#fontweight */
  var fontweight: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#scriptminsize */
  var scriptminsize: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Element/mstyle#scriptsizemultiplier */
  var scriptsizemultiplier: js.UndefOr[Signalish[js.UndefOr[String]]] = js.undefined
}
object MStyleMathMLAttributes {
  
  inline def apply[T /* <: EventTarget */](): MStyleMathMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MStyleMathMLAttributes[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MStyleMathMLAttributes[?], T /* <: EventTarget */] (val x: Self & MStyleMathMLAttributes[T]) extends AnyVal {
    
    inline def setBackground(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontsize(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
    
    inline def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
    
    inline def setFontstyle(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "fontstyle", value.asInstanceOf[js.Any])
    
    inline def setFontstyleUndefined: Self = StObject.set(x, "fontstyle", js.undefined)
    
    inline def setFontweight(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "fontweight", value.asInstanceOf[js.Any])
    
    inline def setFontweightUndefined: Self = StObject.set(x, "fontweight", js.undefined)
    
    inline def setScriptminsize(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scriptminsize", value.asInstanceOf[js.Any])
    
    inline def setScriptminsizeUndefined: Self = StObject.set(x, "scriptminsize", js.undefined)
    
    inline def setScriptsizemultiplier(value: Signalish[js.UndefOr[String]]): Self = StObject.set(x, "scriptsizemultiplier", value.asInstanceOf[js.Any])
    
    inline def setScriptsizemultiplierUndefined: Self = StObject.set(x, "scriptsizemultiplier", js.undefined)
  }
}
