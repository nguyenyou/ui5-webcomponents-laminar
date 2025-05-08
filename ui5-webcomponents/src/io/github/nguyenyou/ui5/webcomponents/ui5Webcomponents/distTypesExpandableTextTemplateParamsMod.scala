package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesExpandableTextTemplateParamsMod {
  
  trait ExpandableTextTemplateParams extends StObject {
    
    /** CSS class name to be applied to the ExpandableText */
    var className: String
    
    /** Maximum number of characters before truncation */
    var maxCharacters: Double
    
    /** Optional CSS part name */
    var part: js.UndefOr[String] = js.undefined
    
    /** Text content to be displayed */
    var text: String
  }
  object ExpandableTextTemplateParams {
    
    inline def apply(className: String, maxCharacters: Double, text: String): ExpandableTextTemplateParams = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], maxCharacters = maxCharacters.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandableTextTemplateParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpandableTextTemplateParams] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setMaxCharacters(value: Double): Self = StObject.set(x, "maxCharacters", value.asInstanceOf[js.Any])
      
      inline def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
      
      inline def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
