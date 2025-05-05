package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var transform: String
}
object Transform {
  
  inline def apply(transform: String): Transform = {
    val __obj = js.Dynamic.literal(transform = transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
  }
}
