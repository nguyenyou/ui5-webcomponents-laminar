package io.github.nguyenyou.ui5.webcomponents.ui5Webcomponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Wrapper extends StObject {
  
  var main: Width
  
  var wrapper: Justifycontent
}
object Wrapper {
  
  inline def apply(main: Width, wrapper: Justifycontent): Wrapper = {
    val __obj = js.Dynamic.literal(main = main.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wrapper]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Wrapper] (val x: Self) extends AnyVal {
    
    inline def setMain(value: Width): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
    
    inline def setWrapper(value: Justifycontent): Self = StObject.set(x, "wrapper", value.asInstanceOf[js.Any])
  }
}
