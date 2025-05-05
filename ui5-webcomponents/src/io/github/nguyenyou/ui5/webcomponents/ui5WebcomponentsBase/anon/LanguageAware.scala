package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageAware extends StObject {
  
  var languageAware: js.UndefOr[Boolean] = js.undefined
  
  var rtlAware: js.UndefOr[Boolean] = js.undefined
  
  var tag: js.UndefOr[String] = js.undefined
  
  var themeAware: js.UndefOr[Boolean] = js.undefined
}
object LanguageAware {
  
  inline def apply(): LanguageAware = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageAware]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LanguageAware] (val x: Self) extends AnyVal {
    
    inline def setLanguageAware(value: Boolean): Self = StObject.set(x, "languageAware", value.asInstanceOf[js.Any])
    
    inline def setLanguageAwareUndefined: Self = StObject.set(x, "languageAware", js.undefined)
    
    inline def setRtlAware(value: Boolean): Self = StObject.set(x, "rtlAware", value.asInstanceOf[js.Any])
    
    inline def setRtlAwareUndefined: Self = StObject.set(x, "rtlAware", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setThemeAware(value: Boolean): Self = StObject.set(x, "themeAware", value.asInstanceOf[js.Any])
    
    inline def setThemeAwareUndefined: Self = StObject.set(x, "themeAware", js.undefined)
  }
}
