package io.github.nguyenyou.ui5.webcomponents.ui5WebcomponentsBase

import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConvertersDomreferenceMod {
  
  object default {
    
    @JSImport("@ui5/webcomponents-base/dist/converters/DOMReference.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAttribute(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAttribute")().asInstanceOf[String | Null]
    inline def fromAttribute(value: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAttribute")(value.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    
    inline def toAttribute(propertyValue: String): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toAttribute")(propertyValue.asInstanceOf[js.Any]).asInstanceOf[String | Null]
    inline def toAttribute(propertyValue: HTMLElement): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("toAttribute")(propertyValue.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
}
