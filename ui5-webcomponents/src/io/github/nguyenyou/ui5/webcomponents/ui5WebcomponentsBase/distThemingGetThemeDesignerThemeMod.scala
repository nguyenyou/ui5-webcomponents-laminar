package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distThemingGetThemeDesignerThemeMod {
  
  @JSImport("@ui5/webcomponents-base/dist/theming/getThemeDesignerTheme.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.UndefOr[ThemeDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.UndefOr[ThemeDescriptor]]
  
  trait ThemeDescriptor extends StObject {
    
    var baseThemeName: js.UndefOr[String] = js.undefined
    
    var themeName: String
  }
  object ThemeDescriptor {
    
    inline def apply(themeName: String): ThemeDescriptor = {
      val __obj = js.Dynamic.literal(themeName = themeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeDescriptor] (val x: Self) extends AnyVal {
      
      inline def setBaseThemeName(value: String): Self = StObject.set(x, "baseThemeName", value.asInstanceOf[js.Any])
      
      inline def setBaseThemeNameUndefined: Self = StObject.set(x, "baseThemeName", js.undefined)
      
      inline def setThemeName(value: String): Self = StObject.set(x, "themeName", value.asInstanceOf[js.Any])
    }
  }
}
