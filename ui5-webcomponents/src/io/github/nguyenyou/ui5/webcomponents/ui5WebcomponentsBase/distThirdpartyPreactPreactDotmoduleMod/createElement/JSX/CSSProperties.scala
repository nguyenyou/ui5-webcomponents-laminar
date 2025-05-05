package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactPreactDotmoduleMod.createElement.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperties
  extends StObject
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.AllCSSProperties
     with io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distThirdpartyPreactJsxMod.JSXInternal.DOMCSSProperties {
  
  @JSName("cssText")
  var cssText_CSSProperties: js.UndefOr[String | Null] = js.undefined
}
object CSSProperties {
  
  inline def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setCssTextNull: Self = StObject.set(x, "cssText", null)
    
    inline def setCssTextUndefined: Self = StObject.set(x, "cssText", js.undefined)
  }
}
