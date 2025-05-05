package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.distI18nBundleMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofInputSuggestions extends StObject {
  
  /* static member */
  var SCROLL_STEP: Double
  
  /* static member */
  var i18nBundle: default
}
object TypeofInputSuggestions {
  
  inline def apply(SCROLL_STEP: Double, i18nBundle: default): TypeofInputSuggestions = {
    val __obj = js.Dynamic.literal(SCROLL_STEP = SCROLL_STEP.asInstanceOf[js.Any], i18nBundle = i18nBundle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofInputSuggestions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofInputSuggestions] (val x: Self) extends AnyVal {
    
    inline def setI18nBundle(value: default): Self = StObject.set(x, "i18nBundle", value.asInstanceOf[js.Any])
    
    inline def setSCROLL_STEP(value: Double): Self = StObject.set(x, "SCROLL_STEP", value.asInstanceOf[js.Any])
  }
}
