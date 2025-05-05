package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Padding extends StObject {
  
  var padding: String
}
object Padding {
  
  inline def apply(padding: String): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
  }
}
