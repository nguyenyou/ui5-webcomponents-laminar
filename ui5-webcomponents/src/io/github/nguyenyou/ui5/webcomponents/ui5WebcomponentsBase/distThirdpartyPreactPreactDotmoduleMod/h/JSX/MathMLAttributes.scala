package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.h.JSX

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.ltr
import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.ui5WebcomponentsBaseStrings.rtl
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MathMLAttributes[Target /* <: EventTarget */]
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.HTMLAttributes[Target] {
  
  @JSName("dir")
  var dir_MathMLAttributes: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[ltr | rtl]]
  ] = js.undefined
  
  var displaystyle: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Boolean]]
  ] = js.undefined
  
  /** @deprecated This feature is non-standard. See https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/href  */
  var href: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathbackground */
  var mathbackground: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathcolor */
  var mathcolor: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  /** @deprecated See https://developer.mozilla.org/en-US/docs/Web/MathML/Global_attributes/mathsize */
  var mathsize: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
  
  var scriptlevel: js.UndefOr[
    io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
  ] = js.undefined
}
object MathMLAttributes {
  
  inline def apply[Target /* <: EventTarget */](): MathMLAttributes[Target] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MathMLAttributes[Target]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MathMLAttributes[?], Target /* <: EventTarget */] (val x: Self & MathMLAttributes[Target]) extends AnyVal {
    
    inline def setDir(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[ltr | rtl]]
    ): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    inline def setDisplaystyle(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[Boolean]]
    ): Self = StObject.set(x, "displaystyle", value.asInstanceOf[js.Any])
    
    inline def setDisplaystyleUndefined: Self = StObject.set(x, "displaystyle", js.undefined)
    
    inline def setHref(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setMathbackground(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "mathbackground", value.asInstanceOf[js.Any])
    
    inline def setMathbackgroundUndefined: Self = StObject.set(x, "mathbackground", js.undefined)
    
    inline def setMathcolor(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "mathcolor", value.asInstanceOf[js.Any])
    
    inline def setMathcolorUndefined: Self = StObject.set(x, "mathcolor", js.undefined)
    
    inline def setMathsize(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "mathsize", value.asInstanceOf[js.Any])
    
    inline def setMathsizeUndefined: Self = StObject.set(x, "mathsize", js.undefined)
    
    inline def setScriptlevel(
      value: io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.Signalish[js.UndefOr[String]]
    ): Self = StObject.set(x, "scriptlevel", value.asInstanceOf[js.Any])
    
    inline def setScriptlevelUndefined: Self = StObject.set(x, "scriptlevel", js.undefined)
  }
}
