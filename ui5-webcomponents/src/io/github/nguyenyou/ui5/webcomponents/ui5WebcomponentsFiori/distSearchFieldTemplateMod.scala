package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsFiori

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSearchFieldTemplateMod {
  
  @JSImport("@ui5/webcomponents-fiori/dist/SearchFieldTemplate.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Any]
  inline def default(options: SearchFieldTemplateOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  trait SearchFieldTemplateOptions extends StObject {
    
    /**
      * If set to true, the search field will be expanded.
      */
    var forceExpanded: js.UndefOr[Boolean] = js.undefined
  }
  object SearchFieldTemplateOptions {
    
    inline def apply(): SearchFieldTemplateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchFieldTemplateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SearchFieldTemplateOptions] (val x: Self) extends AnyVal {
      
      inline def setForceExpanded(value: Boolean): Self = StObject.set(x, "forceExpanded", value.asInstanceOf[js.Any])
      
      inline def setForceExpandedUndefined: Self = StObject.set(x, "forceExpanded", js.undefined)
    }
  }
}
